package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bookinginfo.infocon;

public final class SEAT_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<link href=\"css/seat.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("#curve\n");
      out.write("{\n");
      out.write("\n");
      out.write("    width: 500px;\n");
      out.write("   height: 100px;\n");
      out.write("   border: solid 2px #000;\n");
      out.write("  border-color: transparent transparent #000 transparent;   \n");
      out.write("  border-radius: 0 0 240px 50%/60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t* {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".seat {\n");
      out.write("    float: left;\n");
      out.write("    margin: 5px;\n");
      out.write("    width: 35px;\n");
      out.write("    height: 40px;\n");
      out.write("    border: 2px solid #6699ff ;\n");
      out.write("    border-radius: 5px;\n");
      out.write("}\n");
      out.write(".seats\n");
      out.write("{\n");
      out.write("         display: flex;\n");
      out.write("  flex-direction: row;\n");
      out.write("  flex-wrap: nowrap;\n");
      out.write("  justify-content: flex-start;  \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".seat-select {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".seat-select:checked+.seat {\n");
      out.write("    background-color: #ff9999;  \n");
      out.write("     border: 2px solid #ff9999;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"checkbox\"]:disabled + label \n");
      out.write("{\n");
      out.write("    \n");
      out.write("    background-color: #ff9999;\n");
      out.write("     border: 2px solid #ff9999;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    cursor:not-allowed;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*.seat-select:disabled+.seat {\n");
      out.write("}*/\n");
      out.write("seat:hover\n");
      out.write("{\n");
      out.write("    background:#000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("  <script>\n");
      out.write(" \n");
      out.write("    $(document).ready(function (){\n");
      out.write("    var emailid;    \n");
      out.write("$('#proceed').hide();\n");
      out.write("$('#proceed').click(function()\n");
      out.write("\n");
      out.write("        {\n");
      out.write("               if($('input[type=checkbox]:checked').length==0)   \n");
      out.write("      {\n");
      out.write("          $(\"#proceed\").attr(\"disabled\",\"disabled\");\n");
      out.write("         \n");
      out.write("      } \n");
      out.write("      else{\n");
      out.write("                 $(\"#myModal\").fadeIn(3000);\n");
      out.write("//    var emailid;\n");
      out.write("//var pattern=new RegExp(\"/^[a-zA-Z0-9_\\.-]+@[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+\\.*[a-zA-Z0-9_]+$/\");\n");
      out.write("//var res=pattern.test(inputValue);\n");
      out.write("//\n");
      out.write("//$(\"#email\").val(email);\n");
      out.write("//\n");
      out.write("//$(\"#ticketid\").val(\"#\"+ Math.floor(Math.random()*100000)+1);\n");
      out.write("//\n");
      out.write("//$(\"#myform\").submit();\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        });\n");
      out.write("});\n");
      out.write(" \n");
      out.write("            var seatname;\n");
      out.write("            var seatprice = 0;\n");
      out.write("            var seatvalue;\n");
      out.write("            var temp=[];\n");
      out.write("            var count=1;\n");
      out.write("\n");
      out.write(" \n");
      out.write("  $(function()\n");
      out.write("  {\n");
      out.write("     $('.seat-select').click(function ()\n");
      out.write("     {\n");
      out.write("         \n");
      out.write("                     $('#proceed').removeAttr('disabled');\n");
      out.write("\n");
      out.write("              if($('input[type=checkbox]:checked').length>=0  && $(this).is(':checked')) \n");
      out.write("              {\n");
      out.write("                seatprice = 0;\n");
      out.write("                seatname=0;\n");
      out.write("                  \n");
      out.write("      \n");
      out.write("        $('input[type=checkbox]:checked').each(function (index, value) { \n");
      out.write(" \n");
      out.write("           \n");
      out.write("                    seatvalue=$(this).attr('value');\n");
      out.write("                    console.log(seatvalue.split(\",\"));\n");
      out.write("                    temp =seatvalue.split(\",\");\n");
      out.write("         if(temp[0].length==3)\n");
      out.write("         {\n");
      out.write("                seatname+=parseInt(temp[0].length-2);\n");
      out.write("\n");
      out.write("                seatprice += parseInt(temp[1]);\n");
      out.write("\n");
      out.write("                console.log(\"seat name ki value hai \"+seatname);\n");
      out.write("                console.log(seatprice);\n");
      out.write("\n");
      out.write("                $(\"#name\").text(seatname);\n");
      out.write("                $(\"#price\").text(seatprice);\n");
      out.write("                $(\"#numseat\").val(seatname);\n");
      out.write("                $(\"#total_amount\").val(seatprice);\n");
      out.write("\n");
      out.write("         }\n");
      out.write("          else\n");
      out.write("         {\n");
      out.write("                seatname+=parseInt(temp[0].length-1);\n");
      out.write("\n");
      out.write("                seatprice += parseInt(temp[1]);\n");
      out.write("\n");
      out.write("                console.log(\"seat name ki value hai \"+seatname);\n");
      out.write("                console.log(seatprice);\n");
      out.write("\n");
      out.write("                $(\"#name\").text(seatname);\n");
      out.write("                $(\"#price\").text(seatprice);\n");
      out.write("                $(\"#numseat\").val(seatname);\n");
      out.write("                $(\"#total_amount\").val(seatprice);\n");
      out.write("\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("           \n");
      out.write("    else\n");
      out.write("   {\n");
      out.write("       \n");
      out.write("            seatvalue=$(this).attr('value');\n");
      out.write("           temp =seatvalue.split(\",\");\n");
      out.write("       if(temp[0].length==3)\n");
      out.write("       {\n");
      out.write("           \n");
      out.write("                seatname -= parseInt(temp[0].length-2);\n");
      out.write("\n");
      out.write("                seatprice-= parseInt(temp[1]);\n");
      out.write("\n");
      out.write("                $(\"#name\").text(seatname);\n");
      out.write("                $(\"#price\").text(seatprice);\n");
      out.write("                $(\"#numseat\").val(seatname);\n");
      out.write("                $(\"#total_amount\").val(seatprice);\n");
      out.write("\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("       else\n");
      out.write("       {\n");
      out.write("\n");
      out.write("                seatname -= parseInt(temp[0].length-1);\n");
      out.write("\n");
      out.write("                seatprice-= parseInt(temp[1]);\n");
      out.write("\n");
      out.write("                $(\"#name\").text(seatname);\n");
      out.write("                $(\"#price\").text(seatprice);\n");
      out.write("                $(\"#numseat\").val(seatname);\n");
      out.write("                $(\"#total_amount\").val(seatprice);\n");
      out.write("\n");
      out.write("       }\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("     }); \n");
      out.write("  });\n");
      out.write("\n");
      out.write("    \n");
      out.write("     </script>   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     ");
String img=request.getParameter("image");
            String name=request.getParameter("name");
            String loc=request.getParameter("location");
     String time=request.getParameter("time");
     String date=request.getParameter("date");
     
     
      out.write("\n");
      out.write("    ");

     infocon inf=new infocon();
   StringBuilder st=new StringBuilder();
   st=inf.bookinfo(name, loc, time, date);
   String str=st.toString();
   
    
      out.write("\n");
      out.write("    \n");
      out.write("      <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Modal Header</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <input type=\"email\" placeholder=\"Enter your email id\" id=\"mo_email\">\n");
      out.write("            <button class=\"btn btn-danger\" id=\"con\">continue</button>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write(" <div class=\"row\"> \n");
      out.write("     <form  id=\"myform\" action=\"\" method=\"post\" >\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div  onclick=\"\" class=\"well well-lg\" style=\"width: 100%;height: 800px;box-shadow: 5px 10px 70px #333333\">\n");
      out.write("    <!--first row -->\n");
      out.write("    <p><center>Normal Rs.100</center></p>\n");
      out.write(" <hr>\n");
      out.write("    <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("        <input id=\"seat-1\" class=\"seat-select\" type=\"checkbox\" value=\"1A,100\" >\n");
      out.write("           <label for=\"seat-1\" class=\"seat\" style=\"text-align: center\" >1A</label>\n");
      out.write("      <input id=\"seat-2\" class=\"seat-select\" type=\"checkbox\" value=\"2A,100\" name=\"seat\">\n");
      out.write("      <label for=\"seat-2\" class=\"seat\" style=\"text-align: center\">2A</label>\n");
      out.write("      <input id=\"seat-3\" class=\"seat-select\" type=\"checkbox\" value=\"3A,100\" name=\"seat\">\n");
      out.write("      <label for=\"seat-3\" class=\"seat\" style=\"text-align: center\">3A</label>\n");
      out.write("      <input id=\"seat-4\" class=\"seat-select\" type=\"checkbox\" value=\"4A,100\" name=\"seat\">\n");
      out.write("      <label for=\"seat-4\" class=\"seat\" style=\"text-align: center\">4A</label>\n");
      out.write("      <input id=\"seat-5\" class=\"seat-select\" type=\"checkbox\" value=\"5A,100\" name=\"seat\">\n");
      out.write("      <label for=\"seat-5\" class=\"seat\" style=\"text-align: center\">5A</label>\n");
      out.write("      <input id=\"seat-6\" class=\"seat-select\" type=\"checkbox\" value=\"6A,100\" name=\"seat\">\n");
      out.write("      <label for=\"seat-6\" class=\"seat\" style=\"text-align: center\">6A</label>\n");
      out.write("      <input id=\"seat-7\" class=\"seat-select\" type=\"checkbox\" value=\"7A,100\" name=\"seat\">\n");
      out.write("          </div>\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-8\" class=\"seat-select\" type=\"checkbox\" value=\"8A,100\" ");
if( str.contains("8A") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-8\" class=\"seat\" style=\"text-align: center\" >8A</label>\n");
      out.write("    \n");
      out.write("    <input id=\"seat-9\" class=\"seat-select\" type=\"checkbox\" value=\"9A,100\" name=\"seat\" ");
if( str.contains("9A") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-9\" class=\"seat\" style=\"text-align: center\">9A</label>\n");
      out.write("      <input id=\"seat-10\" class=\"seat-select\" type=\"checkbox\" value=\"10A,100\" name=\"seat\" ");
if( str.contains("10A") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-10\" class=\"seat\" style=\"text-align: center\">10A</label>\n");
      out.write("      <input id=\"seat-11\" class=\"seat-select\" type=\"checkbox\" value=\"11A,100\" name=\"seat\" ");
if( str.contains("11A") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-11\" class=\"seat\" style=\"text-align: center\">11A</label>\n");
      out.write("      <input id=\"seat-12\" class=\"seat-select\" type=\"checkbox\" value=\"12A,100\" name=\"seat\" ");
if( str.contains("12A") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-12\" class=\"seat\" style=\"text-align: center\">12A</label>\n");
      out.write("      <input id=\"seat-13\" class=\"seat-select\" type=\"checkbox\" value=\"13A,100\" name=\"seat\" ");
if( str.contains("13A") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-13\" class=\"seat\" style=\"text-align: center\">13A</label>\n");
      out.write("      <input id=\"seat-14\" class=\"seat-select\" type=\"checkbox\" value=\"14A,100\" name=\"seat\" ");
if( str.contains("14A") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      \n");
      out.write("       </div>\n");
      out.write("      <!--end of the first row-->\n");
      out.write("    <!--staring of the second row-->\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-15\" class=\"seat-select\" type=\"checkbox\" value=\"1B,100\" >\n");
      out.write("           <label for=\"seat-15\" class=\"seat\" style=\"text-align: center\" >1B</label>\n");
      out.write("    \n");
      out.write("      <input id=\"seat-16\" class=\"seat-select\" type=\"checkbox\" value=\"2B,100\" name=\"seat\"  />\n");
      out.write("      <label for=\"seat-16\" class=\"seat\" style=\"text-align: center\">2B</label>\n");
      out.write("      <input id=\"seat-17\" class=\"seat-select\" type=\"checkbox\" value=\"3B,100\" name=\"seat\"   />\n");
      out.write("      <label for=\"seat-17\" class=\"seat\" style=\"text-align: center\">3B</label>\n");
      out.write("      <input id=\"seat-18\" class=\"seat-select\" type=\"checkbox\" value=\"4B,100\" name=\"seat\" />\n");
      out.write("      <label for=\"seat-18\" class=\"seat\" style=\"text-align: center\">4B</label>\n");
      out.write("      <input id=\"seat-19\" class=\"seat-select\" type=\"checkbox\" value=\"5B,100\" name=\"seat\" ");
if( str.contains("5B") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-19\" class=\"seat\" style=\"text-align: center\">5B</label>\n");
      out.write("      <input id=\"seat-20\" class=\"seat-select\" type=\"checkbox\" value=\"6B,100\" name=\"seat\" ");
if( str.contains("6B") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-20\" class=\"seat\" style=\"text-align: center\">6B</label>\n");
      out.write("      <input id=\"seat-21\" class=\"seat-select\" type=\"checkbox\" value=\"7B,100\" name=\"seat\" ");
if( str.contains("7B") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("          </div>\n");
      out.write("             <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-22\" class=\"seat-select\" type=\"checkbox\" value=\"8B,100\" ");
if( str.contains("8B") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-22\" class=\"seat\" style=\"text-align: center\" >8B</label>\n");
      out.write("    \n");
      out.write("    <input id=\"seat-23\" class=\"seat-select\" type=\"checkbox\" value=\"9B,100\" name=\"seat\" ");
if( str.contains("9B") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-23\" class=\"seat\" style=\"text-align: center\">9B</label>\n");
      out.write("      <input id=\"seat-24\" class=\"seat-select\" type=\"checkbox\" value=\"10B,100\" name=\"seat\" ");
if( str.contains("10B") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-24\" class=\"seat\" style=\"text-align: center\">10B</label>\n");
      out.write("      <input id=\"seat-25\" class=\"seat-select\" type=\"checkbox\" value=\"11B,100\" name=\"seat\" ");
if( str.contains("11B") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-25\" class=\"seat\" style=\"text-align: center\">11B</label>\n");
      out.write("      <input id=\"seat-26\" class=\"seat-select\" type=\"checkbox\" value=\"12B,100\" name=\"seat\" ");
if( str.contains("12B") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-26\" class=\"seat\" style=\"text-align: center\">12B</label>\n");
      out.write("      <input id=\"seat-27\" class=\"seat-select\" type=\"checkbox\" value=\"13B,100\" name=\"seat\" ");
if( str.contains("13B") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-27\" class=\"seat\" style=\"text-align: center\">13B</label>\n");
      out.write("      <input id=\"seat-28\" class=\"seat-select\" type=\"checkbox\" value=\"14B,100\" name=\"seat\" ");
if( str.contains("14B") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      \n");
      out.write("       </div>\n");
      out.write("    <!--end of the second row-->\n");
      out.write("        <!--staring of the third row-->\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-29\" class=\"seat-select\" type=\"checkbox\" value=\"1C,100\" ");
if( str.contains("1C") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-29\" class=\"seat\" style=\"text-align: center\" >1C</label>\n");
      out.write("    \n");
      out.write("      <input id=\"seat-30\" class=\"seat-select\" type=\"checkbox\" value=\"2C,100\" name=\"seat\" ");
if( str.contains("2C") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-30\" class=\"seat\" style=\"text-align: center\">2C</label>\n");
      out.write("      <input id=\"seat-31\" class=\"seat-select\" type=\"checkbox\" value=\"3C,100\" name=\"seat\" ");
if( str.contains("3C") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-31\" class=\"seat\" style=\"text-align: center\">3C</label>\n");
      out.write("      <input id=\"seat-32\" class=\"seat-select\" type=\"checkbox\" value=\"4C,100\" name=\"seat\" ");
if( str.contains("4C") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-32\" class=\"seat\" style=\"text-align: center\">4C</label>\n");
      out.write("      <input id=\"seat-33\" class=\"seat-select\" type=\"checkbox\" value=\"5C,100\" name=\"seat\" ");
if( str.contains("5C") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-33\" class=\"seat\" style=\"text-align: center\">5C</label>\n");
      out.write("      <input id=\"seat-34\" class=\"seat-select\" type=\"checkbox\" value=\"6C,100\" name=\"seat\" ");
if( str.contains("6C") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-34\" class=\"seat\" style=\"text-align: center\">6C</label>\n");
      out.write("      <input id=\"seat-35\" class=\"seat-select\" type=\"checkbox\" value=\"7C,100\" name=\"seat\" ");
if( str.contains("7C") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("          </div>\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-36\" class=\"seat-select\" type=\"checkbox\" value=\"8C,100\" ");
if( str.contains("8C") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-36\" class=\"seat\" style=\"text-align: center\" >8C</label>\n");
      out.write("    \n");
      out.write("    <input id=\"seat-37\" class=\"seat-select\" type=\"checkbox\" value=\"9C,100\" name=\"seat\" ");
if( str.contains("9C") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-37\" class=\"seat\" style=\"text-align: center\">9C</label>\n");
      out.write("      <input id=\"seat-38\" class=\"seat-select\" type=\"checkbox\" value=\"10C,100\" name=\"seat\" ");
if( str.contains("10C") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-38\" class=\"seat\" style=\"text-align: center\">10C</label>\n");
      out.write("      <input id=\"seat-39\" class=\"seat-select\" type=\"checkbox\" value=\"11C,100\" name=\"seat\" ");
if( str.contains("11C") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-39\" class=\"seat\" style=\"text-align: center\">11C</label>\n");
      out.write("      <input id=\"seat-40\" class=\"seat-select\" type=\"checkbox\" value=\"12C,100\" name=\"seat\" ");
if( str.contains("12C") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-40\" class=\"seat\" style=\"text-align: center\">12C</label>\n");
      out.write("      <input id=\"seat-41\" class=\"seat-select\" type=\"checkbox\" value=\"13C,100\" name=\"seat\" ");
if( str.contains("13C") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-41\" class=\"seat\" style=\"text-align: center\">13C</label>\n");
      out.write("      <input id=\"seat-42\" class=\"seat-select\" type=\"checkbox\" value=\"14C,100\" name=\"seat\" ");
if( str.contains("14C") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      \n");
      out.write("       </div>\n");
      out.write("    <!--end of the third row-->\n");
      out.write(" <p><center>Silver Rs.200</center></p>\n");
      out.write(" <hr>\n");
      out.write("        <!--staring of the fourth row-->    \n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-43\" class=\"seat-select\" type=\"checkbox\" value=\"1D,200\" ");
if( str.contains("1D") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-43\" class=\"seat\" style=\"text-align: center\" >1D</label>\n");
      out.write("    \n");
      out.write("      <input id=\"seat-44\" class=\"seat-select\" type=\"checkbox\" value=\"2D,200\" name=\"seat\" ");
if( str.contains("2D") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-44\" class=\"seat\" style=\"text-align: center\">2D</label>\n");
      out.write("      <input id=\"seat-45\" class=\"seat-select\" type=\"checkbox\" value=\"3D,200\" name=\"seat\" ");
if( str.contains("3D") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-45\" class=\"seat\" style=\"text-align: center\">3D</label>\n");
      out.write("      <input id=\"seat-46\" class=\"seat-select\" type=\"checkbox\" value=\"4D,200\" name=\"seat\" ");
if( str.contains("4D") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-46\" class=\"seat\" style=\"text-align: center\">4D</label>\n");
      out.write("      <input id=\"seat-47\" class=\"seat-select\" type=\"checkbox\" value=\"5D,200\" name=\"seat\" ");
if( str.contains("5D") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-47\" class=\"seat\" style=\"text-align: center\">5D</label>\n");
      out.write("      <input id=\"seat-48\" class=\"seat-select\" type=\"checkbox\" value=\"6D,200\" name=\"seat\" ");
if( str.contains("6D") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-48\" class=\"seat\" style=\"text-align: center\">6D</label>\n");
      out.write("      <input id=\"seat-49\" class=\"seat-select\" type=\"checkbox\" value=\"7D,200\" name=\"seat\" ");
if( str.contains("7D") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("          </div>\n");
      out.write("      \n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-50\" class=\"seat-select\" type=\"checkbox\" value=\"8D,200\" ");
if( str.contains("8D") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-50\" class=\"seat\" style=\"text-align: center\" >8D</label>\n");
      out.write("    \n");
      out.write("    <input id=\"seat-51\" class=\"seat-select\" type=\"checkbox\" value=\"9D,200\" name=\"seat\" ");
if( str.contains("9D") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-51\" class=\"seat\" style=\"text-align: center\">9D</label>\n");
      out.write("      <input id=\"seat-52\" class=\"seat-select\" type=\"checkbox\" value=\"10D,200\" name=\"seat\" ");
if( str.contains("10D") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-52\" class=\"seat\" style=\"text-align: center\">10D</label>\n");
      out.write("      <input id=\"seat-53\" class=\"seat-select\" type=\"checkbox\" value=\"11D,200\" name=\"seat\" ");
if( str.contains("11D") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-53\" class=\"seat\" style=\"text-align: center\">11D</label>\n");
      out.write("      <input id=\"seat-54\" class=\"seat-select\" type=\"checkbox\" value=\"12D,200\" name=\"seat\" ");
if( str.contains("12D") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-54\" class=\"seat\" style=\"text-align: center\">12D</label>\n");
      out.write("      <input id=\"seat-55\" class=\"seat-select\" type=\"checkbox\" value=\"13D,200\" name=\"seat\" ");
if( str.contains("13D") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-55\" class=\"seat\" style=\"text-align: center\">13D</label>\n");
      out.write("      \n");
      out.write("       </div>\n");
      out.write("    <!--end of the fourth row-->\n");
      out.write(" \n");
      out.write("        <!--staring of the fifth row-->\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-57\" class=\"seat-select\" type=\"checkbox\" value=\"1E,200\" ");
if( str.contains("1E") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-57\" class=\"seat\" style=\"text-align: center\" >1E</label>\n");
      out.write("    \n");
      out.write("      <input id=\"seat-58\" class=\"seat-select\" type=\"checkbox\" value=\"2E,200\" name=\"seat\" ");
if( str.contains("2E") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-58\" class=\"seat\" style=\"text-align: center\">2E</label>\n");
      out.write("      <input id=\"seat-60\" class=\"seat-select\" type=\"checkbox\" value=\"3E,200\" name=\"seat\" ");
if( str.contains("3E") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-60\" class=\"seat\" style=\"text-align: center\">3E</label>\n");
      out.write("      <input  id=\"seat-61\" class=\"seat-select\" type=\"checkbox\" value=\"4E,200\" name=\"seat\" ");
if( str.contains("4E") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-61\" class=\"seat\" style=\"text-align: center\">4E</label>\n");
      out.write("      <input id=\"seat-62\" class=\"seat-select\" type=\"checkbox\" value=\"5E,200\" name=\"seat\" ");
if( str.contains("5E") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-62\" class=\"seat\" style=\"text-align: center\">5E</label>\n");
      out.write("      <input id=\"seat-63\" class=\"seat-select\" type=\"checkbox\" value=\"6E,200\" name=\"seat\" ");
if( str.contains("6E") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-63\" class=\"seat\" style=\"text-align: center\">6E</label>\n");
      out.write("          </div>\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-65\" class=\"seat-select\" type=\"checkbox\" value=\"8E,200\" ");
if( str.contains("8E") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-65\" class=\"seat\" style=\"text-align: center\" >8E</label>\n");
      out.write("    \n");
      out.write("    <input id=\"seat-66\" class=\"seat-select\" type=\"checkbox\" value=\"9E,200\" name=\"seat\" ");
if( str.contains("9E") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-66\" class=\"seat\" style=\"text-align: center\">9E</label>\n");
      out.write("      <input id=\"seat-67\" class=\"seat-select\" type=\"checkbox\" value=\"10E,200\" name=\"seat\" ");
if( str.contains("10E") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-67\" class=\"seat\" style=\"text-align: center\">10E</label>\n");
      out.write("      <input id=\"seat-68\" class=\"seat-select\" type=\"checkbox\" value=\"11E,200\" name=\"seat\" ");
if( str.contains("11E") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-68\" class=\"seat\" style=\"text-align: center\">11E</label>\n");
      out.write("      <input id=\"seat-69\" class=\"seat-select\" type=\"checkbox\" value=\"12E,200\" name=\"seat\" ");
if( str.contains("12E") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-69\" class=\"seat\" style=\"text-align: center\">12E</label>\n");
      out.write("      <input id=\"seat-70\" class=\"seat-select\" type=\"checkbox\" value=\"13E,200\" name=\"seat\" ");
if( str.contains("13E") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-70\" class=\"seat\" style=\"text-align: center\">13E</label>\n");
      out.write("      \n");
      out.write("       </div>\n");
      out.write("    <!--end of the fifth row-->\n");
      out.write(" <p><center>Gold Rs.350</center></p>\n");
      out.write(" <hr>\n");
      out.write("        <!--staring of the sixth row-->\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-72\" class=\"seat-select\" type=\"checkbox\" value=\"1F,350\" ");
if( str.contains("1F") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("           <label for=\"seat-72\" class=\"seat\" style=\"text-align: center\" >1F</label>\n");
      out.write("    \n");
      out.write("      <input id=\"seat-73\" class=\"seat-select\" type=\"checkbox\" value=\"2F,350\" name=\"seat\" ");
if( str.contains("2F") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat73\" class=\"seat\" style=\"text-align: center\">2F</label>\n");
      out.write("      <input id=\"seat-74\" class=\"seat-select\" type=\"checkbox\" value=\"3F,350\" name=\"seat\" ");
if( str.contains("3F") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-74\" class=\"seat\" style=\"text-align: center\">3F</label>\n");
      out.write("      <input id=\"seat-75\" class=\"seat-select\" type=\"checkbox\" value=\"4F,350\" name=\"seat\" ");
if( str.contains("4F") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-75\" class=\"seat\" style=\"text-align: center\">4F</label>\n");
      out.write("      <input id=\"seat-76\" class=\"seat-select\" type=\"checkbox\" value=\"5F,350\" name=\"seat\" ");
if( str.contains("5F") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-76\" class=\"seat\" style=\"text-align: center\">5F</label>\n");
      out.write("      <input id=\"seat-77\" class=\"seat-select\" type=\"checkbox\" value=\"6F,350\" name=\"seat\" ");
if( str.contains("6F") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-77\" class=\"seat\" style=\"text-align: center\">6F</label>\n");
      out.write("          </div>\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-79\" class=\"seat-select\" type=\"checkbox\" value=\"8F,350\" ");
if( str.contains("8F") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-79\" class=\"seat\" style=\"text-align: center\" >8F</label>\n");
      out.write("    \n");
      out.write("    <input id=\"seat-80\" class=\"seat-select\" type=\"checkbox\" value=\"9F,350\" name=\"seat\" ");
if( str.contains("9F") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-80\" class=\"seat\" style=\"text-align: center\">9F</label>\n");
      out.write("      <input id=\"seat-81\" class=\"seat-select\" type=\"checkbox\" value=\"10F,350\" name=\"seat\" ");
if( str.contains("10F") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-81\" class=\"seat\" style=\"text-align: center\">10F</label>\n");
      out.write("      <input id=\"seat-82\" class=\"seat-select\" type=\"checkbox\" value=\"11F,350\" name=\"seat\" ");
if( str.contains("11F") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-82\" class=\"seat\" style=\"text-align: center\">11F</label>\n");
      out.write("      <input id=\"seat-83\" class=\"seat-select\" type=\"checkbox\" value=\"12F,350\" name=\"seat\" ");
if( str.contains("12F") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-84\" class=\"seat\" style=\"text-align: center\">12F</label>\n");
      out.write("      <input id=\"seat-84\" class=\"seat-select\" type=\"checkbox\" value=\"13F,350\" name=\"seat\" ");
if( str.contains("13F") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-85\" class=\"seat\" style=\"text-align: center\">13F</label>\n");
      out.write("      \n");
      out.write("       </div>\n");
      out.write("    <!--end of the sixth row-->\n");
      out.write("\n");
      out.write("          <!--staring of the seven row-->\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-87\" class=\"seat-select\" type=\"checkbox\" value=\"1G,350\" ");
if( str.contains("1G") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-87\" class=\"seat\" style=\"text-align: center\" >1G</label>\n");
      out.write("    \n");
      out.write("      <input id=\"seat-88\" class=\"seat-select\" type=\"checkbox\" value=\"2G,350\" name=\"seat\" ");
if( str.contains("2G") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-88\" class=\"seat\" style=\"text-align: center\">2G</label>\n");
      out.write("      <input id=\"seat-89\" class=\"seat-select\" type=\"checkbox\" value=\"3G,350\" name=\"seat\" ");
if( str.contains("3G") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-89\" class=\"seat\" style=\"text-align: center\">3G</label>\n");
      out.write("      <input id=\"seat-90\" class=\"seat-select\" type=\"checkbox\" value=\"4A,350\" name=\"seat\" ");
if( str.contains("4G") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-90\" class=\"seat\" style=\"text-align: center\">4G</label>\n");
      out.write("      <input id=\"seat-91\" class=\"seat-select\" type=\"checkbox\" value=\"5G,350\" name=\"seat\" ");
if( str.contains("5G") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-91\" class=\"seat\" style=\"text-align: center\">5G</label>\n");
      out.write("      <input id=\"seat-92\" class=\"seat-select\" type=\"checkbox\" value=\"6G,350\" name=\"seat\" ");
if( str.contains("6G") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-92\" class=\"seat\" style=\"text-align: center\">6G</label>\n");
      out.write("          </div>\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-01\" class=\"seat-select\" type=\"checkbox\" value=\"8G,350\" ");
if( str.contains("8G") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-01\" class=\"seat\" style=\"text-align: center\" >8G</label>\n");
      out.write("    \n");
      out.write("    <input id=\"seat-02\" class=\"seat-select\" type=\"checkbox\" value=\"9G,350\" name=\"seat\" ");
if( str.contains("9G") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-02\" class=\"seat\" style=\"text-align: center\">9G</label>\n");
      out.write("      <input id=\"seat-03\" class=\"seat-select\" type=\"checkbox\" value=\"10G,350\" name=\"seat\" ");
if( str.contains("10G") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-03\" class=\"seat\" style=\"text-align: center\">10G</label>\n");
      out.write("      <input id=\"seat-04\" class=\"seat-select\" type=\"checkbox\" value=\"11G,350\" name=\"seat\" ");
if( str.contains("11G") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-04\" class=\"seat\" style=\"text-align: center\">11G</label>\n");
      out.write("      <input id=\"seat-05\" class=\"seat-select\" type=\"checkbox\" value=\"12G,350\" name=\"seat\" ");
if( str.contains("12G") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-05\" class=\"seat\" style=\"text-align: center\">12G</label>\n");
      out.write("      <input id=\"seat-06\" class=\"seat-select\" type=\"checkbox\" value=\"13G,350\" name=\"seat\" ");
if( str.contains("13G") ){
      out.write("disabled");
}
      out.write("/>\n");
      out.write("      <label for=\"seat-06\" class=\"seat\" style=\"text-align: center\">13G</label>\n");
      out.write("      \n");
      out.write("       </div>\n");
      out.write("    <!--end of the seven row-->\n");
      out.write("\n");
      out.write("          <!--staring of the eight row-->\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-001\" class=\"seat-select\" type=\"checkbox\" value=\"1H,350\" ");
if( str.contains("1H") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-001\" class=\"seat\" style=\"text-align: center\" >1H</label>\n");
      out.write("    \n");
      out.write("      <input id=\"seat-002\" class=\"seat-select\" type=\"checkbox\" value=\"2H,350\" name=\"seat\" ");
if( str.contains("2H") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-002\" class=\"seat\" style=\"text-align: center\">2H</label>\n");
      out.write("      <input id=\"seat-003\" class=\"seat-select\" type=\"checkbox\" value=\"3H,350\" name=\"seat\" ");
if( str.contains("3H") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-003\" class=\"seat\" style=\"text-align: center\">3H</label>\n");
      out.write("      <input id=\"seat-004\" class=\"seat-select\" type=\"checkbox\" value=\"4H,350\" name=\"seat\" ");
if( str.contains("4H") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-004\" class=\"seat\" style=\"text-align: center\">4H</label>\n");
      out.write("      <input id=\"seat-005\" class=\"seat-select\" type=\"checkbox\" value=\"5H,350\" name=\"seat\" ");
if( str.contains("5H") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-005\" class=\"seat\" style=\"text-align: center\">5H</label>\n");
      out.write("      <input id=\"seat-006\" class=\"seat-select\" type=\"checkbox\" value=\"6H,350\" name=\"seat\" ");
if( str.contains("6H") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-006\" class=\"seat\" style=\"text-align: center\">6H</label>\n");
      out.write("          </div>\n");
      out.write("      <div class=\"col-md-6\" id=\"seats\">\n");
      out.write("           <input id=\"seat-0001\" class=\"seat-select\" type=\"checkbox\" value=\"8H,350\" ");
if( str.contains("8H") ){
      out.write("disabled");
}
      out.write(">\n");
      out.write("           <label for=\"seat-0001\" class=\"seat\" style=\"text-align: center\" >8H</label>\n");
      out.write("    \n");
      out.write("    <input id=\"seat-0002\" class=\"seat-select\" type=\"checkbox\" value=\"9H,350\" name=\"seat\" ");
if( str.contains("9H") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-0002\" class=\"seat\" style=\"text-align: center\">9H</label>\n");
      out.write("      <input id=\"seat-0003\" class=\"seat-select\" type=\"checkbox\" value=\"10H,350\" name=\"seat\" ");
if( str.contains("10H") ){
      out.write("disabled");
}
      out.write("  />\n");
      out.write("      <label for=\"seat-0003\" class=\"seat\" style=\"text-align: center\">10H</label>\n");
      out.write("      <input id=\"seat-0004\" class=\"seat-select\" type=\"checkbox\" value=\"11H,350\" name=\"seat\" ");
if( str.contains("11H") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-0004\" class=\"seat\" style=\"text-align: center\">11H</label>\n");
      out.write("      <input id=\"seat-0005\" class=\"seat-select\" type=\"checkbox\" value=\"12H,350\" name=\"seat\" ");
if( str.contains("12H") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-0005\" class=\"seat\" style=\"text-align: center\">12H</label>\n");
      out.write("      <input id=\"seat-0006\" class=\"seat-select\" type=\"checkbox\" value=\"13H,350\" name=\"seat\" ");
if( str.contains("13H") ){
      out.write("disabled");
}
      out.write(" />\n");
      out.write("      <label for=\"seat-006\" class=\"seat\" style=\"text-align: center\">13H</label>\n");
      out.write("      \n");
      out.write("       </div>\n");
      out.write("    <!--end of the eight row -->\n");
      out.write("\n");
      out.write("               \n");
      out.write("      <br><br><br><br>\n");
      out.write("\n");
      out.write("<h2 style=\"text-align: center;padding: 10% 20% 0px 20%;\">All Eyes this way</h2>\n");
      out.write("<!--            <hr id=\"curve\" style=\"padding-left: 20%;padding-right: 20%\"> -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"col-md-4\" >\n");
      out.write("                <div class=\"well well-lg\" style=\"width: 100%;height: 700px;box-shadow: 5px 10px 70px #333333;\">\n");
      out.write("                   <div class=\"card\" style=\"box-shadow: 10px 10px 5px grey; font-size:30px; text-align: center;\">\n");
      out.write("                       <div class=\"card-header\" ><img src=\"");
      out.print(img);
      out.write("\" style=\"width:100%; height:auto;\"></div>\n");
      out.write("     <label>Name:</label><div class=\"card-body\">");
      out.print(name);
      out.write("\n");
      out.write("     </div>\n");
      out.write("     <div class=\"card-footer\">");
      out.print(loc);
      out.write("</div>\n");
      out.write("</div>                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <div id=\"name\" style=\"font-size: 30px;\"></div>  \n");
      out.write("                    <div id=\"price\" style=\"font-size: 30px;\"></div>  \n");
      out.write("</div></div> \n");
      out.write("           \n");
      out.write("     <input type=\"hidden\" name=\"hp\" value=");
      out.print(name);
      out.write("\n");
      out.write("       <input type=\"hidden\" name=\"hp\" value=\"");
      out.print(loc);
      out.write("\">           \n");
      out.write("<input type=\"hidden\" name=\"hp\" value=");
      out.print(time);
      out.write("\n");
      out.write("       <input type=\"hidden\" id=\"numseat\" name=\"hp\" > <!--no of seats-->\n");
      out.write("<input type=\"hidden\" id=\"total_amount\" name=\"hp\" ><!-- total amount-->\n");
      out.write("<input type=\"hidden\" id=\"ticketid\" name=\"hp\" ><!--ticket id-->\n");
      out.write("<input type=\"hidden\" name=\"hp\" value");
      out.print(date);
      out.write("><!--date-->\n");
      out.write("<input type=\"hidden\" id=\"email\" name=\"hp\" >\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <button type=\"button\" id=\"proceed\"  class=\" btn btn-danger proceed\"   style=\"width: 32%;height:70px \">Proceed</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("                                \n");
      out.write("    </body>\n");
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
