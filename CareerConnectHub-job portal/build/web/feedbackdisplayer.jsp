<%-- 
    Document   : feedbackdisplayer
    Created on : Nov 24, 2023, 2:28:05 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleResultSetMetaData"%>
<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OracleConnection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Record Displayer</title>
        <!--STEP 2: ADDING A INTERNAL STYLE FOR TABLE-->
         <style>
                  table, tr, td
                {
                    padding: 10px;
                    border: 5px solid blue;
                    border-collapse: collapse
                }
                th
                {
                    padding: 10px;
                    border: 5px solid blue;
                    border-collapse: collapse;
                    color: black;
                }
            </style>
    </head>
    <%!
        // STEP 3: DECLARING OBJECTS AND VARIABLES
            OracleConnection oconn;
            OraclePreparedStatement ops;
            OracleResultSet ors;
            OracleResultSetMetaData orsmd;
            int counter, reccounter, colcounter;
        %>
        <%
            // STEP 4: REGISTRATION OF ORACLE DRIVER
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            
            // STEP 5: INSTANTIATING THE CONNECTION
            oconn = 
                    (OracleConnection)
                    DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:orcl","jbweb","tjas");
            
            // STEP 6: INSTANTIATING THE STATEMENT OBJECT
            ops = (OraclePreparedStatement)oconn.prepareCall("select * from feedback");
            
            // STEP 7: FILLING UP THE DATABASE RECORDS IN A TEMPORARY CONTAINER
            ors = (OracleResultSet)ops.executeQuery();
            
            // STEP 8: GETTING THE COLUMNS INFORMATION(METADATA)
            orsmd = (OracleResultSetMetaData)ors.getMetaData();
            %>
    <body style="background-color: ">
        <!--STEP 1: BASIC STRUCTURE OF A TABLE-->
        <table>
            <thead>
                <tr>
                    <%
                        // STEP 9: BRINGING THE TABLE HEADINGS
                        for(counter = 1; counter <= orsmd.getColumnCount(); counter ++)
                        {
                        %>
                        <th><%=orsmd.getColumnName(counter)%></th>
                        <%
                            }
                        %>
                     
                </tr>
            </thead>
            <tbody>
                <%
                    // STEP 10: BRINGING ALL THE RECORDS AND DISPLAYING AS TABLE ROWS
                    while(ors.next() == true)
                    {
                    %>
                <tr>
                    <%
                       for(counter = 1; counter <= orsmd.getColumnCount(); counter ++)
                        {
                        %>
                        <th><%=ors.getString(counter)%></th>
                        <%
                            }
                        %>
                    
                <%
                    }
                    %>
            </tbody>
            <tfoot>
                <tr>
                    <th colspan="10">&copy; TECHNO INDIA &reg; TECHNOLOGIES &trade;</th>
                </tr>
            </tfoot>
        </table>
                    <%
                        // STEP 11: CLOSING THE CONNECTIONS
                        ors.close();
                        ops.close();
                        oconn.close();
                        %>
    </body>
</html>
