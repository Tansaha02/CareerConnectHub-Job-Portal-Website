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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hp
 */
@WebServlet(name = "user_profile", urlPatterns = {"/user_profile"})
public class user_profile extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    HttpSession session = request.getSession();
    String username = (String) session.getAttribute("username");

    // Initialize database connection parameters
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
    String dbUser = "jbweb";
    String dbPassword = "tjas";

    try {
        // Load the Oracle JDBC driver
        Class.forName("oracle.jdbc.OracleDriver");

        // Create a database connection
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword)) {
            // Prepare and execute a SQL query
            String sql = "SELECT * FROM users WHERE email = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        // Retrieve user information
                        String firstname = resultSet.getString("firstname");
                        String middlename = resultSet.getString("middlename");
                        String lastname = resultSet.getString("lastname");
                        String email = resultSet.getString("email");
                        
                        java.sql.Date dobFromDB = resultSet.getDate("dob");
                        String dobAsString = null;
                        if (dobFromDB != null) {
                            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                            dobAsString = formatter.format(dobFromDB);
                        }
                        
                        String gender = resultSet.getString("gender");
                        String phoneno = resultSet.getString("phone");
                        String alternatephoneno = resultSet.getString("alternatephone");
                        String aadharno = resultSet.getString("aadharno");
                        String address = resultSet.getString("address");

                        // Set user information in request attributes
                        request.setAttribute("firstname", firstname);
                        request.setAttribute("middlename", middlename);
                        request.setAttribute("lastname", lastname);
                        request.setAttribute("email", email);
                        request.setAttribute("dob", dobAsString);
                        request.setAttribute("phone", phoneno);
                        request.setAttribute("alternatephoneno", alternatephoneno);
                        request.setAttribute("aadharno", aadharno);
                        request.setAttribute("address", address);

                        // Forward the request to the profile JSP page
                        request.getRequestDispatcher("profile.jsp").forward(request, response);
                    } else {
                        // User not found, handle accordingly
                        response.sendRedirect("user_login.jsp");
                    }
                }
            }
        }
    } catch (ClassNotFoundException | SQLException e) {
        throw new ServletException("Database access error", e);
    }
}
