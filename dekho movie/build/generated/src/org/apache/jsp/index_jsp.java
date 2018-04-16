package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import theater_partner.theatergetsetter;
import theater_partner.theater;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/navbar1.css\">\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"css/carosel-top.css\">-->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/text.css\" type=\"text/css\">\n");
      out.write("<!--<Link rel=\"stylesheet\" href=\"css/card.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">-->\n");
      out.write("<style>\n");
      out.write("    #nav-right{\n");
      out.write("    font-size:20px;\n");
      out.write("    font-weight:bold; \n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <script>\n");
      out.write(" $(window).scroll(function() {\n");
      out.write("    if($(this).scrollTop() > 50)  \n");
      out.write("    {\n");
      out.write("        $('.opaque-navbar').addClass('opaque');\n");
      out.write("    } else {\n");
      out.write("        $('.opaque-navbar').removeClass('opaque');\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    <body >\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("<div class=\"navbar navbar-inverse navbar-fixed-top opaque-navbar\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navMain\">\n");
      out.write("  <span class=\"glyphicon glyphicon-chevron-right\" style=\"color:white;\"></span>\n");
      out.write("    \n");
      out.write("  </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\" style=\"font-family:fantasy;font-size:30px;color:white;  \">WB</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navMain\">\n");
      out.write("      <ul id=\"nav-right\" class=\"nav navbar-nav pull-right\">\n");
      out.write("        <li class=\"active\"><a href=\"#\"><span class=\"glyphicon glyphicon-Home\">Home</a></li>\n");
      out.write("        <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("<!--       <li><a href=\"SingUpPage.jsp\" ><span class=\"glyphicon glyphicon-user\"><b>Sign-up</b></span></a></li>--> \n");
      out.write("        <li><a href=\"LoginPage.jsp\"><span class=\"glyphicon glyphicon-log-in\"><b> Admin</b></span></a></li>\n");
      out.write("        <li></li>  </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- <section class=\"banner\"> -->\n");
      out.write("<!-- <div class=\"container\" > -->\n");
      out.write("<!-- <div class=\"row\" > -->\n");
      out.write("  <!-- </div> -->\n");
      out.write("  <!-- </div> -->\n");
      out.write("  <!-- </section> -->\n");
      out.write("  <div class=\"container-fluid\" style=\"background-color: Black;\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-12\">\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\" >\n");
      out.write("    <!-- Indicators -->\n");
      out.write("   \n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1520072765/blacky_fs8xfb.jpg\" alt=\"Los Angeles\" style=\"width:100%;\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1520336273/death_najmyv.png\" alt=\"Chicago\" style=\"width:100%;\">\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1515754909/dtlbkcw5ixkpn0yzabgl.jpg\" alt=\"New york\" style=\"width:100%;\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("      </div><br><br><hr>\n");
      out.write("<!-- Modal\t -->\n");
      out.write("\t\n");
      out.write("\t<!-- <modal image end> -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--payments modes-->\n");
      out.write("         <div class=\"container-fluid\">\n");
      out.write("   \n");
      out.write("                 <div class=\"jumbotron-fluid\"> \n");
      out.write("                     <span><center><p class=\"text-muted\" style=\"font-size:20px; \">MORE BENEFITS WITH MORE WAYS TO SHOP AND PAY</p></center>\n");
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
      out.write("        \n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("         \n");
      out.write("\t\n");
      out.write("\t<!-- Movies now in theatre -->\n");
      out.write("  \n");
      out.write("        <br><br>\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("     \n");
      out.write("        <div class=\"row\">\n");
      out.write("      \n");
      out.write("        ");

       theater th=new theater();
       List<theatergetsetter> list= th.get();
       
      out.write(" \n");
      out.write(" ");
 for(theatergetsetter st:list){
     System.out.print(st.getSelect_movie());
     
      out.write(" \n");
      out.write("       <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"card\" style=\"box-shadow: 10px 10px 5px grey; font-size:30px; text-align: center; \">\n");
      out.write("      <div class=\"card-header\"></div>\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("      <center><img src=\"");
      out.print(st.getImage());
      out.write("\" style=\"width:100%; height:350px; margin-left: 2%;\"></center>\n");
      out.write("      </div><br>\n");
      out.write("    <div class=\"card-footer\"><hr>\n");
      out.write("        ");
      out.print(st.getSelect_movie());
      out.write("<hr>\n");
      out.write("      ");
      out.print(st.getSelect_theater_location());
      out.write("\n");
      out.write("          <b>");
      out.print(st.getSelect_time());
      out.write("</b>\n");
      out.write("    \n");
      out.write("    <form action=\"SEAT.jsp\" method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"image\" value=\"");
      out.print(st.getImage());
      out.write("\">\n");
      out.write("<input type=\"hidden\" name=\"name\" value=\"");
      out.print(st.getSelect_movie());
      out.write("\">\n");
      out.write("<input type=\"hidden\" name=\"location\" value=\"");
      out.print(st.getSelect_theater_location());
      out.write("\">\n");
      out.write("<input type=\"hidden\" name=\"time\" value=\"");
      out.print(st.getSelect_time());
      out.write("\">\n");
      out.write("<input type=\"hidden\" name=\"date\" value=\"");
      out.print(st.getSelect_date());
      out.write("\" >\n");
      out.write("        <input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Book Now\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("            </div>\n");
      out.write("     ");
}
      out.write("\n");
      out.write("     \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("</body>\n");
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
