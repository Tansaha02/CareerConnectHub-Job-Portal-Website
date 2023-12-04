<%-- 
    Document   : it.html
    Created on : Nov 15, 2023, 11:38:49 AM
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
  <!------SEARCH SECTION SEARCH SECTION SEARCH SECTION ------>
<div class="width-100 banner-section">
    <div class="container">
      <h1 class="banner-heading">Want to make a successful Career in IT industry</h1>
      <p class="banner-para">You are Welcome</p>
      
    </div>
  </div>

    <div class="container">
      <div class="skill-list">
        <div class="width-33">
          <img class="skill-img" src="https://imgs.search.brave.com/6xaGNkbofupg09j657z2O_JLuQalf3zJkhHy14eLUfg/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9sb2dv/LmNvbS9pbWFnZS1j/ZG4vaW1hZ2VzL2t0/czkyOHBkL3Byb2R1/Y3Rpb24vNWYzOGFk/ZjJiMzdkMTM2MmY0/ODFiMDkwZGFjOTM2/N2NjZTQ3NjlhMi0z/NDR4MzQ1LnBuZz93/PTEwODAmcT03Mg">
        </div>
        <div class="width-66">
            <a href="it.jsp"><h4>It Sector</h4></a>
          <button class="view-button">7,600 jobs</button>
        </div>
      </div>
      <div class="skill-list">
        <div class="width-33">
          <img class="skill-img" src="https://imgs.search.brave.com/KSUy4IxuOC4AeiJZ1HVuyyVupqMXlSpIiMq33XsS3Hw/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9pbWFn/ZXMtcGxhdGZvcm0u/OTlzdGF0aWMuY29t/Ly8wTTlWTkh3cXpG/VjdTOFhXZERUQVox/QkFDQ0k9LzI0N3g3/NDoxNzU4eDE1ODUv/Zml0LWluLzUwMHg1/MDAvOTlkZXNpZ25z/LWNvbnRlc3RzLWF0/dGFjaG1lbnRzLzEx/Mi8xMTI2MzIvYXR0/YWNobWVudF8xMTI2/MzIxMjE.jpeg">
        </div>
        <div class="width-66">
            <a href="sales.jsp"> <h4>Sales</h4></a>
          <button class="view-button">5,000 jobs</button>
        </div>
      </div>
      <div class="skill-list">
        <div class="width-33">
          <img class="skill-img" src="https://imgs.search.brave.com/w-uYdAJg0fPudnnp6wfoVglW_8DJF7fk9KSkLDqIMbg/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9rbm93/bGVkZ2VuZWVkLmNv/bS93cC1jb250ZW50/L3VwbG9hZHMvMjAy/MS8wOC9QaWNzQXJ0/XzA4LTE4LTA3LjM2/LjA1LTMwMHgyMDAu/anBn">
        </div>
        <div class="width-66">
            <a href="bpo.jsp"><h4>BPO</h4></a>
          <button class="view-button">1,100 jobs</button>
        </div>
      </div>
      <div class="skill-list">
        <div class="width-33">
          <img class="skill-img" src="https://imgs.search.brave.com/u79sLdq7rx9Ai8_b8ueA8ciGqOTzhOo76YIqP3T_974/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93d3cu/cHJvZHVjdHBsYW4u/Y29tL3VwbG9hZHMv/MjAxOS8xMC9oaXJp/bmctcHJvZHVjdC1t/YW5hZ2Vycy0xMDI0/eDY4My5qcGVn">
        </div>
        <div class="width-66">
            <a href="management.jsp"><h4>Management</h4></a>
          <button class="view-button">2,345 jobs</button>
        </div>
      </div>
    </div>
  </div> 
  <!-----RECENT JOB SECTION RECENT JOB SECTION RECENT JOB SECTION ----->
<div class="width-100 recent-job">
    <div class="container">
      <h2 class="recent-job-heading">IT jobs</h2>
      <p class="recent-job-sub-heading">Get the list of all tech-related jobs</p>
      <!-----JOB LIST----->
      <div class="width-50">
        <div class="recent-job-list">
          <div class="width-100">
            <h4 class="job-title">Frontend Developer</h4>
            <p class="job-company"> <i class="fa fa-star" aria-hidden="true"></i> | Wipro software solution  </p>
          </div>
          <div class="width-33">
            <i class="fa fa-briefcase" aria-hidden="true"></i> 0-2 Years
          </div>
          <div class="width-33">
            <i class="fa fa-inr" aria-hidden="true"></i>3K-5K/monthly
          </div>
          <div class="width-33">
            <i class="fa fa-map-marker" aria-hidden="true"></i> Bangalore
          </div>
          <div class="width-100">
            <p class="job-skill">
              <b>Skills : </b>HTML, CSS, JAVASCRIPT,  BOOTSTRAP, REACT
            </p>
          </div>
          <div class="width-100">
            <a href="#" class="job-apply-button">Apply Now</a>
          </div>
        </div>
      </div>
      <!-----JOB LIST------>
      <div class="width-50">
        <div class="recent-job-list">
          <div class="width-100">
            <h4 class="job-title">Backend Developer</h4>
            <p class="job-company"><i class="fa fa-star" aria-hidden="true"></i> |CareerConnectHub Group  </p>
          </div>
          <div class="width-33">
            <i class="fa fa-briefcase" aria-hidden="true"></i>1-5 Years
          </div>
          <div class="width-33">
            <i class="fa fa-inr" aria-hidden="true"></i>4k-6k/monthly
          </div>
          <div class="width-33">
            <i class="fa fa-map-marker" aria-hidden="true"></i>kolkata
          </div>
          <div class="width-100">
            <p class="job-skill">
              <b>Skills : </b> JAVASCRIPT, JQUERY ,NODE JS,ORACLE,MONGO DB,JSONPOWERDB
            </p>
          </div>
          <div class="width-100">
            <a href="apply.jsp" class="job-apply-button">Apply Now</a>
          </div>
        </div>
      </div>
      <!-----JOB LIST----->
      <div class="width-50">
        <div class="recent-job-list">
          <div class="width-100">
            <h4 class="job-title">Java Developer</h4>
            <p class="job-company"> <i class="fa fa-star" aria-hidden="true"></i> |meta Incorporation  </p>
          </div>
          <div class="width-33">
            <i class="fa fa-briefcase" aria-hidden="true"></i> 5-12 Years
          </div>
          <div class="width-33">
            <i class="fa fa-inr" aria-hidden="true"></i>7k-10k/monthly
          </div>
          <div class="width-33">
            <i class="fa fa-map-marker" aria-hidden="true"></i> Gurugram
          </div>
          <div class="width-100">
            <p class="job-skill">
              <b>Skills : </b>JAVA SWING,AWT,SPRING BOOT,SERVLETS,JSP
            </p>
          </div>
          <div class="width-100">
            <a href="#" class="job-apply-button">Apply Now</a>
          </div>
        </div>
      </div>
      <!-----JOB LIST----->
      <div class="width-50">
        <div class="recent-job-list">
          <div class="width-100">
            <h4 class="job-title">AI & ML Engineer</h4>
            <p class="job-company"> <i class="fa fa-star" aria-hidden="true"></i> |  </p>
          </div>
          <div class="width-33">
            <i class="fa fa-briefcase" aria-hidden="true"></i>2-5 Years
          </div>
          <div class="width-33">
            <i class="fa fa-inr" aria-hidden="true"></i>7k-10k/monthly
          </div>
          <div class="width-33">
            <i class="fa fa-map-marker" aria-hidden="true"></i>bangalore
          </div>
          <div class="width-100">
            <p class="job-skill">
              <b>Skills : </b>PYTHON,MACHINE LEARNING,DEEP LEARNING,CNN
            </p>
          </div>
          <div class="width-100">
            <a href="apply.jsp" class="job-apply-button">Apply Now</a>
          </div>
        </div>
      </div>
      <!-----JOB LIST----->
      <div class="width-50">
        <div class="recent-job-list">
          <div class="width-100">
            <h4 class="job-title">Graphic Designer</h4>
            <p class="job-company"> <i class="fa fa-star" aria-hidden="true"></i> |Microsoft Solution INC  </p>
          </div>
          <div class="width-33">
            <i class="fa fa-briefcase" aria-hidden="true"></i>0-4 Years
          </div>
          <div class="width-33">
            <i class="fa fa-inr" aria-hidden="true"></i>20k-25k/monthly
          </div>
          <div class="width-33">
            <i class="fa fa-map-marker" aria-hidden="true"></i>remote
          </div>
          <div class="width-100">
            <p class="job-skill">
              <b>Skills : </b>CANVA,ADOBE PREMIRE PRO,FLORA
            </p>
          </div>
          <div class="width-100">
            <a href="apply.jsp" class="job-apply-button">Apply Now</a>
          </div>
        </div>
      </div>
      <!-----JOB LIST------>
      <div class="width-50">
        <div class="recent-job-list">
          <div class="width-100">
            <h4 class="job-title">Computer Vision Engineer</h4>
            <p class="job-company"> <i class="fa fa-star" aria-hidden="true"></i> | Google Corporation</p>
          </div>
          <div class="width-33">
            <i class="fa fa-briefcase" aria-hidden="true"></i>0-2 Years
          </div>
          <div class="width-33">
            <i class="fa fa-inr" aria-hidden="true"></i>30k-50k/monthly
          </div>
          <div class="width-33">
            <i class="fa fa-map-marker" aria-hidden="true"></i>Remote
          </div>
          <div class="width-100">
            <p class="job-skill">
              <b>Skills : </b>Python,CNN,ML,API HANDELLING
            </p>
          </div>
          <div class="width-100">
            <a href="apply.jsp" class="job-apply-button">Apply Now</a>
          </div>
        </div>
      </div>
    <div class="width-50">
        <div class="recent-job-list">
          <div class="width-100">
        <% 
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jbweb", "tjas");

                String sql = "SELECT * FROM itjob_table";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
        %>
            <h4 class="job-title"><%=rs.getString("job_title")%></h4>
            <p class="job-company"><%=rs.getString("company")%> <i class="fa fa-star" aria-hidden="true"></i> | 234 Reviews </p>
          </div>
          <div class="width-33">
            <i class="fa fa-briefcase" aria-hidden="true"></i><%=rs.getString("experience")%>
          </div>
          <div class="width-33">
            <i class="fa fa-inr" aria-hidden="true"></i><%=rs.getString("salary")%>
          </div>
          <div class="width-33">
            <i class="fa fa-map-marker" aria-hidden="true"></i><%=rs.getString("location")%>
          </div>
          <div class="width-100">
            <p class="job-skill">
              <b>Skills : </b><%=rs.getString("skills")%>
            </p>
          </div>
          <div class="width-100">
            <a href="apply.jsp" class="job-apply-button">Apply Now</a>
          
        <% 
                }
                rs.close();
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                // Handle errors
            }
        %>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="width-25">
        <div class=" company-list">
          <div class="width-100">
            <div class="width-25 company-image">
              <img src="https://imgs.search.brave.com/0onedxgdJWLsAOrzVTbco23TxXLuDJGb_uBUL74bc7k/rs:fit:500:0:0/g:ce/aHR0cHM6Ly91cGxv/YWQud2lraW1lZGlh/Lm9yZy93aWtpcGVk/aWEvY29tbW9ucy9j/L2NhL0xpbmtlZElu/X2xvZ29faW5pdGlh/bHMucG5n">
            </div>
            <div class="width-75">
              <h4 class="company-name">Linkedin Company</h4>
              <p class="company-rating">
                <i class="fa fa-star" aria-hidden="true"></i>
                <i class="fa fa-star" aria-hidden="true"></i>
                <i class="fa fa-star" aria-hidden="true"></i>
                <i class="fa fa-star" aria-hidden="true"></i>
                <i class="fa fa-star " aria-hidden="true"></i>
              </p>
              <p class="company-review">( 874 Reviews)</p>
            </div>
          </div>
          <div class="width-50 company-address">New York, USA</div>
          <div class="width-50 company-opening">25 Job Opening </p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-------FEATURE SECTION FEATURE SECTION FEATURE SECTION------->
<div class="width-100 feature-sect">
    <div class="container">
      <div class="width-50">
        <div class="feature-panel">
          <img src="https://imgs.search.brave.com/Y_2Y5k4zukog-yibBlGT8xLy51CUZ6JH3-qQ0S-8X1s/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9pLnBp/bmltZy5jb20vb3Jp/Z2luYWxzLzk3LzEz/L2ZiLzk3MTNmYjZj/ZDJjMjFiNDdkYjk3/ZGRhMTZjOTU5YWU0/LS1oaXJpbmctZW1w/bG95ZWVzLWpvYi1o/dW1vci5qcGc" class="feature-img">
          <h4 class="feature-title">DO YOU WANT TO FIND A JOB ?</h4>
          <p class="feature-desc">You are at the right Place</p>
          <a href="it.jsp" class="feature-btn">Find Job</a>
        </div>
      </div>
      <div class="width-50">
        <div class="feature-panel">
          <img src="https://imgs.search.brave.com/HInhyOcVNKxXXSNkttUF2X7-ZFXnakbsWnjXQtPeWp0/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93d3cu/dXNjcmVlbi50di93/cC1jb250ZW50L3Vw/bG9hZHMvMjAyMS8x/MC9ob3ctdG8tc2Vs/bC1jb3Vyc2VzLW9u/bGluZS05MDZ4NTE1/LmpwZw" class="feature-img">
          <h4 class="feature-title"> ARE YOU LOOKING FOR A PLACEMENT ASSISTANCE COURSE ?</h4>
          <p class="feature-desc">Affortable and Cheep Courses are waiting for you</p>
          <a href="course.jsp" class="feature-btn">Find Courses</a>
        </div>
      </div>
    </div>
  </div>
  <!------FOOTER SECTION FOOTER SECTION FOOTER SECTION ------->
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
  <!------FOOTER SECTION FOOTER SECTION FOOTER SECTION ------>