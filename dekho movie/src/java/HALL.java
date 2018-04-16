import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.websocket.Decoder;
import javax.websocket.Encoder;
import theater_partner.theater;
import theater_partner.theatergetsetter;
/**
 *
 * @author D3LL
 */

@MultipartConfig(fileSizeThreshold=1024*1024*10, 	// 10 MB 
                 maxFileSize=1024*1024*50,      	// 50 MB
                 maxRequestSize=1024*1024*100)   	// 100 MB
public class HALL extends HttpServlet {

    theatergetsetter tgs=new theatergetsetter();
    theater th=new theater();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
                  String []values=request.getParameterValues("Dta_val");
            System.err.println("list");
            for(int i = 0; i < values.length; i++ )
            {
                System.out.println(values[i]);
            }
             for (int i = 0; i < values.length; i++) {
           
                    switch(i)
               {
                       case 0: tgs.setSelect_movie(values[i]);break;
                    case 1: tgs.setSelect_theater_location(values[i]);break;
                    case 2: tgs.setSelect_date(values[i]);break;
                    case 3: tgs.setSelect_time(values[i]);break;
                         
                }
           
            }
            
         String SAVE_DIR="image";        
            String appPath = request.getServletContext().getRealPath("");
                    out.println( appPath );
         String savePath = appPath + File.separator + SAVE_DIR;
        File fileSaveDir = new File(savePath);
        
        if( !fileSaveDir.exists() )
        {
            fileSaveDir.mkdir();
        }
       
          System.out.println( savePath + File.separator + "sample.jpg" );
        
        File f = new File( savePath + File.separator + "simple.jpg" );
      
        FileOutputStream fos = new FileOutputStream(f);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        Part part = request.getPart("image");
        
        {
            
            String filename = "simple.jpg";
            
            byte b[] = new byte[part.getInputStream().available()];
            
            part.getInputStream().read(b);
            
            bos.write(b);
               
        }
       
      
           Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
  "cloud_name", "warmachinewarrior",
  "api_key", "541641359745253",
  "api_secret", "oEohTTTpzXhcroGvWqrnxbuuHpA"));
             Map uploadResult = cloudinary.uploader().upload(f, ObjectUtils.emptyMap());
             System.out.println(uploadResult.get("url"));
              
             System.out.println( uploadResult );
        
  
             tgs.setImage(uploadResult.get("url").toString());
           
             th.addata(tgs);
             response.sendRedirect("therater_partner.jsp");
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
   //         Logger.getLogger(adminAddDta.class.getName()).log(Level.SEVERE, null, ex);
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
     //       Logger.getLogger(adminAddDta.class.getName()).log(Level.SEVERE, null, ex);
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