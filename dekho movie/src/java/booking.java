/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bookinginfo.bookinginfo;
import bookinginfo.infocon;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import signup.email_send;

/**
 *
 * @author Pradeep Negi
 */
public class booking extends HttpServlet {

    String email,ticket_id,amount;
     bookinginfo p=new bookinginfo();
     infocon con=new infocon();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
   
            
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          

                String seat_dta="";
                String seatname="";
                String seatprice="";
                int temp=0;

            
            
            String values[] =request.getParameterValues("hp");
            int z=0;
            for(String leaagya:values){
                System.out.println(z+++":"+leaagya);
            }
            String a[]=request.getParameterValues("seat");
            
            
            for (int i = 0; i <a.length; i++) {
                 seat_dta+=a[i]+";";
              }
            
             System.out.println("seatvalues :"+ seat_dta);

             String splitvalue[]=seat_dta.split(";");
                    
             for (String w:splitvalue ) {
                    String ab[]=w.split(",");
                    seatname+=ab[0] +" ";
                    temp+=Integer.parseInt(ab[1]);
                    seatprice=String.valueOf(temp);	
                    }
                    
                    
                     System.out.println("seatname :"+seatname+""+"seatValue :"+seatprice);

                        for(int i=0;i<values.length; i++){
                            System.out.println("Abhi : "+values[i]);
                        }
                        
                        Random rd=new Random();
                        int ticketID= rd.nextInt(100000);
                      //  System.out.println("Genertae /"+rando);// Ticket ID vice-versa;
                        
                        
                        for(int i=0;i<values.length;i++) {
                 switch(i){
                    case 0: 
                      p.setMovie_name(values[i]);
                        break;
                    case 1: 
                      p.setMovie_location(values[i]);
                        break;
                    case 2:
                        p.setMovie_timmming(values[i]);
                        break;
                    case 3: p.setNumber_of_seats(values[i]); break;
                    case 4: p.setTotal_amount(values[i]); break; 
                    case 5: p.setDate(values[i]); break;  
                    case 6: p.setEmail(values[i]); break;
                        
                        
                   
                  }
                 p.setSeat_number(seatname);
                 p.setTikect_id(ticketID+"");
                 
            }
//p.setSeat_number(seatname);
//                        
con.addata(p);
////            public  void email_snd(String email,String ticket_id,String seat_number,String amount)
//
email_send o=new email_send();
o.email_snd(values[6], ticketID+"", seatname, values[4]);

//request.setAttribute("ticket_id",ticket_id);
            RequestDispatcher dispatcher=request.getRequestDispatcher("Thankyou.jsp");//page dal dio 
            dispatcher.forward(request, response);
                        
        //ye rha ..hmmm 
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
