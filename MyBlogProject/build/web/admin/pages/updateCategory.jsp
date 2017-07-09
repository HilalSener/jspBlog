<%@page import="blog.source.DB"%>
<%
    request.setCharacterEncoding("UTF-8");
    
    DB db = new DB();

    String cat = request.getParameter("cat");
    String id = request.getParameter("cat_id");
    //String delete = "delete from category where category = '"+ cat +"'";
    String update = "update category set category='"+ cat +"' WHERE category_id='"+ id +"'";
    
    update = String.format(update, cat);
    
    //response.sendRedirect("category.jsp");
    
    db.query(update);
%>