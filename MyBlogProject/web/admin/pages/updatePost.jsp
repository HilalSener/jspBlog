<%@page import="blog.source.DB"%>
<%
    request.setCharacterEncoding("UTF-8");

    DB db = new DB();

    String id = request.getParameter("post_id");
    String title = request.getParameter("title");
    String imgUrl = request.getParameter("imgUrl");
    String pText = request.getParameter("pText");
    int cEnabled = request.getParameter("cEnabled") == null ? 0 : 1;

    String update = "update post set post_title='" + title + "', post_date= now(), post_img_url='" + imgUrl + "', post_text='" + pText + "', comments_enabled='" + cEnabled + "' WHERE post_id='" + id + "'";

    update = String.format(update, title, imgUrl, pText, cEnabled);

    response.sendRedirect("editPost.jsp");

    db.query(update);
%>