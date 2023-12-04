<%-- 
    Document   : course
    Created on : Nov 20, 2023, 2:31:44 PM
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
<html>
    <head>
        <link rel="stylesheet" href="course.css">
        <script src="https://kit.fontawesome.com/92d70a2fd8.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="header">
            <p class="logo" style="width:70%">
          <img src="img\mainlogo.png">
        </p>
        <a href="home.jsp"> <p style="color:black" >Home</p></a>
		 <p style="color:black">Jobs</p>
                 <a href="feedback.jsp"> <p style="color:black">Contact us</p></a>
                         <div class="dropdown">
    <button class="dropbtn"  style="color:black">Services
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="it.jsp">apply for jobs</a>
      <a href="course.jsp">trainings</a>
      
    </div>
  </div>
                        
            
			
                         <p> <a href="http://localhost:8080/Job_Portal/user_profile"> Welcome<%=user%></a></p><br>
                        <p>        </p>
                                    <p><a href="http://localhost:8080/Job_Portal/logout">Logout</a></p>
            
        </div>
<div class="width-100 banner-section">
    <div class="heading">
      <h1 class="banner-heading" style="align:center">Discover, Learn, Succeed: Find Your Perfect Course Here!</h1>
      <p class="banner-para" style="align:center">Master New Skills: Choose from Hundreds of Expert-Led Courses</p>
      
    </div>
  
  </div>
<div class=heading>
<h1 style="text-align:center">Courses</h1>
</div>
        <div class="container">
             
            <div id="root"></div>
            <div class="sidebar">
                <div class="head" style="color:black"><p>My Cart</p><div class="cart"><i class="fa-solid fa-cart-shopping"></i><p id="count">0</p></div></div>
                <div id="cartItem">Your cart is empty</div>
                <div class="foot">
                    <h3>Total</h3>
                    <h2 id="total"> 0.00</h2>
                   <button id="rzp-button1">Pay</button>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script>
var options = {
    "key": "rzp_test_HNVfGiRgUfDmZk", // Enter the Key ID generated from the Dashboard
    "amount": "5000000", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
    "currency": "INR",
    "name": "Acme Corp", //your business name
    "description": "Test Transaction",
    "image": "https://example.com/your_logo",
    "order_id": "order_N1QoOFh2ImTCj2", //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
    "callback_url": "https://eneqd3r9zrjok.x.pipedream.net/",
    "prefill": { //We recommend using the prefill parameter to auto-fill customer's contact information especially their phone number
        "name": "Gaurav Kumar", //your customer's name
        "email": "gaurav.kumar@example.com",
        "contact": "9000090000" //Provide the customer's phone number for better conversion rates 
    },
    "notes": {
        "address": "Razorpay Corporate Office"
    },
    "theme": {
        "color": "#3399cc"
    }
};
var rzp1 = new Razorpay(options);
document.getElementById('rzp-button1').onclick = function(e){
    rzp1.open();
    e.preventDefault();
}
</script>
                </div>

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
        <script src="course.js"></script>
    </body>
</html>
