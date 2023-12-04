/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverpages;

import java.io.IOException;
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
@WebServlet(name = "addjob", urlPatterns = {"/addjob"})
public class addjob extends HttpServlet {

   private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jobTitle = request.getParameter("jobTitle");
        String company = request.getParameter("company");
        String experience = request.getParameter("experience");
        String salary = request.getParameter("salary");
        String location = request.getParameter("location");
        String skills = request.getParameter("skills");

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jbweb", "tjas");

            String sql = "INSERT INTO job_table (job_title, company, experience, salary, location, skills) VALUES (?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, jobTitle);
            pstmt.setString(2, company);
            pstmt.setString(3, experience);
            pstmt.setString(4, salary);
            pstmt.setString(5, location);
            pstmt.setString(6, skills);
            pstmt.executeUpdate();

            response.sendRedirect("addjob1.jsp"); 
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the error
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}