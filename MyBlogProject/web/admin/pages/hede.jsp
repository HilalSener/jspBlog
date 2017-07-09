<%-- 
    Document   : hede
    Created on : Jul 6, 2017, 10:55:45 AM
    Author     : HilalSener
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="blog.source.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            DB db = new DB();
            ResultSet rs = db.execute("select now() as 'SuAn'");
            rs.next();
            out.println(rs.getString(1));
            %>
    </body>
</html>
