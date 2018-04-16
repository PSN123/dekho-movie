<%-- 
    Document   : index
    Created on : Dec 25, 2017, 10:56:46 PM
    Author     : Pradeep Negi
--%>

<%@page import="java.util.List"%>
<%@page import="theater_partner.theatergetsetter"%>
<%@page import="theater_partner.theater"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="css/navbar1.css">
<!--<link rel="stylesheet" href="css/carosel-top.css">-->
<link rel="stylesheet" href="css/text.css" type="text/css">
<!--<Link rel="stylesheet" href="css/card.css" type="text/css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">-->
<style>
    #nav-right{
    font-size:20px;
    font-weight:bold; 
    }
    </style>
    </head>
    

    <script>
 $(window).scroll(function() {
    if($(this).scrollTop() > 50)  
    {
        $('.opaque-navbar').addClass('opaque');
    } else {
        $('.opaque-navbar').removeClass('opaque');
    }
});


</script>
    <body >
    <div class="container-fluid">
<div class="navbar navbar-inverse navbar-fixed-top opaque-navbar">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navMain">
  <span class="glyphicon glyphicon-chevron-right" style="color:white;"></span>
    
  </button>
      <a class="navbar-brand" href="#" style="font-family:fantasy;font-size:30px;color:white;  ">WB</a>
    </div>
    <div class="collapse navbar-collapse" id="navMain">
      <ul id="nav-right" class="nav navbar-nav pull-right">
        <li class="active"><a href="#"><span class="glyphicon glyphicon-Home">Home</a></li>
        <li><a href="aboutus.jsp">About Us</a></li>
<!--       <li><a href="SingUpPage.jsp" ><span class="glyphicon glyphicon-user"><b>Sign-up</b></span></a></li>--> 
        <li><a href="LoginPage.jsp"><span class="glyphicon glyphicon-log-in"><b> Admin</b></span></a></li>
        <li></li>  </ul>
    </div>
  </div>
</div>
</div>
<!-- <section class="banner"> -->
<!-- <div class="container" > -->
<!-- <div class="row" > -->
  <!-- </div> -->
  <!-- </div> -->
  <!-- </section> -->
  <div class="container-fluid" style="background-color: Black;">
      <div class="row">
          <div class="col-lg-12">
  <div id="myCarousel" class="carousel slide" data-ride="carousel" >
    <!-- Indicators -->
   
    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="http://res.cloudinary.com/warmachinewarrior/image/upload/v1520072765/blacky_fs8xfb.jpg" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="http://res.cloudinary.com/warmachinewarrior/image/upload/v1520336273/death_najmyv.png" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="http://res.cloudinary.com/warmachinewarrior/image/upload/v1515754909/dtlbkcw5ixkpn0yzabgl.jpg" alt="New york" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
 </div>
      </div><br><br><hr>
<!-- Modal	 -->
	
	<!-- <modal image end> -->
        
        
        <!--payments modes-->
         <div class="container-fluid">
   
                 <div class="jumbotron-fluid"> 
                     <span><center><p class="text-muted" style="font-size:20px; ">MORE BENEFITS WITH MORE WAYS TO SHOP AND PAY</p></center>
             <div class="col-md-3">
        <center><span class="glyphicon glyphicon-globe" style="font-size:75px;"></span></center>
                    <center><p class="text" style="font-size:20px; "><b>Shop in India and around world</b></p>
                    <small class="text-muted">Signing up for a pay account is an easy process Make sure you have your personal details ready.</small>
                    </center>
                
             </div> 
        <div class="col-md-3">
            <center><span class="glyphicon glyphicon-credit-card" style="font-size:75px;"></span></center>
           <center><p class="text" style="font-size:20px; "><b>Pay without worries</b></p>
                    <small class="text-muted">With 24/7 fraud detection,we work around the clock to keep your account safe and secure.</small>
                    </center>
            
                 </div>
                 <div class="col-md-3">
                     <center><span class="glyphicon glyphicon-lock" style="font-size:75px;"></span></center>
               <center><p class="text" style="font-size:20px; "><b>Your purchases are protected</b></p>
                    <small class="text-muted">We cover you for eligible purchases if an item doesn't reach you or if its not as the seller described it.</small>
                    </center>     
                 </div>
                     <div class="col-md-3">
                     <center><span class="glyphicon glyphicon-shopping-cart" style="font-size:75px;"></span></center>
               <center><p class="text" style="font-size:20px; "><b>Faster checkout</b></p>
                    <small class="text-muted">Speed through checkout at millions of brands that accept KardPay.</small>
                    </center>
                     
                     </div>
                 </div>
     </div>
        
<%--  <%@include file="water.html"%>--%>
 

         
	
	<!-- Movies now in theatre -->
  
        <br><br>
      <div class="container-fluid">
     
        <div class="row">
      
        <%
       theater th=new theater();
       List<theatergetsetter> list= th.get();
       %> 
 <% for(theatergetsetter st:list){
     System.out.print(st.getSelect_movie());
     %> 
       <div class="col-sm-4">
          <div class="card" style="box-shadow: 10px 10px 5px grey; font-size:30px; text-align: center; ">
      <div class="card-header"></div>
      <div class="card-body">
      <center><img src="<%=st.getImage()%>" style="width:100%; height:350px; margin-left: 2%;"></center>
      </div><br>
    <div class="card-footer"><hr>
        <%=st.getSelect_movie()%><hr>
      <%=st.getSelect_theater_location()%>
          <b><%=st.getSelect_time()%></b>
    
    <form action="SEAT.jsp" method="post">
        <input type="hidden" name="image" value="<%=st.getImage()%>">
<input type="hidden" name="name" value="<%=st.getSelect_movie()%>">
<input type="hidden" name="location" value="<%=st.getSelect_theater_location()%>">
<input type="hidden" name="time" value="<%=st.getSelect_time()%>">
<input type="hidden" name="date" value="<%=st.getSelect_date()%>" >
        <input type="submit" class="btn btn-primary btn-block" value="Book Now">
        </form>
        
        
        </div>
      </div>
            </div>
     <%}%>
     
      </div>
    </div>
    
    
    <br><br>


   

</body>
</html>
