/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverpages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */
@WebServlet(name = "VerifyOTP", urlPatterns = {"/VerifyOTP"})
public class VerifyOTP extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String registeredMail = request.getParameter("email");
            String enteredOTP = request.getParameter("otp");

            Connection conn = null;
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
                Class.forName("oracle.jdbc.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jbweb", "tjas");

                // Retrieve stored OTP from the database
                String retrieveOTPQuery = "SELECT OTP FROM USERS WHERE EMAIL = ?";
                pst = conn.prepareStatement(retrieveOTPQuery);
                pst.setString(1, registeredMail);
                rs = pst.executeQuery();

                if (rs.next()) {
                    String storedOTP = rs.getString("OTP");

                    if (enteredOTP.equals(storedOTP)) {
                        out.println("<h2 style='color:green'>OTP Verified Successfully!</h2>");
                        response.sendRedirect("passchange.jsp");
                        // Add your logic for successful OTP verification (e.g., password reset)
                    } else {
                        out.println("<h2 style='color:red'>Invalid OTP. Please try again.</h2>");
                    }
                } else {
                    out.println("<h2 style='color:red'>User not found or OTP expired.</h2>");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                out.println("<h2 style='color:red'>Error: " + ex.getMessage() + "</h2>");
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (pst != null) {
                        pst.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace(); // Handle the exception appropriately
                }
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Verify OTP Servlet";
    }
}