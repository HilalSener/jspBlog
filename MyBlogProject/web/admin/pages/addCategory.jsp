<%@page import="blog.source.DB"%>
<%
    request.setCharacterEncoding("UTF-8");
    
    DB db = new DB();

    String cat = request.getParameter("cat");
    String add = "insert into category values(0, '%s')";

    add = String.format(add, cat);

    if (cat.isEmpty()) { return; }
    
    response.sendRedirect("category.jsp");
    
    db.query(add);
%>