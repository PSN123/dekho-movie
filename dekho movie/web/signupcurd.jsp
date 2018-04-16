<%-- 
    Document   : signupcurd
    Created on : Jan 23, 2018, 1:57:28 PM
    Author     : Pradeep Negi
--%>

<%@page import="signup.usersign"%>
<%@page import="java.util.Iterator"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="signup.getset"%>
<%@page import="signup.signuinter"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    </head>
    
    <body>
        <%
             usersign us=new signuinter();
        ArrayList list=(ArrayList)us.get();
        Iterator i=list.iterator();
        System.out.print("value of list is :"+ i);
         %>
    <c:set var="val" scope="page" value="<%=list%>"/>
        
     <div class="container-fluid"> 
     <table class="table table-striped"> 
         <thead>
             <tr>
                 <th>id</th>
                 <th>firat_name</th>
                 <th>last_name</th>
                 <th>username</th>
                 <th>password</th>
                 <th>Email</th>
                 <th>Contact</th>
                 <th>Delete</th>
                 <th>Update</th>
                
             </tr>
         </thead>
          <tbody>
  
                      <c:forEach var="j" items="${val}">
 <tr>
    
     <td>${j.getId()}</td>
     <td>${j.getFirat_name()}</td>
     <td>${j.getLast_name()}</td>
     <td>${j.getUsername()}</td>
     <td>${j.getPassword()}</td>
     <td>${j.getEmail()}</td>
     <td>${j.getContact()}</td>
     <td><a href="deleteuser.jsp?U_D_id=${j.getId()}"  class="btn btn-danger" role="button">Delete</a>
   

     </td>     
     <td><button class="btn btn-success" data-toggle="modal" data-target="#mo${j.getId()}">Update</button></td>     
 </tr>
    <div class="modal fade" id="mo${j.getId()}" role="dialog">
<div class="modal-dialog"> 
<div class="modal-content">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal>&times;"></button>
        <h4 class="modal-tittle" style="text-align: center; font-family:cursive;font-size:20px; ">Update your details</h4>
    </div>
        
        <form action="update" >
    <div class="form-group">
            <label>First Name:</label>
<input type="hidden" name="id" value="${j.getId()}">
<input type="text" class="form-control" name="first_name" id="first_name" value="${j.getFirat_name()}">
      </div>
         
             <div class="form-group">
           <label>Last Name:</label>
           <input type="text" class="form-control" name="last_name" id="last_name" value="${j.getLast_name()}"  >
             </div>     
         
             <div class="form-group">
           <label>Username:</label>
          <input type="text" class="form-control" name="username" id="username" value="${j.getUsername()}" >
         </div>
          
           <div class="form-group">        
           <label>password:</label>
           <input type="text" class="form-control" name="Password" id="Password" value="${j.getPassword()}" >
           </div>
           
           <div class="form-group">
           <label>Email:</label>
           <input type="email" class="form-control" name="email" id="email" value="${j.getEmail()}" >
         </div>

         <div class="form-group">
         <label>Contact:</label>
           <input type="number" class="form-control" name="contact" id="contact"  value="${j.getContact()}">
          </div>
    
           
        <div class="modal-footer">
       </div>
           <input type="submit" value="update"  class="btn btn-success" role="button">
         </div>    
          </form>

</div>
        </div>
       
         
                       
                       
                     
                          
                      </c:forEach>
        
     </tbody>
     </table>
     </body>
</html>
