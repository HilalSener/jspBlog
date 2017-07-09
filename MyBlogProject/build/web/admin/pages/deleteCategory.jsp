<%@page import="blog.source.DB"%>
<%
    request.setCharacterEncoding("UTF-8");
    
    DB db = new DB();

    String cat = request.getParameter("cat");
    String delete = "delete from category where category = '"+ cat +"'";
    
    delete = String.format(delete, cat);
    
    response.sendRedirect("category.jsp");
    
    db.query(delete);
%>