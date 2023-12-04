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
@WebServlet(name = "passchange", urlPatterns = {"/passchange"})
public class passchange extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String newPassword = request.getParameter("password");
            String confirmPassword = request.getParameter("conpassword");
            String registeredMail = request.getParameter("email");

            if (newPassword.equals(confirmPassword)) {
                // Passwords match, proceed with updating the password
                Connection conn = null;
                PreparedStatement pst = null;

                try {
                    Class.forName("oracle.jdbc.OracleDriver");
                    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jbweb", "tjas");

                    // Update the password in the database
                    String updatePasswordQuery = "UPDATE USERS SET PASSWORD = ? WHERE EMAIL = ?";
                    pst = conn.prepareStatement(updatePasswordQuery);
                    pst.setString(1, newPassword);
                    pst.setString(2, registeredMail);

                    int rowsAffected = pst.executeUpdate();

                    if (rowsAffected > 0) {
                        out.println("<h2 style='color:green'>Password reset successfully!</h2>");
                        response.sendRedirect("user_login.jsp");
                    } else {
                        out.println("<h2 style='color:red'>Error updating password. Please try again.</h2>");
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    out.println("<h2 style='color:red'>Error: " + ex.getMessage() + "</h2>");
                } finally {
                    try {
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
            } else {
                out.println("<h2 style='color:red'>Passwords do not match. Please try again.</h2>");
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
        return "Reset Password Servlet";
    }
}