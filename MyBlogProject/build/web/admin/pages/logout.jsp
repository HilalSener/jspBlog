<%
    session.invalidate();
    //kullan?c?y? login.jsp ye y�nlendir
    response.sendRedirect("login.jsp");
    return;
%>