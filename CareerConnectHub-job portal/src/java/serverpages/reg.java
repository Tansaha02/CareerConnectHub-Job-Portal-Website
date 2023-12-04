/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverpages;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 *
 * @author Hp
 */
@WebServlet(name = "reg", urlPatterns = {"/reg"})
//@MultipartConfig(maxFileSize = 16177215)
public class reg extends HttpServlet {

   
   private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form parameters
        String firstname = request.getParameter("firstname");
        String middlename = request.getParameter("middlename");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String phoneNo = request.getParameter("phoneno");
        String alternatePhoneNo = request.getParameter("alternatephoneno");
        String aadharNo = request.getParameter("aadharno");
        String currentAddress = request.getParameter("address");
  //      Part filePart = request.getPart("profilepic");
    //    InputStream fileContent = filePart.getInputStream();
      //      String fileName = filePart.getSubmittedFileName();
        //    long fileSize = filePart.getSize();
      
               
              

        // JDBC variables
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load the JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish a connection
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jbweb", "tjas");

            // Create the SQL query
            String sql = "INSERT INTO USERS (FIRSTNAME, MIDDLENAME, LASTNAME, EMAIL, PASSWORD, DOB, GENDER, PHONE, ALTERNATEPHONE, AADHARNO, ADDRESS) VALUES (?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?, ?)";

            // Create a prepared statement
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, middlename);
            preparedStatement.setString(3, lastname);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, password);
            preparedStatement.setString(6, dob);
            preparedStatement.setString(7, gender);
            preparedStatement.setString(8, phoneNo);
            preparedStatement.setString(9, alternatePhoneNo);
            preparedStatement.setString(10, aadharNo);
            preparedStatement.setString(11, currentAddress);
          //  preparedStatement.setBinaryStream(12, fileContent, (int) fileSize);

            // Execute the query
            int rowsInserted = preparedStatement.executeUpdate();

            // Display a message based on the result
            if (rowsInserted > 0) {
                response.getWriter().write("User registered successfully!");
                response.sendRedirect("user_login.jsp");
            } else {
                response.getWriter().write("Error registering user.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            // Handle exceptions
            e.printStackTrace();
            response.getWriter().write("Database error: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}