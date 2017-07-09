
<%@page import="org.apache.catalina.tribes.util.Arrays"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="blog.source.*"%>
<%
    try {
        request.setCharacterEncoding("UTF-8");

        Map<String, String[]> hm = request.getParameterMap();
        Iterator<String> it = hm.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String[] val = hm.get(key);

            out.println("<b>" + key + " :</b>" + Arrays.toString(val) + "<br />");
        }
        DB db = new DB();

        String options = "select * from category";
        db.query(options);
        
        //Post post = new Post();
        String title = request.getParameter("title");
        String cat = request.getParameter("cat");
        String imgUrl = request.getParameter("imgUrl");
        String pText = request.getParameter("pText");
        int cEnabled = request.getParameter("cEnabled") == null ? 0 : 1;

        if (title.isEmpty() || imgUrl.isEmpty() || pText.isEmpty()) {
            return;
        }

        //post.addPost(title, imgUrl, pText, cEnabled);
        String sql = "insert into post values(0, '%s', '%s', now(),'%s', '%s', %d)";
        sql = String.format(sql, title, cat, imgUrl, pText, cEnabled);

        //out.println("SQL : <br>" + sql);
        response.sendRedirect("forms.jsp");
        
        db.query(sql);

    } catch (Exception e) {
        out.println("Something is wrong!");
        out.println("<br />ERR : " + e.toString());
    }
%>


