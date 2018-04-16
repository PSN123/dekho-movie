
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import login.loginDao;
public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

        String s1=request.getParameter("username");
        String s2=request.getParameter("password");
            System.out.println("this name"+s1+s2);
        
//               String a=(String)sp.getAttribute("username");
//               out.print(a);
        
        if(s1.equals("pradeep")&& s2.equals("123")){
            RequestDispatcher rs=request.getRequestDispatcher("therater_partner.jsp");
            rs.forward(request, response);
            System.out.println("ye gya theater jsp pe");
        }else{
            RequestDispatcher rs1=request.getRequestDispatcher("LoginPage.jsp");
            rs1.forward(request, response);
        
//        loginDao ld=new loginDao();
//        boolean status=ld.validate(s1, s2);
//            System.out.println("Status check "+status);
//            
//        boolean result=ld.uservalidate();
//        if(result){
//         HttpSession sp=request.getSession();
//            sp.setAttribute("username",s1);
//            RequestDispatcher rd=request.getRequestDispatcher("profile.jsp");
//rd.forward(request, response);
//            
//        }else{
//     request.setAttribute("result", result);
//            
//                    RequestDispatcher rd1=request.getRequestDispatcher("LoginPage.jsp");
//            rd1.forward(request, response);
//       
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
