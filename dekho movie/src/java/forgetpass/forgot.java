package forgetpass;
import forgetpass.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import signup.getset;

public class forgot {

    
public int password() {
  
 ArrayList <Integer>li=new ArrayList();
        Random rand = new Random();
    li.add(rand.nextInt(10000));    
      
 
   
return li.get(0);

}
  public  void forget()

  {
forget fi=new forget();
  try{
      String host="smtp.gmail.com";
      String user="pradeep.negi01000@gmail.com";
      String password="";
      System.out.println("si.getEmail()");
      String to=fi.getForgetemail();
      String from="pradeep.negi01000@gmail.com";
      String subject="Recover Password";
      String messageText=String.valueOf(password());
      System.out.println(" exception yaha se suru hui hai ");
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


