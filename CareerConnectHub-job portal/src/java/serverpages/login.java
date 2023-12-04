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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 * @author Hp
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("email");
        String password = request.getParameter("password");
        
        // Initialize database connection parameters
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String dbUser = "jbweb";
        String dbPassword = "tjas";
        
        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.OracleDriver");
            
            // Prepare and execute a SQL query
            try ( // Create a database connection
                    Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword)) {
                // Prepare and execute a SQL query
                String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, username);
                    statement.setString(2, password);
                    
                    try (ResultSet resultSet = statement.executeQuery()) {
                        if (resultSet.next()) {
                            // Authentication successful
                            HttpSession session = request.getSession(true);
                            session.setAttribute("username", username);
                            
                            response.sendRedirect("home.jsp");
                        } else {
                            // Authentication failed, handle accordingly
                            response.sendRedirect("user_login.jsp");
                        }
                        // Close resources
                    }
                }
            }
        } catch (IOException | ClassNotFoundException | SQLException e) {
        }
    }
}
