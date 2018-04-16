
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="signup.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
int U_D_id=Integer.parseInt(request.getParameter("U_D_id"));

signuinter si=new signuinter();
si.delete(U_D_id);
response.sendRedirect("signupcurd.jsp");
//System.out.println("balle balle"+U_D_id);
%>

    </body>
</html>
