<%-- 
    Document   : admin
    Created on : Nov 24, 2023, 3:34:44 AM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Admin Panel</title>
<style>
body {
  margin: 0;
  padding: 0;
  font-family: Arial, sans-serif;
}

.admin-panel {
  display: flex;
}

.sidebar {
  width: 250px;
  background-color: #000;
  color: #fff;
  padding: 20px;
}

.sidebar h2 {
  margin-bottom: 20px;
  text-align: center;
}

.sidebar ul {
  list-style: none;
  padding: 0;
}

.sidebar ul li {
  margin-bottom: 79px;
}

.sidebar ul li a {
  text-decoration: none;
  color: #fff;
}
.banner-section {
	background-image: url('https://imgs.search.brave.com/P2FlIlrXxhqDXxvd0fyQx8XHtMWjDiOvCzH7i6PnDhw/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93d3cu/YmFubmVyaGVhbHRo/LmNvbS8tL21lZGlh/L2ltYWdlcy9wcm9q/ZWN0L2JoL2hlcm8t/aW1hZ2VzL2Zvci1l/bXBsb3llZXMvZW1w/bG95ZWVzLWhlcm8u/YXNoeD9oPTQ2MSZ3/PTE5MjAmaGFzaD1D/QTEyQUVBMEU3ODdE/QjY4RTY5MUREOERF/QjMxNjNFMg');
	background-repeat: no-repeat;
	background-size: cover;
	text-align: center;
	height: 450px;
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

.content {
  flex: 1;
  padding: 20px;
}

.info-box {
  background-color: #f0f0f0;
  padding: 20px;
  border-radius: 5px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}
.info-box h2,p{
 text-align:center;
}

</style>
</head>
<body>
  <div class="admin-panel">
    <div class="sidebar">
      <h2>Dashboard</h2>
      <ul>
        
        <li><a href="userdisplayer.jsp">User Details Table</a></li>
         <li><a href="applicationdisplayer.jsp">Application_Details Table</a></li>
          <li><a href="feedbackdisplayer.jsp">Feedback Table</a></li>
        	<li><a href="itdisplayer.jsp">IT jobs table</a></li>
		<li><a href="bpodisplayer.jsp">BPO jobs table</a></li>
		<li><a href="salesdisplayer.jsp">SALES jobs table</a></li>
		<li><a href="managementdisplayer.jsp">Management jobs table</a></li>
        <!-- Add more sidebar options -->
      </ul>
    </div>
    <div class="content">
     <div class="content">
      <div class="info-box">
        <h2>Welcome, Admin!</h2>
        <p>This is the admin panel. Explore the sidebar options for more.</p>
      </div>
<div class="width-100 banner-section">
    <div class="container">
      
      <h1 class="banner-heading">WELCOME TO THE FUTURE OF JOB PORTALS</h1>
      
      
    </div>
  </div>
      <div class="info-box">
        <h2>To add job in homepage recent section</h2>
        <p> <a href ="addjob1.jsp">click here</a></p>
	 <h2>To Delete job in homepage recent section</h2>
        <p> <a href ="deletejob.jsp">click here</a></p>
      </div>
      
      <div class="content">
      <div class="info-box">
        <h2>To add job in IT  section</h2>
        <p> <a href ="addjobit.jsp">click here</a></p>
	 <h2>To Delete job in IT section</h2>
        <p> <a href ="deletejobit.jsp">click here</a></p>
      </div>
     <div class="content">
      <div class="info-box">
        <h2>To add job in BPO section</h2>
        <p> <a href ="addjobbpo.jsp">click here</a></p>
	 <h2>To Delete job in BPO section</h2>
        <p> <a href ="deletejobbpo.jsp">click here</a></p>
      </div>
      <div class="content">
      <div class="info-box">
       <h2>To add job in Sales section</h2>
        <p> <a href ="addjobsales.jsp">click here</a></p>
	 <h2>To Delete job in Sales section</h2>
        <p> <a href ="deletejobsales.jsp">click here</a></p>
      </div>
      <div class="content">
      <div class="info-box">
        <h2>To add job in Management  section</h2>
        <p> <a href ="addjobmanagement.jsp">click here</a></p>
	 <h2>To Delete job in Management  section</h2>
        <p> <a href ="deletemanagement.jsp">click here</a></p>
      </div>
    </div>
  </div>
</body>
</html> 