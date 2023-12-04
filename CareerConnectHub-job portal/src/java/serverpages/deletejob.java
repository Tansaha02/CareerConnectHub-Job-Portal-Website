/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverpages;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author Hp
 */
@WebServlet(name = "deletejob", urlPatterns = {"/deletejob"})
public class deletejob extends HttpServlet {

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String job_title = request.getParameter("job_title");
        String company = request.getParameter("company");

        // Database connection parameters
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String dbUser = "jbweb";
        String dbPassword = "tjas";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

            String sql = "DELETE FROM job_table WHERE job_title = ? AND company= ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, job_title);
             pstmt.setString(2, company);
            int rowsDeleted = pstmt.executeUpdate();
            pstmt.close();
            conn.close();

            if (rowsDeleted > 0) {
                response.getWriter().println("Record deleted successfully.");
            } else {
                response.getWriter().println("No record found for deletion.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new ServletException("Database access error", e);
        }
    }
}