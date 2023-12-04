<%-- 
    Document   : aboutus
    Created on : Nov 21, 2023, 2:30:01 PM
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
      .vision {
    /* Styles for the vision div */
    padding: 20px;
    border-radius: 8px;
    margin-top: 20px;
}

.vision h2 {
    /* Styles for the heading within the vision div */
    color: #333;
    font-size: 24px;
    margin-bottom: 10px;
}

.vision p {
    /* Styles for the paragraph within the vision div */
    color: #666;
    font-size: 16px;
}

/*****BANNER SECTION*****/
.banner-section {
	background-image: url('img/download.png');
	background-repeat: no-repeat;
	background-size: cover;
	text-align: center;
	height: 620px;
	position: relative;
	width: 100%;
}
.banner-heading {
	font-size: 40px;
	color: white;
	padding-top: 70px
}
.banner-para {
	font-size: 15px;
	color: #fff;
	padding-top: 10px;
}
.team-member-card {
    display: flex;
    flex-direction: column;
    align-items: center;
    background-color: #ffffff;
    border-radius: 196px;
    padding: 34px;
    margin-bottom: 34px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1)
}

.team-member-card img {
    width: 150px;
    height: 150px;
    border-radius: 50%;
    object-fit: cover;
    margin-bottom: 10px;
}

.team-member-card h3 {
    margin: 0;
    font-size: 24px;
    font-weight: bold;
}

.team-member-card p {
    margin: 0;
    font-size: 16px;
    line-height: 1.5;
}
box{
    width: 40px;
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
                
          <a href="cv.html" >
            <i class="fa fa-pencil-square-o" aria-hidden="true"></i> Create Resume </a>
        </div>
      </div>
    </div>
  </header>
                <div class="width-100 banner-section">
    <div class="container">
      <h1 class="banner-heading" style="font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;">Unveiling Innovation, Collaboration, and Excellence</h1>
      <p class="banner-para" style="align:right;font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif">– Join Us in Crafting Tomorrow's Solutions.</p>
      
    </div>
  </div>
<div id=box>
<section class="about-us">
    <div class="vision">
        <h2 style="text-align:center">Our Vision</h2>
        <p style="text-align:center">We envision connecting talented individuals with their dream jobs, fostering a community of growth, innovation, and success.</p>
    <p style="text-align:center">Our mission is to provide a seamless platform that empowers job seekers and employers alike, ensuring mutual benefit and satisfaction.</p>
    </div>
</section>
</div>
  <div id=box>
  <div class="team-member-card">
    <img src="img/Tanmoy.jpeg" alt="Tanmoy's Photo">
    <h3>Tanmoy Saha</h3>
    <p> An exceptional tech whiz weaving the project's foundation with skillful precision</p><p> adding innovation and expertise to every line of code</p><p> defining the project's tech brilliance.</p>
    

  </div>
</div>
  <div=box>
  <div class="team-member-card">
    <img src="img/jyoti.jfif" alt="jyoti's Photo">
    <h3>Jyoti Dhara</h3>
    <p> The creative visionary behind our project seamlessly blends eloquent words with captivating designs</p><p> orchestrating impactful narratives that breathe life into every page of our project's story.</p>
    

  </div>
</div>
<div id=box>
  <div class="team-member-card">
    <img src="img/Subham.jpg" alt="Subham's Photo">
    <h3>Subham Raj</h3>
    <p>An ingenious leader spearheading the project's vision</p><p> infusing it with a trailblazing array of innovative concepts</p><p>steering the team toward boundless success</p>
    

  </div>
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
            <a href="admin_login.jsp"<h4>Admin Login</h4>
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
            
            <a href="aboutus.jsp"><li>About us</li></a>
       	    <a href="feedback.jsp"><li>Any Complain?complain here</li></a>
          </ul>
        </div>
        <div class="width-25">
          <h4>GET IN TOUCH</h4>
          <ul class="get-in-touch">
            <li>
              <i class="fa fa-envelope-o" aria-hidden="true"></i>
              <p>E-MAIL: info.careerconnecthub2023@gmail.com</p>
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
              <img src="https://imgs.search.brave.com/0onedxgdJWLsAOrzVTbco23TxXLuDJGb_uBUL74bc7k/rs:fit:500:0:0/g:ce/aHR0cHM6Ly91cGxv/YWQud2lraW1lZGlh/Lm9yZy93aWtpcGVk/aWEvY29tbW9ucy9j/L2NhL0xpbmtlZElu/X2xvZ29faW5pdGlh/bHMucG5n">
            </li>
          </ul>
        </div>
      </div>
    </div>
  </footer>
  <!------FOOTER SECTION FOOTER SECTI