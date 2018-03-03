<%-- 
    Document   : main
    Created on : Sep 3, 2017, 2:21:55 AM
    Author     : sawar
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
        try
        {
            String unm=request.getParameter("username");
            String pwd=request.getParameter("password");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?kaka","kaka","kaka");
            PreparedStatement stmt=con.prepareStatement("select password,fname,lname from registration where email=?");
                stmt.setString(1, unm);
                ResultSet rs=stmt.executeQuery();
                rs.next();
                String password=rs.getString(1);
                String name=rs.getString(2)+" "+rs.getString(3);
                
                if(pwd.equals(password))
                {
                    %>
                    <h1>WELCOME : <%=name%></h1>
                    <%
                }
                else
                {
                    out.println("<br><center><h1>wrong username or password</h1></center>");
                }
        }
        catch(Exception e)
        {
            out.println("wrong username or password"+e);
        }

            %>
    </center>
    </body>
</html>
