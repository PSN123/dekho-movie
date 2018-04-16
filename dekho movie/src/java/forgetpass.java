
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import forgetpass.*;
import javax.servlet.RequestDispatcher;
import signup.getset;
import signup.signuinter;
public class forgetpass extends HttpServlet {
forget fi=new forget();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException,NullPointerException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<script src=\'https://unpkg.com/sweetalert/dist/sweetalert.min.js\'></script>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet forgetpass at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
       
        String s=request.getParameter("forgetemail");
        signuinter si=new signuinter();

String emailvalue=si.emailid(s);

            System.out.println("email value sahi"+emailvalue);

       if(emailvalue==null){
            request.setAttribute("WD", "500");
            System.out.println("hello inside the forgetpass page null m");
         }else if(emailvalue.equals(s)){
            System.out.println("inside the right statmenet");

                      request.setAttribute("WD", s);
                      request.setAttribute("valid", emailvalue);
         } 
       else{
            System.out.println("chitye ho gya bhai");
            request.setAttribute("WD", "500");
       }
       
       
            RequestDispatcher rs=request.getRequestDispatcher("LoginPage.jsp");
            rs.forward(request, response);
        
        
        
        
        out.println("<script>");
        out.println("swal('success','OTP has been sent to you email','success')");
        out.println("</script>");
        
        
       response.sendRedirect("LoginPage.jsp");
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
