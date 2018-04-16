package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String email_id;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        /* config.css */\n");
      out.write("        /*Modal CSS*/\n");
      out.write(".modal-footer {   border-top: 0px; }\n");
      out.write("/* helpers/align.css */\n");
      out.write("\n");
      out.write(".align {\n");
      out.write("  -webkit-box-align: center;\n");
      out.write("      -ms-flex-align: center;\n");
      out.write("          align-items: center;\n");
      out.write("  display: -webkit-box;\n");
      out.write("  display: -ms-flexbox;\n");
      out.write("  display: flex;\n");
      out.write("  -webkit-box-orient: vertical;\n");
      out.write("  -webkit-box-direction: normal;\n");
      out.write("      -ms-flex-direction: column;\n");
      out.write("          flex-direction: column;\n");
      out.write("  -webkit-box-pack: center;\n");
      out.write("      -ms-flex-pack: center;\n");
      out.write("          justify-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* helpers/grid.css */\n");
      out.write("\n");
      out.write(".grid {\n");
      out.write("  margin-left: auto;\n");
      out.write("  margin-right: auto;\n");
      out.write("  max-width: 320px;\n");
      out.write("  max-width: 20rem;\n");
      out.write("  width: 90%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* helpers/hidden.css */\n");
      out.write("\n");
      out.write(".hidden {\n");
      out.write("  border: 0;\n");
      out.write("  clip: rect(0 0 0 0);\n");
      out.write("  height: 1px;\n");
      out.write("  margin: -1px;\n");
      out.write("  overflow: hidden;\n");
      out.write("  padding: 0;\n");
      out.write("  position: absolute;\n");
      out.write("  width: 1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* helpers/icon.css */\n");
      out.write("\n");
      out.write(".icons {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icon {\n");
      out.write("  display: inline-block;\n");
      out.write("  fill: #FFF;\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-size: 1rem;\n");
      out.write("  height: 1em;\n");
      out.write("  vertical-align: middle;\n");
      out.write("  width: 1em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* layout/base.css */\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: inherit;\n");
      out.write("}\n");
      out.write("\n");
      out.write("html {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-size: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-color: #2c3338;\n");
      out.write("  color: #606468;\n");
      out.write("  font-family: 'Open Sans', sans-serif;\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-size: 0.875rem;\n");
      out.write("  font-weight: 400;\n");
      out.write("  height: 100%;\n");
      out.write("  line-height: 1.5;\n");
      out.write("  margin: 0;\n");
      out.write("  min-height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* modules/anchor.css */\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  color: #eee;\n");
      out.write("  outline: 0;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:focus,\n");
      out.write("a:hover {\n");
      out.write("  text-decoration: underline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* modules/form.css */\n");
      out.write("\n");
      out.write("input {\n");
      out.write("  background-image: none;\n");
      out.write("  border: 0;\n");
      out.write("  color: inherit;\n");
      out.write("  font: inherit;\n");
      out.write("  margin: 0;\n");
      out.write("  outline: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  -webkit-transition: background-color 0.3s;\n");
      out.write("          transition: background-color 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type='submit'] {\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form {\n");
      out.write("  margin: -14px;\n");
      out.write("  margin: -0.875rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form input[type='password'],\n");
      out.write(".form input[type='text'],\n");
      out.write(".form input[type='submit'] {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form__field {\n");
      out.write("  display: -webkit-box;\n");
      out.write("  display: -ms-flexbox;\n");
      out.write("  display: flex;\n");
      out.write("  margin: 28px;\n");
      out.write("  margin: 0.875rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form__input {\n");
      out.write("  -webkit-box-flex: 1;\n");
      out.write("      -ms-flex: 1;\n");
      out.write("          flex: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* modules/login.css */\n");
      out.write("\n");
      out.write(".login {\n");
      out.write("  color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login label,\n");
      out.write(".login input[type='text'],\n");
      out.write(".login input[type='password'],\n");
      out.write(".login input[type='submit'] {\n");
      out.write("  border-radius: 0.25rem;\n");
      out.write("  padding: 16px;\n");
      out.write("  padding: 1rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login label {\n");
      out.write("  background-color: #363b41;\n");
      out.write("  border-bottom-right-radius: 0;\n");
      out.write("  border-top-right-radius: 0;\n");
      out.write("  padding-left: 20px;\n");
      out.write("  padding-left: 1.25rem;\n");
      out.write("  padding-right: 20px;\n");
      out.write("  padding-right: 1.25rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type='password'],\n");
      out.write(".login input[type='text'] {\n");
      out.write("  background-color: #FFF;\n");
      out.write("  border-bottom-left-radius: 0;\n");
      out.write("  border-top-left-radius: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type='password']:focus,\n");
      out.write(".login input[type='password']:\n");
      out.write(".login input[type='text']:focus,\n");
      out.write(".login input[type='text'] {\n");
      out.write("  background-color: #434a52;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type='submit'] {\n");
      out.write("  background-color: #d44179;\n");
      out.write("  color: #eee;\n");
      out.write("  font-weight: 600;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type='submit']:focus,\n");
      out.write(".login input[type='submit']:hover {\n");
      out.write("  background-color: #64fccf;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* modules/text.css */\n");
      out.write("\n");
      out.write("p {\n");
      out.write("  margin-bottom: 24px;\n");
      out.write("  margin-bottom: 1.5rem;\n");
      out.write("  margin-top: 24px;\n");
      out.write("  margin-top: 1.5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text--center {\n");
      out.write("  text-align: center;\n");
      out.write("  color: #fff;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write(" <body class=\"align\" id=\"a\" style=\"background-image: url(http://res.cloudinary.com/warmachinewarrior/image/upload/v1515952817/unexre0t6fanp7glo2ld.jpg) \">\n");
      out.write(" \n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("<div class=\"navbar navbar-inverse navbar-fixed-top opaque-navbar\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navMain\">\n");
      out.write("  <span class=\"glyphicon glyphicon-chevron-right\" style=\"color:white;\"></span>\n");
      out.write("    \n");
      out.write("  </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\">WM</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navMain\">\n");
      out.write("      <ul class=\"nav navbar-nav pull-right\">\n");
      out.write("        <!--<li><a href=\"#\">Movies</a></li>-->\n");
      out.write("        <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("             <li class=\"active\"><a href=\"LoginPage.jsp\">LogIn</a></li> \n");
      out.write("       \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");

try{
String status=request.getAttribute("result").toString();
    if(status==null){
    System.out.println("your result status is null");
    }else{
      out.write("\n");
      out.write("       <script> \n");
      out.write("      \n");
      out.write("swal ( \"Error\" ,  \"Please check your password\" ,  \"error\");     \n");
      out.write("      \n");
      out.write("       </script> \n");
      out.write("   ");
 } 

    
    
}catch(Exception e){
System.out.println("Exception "+e);
}
    

      out.write("  \n");
      out.write("      \n");
      out.write('\n');

try{
     
     if(request.getAttribute("WD")!="500" && request.getAttribute("WD")!=null)
     {
          email_id=request.getAttribute("valid").toString();
 

      out.write("       \n");
      out.write(" \n");
      out.write("        <script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("        $(\"#myModal\").modal();\n");
      out.write(" });          \n");
      out.write("      </script>\n");
      out.write("\n");
      out.write("  ");
 
    } 
    else if(  request.getAttribute("WD")=="500")
    {
     System.out.println("");   
    
      
      out.write("\n");
      out.write("     <script>\n");
      out.write("swal ( \"Error\" ,  \"Please enter your valid email  ID\" ,  \"error\");    \n");
      out.write("  </script>\n");
      out.write("      \n");
  }
    
    else{
        System.out.println("hardy ne kiya hai ");
    }
}catch(Exception e){
    
    System.out.print("inside the otp funtion hello ");
    
      out.write("\n");
      out.write("    <script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("         $(\"#myModal\").(\"hide\");\n");
      out.write(" });\n");
      out.write("</script>\n");

}

      out.write("\n");
      out.write("\n");
      out.write(" <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("           <h4 class=\"modal-title\">Enter your OTP</h4>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"OTP\" placeholder=\"Enter your OTP \">  \n");
      out.write("          </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <p>Some text in the modal.</p>\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"grid\">\n");
      out.write("\n");
      out.write("      <form action=\"login\" method=\"POST\" class=\"form login\">\n");
      out.write("\n");
      out.write("        <div class=\"form__field\">\n");
      out.write("          <label for=\"login__username\"><svg class=\"icon\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#user\"></use></svg><span class=\"hidden\">Username</span></label>\n");
      out.write("          <input id=\"login__username\" type=\"text\" name=\"username\" class=\"form__input\" placeholder=\"Username\" required>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form__field\">\n");
      out.write("          <label for=\"login__password\"><svg class=\"icon\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#lock\"></use></svg><span class=\"hidden\">Password</span></label>\n");
      out.write("          <input id=\"login__password\" type=\"password\" name=\"password\" class=\"form__input\" placeholder=\"Password\" required>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form__field\">\n");
      out.write("          <input type=\"submit\" value=\"Sign In\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </form>\n");
      out.write("            <p class=\"text--center\">Not a member? <a href=\"SingUpPage.jsp\">Sign up now</a> <svg class=\"icon\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"assets/images/icons.svg#arrow-right\"></use></svg></p>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <center><input class=\"btn btn-lg btn-danger btn-block\" value=\"Forget Password\" type=\"submit\" data-target=\"#pwdModal\" data-toggle=\"modal\"/></center>\n");
      out.write("            \n");
      out.write("            <!--data-target=\"#pwdModal\" data-toggle=\"modal\"-->\n");
      out.write("            <div id=\"pwdModal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("          <h1 class=\"text-center\">Change Password?</h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                          \n");
      out.write("                          <p>If you have forgotten your password you can reset it here.</p>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <fieldset>\n");
      out.write("                                    <form action=\"forgetpass\" method=\"post\">\n");
      out.write("                                       \n");
      out.write("                                           <div class=\"form-group\" >\n");
      out.write("                                        <input class=\"form-control input-lg\" placeholder=\"Email Address\" name=\"forgetemail\" type=\"email\">\n");
      out.write("                                    </div>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                            <input class=\"btn btn-lg btn-primary btn-block\" value=\"Send My OTP\" type=\"submit\">\n");
      out.write("                                    </form>\n");
      out.write("                                    </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("          <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Cancel</button>\n");
      out.write("\t\t  </div>\t\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <svg xmlns=\"http://www.w3.org/2000/svg\" class=\"icons\"><symbol id=\"arrow-right\" viewBox=\"0 0 1792 1792\"><path d=\"M1600 960q0 54-37 91l-651 651q-39 37-91 37-51 0-90-37l-75-75q-38-38-38-91t38-91l293-293H245q-52 0-84.5-37.5T128 1024V896q0-53 32.5-90.5T245 768h704L656 474q-38-36-38-90t38-90l75-75q38-38 90-38 53 0 91 38l651 651q37 35 37 90z\"/></symbol><symbol id=\"lock\" viewBox=\"0 0 1792 1792\"><path d=\"M640 768h512V576q0-106-75-181t-181-75-181 75-75 181v192zm832 96v576q0 40-28 68t-68 28H416q-40 0-68-28t-28-68V864q0-40 28-68t68-28h32V576q0-184 132-316t316-132 316 132 132 316v192h32q40 0 68 28t28 68z\"/></symbol><symbol id=\"user\" viewBox=\"0 0 1792 1792\"><path d=\"M1600 1405q0 120-73 189.5t-194 69.5H459q-121 0-194-69.5T192 1405q0-53 3.5-103.5t14-109T236 1084t43-97.5 62-81 85.5-53.5T538 832q9 0 42 21.5t74.5 48 108 48T896 971t133.5-21.5 108-48 74.5-48 42-21.5q61 0 111.5 20t85.5 53.5 62 81 43 97.5 26.5 108.5 14 109 3.5 103.5zm-320-893q0 159-112.5 271.5T896 896 624.5 783.5 512 512t112.5-271.5T896 128t271.5 112.5T1280 512z\"/></symbol></svg>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
