package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class therater_005fpartner_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write(" <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"header_footer_colour.css\">\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write(" </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("       <body>\n");
      out.write("                 <div class=\"container-fluid\">\n");
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
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write(" <!--       <li><a href=\"#\">Movies</a></li>-->\n");
      out.write("        <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("            <!--<li class=\"active\"><a href=\"LoginPage.jsp\">LogIn</a></li>--> \n");
      out.write("<!--<li><button class=\"btn btn-lg\"  style=\"margin-top:5%; background-color:black; font-size:15px;cursor:pointer; color:white;\" onclick=\"openNav()\">Trailers</button>-->\n");
      out.write("</li>\n");
      out.write("      </ul>\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"color:white;   font-family:cursive; font-size:20px; margin-top:1%; cursor:pointer; \">\n");
      out.write("            <li><span class=\"glyphicon glyphicon-user \">|</span>\n");
      out.write("                ");

                    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
                    
               HttpSession sp=request.getSession(false);
    String s1=request.getParameter("username");
    String a=(String)sp.getAttribute("username");

    out.print("welcome  " +  s1);
 
 
            
      out.write("</li>\n");
      out.write("   \n");
      out.write("          <li><a href=\"logout.jsp\" role=\"button\" class=\"btn\" style=\"padding-bottom:5%;margin-bottom:-50px; \"> Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("          \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("</div>\n");
      out.write("<!--            <div class=\"container-fluid\">\n");
      out.write("/</div>-->\n");
      out.write("            <!--             <h2><span>Movies now in Theater</span></h2>  \n");
      out.write("         <script>\n");
      out.write("        \n");
      out.write("    function callApi(){\n");
      out.write("         $.getJSON(\"http://www.omdbapi.com/?i=tt3896198&apikey=bd8375d&t=Black_Panther\",function(result)\n");
      out.write("         {\n");
      out.write("console.log(result);            \n");
      out.write("$(\"#actor\").text(result.Actors);\n");
      out.write("$(\"#Director\").text(result.Director);\n");
      out.write("$(\"#my_image\").attr(\"src\",result.Poster);\n");
      out.write("$(\"#plot\").text(result.Plot);\n");
      out.write("$(\"#Tittle\").text(result.Title);\n");
      out.write("\n");
      out.write("    });\n");
      out.write("      }\n");
      out.write("    callApi();\n");
      out.write("        </script>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-4\"> \n");
      out.write("            <div class=\"card\" style=\"width:400px\">\n");
      out.write("                <div class=\"card-header\" style=\"background-color:lavender;   font-size:20px; text-align:center ; \"><b id=\"Tittle\"</b></div>\n");
      out.write(" <div class=\"card-body\">        \n");
      out.write("  <center><img class=\"img-responsive\" id=\"my_image\" width=\"350\" height=\"30\" ></center>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card-footer card-grey\">\n");
      out.write("      <h4>Exclusive show</h4>\n");
      out.write("      <small>Action</small>\n");
      out.write("      <br>\n");
      out.write("      <a href=\"book.jsp\"class=\"btn  btn-danger btn-block\">Book Now</a>\n");
      out.write("<button type=\"button\" class=\"btn btn-info btn-block\" data-toggle=\"collapse\" data-target=\"#demo\">Plot</button>\n");
      out.write("  <div id=\"demo\" class=\"collapse\">\n");
      out.write("<b><i id=\"plot\"></i></b>\n");
      out.write("  </div>\n");
      out.write("     \n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write(" <div class=\"col-sm-4\" style=\"background-color:lavender; \">\n");
      out.write("here we go\n");
      out.write("    </div>\n");
      out.write("     <div class=\"col-sm-4\" style=\"background-color:#818181; \">\n");
      out.write("here we go\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("            -->\n");
      out.write("            \n");
      out.write(" \n");
      out.write("   \n");
      out.write("               \n");
      out.write("     \n");
      out.write(" <div class=\"container-fluid\">\n");
      out.write("   \n");
      out.write("                 <div class=\"jumbotron-fluid\"> \n");
      out.write("                     <center><p class=\"text-muted\" style=\"font-size:20px; \">MORE BENEFITS WITH MORE WAYS TO SHOP AND PAY</p></center>\n");
      out.write("             <div class=\"col-md-3\">\n");
      out.write("        <center><span class=\"glyphicon glyphicon-globe\" style=\"font-size:75px;\"></span></center>\n");
      out.write("                    <center><p class=\"text\" style=\"font-size:20px; \"><b>Shop in India and around world</b></p>\n");
      out.write("                    <small class=\"text-muted\">Signing up for a pay account is an easy process Make sure you have your personal details ready.</small>\n");
      out.write("                    </center>\n");
      out.write("                \n");
      out.write("             </div> \n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <center><span class=\"glyphicon glyphicon-credit-card\" style=\"font-size:75px;\"></span></center>\n");
      out.write("           <center><p class=\"text\" style=\"font-size:20px; \"><b>Pay without worries</b></p>\n");
      out.write("                    <small class=\"text-muted\">With 24/7 fraud detection,we work around the clock to keep your account safe and secure.</small>\n");
      out.write("                    </center>\n");
      out.write("            \n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-md-3\">\n");
      out.write("                     <center><span class=\"glyphicon glyphicon-lock\" style=\"font-size:75px;\"></span></center>\n");
      out.write("               <center><p class=\"text\" style=\"font-size:20px; \"><b>Your purchases are protected</b></p>\n");
      out.write("                    <small class=\"text-muted\">We cover you for eligible purchases if an item doesn't reach you or if its not as the seller described it.</small>\n");
      out.write("                    </center>     \n");
      out.write("                 </div>\n");
      out.write("                     <div class=\"col-md-3\">\n");
      out.write("                     <center><span class=\"glyphicon glyphicon-shopping-cart\" style=\"font-size:75px;\"></span></center>\n");
      out.write("               <center><p class=\"text\" style=\"font-size:20px; \"><b>Faster checkout</b></p>\n");
      out.write("                    <small class=\"text-muted\">Speed through checkout at millions of brands that accept KardPay.</small>\n");
      out.write("                    </center>\n");
      out.write("                     \n");
      out.write("                     </div>\n");
      out.write("                 </div>\n");
      out.write("     </div>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("   \n");
      out.write("<!--           <==========================================================================================================> -->\n");
      out.write("\n");
      out.write("           <div class=\"jumbotron-fluid\" style=\"background-color: grey;\"> \n");
      out.write("               <div class=\"row\" style=\"padding-left: 30%; margin-top: 5%; text-align: center; \" >\n");
      out.write("             <!--   start of the first row -->  \n");
      out.write("                        <div class=\"col-sm-5\" style=\"padding-right: 5%\">\n");
      out.write("                            <h3 class=\"text-center\" style=\"letter-spacing: 5px\">Theatre Data</h3>       \n");
      out.write("                            <form   action=\"HALL\" enctype=\"multipart/form-data\"  method=\"post\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("                 <select name=\"Dta_val\" style=\"width: 480px;height:35px;border-radius: 8px\" >\n");
      out.write("<option>*********Select Movie*********</option>\n");
      out.write("<option>Black Panther</option> \n");
      out.write("<option>Raid</option>\n");
      out.write("<option>Sonu ke Titu Ki Sweety</option>\n");
      out.write("<option>Baaghi 2</option>\n");
      out.write("<option>Hichki</option>\n");
      out.write("<option>October</option>\n");
      out.write("<option>Daddy</option>\n");
      out.write("<option>Hate Story 5</option>\n");
      out.write("\n");
      out.write("</select>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("   <select name=\"Dta_val\" style=\"width: 480px;height:35px;border-radius: 8px\" >\n");
      out.write("<option>*********Select Theater Location *********</option>\n");
      out.write("<option>Wave Cinemas,TDi Paragon Mall</option> \n");
      out.write("<option>M2K  PITAMPURA, Rani Bagh/option>\n");
      out.write("<option>Delite Diamond,Delhi Gate</option>\n");
      out.write("<option>PVR ,Shalimar Bagh</option>\n");
      out.write("<option>PVR,Vikaspuri </option>\n");
      out.write("\n");
      out.write("   </select>\n");
      out.write("          </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("<select name=\"Dta_val\" style=\"width: 480px;height:35px;border-radius: 8px\" >\n");
      out.write("<option>*********Select Theater Date *********</option>\n");
      out.write("<option>29 March,2018</option>\n");
      out.write("<option>30 March,2018</option>\n");
      out.write("<option>31 March,2018</option>\n");
      out.write("<option>1 April,2018</option>\n");
      out.write("<option>2 April,2018</option>\n");
      out.write("<option>3 April,2018</option>\n");
      out.write("<option>4 April,2018</option>\n");
      out.write("<option>5 April,2018</option>\n");
      out.write("<option>6 April,2018</option>\n");
      out.write("</select>\n");
      out.write("              </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("<select name=\"Dta_val\" style=\"width: 480px;height:35px;border-radius: 8px\" >\n");
      out.write("<option>*********Select Theater Time *********</option>\n");
      out.write("<option>10:00Am</option>\n");
      out.write("<option>10:20Am</option>\n");
      out.write("<option>10:30Am</option>\n");
      out.write("<option>10:45Am</option>\n");
      out.write("<option>11:00Am</option>\n");
      out.write("<option>11:20Am</option>\n");
      out.write("<option>11:45Am</option>\n");
      out.write("<option>12:00pm</option>\n");
      out.write("<option>12:10pm</option>\n");
      out.write("<option>12:20pm</option>\n");
      out.write("<option>12:30pm</option>\n");
      out.write("<option>12:45pm</option>\n");
      out.write("<option>01:00pm</option>\n");
      out.write("<option>02:00pm</option>\n");
      out.write("<option>Not Beyond </option>\n");
      out.write("</select>\n");
      out.write(" </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control\" required   type=\"file\"   name=\"image\">\n");
      out.write(" </div>\n");
      out.write("                                \n");
      out.write("                                          \n");
      out.write("<!--                                       <div class=\"form-group\">\n");
      out.write("              <input class=\"form-control\" required   type=\"text\" placeholder=\"Theater Plan Name\"  name=\"Dta_val\">\n");
      out.write(" </div>                         -->\n");
      out.write("                                \n");
      out.write("<!--pattern=\"^[A-Z][a-z]*[,][0-1][0-9][:][0-9]{2}[][AMP]+$\"     -->\n");
      out.write("\n");
      out.write("              <button type=\"submit\" class=\"btn btn-info btn-block\"> Upload It </button>  \n");
      out.write("                                               </form>\n");
      out.write("</div>\n");
      out.write("                          </div>\n");
      out.write("    \n");
      out.write("                </div>\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("</html>");
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
