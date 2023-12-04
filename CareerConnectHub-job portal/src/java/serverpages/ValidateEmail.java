/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverpages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
/**
 *
 * @author Hp
 */
@WebServlet(name = "ValidateEmail", urlPatterns = {"/ValidateEmail"})
public class ValidateEmail extends HttpServlet {
OracleConnection oconn;
    OraclePreparedStatement ost;
    OracleResultSet ors = null;
    String vemail, vpass, vname;
    String vto, vfrom, vcc, vbcc, vsubject, vbody;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            vemail = request.getParameter("email");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jbweb", "tjas");
            ost = (OraclePreparedStatement) oconn.prepareStatement("SELECT * FROM USERS where EMAIL=?");
            ost.setString(1, vemail);
            ors = (OracleResultSet) ost.executeQuery();

            if (ors.next()) {
                // Generate OTP
                String otp = generateOTP();

                // Save OTP in the database (Assuming there is a column named OTP in USERS table)
                updateOTPInDatabase(vemail, otp);

                // Send OTP to the registered email
                sendOTPEmail(vemail, otp);

                // Redirect to the OTP verification page
                response.sendRedirect("http://localhost:8080/Job_Portal/otp.jsp");

            } else {
              response.getWriter().write("Error registering user.");
            }
            ost.close();
            oconn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ValidateEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String generateOTP() {
        // Generate a 6-digit random OTP
        Random random = new Random();
        int otpValue = 100000 + random.nextInt(900000);
        return String.valueOf(otpValue);
    }

    private void updateOTPInDatabase(String email, String otp) throws SQLException {
        // Update the OTP in the database (Assuming there is a column named OTP in USERS table)
        String updateQuery = "UPDATE USERS SET OTP = ? WHERE EMAIL = ?";
        try (OraclePreparedStatement updateStatement = (OraclePreparedStatement) oconn.prepareStatement(updateQuery)) {
            updateStatement.setString(1, otp);
            updateStatement.setString(2, email);
            updateStatement.executeUpdate();
        }
    }

    private void sendOTPEmail(String toEmail, String otp) {
        // Email sending code with OTP
        final String username = "info.careerconnecthub2023@gmail.com";
        final String password = "megaqswlougvyxep";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("OTP for Password Reset");
            String body = "Your OTP for password reset is: " + otp;
            message.setText(body);
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace(); // Handle the exception appropriately
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
        return "Short description";
    }
}