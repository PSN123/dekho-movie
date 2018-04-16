<%-- 
    Document   : logout
    Created on : Jan 25, 2018, 5:42:16 PM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
  
    
      
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
        HttpSession sp=request.getSession();
        String a=(String)sp.getAttribute("username");
out.print("welcome" + a);
        sp.invalidate();

        
       RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            
        %>
       
        <h1></h1>
    </body>
</html>
