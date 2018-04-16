<%@page import="bookinginfo.infocon"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="css/seat.css" rel="stylesheet" type="text/css"/>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<style>
#curve
{

    width: 500px;
   height: 100px;
   border: solid 2px #000;
  border-color: transparent transparent #000 transparent;   
  border-radius: 0 0 240px 50%/60px;
}

	* {
    margin: 0;
    padding: 0;
}

.seat {
    float: left;
    margin: 5px;
    width: 35px;
    height: 40px;
    border: 2px solid #6699ff ;
    border-radius: 5px;
}
.seats
{
         display: flex;
  flex-direction: row;
  flex-wrap: nowrap;
  justify-content: flex-start;  

}

.seat-select {
    display: none;
}

.seat-select:checked+.seat {
    background-color: #ff9999;  
     border: 2px solid #ff9999;
    border-radius: 5px;
    
}

input[type="checkbox"]:disabled + label 
{
    
    background-color: #ff9999;
     border: 2px solid #ff9999;
    border-radius: 5px;
    cursor:not-allowed;
}

/*.seat-select:disabled+.seat {
}*/
seat:hover
{
    background:#000;
}

    

</style>
  <script>
 
    $(document).ready(function (){
    var emailid;    
$('#proceed').hide();
$('#proceed').click(function()

        {
               if($('input[type=checkbox]:checked').length==0)   
      {
          $("#proceed").attr("disabled","disabled");
         
      } 
      else{
                 $("#myModal").fadeIn(1000);
//    var emailid;
//var pattern=new RegExp("/^[a-zA-Z0-9_\.-]+@[a-zA-Z0-9_-]+\.[a-zA-Z0-9_-]+\.*[a-zA-Z0-9_]+$/");
//var res=pattern.test(inputValue);
//
//$("#email").val(email);
//
//$("#ticketid").val("#"+ Math.floor(Math.random()*100000)+1);
//
//$("#myform").submit();


        }
        });
});
 
            var seatname=0;
            var seatprice = 0;
            var seatvalue;
            var temp=[];
            var count=1;
               var seat_count="";
 
$(function()
{
 $('.seat-select').click(function()
    {
     if($('input[type=checkbox]:checked').length>=0  && $(this).is(':checked')) 
      {
                               $('#proceed').removeAttr('disabled');
                               $('#proceed').fadeIn(1000);
                               
        seatprice = 0;
        seatname=0;
      
        $('input[type=checkbox]:checked').each(function (index, value) { 
 
          
        seatvalue=$(this).attr('value');
          console.log(seatvalue.split(","));
          temp =seatvalue.split(",");
          seat_count=temp[0];
          seatname +=parseInt(seat_count.substring(0,1).length) ;
//           parseInt(temp[0].length-1);

         seatprice += parseInt(temp[1]);
         console.log("asdasdasdadasd :"+seat_count.substring(0,1).length);
          console.log(seatname);
         console.log(seatprice);

        $("#name").text(seatname);
        $("#price").text(seatprice);
                $("#numseat").val(seatname);
                $("#total_amount").val(seatprice);

         });
        
        }     
    else
   {
       seatname="";
               seatvalue=$(this).attr('value');
           temp =seatvalue.split(",");
           console.log("hello bkjsdjfsfdj :"+ seat_count.substring(0,1).length);
                       seat_count=temp[0];
          seatname -=parseInt(seat_count.substring(0,1).length) ;

//          seatname -= parseInt(temp[0].length)-1;
console.log(seatname);
         seatprice-= parseInt(temp[1]);
         
        $("#name").text(seatname);
        $("#price").text(seatprice);
                $("#numseat").val(seatname);
                $("#total_amount").val(seatprice);

           
     }

 });
});

$(document).ready(function ()
{
    
  $("#con") .click(function ()
  {
       
      if($("#mo_email").val()=="")
      {
          alert("PLease enter your emial id before continue");
      }
      
      else
      {
                
                var id=$("#mo_email").val();   
                $('#email').val(id);
                setTimeout(submit_Func(),2000);
                function submit_Func()
               {
//                    var queryString = $('#myform').serialize();
//                    console.log(" bad ka DATA : "+queryString);
                    $("#myform").submit();
                
                }

      }
 
      
  }) ;
});  
     </script>   
</head>
<body>
     <%String img=request.getParameter("image");
            String name=request.getParameter("name");
            String loc=request.getParameter("location");
     String time=request.getParameter("time");
     String date=request.getParameter("date");
    System.out.println(time+" "+date);
     %>
    <%
     infocon inf=new infocon();
   StringBuilder st=new StringBuilder();
   st=inf.bookinfo(name, loc, time, date);
   String str=st.toString();
   
    %>
    
      <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Enter your email id</h4>
        </div>
        <div class="modal-body">
            <input type="email" placeholder="Enter your email id" id="mo_email">
            <button class="btn btn-danger" id="con">continue</button>
         </div>
       </div>
      
    </div>
  </div>

    
 <div class="row"> 
     <form  id="myform" action="booking" method="post" >
            <div class="col-md-8">
                <div  onclick="" class="well well-lg" style="width: 100%;height: 800px;box-shadow: 5px 10px 70px #333333">
    <!--first row -->
    <p><center>Normal Rs.100</center></p>
 <hr>
    <div class="col-md-6" id="seats">
        <input id="seat-1" class="seat-select" type="checkbox" value="1A,100" >
           <label for="seat-1" class="seat" style="text-align: center" >1A</label>
      <input id="seat-2" class="seat-select" type="checkbox" value="2A,100" name="seat">
      <label for="seat-2" class="seat" style="text-align: center">2A</label>
      <input id="seat-3" class="seat-select" type="checkbox" value="3A,100" name="seat">
      <label for="seat-3" class="seat" style="text-align: center">3A</label>
      <input id="seat-4" class="seat-select" type="checkbox" value="4A,100" name="seat">
      <label for="seat-4" class="seat" style="text-align: center">4A</label>
      <input id="seat-5" class="seat-select" type="checkbox" value="5A,100" name="seat">
      <label for="seat-5" class="seat" style="text-align: center">5A</label>
      <input id="seat-6" class="seat-select" type="checkbox" value="6A,100" name="seat">
      <label for="seat-6" class="seat" style="text-align: center">6A</label>
      <input id="seat-7" class="seat-select" type="checkbox" value="7A,100" name="seat">
          </div>
      <div class="col-md-6" id="seats">
           <input id="seat-8" class="seat-select" type="checkbox" value="8A,100" <%if( str.contains("8A") ){%>disabled<%}%>>
           <label for="seat-8" class="seat" style="text-align: center" >8A</label>
    
    <input id="seat-9" class="seat-select" type="checkbox" value="9A,100" name="seat" <%if( str.contains("9A") ){%>disabled<%}%> />
      <label for="seat-9" class="seat" style="text-align: center">9A</label>
      <input id="seat-10" class="seat-select" type="checkbox" value="10A,100" name="seat" <%if( str.contains("10A") ){%>disabled<%}%>  />
      <label for="seat-10" class="seat" style="text-align: center">10A</label>
      <input id="seat-11" class="seat-select" type="checkbox" value="11A,100" name="seat" <%if( str.contains("11A") ){%>disabled<%}%>/>
      <label for="seat-11" class="seat" style="text-align: center">11A</label>
      <input id="seat-12" class="seat-select" type="checkbox" value="12A,100" name="seat" <%if( str.contains("12A") ){%>disabled<%}%>/>
      <label for="seat-12" class="seat" style="text-align: center">12A</label>
      <input id="seat-13" class="seat-select" type="checkbox" value="13A,100" name="seat" <%if( str.contains("13A") ){%>disabled<%}%>/>
      <label for="seat-13" class="seat" style="text-align: center">13A</label>
      <input id="seat-14" class="seat-select" type="checkbox" value="14A,100" name="seat" <%if( str.contains("14A") ){%>disabled<%}%>/>
      
       </div>
      <!--end of the first row-->
    <!--staring of the second row-->
      <div class="col-md-6" id="seats">
           <input id="seat-15" class="seat-select" type="checkbox" value="1B,100" >
           <label for="seat-15" class="seat" style="text-align: center" >1B</label>
    
      <input id="seat-16" class="seat-select" type="checkbox" value="2B,100" name="seat"  />
      <label for="seat-16" class="seat" style="text-align: center">2B</label>
      <input id="seat-17" class="seat-select" type="checkbox" value="3B,100" name="seat"   />
      <label for="seat-17" class="seat" style="text-align: center">3B</label>
      <input id="seat-18" class="seat-select" type="checkbox" value="4B,100" name="seat" />
      <label for="seat-18" class="seat" style="text-align: center">4B</label>
      <input id="seat-19" class="seat-select" type="checkbox" value="5B,100" name="seat" <%if( str.contains("5B") ){%>disabled<%}%>/>
      <label for="seat-19" class="seat" style="text-align: center">5B</label>
      <input id="seat-20" class="seat-select" type="checkbox" value="6B,100" name="seat" <%if( str.contains("6B") ){%>disabled<%}%>/>
      <label for="seat-20" class="seat" style="text-align: center">6B</label>
      <input id="seat-21" class="seat-select" type="checkbox" value="7B,100" name="seat" <%if( str.contains("7B") ){%>disabled<%}%>/>
          </div>
             <div class="col-md-6" id="seats">
           <input id="seat-22" class="seat-select" type="checkbox" value="8B,100" <%if( str.contains("8B") ){%>disabled<%}%>>
           <label for="seat-22" class="seat" style="text-align: center" >8B</label>
    
    <input id="seat-23" class="seat-select" type="checkbox" value="9B,100" name="seat" <%if( str.contains("9B") ){%>disabled<%}%> />
      <label for="seat-23" class="seat" style="text-align: center">9B</label>
      <input id="seat-24" class="seat-select" type="checkbox" value="10B,100" name="seat" <%if( str.contains("10B") ){%>disabled<%}%>  />
      <label for="seat-24" class="seat" style="text-align: center">10B</label>
      <input id="seat-25" class="seat-select" type="checkbox" value="11B,100" name="seat" <%if( str.contains("11B") ){%>disabled<%}%>/>
      <label for="seat-25" class="seat" style="text-align: center">11B</label>
      <input id="seat-26" class="seat-select" type="checkbox" value="12B,100" name="seat" <%if( str.contains("12B") ){%>disabled<%}%>/>
      <label for="seat-26" class="seat" style="text-align: center">12B</label>
      <input id="seat-27" class="seat-select" type="checkbox" value="13B,100" name="seat" <%if( str.contains("13B") ){%>disabled<%}%>/>
      <label for="seat-27" class="seat" style="text-align: center">13B</label>
      <input id="seat-28" class="seat-select" type="checkbox" value="14B,100" name="seat" <%if( str.contains("14B") ){%>disabled<%}%>/>
      
       </div>
    <!--end of the second row-->
        <!--staring of the third row-->
      <div class="col-md-6" id="seats">
           <input id="seat-29" class="seat-select" type="checkbox" value="1C,100" <%if( str.contains("1C") ){%>disabled<%}%>>
           <label for="seat-29" class="seat" style="text-align: center" >1C</label>
    
      <input id="seat-30" class="seat-select" type="checkbox" value="2C,100" name="seat" <%if( str.contains("2C") ){%>disabled<%}%> />
      <label for="seat-30" class="seat" style="text-align: center">2C</label>
      <input id="seat-31" class="seat-select" type="checkbox" value="3C,100" name="seat" <%if( str.contains("3C") ){%>disabled<%}%>  />
      <label for="seat-31" class="seat" style="text-align: center">3C</label>
      <input id="seat-32" class="seat-select" type="checkbox" value="4C,100" name="seat" <%if( str.contains("4C") ){%>disabled<%}%>/>
      <label for="seat-32" class="seat" style="text-align: center">4C</label>
      <input id="seat-33" class="seat-select" type="checkbox" value="5C,100" name="seat" <%if( str.contains("5C") ){%>disabled<%}%>/>
      <label for="seat-33" class="seat" style="text-align: center">5C</label>
      <input id="seat-34" class="seat-select" type="checkbox" value="6C,100" name="seat" <%if( str.contains("6C") ){%>disabled<%}%>/>
      <label for="seat-34" class="seat" style="text-align: center">6C</label>
      <input id="seat-35" class="seat-select" type="checkbox" value="7C,100" name="seat" <%if( str.contains("7C") ){%>disabled<%}%>/>
          </div>
      <div class="col-md-6" id="seats">
           <input id="seat-36" class="seat-select" type="checkbox" value="8C,100" <%if( str.contains("8C") ){%>disabled<%}%>>
           <label for="seat-36" class="seat" style="text-align: center" >8C</label>
    
    <input id="seat-37" class="seat-select" type="checkbox" value="9C,100" name="seat" <%if( str.contains("9C") ){%>disabled<%}%> />
      <label for="seat-37" class="seat" style="text-align: center">9C</label>
      <input id="seat-38" class="seat-select" type="checkbox" value="10C,100" name="seat" <%if( str.contains("10C") ){%>disabled<%}%>  />
      <label for="seat-38" class="seat" style="text-align: center">10C</label>
      <input id="seat-39" class="seat-select" type="checkbox" value="11C,100" name="seat" <%if( str.contains("11C") ){%>disabled<%}%>/>
      <label for="seat-39" class="seat" style="text-align: center">11C</label>
      <input id="seat-40" class="seat-select" type="checkbox" value="12C,100" name="seat" <%if( str.contains("12C") ){%>disabled<%}%>/>
      <label for="seat-40" class="seat" style="text-align: center">12C</label>
      <input id="seat-41" class="seat-select" type="checkbox" value="13C,100" name="seat" <%if( str.contains("13C") ){%>disabled<%}%>/>
      <label for="seat-41" class="seat" style="text-align: center">13C</label>
      <input id="seat-42" class="seat-select" type="checkbox" value="14C,100" name="seat" <%if( str.contains("14C") ){%>disabled<%}%>/>
      
       </div>
    <!--end of the third row-->
 <p><center>Silver Rs.200</center></p>
 <hr>
        <!--staring of the fourth row-->    
      <div class="col-md-6" id="seats">
           <input id="seat-43" class="seat-select" type="checkbox" value="1D,200" <%if( str.contains("1D") ){%>disabled<%}%>>
           <label for="seat-43" class="seat" style="text-align: center" >1D</label>
    
      <input id="seat-44" class="seat-select" type="checkbox" value="2D,200" name="seat" <%if( str.contains("2D") ){%>disabled<%}%> />
      <label for="seat-44" class="seat" style="text-align: center">2D</label>
      <input id="seat-45" class="seat-select" type="checkbox" value="3D,200" name="seat" <%if( str.contains("3D") ){%>disabled<%}%>  />
      <label for="seat-45" class="seat" style="text-align: center">3D</label>
      <input id="seat-46" class="seat-select" type="checkbox" value="4D,200" name="seat" <%if( str.contains("4D") ){%>disabled<%}%>/>
      <label for="seat-46" class="seat" style="text-align: center">4D</label>
      <input id="seat-47" class="seat-select" type="checkbox" value="5D,200" name="seat" <%if( str.contains("5D") ){%>disabled<%}%>/>
      <label for="seat-47" class="seat" style="text-align: center">5D</label>
      <input id="seat-48" class="seat-select" type="checkbox" value="6D,200" name="seat" <%if( str.contains("6D") ){%>disabled<%}%>/>
      <label for="seat-48" class="seat" style="text-align: center">6D</label>
      <input id="seat-49" class="seat-select" type="checkbox" value="7D,200" name="seat" <%if( str.contains("7D") ){%>disabled<%}%>/>
          </div>
      
      <div class="col-md-6" id="seats">
           <input id="seat-50" class="seat-select" type="checkbox" value="8D,200" <%if( str.contains("8D") ){%>disabled<%}%>>
           <label for="seat-50" class="seat" style="text-align: center" >8D</label>
    
    <input id="seat-51" class="seat-select" type="checkbox" value="9D,200" name="seat" <%if( str.contains("9D") ){%>disabled<%}%> />
      <label for="seat-51" class="seat" style="text-align: center">9D</label>
      <input id="seat-52" class="seat-select" type="checkbox" value="10D,200" name="seat" <%if( str.contains("10D") ){%>disabled<%}%>  />
      <label for="seat-52" class="seat" style="text-align: center">10D</label>
      <input id="seat-53" class="seat-select" type="checkbox" value="11D,200" name="seat" <%if( str.contains("11D") ){%>disabled<%}%>/>
      <label for="seat-53" class="seat" style="text-align: center">11D</label>
      <input id="seat-54" class="seat-select" type="checkbox" value="12D,200" name="seat" <%if( str.contains("12D") ){%>disabled<%}%>/>
      <label for="seat-54" class="seat" style="text-align: center">12D</label>
      <input id="seat-55" class="seat-select" type="checkbox" value="13D,200" name="seat" <%if( str.contains("13D") ){%>disabled<%}%>/>
      <label for="seat-55" class="seat" style="text-align: center">13D</label>
      
       </div>
    <!--end of the fourth row-->
 
        <!--staring of the fifth row-->
      <div class="col-md-6" id="seats">
           <input id="seat-57" class="seat-select" type="checkbox" value="1E,200" <%if( str.contains("1E") ){%>disabled<%}%>>
           <label for="seat-57" class="seat" style="text-align: center" >1E</label>
    
      <input id="seat-58" class="seat-select" type="checkbox" value="2E,200" name="seat" <%if( str.contains("2E") ){%>disabled<%}%> />
      <label for="seat-58" class="seat" style="text-align: center">2E</label>
      <input id="seat-60" class="seat-select" type="checkbox" value="3E,200" name="seat" <%if( str.contains("3E") ){%>disabled<%}%>  />
      <label for="seat-60" class="seat" style="text-align: center">3E</label>
      <input  id="seat-61" class="seat-select" type="checkbox" value="4E,200" name="seat" <%if( str.contains("4E") ){%>disabled<%}%>/>
      <label for="seat-61" class="seat" style="text-align: center">4E</label>
      <input id="seat-62" class="seat-select" type="checkbox" value="5E,200" name="seat" <%if( str.contains("5E") ){%>disabled<%}%>/>
      <label for="seat-62" class="seat" style="text-align: center">5E</label>
      <input id="seat-63" class="seat-select" type="checkbox" value="6E,200" name="seat" <%if( str.contains("6E") ){%>disabled<%}%>/>
      <label for="seat-63" class="seat" style="text-align: center">6E</label>
          </div>
      <div class="col-md-6" id="seats">
           <input id="seat-65" class="seat-select" type="checkbox" value="8E,200" <%if( str.contains("8E") ){%>disabled<%}%>>
           <label for="seat-65" class="seat" style="text-align: center" >8E</label>
    
    <input id="seat-66" class="seat-select" type="checkbox" value="9E,200" name="seat" <%if( str.contains("9E") ){%>disabled<%}%> />
      <label for="seat-66" class="seat" style="text-align: center">9E</label>
      <input id="seat-67" class="seat-select" type="checkbox" value="10E,200" name="seat" <%if( str.contains("10E") ){%>disabled<%}%>  />
      <label for="seat-67" class="seat" style="text-align: center">10E</label>
      <input id="seat-68" class="seat-select" type="checkbox" value="11E,200" name="seat" <%if( str.contains("11E") ){%>disabled<%}%>/>
      <label for="seat-68" class="seat" style="text-align: center">11E</label>
      <input id="seat-69" class="seat-select" type="checkbox" value="12E,200" name="seat" <%if( str.contains("12E") ){%>disabled<%}%>/>
      <label for="seat-69" class="seat" style="text-align: center">12E</label>
      <input id="seat-70" class="seat-select" type="checkbox" value="13E,200" name="seat" <%if( str.contains("13E") ){%>disabled<%}%>/>
      <label for="seat-70" class="seat" style="text-align: center">13E</label>
      
       </div>
    <!--end of the fifth row-->
 <p><center>Gold Rs.350</center></p>
 <hr>
        <!--staring of the sixth row-->
      <div class="col-md-6" id="seats">
           <input id="seat-72" class="seat-select" type="checkbox" value="1F,350" <%if( str.contains("1F") ){%>disabled<%}%>/>
           <label for="seat-72" class="seat" style="text-align: center" >1F</label>
    
      <input id="seat-73" class="seat-select" type="checkbox" value="2F,350" name="seat" <%if( str.contains("2F") ){%>disabled<%}%> />
      <label for="seat73" class="seat" style="text-align: center">2F</label>
      <input id="seat-74" class="seat-select" type="checkbox" value="3F,350" name="seat" <%if( str.contains("3F") ){%>disabled<%}%>  />
      <label for="seat-74" class="seat" style="text-align: center">3F</label>
      <input id="seat-75" class="seat-select" type="checkbox" value="4F,350" name="seat" <%if( str.contains("4F") ){%>disabled<%}%>/>
      <label for="seat-75" class="seat" style="text-align: center">4F</label>
      <input id="seat-76" class="seat-select" type="checkbox" value="5F,350" name="seat" <%if( str.contains("5F") ){%>disabled<%}%>/>
      <label for="seat-76" class="seat" style="text-align: center">5F</label>
      <input id="seat-77" class="seat-select" type="checkbox" value="6F,350" name="seat" <%if( str.contains("6F") ){%>disabled<%}%>/>
      <label for="seat-77" class="seat" style="text-align: center">6F</label>
          </div>
      <div class="col-md-6" id="seats">
           <input id="seat-79" class="seat-select" type="checkbox" value="8F,350" <%if( str.contains("8F") ){%>disabled<%}%>>
           <label for="seat-79" class="seat" style="text-align: center" >8F</label>
    
    <input id="seat-80" class="seat-select" type="checkbox" value="9F,350" name="seat" <%if( str.contains("9F") ){%>disabled<%}%> />
      <label for="seat-80" class="seat" style="text-align: center">9F</label>
      <input id="seat-81" class="seat-select" type="checkbox" value="10F,350" name="seat" <%if( str.contains("10F") ){%>disabled<%}%>  />
      <label for="seat-81" class="seat" style="text-align: center">10F</label>
      <input id="seat-82" class="seat-select" type="checkbox" value="11F,350" name="seat" <%if( str.contains("11F") ){%>disabled<%}%>/>
      <label for="seat-82" class="seat" style="text-align: center">11F</label>
      <input id="seat-83" class="seat-select" type="checkbox" value="12F,350" name="seat" <%if( str.contains("12F") ){%>disabled<%}%>/>
      <label for="seat-84" class="seat" style="text-align: center">12F</label>
      <input id="seat-84" class="seat-select" type="checkbox" value="13F,350" name="seat" <%if( str.contains("13F") ){%>disabled<%}%>/>
      <label for="seat-85" class="seat" style="text-align: center">13F</label>
      
       </div>
    <!--end of the sixth row-->

          <!--staring of the seven row-->
      <div class="col-md-6" id="seats">
           <input id="seat-87" class="seat-select" type="checkbox" value="1G,350" <%if( str.contains("1G") ){%>disabled<%}%>>
           <label for="seat-87" class="seat" style="text-align: center" >1G</label>
    
      <input id="seat-88" class="seat-select" type="checkbox" value="2G,350" name="seat" <%if( str.contains("2G") ){%>disabled<%}%> />
      <label for="seat-88" class="seat" style="text-align: center">2G</label>
      <input id="seat-89" class="seat-select" type="checkbox" value="3G,350" name="seat" <%if( str.contains("3G") ){%>disabled<%}%>  />
      <label for="seat-89" class="seat" style="text-align: center">3G</label>
      <input id="seat-90" class="seat-select" type="checkbox" value="4A,350" name="seat" <%if( str.contains("4G") ){%>disabled<%}%>/>
      <label for="seat-90" class="seat" style="text-align: center">4G</label>
      <input id="seat-91" class="seat-select" type="checkbox" value="5G,350" name="seat" <%if( str.contains("5G") ){%>disabled<%}%>/>
      <label for="seat-91" class="seat" style="text-align: center">5G</label>
      <input id="seat-92" class="seat-select" type="checkbox" value="6G,350" name="seat" <%if( str.contains("6G") ){%>disabled<%}%>/>
      <label for="seat-92" class="seat" style="text-align: center">6G</label>
          </div>
      <div class="col-md-6" id="seats">
           <input id="seat-01" class="seat-select" type="checkbox" value="8G,350" <%if( str.contains("8G") ){%>disabled<%}%>>
           <label for="seat-01" class="seat" style="text-align: center" >8G</label>
    
    <input id="seat-02" class="seat-select" type="checkbox" value="9G,350" name="seat" <%if( str.contains("9G") ){%>disabled<%}%> />
      <label for="seat-02" class="seat" style="text-align: center">9G</label>
      <input id="seat-03" class="seat-select" type="checkbox" value="10G,350" name="seat" <%if( str.contains("10G") ){%>disabled<%}%>  />
      <label for="seat-03" class="seat" style="text-align: center">10G</label>
      <input id="seat-04" class="seat-select" type="checkbox" value="11G,350" name="seat" <%if( str.contains("11G") ){%>disabled<%}%>/>
      <label for="seat-04" class="seat" style="text-align: center">11G</label>
      <input id="seat-05" class="seat-select" type="checkbox" value="12G,350" name="seat" <%if( str.contains("12G") ){%>disabled<%}%>/>
      <label for="seat-05" class="seat" style="text-align: center">12G</label>
      <input id="seat-06" class="seat-select" type="checkbox" value="13G,350" name="seat" <%if( str.contains("13G") ){%>disabled<%}%>/>
      <label for="seat-06" class="seat" style="text-align: center">13G</label>
      
       </div>
    <!--end of the seven row-->

          <!--staring of the eight row-->
      <div class="col-md-6" id="seats">
           <input id="seat-001" class="seat-select" type="checkbox" value="1H,350" <%if( str.contains("1H") ){%>disabled<%}%>>
           <label for="seat-001" class="seat" style="text-align: center" >1H</label>
    
      <input id="seat-002" class="seat-select" type="checkbox" value="2H,350" name="seat" <%if( str.contains("2H") ){%>disabled<%}%> />
      <label for="seat-002" class="seat" style="text-align: center">2H</label>
      <input id="seat-003" class="seat-select" type="checkbox" value="3H,350" name="seat" <%if( str.contains("3H") ){%>disabled<%}%>  />
      <label for="seat-003" class="seat" style="text-align: center">3H</label>
      <input id="seat-004" class="seat-select" type="checkbox" value="4H,350" name="seat" <%if( str.contains("4H") ){%>disabled<%}%> />
      <label for="seat-004" class="seat" style="text-align: center">4H</label>
      <input id="seat-005" class="seat-select" type="checkbox" value="5H,350" name="seat" <%if( str.contains("5H") ){%>disabled<%}%> />
      <label for="seat-005" class="seat" style="text-align: center">5H</label>
      <input id="seat-006" class="seat-select" type="checkbox" value="6H,350" name="seat" <%if( str.contains("6H") ){%>disabled<%}%> />
      <label for="seat-006" class="seat" style="text-align: center">6H</label>
          </div>
      <div class="col-md-6" id="seats">
           <input id="seat-0001" class="seat-select" type="checkbox" value="8H,350" <%if( str.contains("8H") ){%>disabled<%}%>>
           <label for="seat-0001" class="seat" style="text-align: center" >8H</label>
    
    <input id="seat-0002" class="seat-select" type="checkbox" value="9H,350" name="seat" <%if( str.contains("9H") ){%>disabled<%}%> />
      <label for="seat-0002" class="seat" style="text-align: center">9H</label>
      <input id="seat-0003" class="seat-select" type="checkbox" value="10H,350" name="seat" <%if( str.contains("10H") ){%>disabled<%}%>  />
      <label for="seat-0003" class="seat" style="text-align: center">10H</label>
      <input id="seat-0004" class="seat-select" type="checkbox" value="11H,350" name="seat" <%if( str.contains("11H") ){%>disabled<%}%> />
      <label for="seat-0004" class="seat" style="text-align: center">11H</label>
      <input id="seat-0005" class="seat-select" type="checkbox" value="12H,350" name="seat" <%if( str.contains("12H") ){%>disabled<%}%> />
      <label for="seat-0005" class="seat" style="text-align: center">12H</label>
      <input id="seat-0006" class="seat-select" type="checkbox" value="13H,350" name="seat" <%if( str.contains("13H") ){%>disabled<%}%> />
      <label for="seat-006" class="seat" style="text-align: center">13H</label>
      
       </div>
    <!--end of the eight row -->

               
      <br><br><br><br>

<h2 style="text-align: center;padding: 10% 20% 0px 20%;">All Eyes this way</h2>
<!--            <hr id="curve" style="padding-left: 20%;padding-right: 20%"> -->

        </div>
      
            </div>
           
            <div class="col-md-4" >
                <div class="well well-lg" style="width: 100%;height: 700px;box-shadow: 5px 10px 70px #333333;">
                   <div class="card" style="box-shadow: 10px 10px 5px grey; font-size:30px; text-align: center;">
                       <div class="card-header" ><img src="<%=img%>" style="width:100%; height:auto;"></div>
     <label>Name:</label><div class="card-body"><%=name%>
     </div>
     <div class="card-footer"><%=loc%></div>
</div>                    
                    
                    
                    <div id="name" style="font-size: 30px;"></div>  
                    <div id="price" style="font-size: 30px;"></div>  
                </div>
                    
            </div> 
    
    <input type="hidden" name="hp" value="<%=name%>">
    <input type="hidden" name="hp" value="<%=loc%>">           
    <input type="hidden" name="hp" value="<%=time%>">
    <input type="hidden" id="numseat" name="hp" >no of seats
    <input type="hidden" id="total_amount" name="hp" ><!-- total amount-->
    <!--<input type="hidden" id="ticketid" name="hp" ><!--ticket id-->
    <input type="hidden" name="hp" value="<%=date%>" >
    <input type="hidden" id="email" name="hp" >


    <button type="button" id="proceed"  class=" btn btn-danger proceed" data-toggle="modal" data-target="#myModal"   style="width: 32%;height:70px ">Proceed</button>
            </form>

        </div>
    </body>
</html>

