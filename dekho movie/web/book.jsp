<%-- 
Document   : book
Created on : Dec 26, 2017, 11:26:40 PM
Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="ullu/owl.theme.css" rel="stylesheet" type="text/css"/>
<link href="ullu/owl.carousel.css" rel="stylesheet" type="text/css"/>
<script src="ullu/owl.carousel.min.js" type="text/javascript"></script>
<link href="ullu/owl.transitions.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="css/seat.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="css/carosel-top.css">
<link rel="stylesheet" href="css/text.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  </head>
<style>
b{
font-family:cursive;
font-size: 20px;
}
#img{
position: absolute;
left: 0px;
top: 0px;
z-index: 2;
margin-top:12%; 
margin-left:1%;

}

#btn{
position:absolute;
left: 0px;
top: 0px;
z-index: 1;
margin-top:10%; 
margin-left:50%;
transition: transform.2s;

}
#btn:hover{
transform: scale(1.5);
} 
.caption{
position: absolute;
left: 0px;
top: 0px;
margin-top:20%;
margin-left:20%;
cursor: pointer;
font-size:20px;       
z-index:1;            
}


</style>
<script>

$(document).ready(function(){

$("#owl").owlCarousel({
    autoPlay:3000,
    pagination:false,
    items:4,
    itemsDesktop:[1199,3],
    itemsDesktopSmall:[979,3]

});
});

$(document).ready(function(){


    var movie_id;
   $.getJSON("https://api.themoviedb.org/3/search/movie?api_key=370be6972dc90780d69d3fb2e0571d2a&query=pari").then(function (response)
   {
       movie_id=response.result[0].id;
       
       $.getJSON("https://api.themoviedb.org/3/movie/"+response.result[0].id+"/images?api_key=370be6972dc90780d69d3fb2e0571d2a").then(function (response)
       {
          console.log("chal ja bhai :"+ response); 
       });
   }); 


});

   
   
    
    </script>
<body>

<div class="top">
<img id="back" class="img-responsive" src="http://res.cloudinary.com/warmachinewarrior/image/upload/v1520072765/blacky_fs8xfb.jpg" alt="not found" Style="width:100%; height:auto; opacity:0.8;">      
<div class="bg">
<li href="#" id="btn" class="fa fa-play-circle" role="button" data-toggle="modal" data-target="#custom-modal" style="font-size:100px;color:silver;"></li>   

<div class="modal fade" id="custom-modal" role="dialog" >
<div class="modal-dialog " style="width:100%; height:auto; ">
<div class="modal-content" style="background-color:black; ">
<div class="modal-header">
<button type="button" class="close" data-dismiss="modal">close</button>
</div>
<div class="modal-body">
<center><iframe id="video" style="width:100%; height:500px" src="https://www.youtube.com/embed/xjDjIWPwcPU?rel=0&amp;autoplay=1" autoplay:1 color:white ></iframe></center>
</div>
</div>
</div>
</div>


</div>
</div>

<div class="caption">
<div class=" label label-info " style="margin-left:10%; color:white;">Action</div>   
<div class=" label label-info" style="margin-left:10%; color:white; ">Adventure</div>   
<div class=" label label-info" style="margin-left:10%; color:white; ">Fantasy</div>   
</div>
<div class="container-fluid">
<img class="img-responsive" id="img" src="http://res.cloudinary.com/warmachinewarrior/image/upload/c_scale,q_99,w_241/v1520160948/poster_kgkl4b.jpg" alt="not found" Style="width:20%; height:auto;" >
</div>
<br><br><br><br><br>        

<div class="container-fluid" >        
<div class="row">
    <div class="col-sm-4">
<h2><span>Please Select a Theater</span></h2>	

<div class="panel panel-default">

<div class="panel-header" style="background-color:lavender; font-family:cursive; font-size:35px;text-align:center;  "><B>Ticket Available</b></div>

<div class="panel-body">
<p><b>Saket PVR  </b>
<a href="#"class="btn btn-lg" onclick="openNav()">  9:10 am</a> 
<a href="#"class="btn btn-lg" onclick="openNav()">  9:10 am</a> 
<a href="#"class="btn btn-lg" onclick="openNav()">  9:10 am</a> 
<a href="#"class="btn btn-lg" onclick="openNav()">  9:10 am</a> 
<a href="#" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">book now</a>
</div>
</div>
    </div>
    
<div class="col-sm-4" >

<div class="card bg-primary text-white">
<div class="card-header" style="font-size:30px" >Cast & Crew</div>
</div>
<div class="card-body">
<b><i><h3>Plot</h3></i></b>
<div class="text text-muted" style="font-size:20px;  " >
<i> After the death of his father, T'Challa returns home to the African nation of Wakanda to take his rightful place as king. When a powerful enemy suddenly reappears, T'Challa's mettle as king -- and as Black Panther -- gets tested when he's drawn into a conflict that puts the fate of Wakanda and the entire world at risk. Faced with treachery and danger, the young king must rally his allies and release the full power of Black Panther to defeat his foes and secure the safety of his people.</i>    
</div>



</div></div>

<div class="col-sm-4">
<div class="card" style="background-color: lavender;">
<div class="card-header"></div>
<div class="card-body">
<button class="btn btn-block btn-danger">CORPORATE BOOKING</button>
</div>
<h4>Related News</h4>
<b>An Ancient Time Warrior of Waganda</b>
</div>
</div>
</div>
</div>

<div class="container-fluid">
<div class="row">
    <div class="col-lg-12 col-sm-12">
    <div class="text bg-primary"><h1>Cast</h1></div> 
<%@include file="actors.html"%>
<div class="card-footer">
<div class="text text bg-primary"><h1>Crew</h1></div>
</div>
</div>
</div>
</div>
   <!--            
</div>-->

<!--        
   -->
<!--            <p><b>DLF Promnade Vsant Kunj</b>
   <a href="#"class="btn btn-lg">  11:10 am</a> 
   <a href="#"class="btn btn-lg">  2:10 pm</a> 
   <a href="#"class="btn btn-lg">  5:10 pm</a> 
   <a href="#"class="btn btn-lg">  7:10 pm</a></p><hr> 

    <p><b>DLf Select City Walk</b>
   <a href="#"class="btn btn-lg">  11:10 am</a> 
   <a href="#"class="btn btn-lg">  2:10 pm</a> 
   <a href="#"class="btn btn-lg">  5:10 pm</a> 
   <a href="#"class="btn btn-lg">  7:10 pm</a></p><hr> 

    <p><b>Ambience Mall Gurugram</b>
   <a href="#"class="btn btn-lg">  11:10 am</a> 
   <a href="#"class="btn btn-lg">  2:10 pm</a> 
   <a href="#"class="btn btn-lg">  5:10 pm</a> 
   <a href="#"class="btn btn-lg">  7:10 pm</a></p><hr> -->

    </div>
    </div>
</div>
    </div>
<div class="container-fluid">

<!-- Modal -->
<div class="modal fade" id="myModal" role="dialog">
<div class="modal-dialog " style="width:80%; height:auto;">
<div class="modal-content">
<div class="modal-header">
  <button type="button" class="close" data-dismiss="modal">&times;</button>
  <h4 class="modal-title">Modal Header</h4>
</div>
<div class="modal-body">

<div class="row">
<nav class="navbar navbar-default " style="background-color:black; text-align:center;  " >
<div class="container-fluid">
<div class="navbar-header">
</div>
<!-- <ul class="nav navbar-nav pull-right"> -->
<!-- <li class="active"><a href="#">Home</a></li> -->
<!-- <li><a href="#">Page 1</a></li> -->
<!-- <li><a href="#">Page 2</a></li> -->
<!-- <li><a href="#">Page 3</a></li> -->
<!-- </ul> -->
</div>
</nav>
<marquee direction="left" style="font-size:20px;">
<span style="font-size:20px;"><b><i>Watch Awesome Movie</b></i></span>
<span style="font-size:20px; color:blue;"><i>Exclusive Shows</i></span>
<span style="font-size:20px; "><u>Action</u></span>
<span style="font-size:20px;"><b>Drama</b></span>
<span style="font-size:20px;">Comedy</span>
<span style="font-size:20px; color:red;">Romance</span>
<span style="font-size:20px;"><u><i><b>only on Dekho Movie Dil se<b/></i></u></span>
</marquee>   

<div class="col-sm-8" > 

<div class="card" style="">
<div class="card-header">
<center><label style="font-size:40px;background-color:Black;color:white;margin-top:0.5%; ">ALL Eyes Here</label></center>          </div>
<div class="card-body" style="margin-top:1%;">
<input id="three" type="checkbox">
<label for="three">C1</label>




</div>
<div class="card-footer">

</div>
</div>
</div> 

<div class="col-sm-4">
<h1 style="text-align:center; color:black; box-shadow: 5px 10px 70px #333333;">BlankSpace</h1> 
</div> 
</div>
</div>
</div>
 </div>
</div>
</div>

<!-- Use any element to open/show the overlay navigation menu -->

<script>
function openNav() {
document.getElementById("myNav").style.width = "100%";
}

/* Close when someone clicks on the "x" symbol inside the overlay */
function closeNav() {
document.getElementById("myNav").style.width = "0%";
}
</script>
</body>
</html>
