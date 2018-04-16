<%-- 
    Document   : shows
    Created on : Apr 12, 2018, 3:05:33 PM
    Author     : Pradeep Negi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="theater_partner.theater"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <%
 theater th=new theater();
 ArrayList al=(ArrayList)th.get();
 Iterator i=al.iterator();
 System.out.println("value a rhi hai "+i);
 %>
    <c:set var="val" scope="page" value="<%=al%>"/>
<div class="container-fluid">
    <table class="table table-striped">
<thead>
    <tr style="background-color: black;color:white; font-size: 20px;">
    <th>Id</th>
<th>Poster</th>
<th>Movie</th>
<th>Theater </th>
<th>Date</th>
<th>Time</th>
</tr>   
</thead>

<tbody>
<c:forEach var="j" items="${val}">
    <tr>

        <td>${j.getId()}</td>
<td><img class="img-rounded" style="width:20%;" src="${j.getImage()}"></td>

        <td>${j.getSelect_movie()}</td>
<td>${j.getSelect_theater_location()}</td>
<td>${j.getSelect_date()}</td>
<td>${j.getSelect_time()}</td>
    </tr>
</c:forEach>
</tbody>    
    </table>
    

</div>    
</body>
</html>
