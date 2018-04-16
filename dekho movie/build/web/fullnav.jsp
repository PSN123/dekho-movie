 <!DOCTYPE html>
<!--
To change this template file, choose Tools | Templates
and open theTo change this license header, choose License Headers in Project Properties.
 template in the editor.
-->
<html>
    <head>
      
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>	
  <link rel="stylesheet" type="text/css" href="bookingInfo.css">
   <link rel="stylesheet" type="text/css" href="header_footer_colour.css">

  <style>
   disabled
      {
          background-color: black;
     border: 2px solid black;
    border-radius: 5px;

      }
    
      </style>


      <script>
      
    $(document).ready(function ()
    {
            $('#checkSeat').click(function()
        {
        if ($('input[type=checkbox]:checked').length==0) {
       $('#checkSeat').attr('disabled','disabled');
       }
      });     
        });
    
  
$(function()
{
 $('.seat-select').click(function()
    {
            $('#checkSeat').removeAttr('disabled');
    });
 
   
});
 
      var seatname;
  var seatprice = 0;
  var seatvalue;
var temp=[];
var count=1;
 

$(function()
{
 $('.seat-select').click(function()
    {
     if($('input[type=checkbox]:checked').length>=0  && $(this).is(':checked')) 
      {
 
        seatprice = 0;
        seatname="";
      
        $('input[type=checkbox]:checked').each(function (index, value) { 
 
          
        seatvalue=$(this).attr('value');
          console.log(seatvalue.split(","));
          temp =seatvalue.split(",");
          seatname +=parseInt(temp[0].length-1);

         seatprice += parseInt(temp[1]);
         
         console.log(seatname);
         console.log(seatprice);

        $("#name").text(seatname);
        $("#price").text(seatprice);

         });
        
        }     
    else
   {
       seatname="";
               seatvalue=$(this).attr('value');
           temp =seatvalue.split(",");
          seatname -= parseInt(temp[0].length)-1;

         seatprice-= parseInt(temp[1]);
         
        $("#name").text(seatname);
        $("#price").text(seatprice);

         
     }

 });
});
  
   
 
      </script>
    


    </head>
    
    <body id="myPage">
 
      <div class="row"> 
         <form id="my-form" action="bookingInfo" method="post">
            <div class="col-md-8">
                <div    class="well well-lg" style="width: 100%;height: 800px;box-shadow: 5px 10px 70px #333333">
    <!--first row -->
    <p><center><b>Gold- Rs-500</b> </center></p>
             
    
    <div class="col-md-6" id="seats"> 
        <input id="seat-1" class="seat-select" type="checkbox"   value="1A,500" >
           <label for="seat-1" class="seat" style="text-align: center" >1A</label>
      <input id="seat-2" class="seat-select" type="checkbox"   value="2A,500" name="seat" />
      <label for="seat-2" class="seat" style="text-align: center">2A</label>
      <input id="seat-3" class="seat-select" type="checkbox"   value="3A,500" name="seat" />
      <label for="seat-3" class="seat" style="text-align: center">3A</label>
      <input id="seat-4" class="seat-select" type="checkbox"   value="4A,500" name="seat" />
      <label for="seat-4" class="seat" style="text-align: center">4A</label>
      <input id="seat-5" class="seat-select" type="checkbox"    value="5A,500" name="seat" />
      <label for="seat-5" class="seat" style="text-align: center">5A</label>
      <input id="seat-6" class="seat-select" type="checkbox" value="6A,500"    name="seat" />
      <label for="seat-6" class="seat" style="text-align: center">6A</label>
      <input id="seat-7" class="seat-select" type="checkbox" value="7A,500"   name="seat" />
      <label for="seat-7" class="seat" style="text-align: center">7A</label>
          </div>
      
<h2 style="text-align: center;padding: 10% 20% 0px 20%;">All Eyes this way</h2>
<!--            <hr id="curve" style="padding-left: 20%;padding-right: 20%"> -->

        </div>
      
            </div>
            
            <div class="col-md-4" >
                <div class="well well-lg" style="width: 100%;height: 700px;box-shadow: 5px 10px 70px #333333;">
                               
                             
                             <div style="padding-top: 10%" class="row">
                        <div class="col-md-6">
                            <h4><b>No.of Tickets:</b><span id="name"></span> </h4>
                  
                        </div>
                        <div class="col-md-6">
                            <h4><b>Amount:</b><span id="price"></span></h4>
                  
                        </div>
                    </div>

                             
          <button type="submit" class="btn btn-danger" id="checkSeat" style="width: 32%;height:70px "><h3>Proceed</h3> </button>
            </form>
        </div>
                            
              
     </body>
</html>
