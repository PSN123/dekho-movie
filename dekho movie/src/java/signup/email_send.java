package signup;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;


public class email_send {
 
 
public  void email_snd(String email,String ticket_id,String seat_number,String amount)
{
            
  try{
      
      String host="smtp.gmail.com";
      String user="dekhomovie2018@gmail.com";
      String password="Pr@deep1997";
      String to=email;
      String from="dekhomovie2018@gmail.com";
      String subject="Success";
      String messageText="Your ticket ID :"+ticket_id+", Seeat Number :"+seat_number+" , Total amount :"+amount;
      
      boolean sessionDebug=false;
      
      Properties props=System.getProperties();
      
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.hist",host);
      props.put("mail.smtp.port", "587");
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.required", "true");
      
      
    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
    Session mailSession=Session.getDefaultInstance(props,null);
    mailSession.setDebug(sessionDebug);
    Message msg=new MimeMessage(mailSession);
    msg.setFrom(new InternetAddress(from));
    InternetAddress[] address={new InternetAddress(to)};
    msg.setRecipients(Message.RecipientType.TO, address);
    msg.setSubject(subject);
    msg.setSentDate(new Date());
    msg.setText(messageText);
    
    Transport transport=mailSession.getTransport("smtp");
   transport.connect(host,user,password);
   transport.sendMessage(msg, msg.getAllRecipients());
transport.close();
      System.out.println("message send successfully on Recipient   \n" +
"   \n" +
"Recipient's Email");
        
  }catch(Exception e){
      System.out.println("Excaption:"+e);
  } 
        
        
    }
 
}
    
           
           
   
    
    

