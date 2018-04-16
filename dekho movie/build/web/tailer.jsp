<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        
        <title>JavaScript</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!-- Compiled and minified JavaScript -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        
    <input type="text" placeholder="enter your suffering" id="search"/>
    <input type="button" id="search_it" value="search">
    
    
    
    
<script>
        $(document).ready(function ()
        {
                 $('#search_it').click(function ()
                {
                    var data=$('#search').val();
        function callApi()
  {
      $.getJSON('https://www.googleapis.com/youtube/v3/search?key=AIzaSyA4WfDOOcQVvG9qfsf-erOK5nCY51ZoOUA&part=snippet&maxResults=5&q='+data+'&type=video').
              then(function (response) 
      {
         console.log(response.items);

         for( x in response.items )
        {
             $("#abc").append("<iframe width='600' height='480' src='https://www.youtube.com/embed/"+response.items[x].id.videoId+"' frameborder='0' allow='autoplay; encrypted-media' allowfullscreen></iframe>");
             console.log(response.items[x].id.videoId);
             
     $("#video_id").append()
        }
             

    });
  }
             callApi();     
                });
       
        
        });
         
      
        </script>
   
    <body>
<a class="waves-effect waves-light btn modal-trigger" href="#modal1">modal</a>
<div id="modal1" class="modal bottom-sheet"> 
    <div class="modal-content">
<div id="abc"></div>
</div>
<div class="modal-footer" >
    <a href="#" class="modal-action modal-close waves-effect btn-flat">Agree</a>
</div>
    </div>
<script>
    $(document).ready(function(){
       $('#modal1').modal(); 
    });
    </script>
    </body>
</html>
