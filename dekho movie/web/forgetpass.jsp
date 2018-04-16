<%-- 
    Document   : forgetpass
    Created on : Jan 13, 2018, 10:34:19 PM
    Author     : Pradeep Negi
--%>

<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.Session"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<%--<%@page import="signup.email_send" %>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          try{ 
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
          Statement st=con.createStatement();
          String email=request.getParameter("email");
          String str="select count(*) from signup where email='"+email+"'"; 
      ResultSet rs=st.executeQuery(str);
      rs.next();
      String Countrow=rs.getString(1);
      if(Countrow.equals("1")){
      
       try{
            String host="smtp.gmail.com";
      String user="pradeep.negi01000@gmail.com";
      String password="R160020100700";
      System.out.println("gs.getEmail()"+email);
      String to=email;
      String from="pradeep.negi01000@gmail.com";
      String subject="Success";
      String messageText="your account has been successfully Created";
      
      boolean sessionDebug=false;
      
      Properties props=System.getProperties();
      
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.hist",host);
      props.put("mail.smtp.port", "587");
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.required", "true");
      
      
    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
    Session mailSession=Session.getDefaultInstance(props,null);
    mailSession.setDebug(sessionDebug);
    Message msg=new MimeMessage(mailSession);
    msg.setFrom(new InternetAddress(from));
    InternetAddress[] address={new InternetAddress(to)};
    msg.setRecipients(Message.RecipientType.TO, address);
    msg.setSubject(subject);
  //  msg.setSentDate(new Date());
    msg.setText(messageText);
    
    Transport transport=mailSession.getTransport("smtp");
   transport.connect(host,user,password);
   transport.sendMessage(msg, msg.getAllRecipients());
transport.close();
       
out.print("your password successfully send to given eamil");
               
                
       
       
       }
      catch(Exception e)
      {e.printStackTrace();
              }
      
       out.print("Password send to your Mail if successfully");
      }else{
          out.print("invalid address");
              
              }       
      
      
       
  }catch(Exception e){
  e.printStackTrace();};
         
            %>
    
    </body>
</html>
