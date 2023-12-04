<%-- 
    Document   : deletejobsales
    Created on : Nov 23, 2023, 10:38:26 AM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
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

       
    .login-container {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        width: 372px;
        text-align: center;
        margin: auto;
    }

    h2 {
        color: #333;
    }

    form {
        align-content: center;
    }

    .checkbox {
        margin-bottom: 15px;
        text-align: left;
    }

    .checkbox label {
        display: block;
        margin-top: 10px; /* Adjusted margin for better spacing */
        color: #555;
    }

    .input-group {
        margin-bottom: 15px;
        text-align: left;
    }

    label {
        display: block;
        margin-bottom: 5px;
        color: #555;
    }

    input {
        width: 100%;
        padding: 9px 74px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 14px;
    }

    button {
        padding: 10px 15px;
        margin-right: 10px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 14px;
    }

    .btn-login {
        background-color: #e34216;
        color: #fff;
    }

    .btn-reset {
        background-color: #e34216;
        color: #fff;
    }

    .btn-close {
        background-color: #e34216;
        color: #fff;
    }

    .options {
        margin-top: 15px;
    }

    .option-link {
        color: #3498db;
        text-decoration: none;
        margin-right: 15px;
    }
</style>

 
</style>

</head>
  <body>
    <!------HEADER SECTION HEADER SECTION HEADER SECTION ------>
<header>
    <div class="width-100">
      <div class="container header">
        <div class="width-25">
          <img src="img/mainlogo.png">
        </div>
        
  </header>
    <body>
    <div class="login-container">
        <h2>Delete job to Sales Section</h2>
        <form action="http://localhost:8080/Job_Portal/deletejobsales" method="post">
            <div class="input-group">
                <label for="email">Job_title:</label>
                <input type="text" name="job_title" placeholder="Job Title" required>
            </div>
            <div class="input-group">
                <label for="company">Company name:</label>
                <input type="text" name="company" placeholder="Company" required><br>
            </div>

           

            

            <button type="submit" class="submit" >Submit</button>
            
        </form>

        
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
 