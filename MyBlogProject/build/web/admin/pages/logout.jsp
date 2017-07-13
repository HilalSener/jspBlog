<%
    session.invalidate();
    //kullan?c?y? login.jsp ye yönlendir
    response.sendRedirect("login.jsp");
    return;
%>