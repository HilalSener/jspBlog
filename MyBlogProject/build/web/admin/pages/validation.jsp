<%-- 
    Document   : validation
    Created on : Jul 5, 2017, 5:42:14 PM
    Author     : HilalSener
--%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="blog.source.DB"%>
<%
    try
    {
        DB db = new DB();
        String uname = request.getParameter("uname");
        String password = request.getParameter("password");
        
        PreparedStatement pst =  db.conn.prepareStatement("select username, password from admin where username=? and password=?");
        pst.setString(1, uname);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();                        
        if(rs.next())   
        {
            //out.println("Valid login credentials");        
            response.sendRedirect("forms.jsp");
        }
        else
           out.println("Invalid login credentials");            
    }
    catch(Exception e)
    { 
        out.println("Something went wrong !! Please try again");    
    }
%>
