<%-- 
    Document   : feedack
    Created on : Nov 23, 2023, 3:49:53 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%
  String user = "";
  Object usernameObj = session.getAttribute("username");
  if (usernameObj != null) {
    user = usernameObj.toString();
  } else {
    response.sendRedirect("user_login.jsp");
  }
%>

<!DOCTYPE html>
 <html lang="en">
  <head>
   <title>Search Job</title>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="index1.css">
   <meta name="robots" content="noindex, nofollow">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
   <link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
      .contain {
    width: 80%;
    margin: 20px auto;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
    text-align: center;
}

label {
    display: block;
    margin-bottom: 5px;
}

input[type="text"],
input[type="email"],
select,
textarea {
    width: 100%;
    padding: 8px;
    margin-bottom: 15px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

textarea {
    resize: vertical;
}

input[type="submit"] {
    background-color: black;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    transition: background-color 0.3s;
}

.contact-info {
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.contact-info h2 {
    font-size: 24px;
    margin-bottom: 15px;
    text-align: center;
}

.contact-info p {
    margin-bottom: 8px;
    text-align: center;
}

.contact-info strong {
    font-weight: bold;
    margin-right: 5px;
}

  </style>
  <body>
    <!------HEADER SECTION HEADER SECTION HEADER SECTION ------>
<header>
    <div class="width-100">
      <div class="container header">
        <div class="width-25">
          <img src="img/mainlogo.png">
        </div>
        <div class="width-50">
          <ul class="header-menu ">
            <li>
              <a href="home.jsp">Home </a>
            </li>
            <li>
              <a href="it.jsp">Jobs </a>
            </li>
            
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Services <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="course.jsp">industrial trainings</a></li>
          <li><a href="bpo.jsp">apply for jobs</a></li>
        </ul>
            <li>
              <a href="feedback.jsp">Contact Us </a>
            </li>
          </ul>
        </div>
        <div class="width-25">
         
          
                <li><a href="http://localhost:8080/Job_Portal/user_profile">Welcome, <%=user%></a></li>
                <li><a href="http://localhost:8080/Job_Portal/logout">Logout</a></li>
                
          <a href="resume.jsp" >
            <i class="fa fa-pencil-square-o" aria-hidden="true"></i> Create Resume </a>
        </div>
      </div>
    </div>
  </header>
                <body>
    < <div class="contain">
        <h1>Feedback Us</h1>
        <form action="http://localhost:8080/Job_Portal/feedback" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

          
            <label for="feedback">Your Feedback:</label>
            <textarea id="feedback" name="feedback" rows="4" required></textarea>

            <input type="submit" value="Submit">
        </form>
            </div>
    <div class="contact-info">
    <h2>Contact Information</h2>
    <p><strong>Email:</strong> info.careerconnecthub2023@gmail.com</p>
    <p><strong>Phone:</strong> +(033)09876534123</p>
    <p><strong>Address:</strong> 24,College road,EM 4,saltlake,Kolkata-700053</p>
</div>
    <footer>
    <div class="width-100 footer-background">
      <div class="container">
        <div class="width-25">
          <h4>SiteMap</h4>
          <ul class="footer-list">
            <a href="it.jsp"><li>IT JOBS</li>
            <a href="bpo.jsp"><li>BPO JOBS</li>
            <a href="sales.jsp"><li>SALES JOB</li>
            <a href="management.jsp"><li>MANAGEMENT JOB</li>
          </ul>
        </div>
        <div class="width-25">
          <h4>Admin Login</h4>
          <ul class="footer-list">
            
            <a href="user_login.jsp"><li>USER LOGIN</li></a>
            <a href="reg.jsp"><li>USER REGISTRATION</li>
            <a href="T&C.jsp"><li>TERMS & CONDITIONS</li>
          </ul>
        </div>
        <div class="width-25">
          <h4>RESOURCES</h4>
          <ul class="footer-list">
            <a href="home.jsp"><li>Home</li></a>
            <a href="it.jsp"><li>Jobs</li></a>
            <a href=""><li>Companies</li></a>
            <a href="aboutus.jsp"><li>About us</li></a>
       	    <a href="contactus.jsp"><li>Any Complain?complain here</li></a>
          </ul>
        </div>
        <div class="width-25">
          <h4>GET IN TOUCH</h4>
          <ul class="get-in-touch">
            <li>
              <i class="fa fa-envelope-o" aria-hidden="true"></i>
              <p>E-MAIL: info.careerconnecthub.com</p>
            </li>
            <li>
              <i class="fa fa-headphones" aria-hidden="true"></i>
              <p>WHATS-APP: +916287074180</p>
            </li>
            <li>
              <i class="fa fa-fax" aria-hidden="true"></i>
              <p>CONTACT NO.: +91 -(123)-4567890</p>
            </li>
            <li>
              <i class="fa fa-globe" aria-hidden="true"></i>
              <p>WEBSITE: https://www.CareerConnectHub.com</p>
            </li>
            <li>
              <img src="https://imgs.search.brave.com/pHNxVXruRk9h42oa1iA12pSEXJzg0zlhLZ2ijck5ses/rs:fit:500:0:0/g:ce/aHR0cHM6Ly90NC5m/dGNkbi5uZXQvanBn/LzAzLzAwLzI0LzU5/LzM2MF9GXzMwMDI0/NTk1M19TdmloMURZ/SmJ3NHYydDkyRWhE/T1R3VzRMSXFNZ2ht/eS5qcGc">
            </li>
            <li>
              <img src="https://imgs.search.brave.com/cdA4EESxZIip_Z_PMhaUfpfHygnsRUBcrBY_AOR_yMw/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93d3cu/ZWRpZ2l0YWxhZ2Vu/Y3kuY29tLmF1L3dw/LWNvbnRlbnQvdXBs/b2Fkcy9pbnN0YWdy/YW0tbG9nby1hY3J5/bGljLXNwbGFzaC5q/cGVn">
            </li>
            <li>
              <img src="https://imgs.search.brave.com/BfF-6PmzEYBuyW-kbGpeyqtmSx37AF34-H0gLfLXHHA/rs:fit:500:0:0/g:ce/aHR0cHM6Ly90My5m/dGNkbi5uZXQvanBn/LzAzLzk3LzIyLzcw/LzM2MF9GXzM5NzIy/NzA4N19RYVlKQW1M/RU5UNms5VVFkdWV4/REhXaGxoNmRsMlhX/SS5qcGc">
            </li>
            <li>
              <img src="C:\Users\Hp\Desktop\project techno\img\circle-linkedin-512.webp">
            </li>
          </ul>
        </div>
      </div>
    </div>
  </footer>
  <!------FOOTER SECTION FOOTER SECTION FOOTER SECTION ------>