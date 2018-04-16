<%-- 
    Document   : SingUpPage
    Created on : Dec 26, 2017, 2:30:52 PM
    Author     : Karan Chaurasia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>SingUp</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script>
     $(document).ready(function() {
    $('#contact_form').bootstrapValidator({
      
        // To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            first_name: {
                validators: {
                        stringLength: {
                        min: 2,
                    },
                        notEmpty: {
                        message: 'please fill your first name'
                    }
                }
            },
             last_name: {
                validators: {
                     stringLength: {
                        min: 2,
                    },
                    notEmpty: {
                        message: 'Please supply your last name'
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: 'Please supply your email address'
                    },
                    emailAddress: {
                        message: 'Please supply a valid email address'
                    }
                }
            },
            password:{
                validators: {
                    stringLength:{
                        max: 20,
                    },
                    notEmpty: {
                        message: 'The password is required'
                    },
                    identical: {
                        //field: 'conpassword',
                       // message: 'The password and its confrim are not the same'
                    }
                    
                }
            },
            conpassword: {
                validators: {
                    notEmpty: {
                        message: 'The confirm password is required'
                    },
                    identical:{
                    field : 'password',
                        message: 'Confirm Password incorrect !'
                    }
                }
            },
            username:{
                validators:{
                    notEmpty: {
                        message: 'The username is required'
                    },
                                    }
            },
            contact:{
                validators:{
                    stringLength: {
                     max: 10,
                    },
                    notEmpty: {
                        message: 'The Contact No is Required'
                    }
                }
            }
            }
            
        });
//        .on('success.form.bv', function(e) {
//            $('#success_message').slideDown({ opacity: "show" }, "slow") // Do something ...
//                $('#contact_form').data('bootstrapValidator').resetForm();
//
//            // Prevent form submission
//            e.preventDefault();
//
//            // Get the form instance
//            var $form = $(e.target);
//
//            // Get the BootstrapValidator instance
//            var bv = $form.data('bootstrapValidator');
//
//            // Use Ajax to submit form data
//            $.post($form.attr('action'), $form.serialize(), function(result) {
//                console.log(result);
//            }, 'json');
//        });
});


 

function ValidateAlpha3(evt)
    {
        var keyCode = (evt.which) ? evt.which : evt.keyCode
        if ((keyCode < 65 || keyCode > 90) && (keyCode < 97 || keyCode > 123) && keyCode != 32)
         
        return false;
            return true;
    }
    function validatenum(event){
        if(event.keyCode>=48 && event.keyCode<=57){
            return true;
        }
    return false;
    }
  function pass(event){
  
    }
</script>
    </head>
    <div class="container-fluid">
<div class="navbar navbar-inverse navbar-fixed-top opaque-navbar">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navMain">
  <span class="glyphicon glyphicon-chevron-right" style="color:white;"></span>
    
  </button>
        <a class="navbar-brand" href="index.jsp">DekhoMovies</a>
    </div>
    <div class="collapse navbar-collapse" id="navMain">
      <ul class="nav navbar-nav pull-right">
        <li><a href="#">Movies</a></li>
        <li><a href="AboutUs.jsp">About Us</a></li>
        <li class="active"> <a href="SingUpPage.jsp">SignUp</a></li> 
        <li><a href="LoginPage.jsp">LogIn</a></li> 
       
      </ul>
    </div>
  </div>
</div>
</div>
    <br />
    <br />
    <body style="background-image: url(images/loginbg.jpeg)">
           <div class="container">

               <div class="container">
            <div class="container">

                <form class="well form-horizontal" action="user" method="post"  id="contact_form">
<fieldset>

<!-- Form Name -->
<legend><center>SignUp</center></legend>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">First Name</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>

  <input  name="first_name" placeholder="First Name" class="form-control" id="first_name" onKeyPress="return ValidateAlpha3(event)" type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Last Name</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="last_name" placeholder="Last Name" class="form-control" id="last_name" onKeyPress="return ValidateAlpha3(event)" type="text">
    </div>
  </div>
</div>

<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">Username</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
        <input name="username" placeholder="Username" class="form-control" id="username"  onKeyPress="return ValidateAlpha3(event)" type="text">
    </div>
  </div>
</div>


<!-- Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">Password</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
        <input name="password" placeholder="Passsword"  class="form-control" id="pass" onKeyPress="return pass(event)" type="password">
    </div>
  </div>
</div>

<!-- Text input-->
 
<div class="form-group">
  <label class="col-md-4 control-label">Confirm Password</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
        <input name="conpassword" placeholder="Re-Password" class="form-control" id="confrim"  type="password">
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">Email</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input name="email" placeholder="Email-address" class="form-control"  id="email" type="text">
    </div>
</div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label">Contact No.</label>  
   <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-phone"></i></span>
        <input name="contact" placeholder="+91" class="form-control"  id="contact" onKeyPress="return validatenum(event)" type="text">
    </div>
  </div>
</div>
<!-- Button -->

<div class="form-group">
          <label class="col-md-4 control-label"></label>
            <div class="col-md-4"><br>
                <center>  <button id="b3" type="submit" class="btn btn-success" >SUBMIT <span class="glyphicon glyphicon-send"></span></button></center>
<!--                <script>
            
            
             $(document).ready(function(){
        $("#b3").click(function(){
        var first = $("#first_name").attr("value");
                var last= $("#last_name").attr("value");
                var user = $("#username").attr("value");
var pass = $("#pass").attr("value");
var con = $("#confrim").attr("value");
var email = $("#email").attr("value");
var contact = $("#contact").attr("value");


if(first != null && first.length == 0 && first)

{
    console.log("ja rhi hai ");
}
else
{

swal("Error!", "all Fields are MANDATORY!", "error");
 }
        });
    })
                </script>-->
            
            </div>
        </div>

</fieldset>
</form>
</div>
    </div><!-- /.container -->
    
    </body>
</html>
