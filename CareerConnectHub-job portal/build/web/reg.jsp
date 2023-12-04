<%-- 
    Document   : reg
    Created on : Nov 13, 2023, 3:33:36 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
 

   input[type=text], input[type=password],  textarea {
      width: calc(100% - 20px); /* Adjusted width */
      padding: 8px; /* Adjusted padding */
      margin: 5px 0 8px 0;
      border: 1px solid black;
      box-sizing: border-box;
    }

    input[type=text]:focus, input[type=password]:focus {
      background-color: #f9d5b5;
      outline: none;
    }

    hr {
      border: 1px solid #f1f1f1;
      margin-bottom: 15px; /* Adjusted margin */
    }

    .registerbtn {
	background-color: black;
      color: white;
      padding: 12px 15px; /* Adjusted padding */
      margin: 8px 0;
      border: none;
      cursor: pointer;
      width: 100%;
      opacity: 0.9;
    }
    

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
        
      </div>
    </div>
 
<div class="container">
  <form action="http://localhost:8080/Job_Portal/reg" method="post" >
    
      <center><h1>SIGN UP</h1></center>
      <hr>
      <label>Firstname:</label>
      <input type="text" name="firstname" placeholder="Firstname" required />
      <label>Middlename:</label>
      <input type="text" name="middlename" placeholder="Middlename" required />
      <label>Lastname:</label>
      <input type="text" name="lastname" placeholder="Lastname" required />

      <label>Email</label>
      <input type="text" name="email" placeholder="youremail@gmail.com" required />
      <label>Password</label>
      <input type="text" name="password" placeholder="password" required />
      <label>Confirm Password</label>
      <input type="text" name="password" placeholder="re-type_password" required />

      <div>
        <label>Date of Birth:</label>
        <input type="date" id="dob" name="dob" required />
      </div>
      
      <div>
        <label>Gender:</label><br>
        <input type="radio" value="Male" name="gender" checked> Male
        <input type="radio" value="Female" name="gender"> Female
        <input type="radio" value="Other" name="gender"> Other
      </div>

      <label>Phone:</label>
      <input type="text" name="phoneno" placeholder="phone no" value="+91" />

      <div>
        <label>Alternate Phone no.:</label>
        <input type="text" name="alternatephoneno" placeholder="phone no" value="+91" />
      </div>

      <div>
        <label>Aadhar CARD NO.:</label>
        <input type="text" name="aadharno" placeholder="0000 0000 0000 0000" pattern="[0-9]{16}" required />
      </div>
      

      <label>Current Address:</label>
      <textarea cols="30" rows="5" name="address" placeholder="Current Address"  required></textarea>
      
      <div>
        <label>Profile picture:</label>
        <input type="file" name="profilepic" required />
      </div>
      <div class="checkbox">
                <label>
                    <input type="checkbox" name="terms" required> I agree to the <a href="terms.jsp">Terms and Conditions</a>
                </label>
            </div>
      <button type="submit" id="submit" class="registerbtn">Register</button>
   
  </form>
     </div>
</header>
<footer>
    <div class="width-100 footer-background">
      <div class="container">
        <div class="width-25">
          <h4>SiteMap</h4>
          <ul class="footer-list">
            <li>IT JOBS</li>
            <li>BPO JOBS</li>
            <li>SALES JOB</li>
            <li>MANAGEMENT JOB</li>
          </ul>
        </div>
        <div class="width-25">
          <h4></h4>
          <ul class="footer-list">
            <li>Admin Login</li>
            <li>USER LOGIN</li>
            <li>USER REGISTRATION</li>
            <li>TERMS & CONDITIONS</li>
          </ul>
        </div>
        <div class="width-25">
          <h4>RESOURCES</h4>
          <ul class="footer-list">
            <a href=""><li>Home</li></a>
            <a href=""><li>Jobs</li></a>
            <a href=""><li>Companies</li></a>
            <a href=""><li>Contact us</li></a>
       	    <a href=""><li>Any Complain?complain here</li></a>
          </ul>
        </div>
        <div class="width-25">
          <h4>GET IN TOUCH</h4>
          <ul class="get-in-touch">
            <li>
              <i class="fa fa-envelope-o" aria-hidden="true"></i>
              <p>E-MAIL: info@CareerConnectHub.com</p>
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

