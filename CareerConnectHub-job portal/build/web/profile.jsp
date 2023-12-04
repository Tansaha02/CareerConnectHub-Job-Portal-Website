<%-- 
    Document   : profile
    Created on : Nov 15, 2023, 3:13:11 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
  String user = "";
  Object usernameObj = session.getAttribute("username");
  if (usernameObj != null) {
    user = usernameObj.toString();
  } else {
    response.sendRedirect("user_login.jsp");
  }
%>

<!-----META SECTION----->
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

        /* Sidebar styles */
        .sidebar {
            width: 250px;
            background-color: #000;
            color: #fff;
            float: left;
            height: 100vh; /* Adjust sidebar height */
        }
        .sidebar ul {
            list-style: none;
            padding: 0;
        }
        .sidebar li {
            padding: 10px;
            cursor: pointer;
        }
        .sidebar li:hover {
            background-color: #333;
        }
        /* Content section */
        .content {
            margin-left: 250px; /* Adjust according to sidebar width */
            padding: 50px;
        }
        /* Table styles */
        table {
            border-collapse: collapse;
            width: 100%;
            color: #000; /* Adjust text color */
        }
        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd; /* Add border between rows */
        }
        th {
            background-color: #f2f2f2;
        }
    
</style>
</head>
  <body>
    <!------HEADER SECTION HEADER SECTION HEADER SECTION ------>
<header>
    <div class="width-100">
      <div class="container header">
        <div class="width-25">
          <img src="img\mainlogo.png">
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
          <li><a href="it.jsp">apply for jobs</a></li>
        </ul>
            <li>
              <a href="feedback.jsp">Contact Us </a>
            </li>
          </ul>
        </div>
        <div class="width-25">
         
          
                <li><a href="profile.jsp">Welcome, <%=user%></a></li>
                <li><a href="http://localhost:8080/Job_Portal/logout">Logout</a></li>
                
          <a href="cv.html" >
            <i class="fa fa-pencil-square-o" aria-hidden="true"></i> Create Resume </a>
        </div>
      </div>
    </div>
  </header>
<div class="sidebar">
        <ul>
          <li><img src="https://imgs.search.brave.com/budZV5WXI8fPMNjtNI4DFAa20HjQkiC6GbvI7H95HYk/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93d3cu/a2luZHBuZy5jb20v/cGljYy9tLzI1Mi0y/NTI0Njk1X2R1bW15/LXByb2ZpbGUtaW1h/Z2UtanBnLWhkLXBu/Zy1kb3dubG9hZC5w/bmc"></li>
           
          <a href =passchange.jsp><li>Change Password</li></a>
            <!-- Add other sidebar options -->
        </ul>
    </div>

    <!-- User Details -->
    <div class="content">
        <h2>User Details</h2>
        <table>
            <tr>
                <th>Field</th>
                <th>Details</th>
            </tr>
            <tr>
                <td>First Name</td>
                <td>${requestScope.firstname}</td>
            </tr>
            <tr>
                <td>Middle Name</td>
                <td>${requestScope.middlename}</td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td>${requestScope.lastname}</td>
            </tr>
            <tr>
                <td>Email</td>
                <td>${requestScope.email}</td>
            </tr>
            <tr>
                <td>Date of Birth</td>
                <td>${requestScope.dob}</td>
            </tr>
            <tr>
                <td>Address</td>
                <td>${requestScope.address}</td>
            </tr>
            <tr>
                <td>Aadhar No.</td>
                <td>${requestScope.aadharno}</td>
            </tr>
            <tr>
                <td>Phone No.</td>
                <td>${requestScope.phone}</td>
            </tr>
            <tr>
                <td>Alternate Phone No.</td>
                <td>${requestScope.alternatephoneno}</td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>Male</td>
            </tr>
            
            <!-- Add other rows with user details -->
        </table>
    </div>
</body>
</html>