<%-- 
    Document   : application.jsp
    Created on : Nov 19, 2023, 1:54:33 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Upload PDF Form</title>
</head>
<body>
    <form action="http://localhost:8080/Job_Portal/application" method="post" enctype="multipart/form-data">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="pdfFile">Upload PDF:</label>
        <input type="file" id="pdfFile" name="pdfFile" accept=".pdf" required><br><br>
        
        <input type="submit" value="Upload">
    </form>
</body>
</html>
