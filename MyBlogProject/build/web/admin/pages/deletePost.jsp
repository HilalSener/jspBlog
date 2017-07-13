<%@page import="blog.source.DB"%>
<%
    request.setCharacterEncoding("UTF-8");
    
    DB db = new DB();

    String del = request.getParameter("del");
    String delete = "delete from post where post_title = '"+ del +"'";
    
    delete = String.format(delete, del);
    
    response.sendRedirect("editPost.jsp");
    
    db.query(delete);
%>