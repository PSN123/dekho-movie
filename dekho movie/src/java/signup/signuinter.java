package signup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class signuinter implements usersign {
    
getset si=new getset(); 
 
@Override
    public void addata(getset si) {
 
    try{
    String query="insert into signup(first_name,last_name,username,password,email,contact)values(?,?,?,?,?,?)";
    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
    PreparedStatement ps=con.prepareStatement(query);
    ps.setString(1,si.getFirat_name());
    ps.setString(2, si.getLast_name());
    ps.setString(3, si.getUsername());
    ps.setString(4, si.getPassword());
    ps.setString(5, si.getEmail());
    ps.setString(6, si.getContact());
    ps.execute();
    email_send obj1=new email_send();
//    obj1.email_snd(si);
smsuser sm=new smsuser();
    sm.sendSms(si);

}catch(Exception e){e.printStackTrace();}
}

    @Override
    public void update(getset si,int wd_id) {
   try{
        System.out.println("value are :"+wd_id+si.getFirat_name()+si.getLast_name());
       
       String q="update signup set first_name=?,last_name=?,username=?,email=?,contact=? where id="+wd_id;
       Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
       PreparedStatement ps=con.prepareStatement(q);
       ps.setString(1, si.getFirat_name());
       ps.setString(2, si.getLast_name());
       ps.setString(3, si.getUsername());
        ps.setString(4,si.getEmail());
       ps.setString(5,si.getContact());
       ps.execute();
   }catch(Exception e){e.printStackTrace();}
    
    }

    @Override
    public void delete(int id) {
try{   
    String query="delete from signup where id="+id;
     Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
     PreparedStatement ps=con.prepareStatement(query);
  
     ps.executeUpdate();
   }catch(Exception e){e.printStackTrace();}

}

    @Override
    public getset get(int eid) {
       getset gs=null;
        String q="select * from signup where id=?";
    try{
       Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
       PreparedStatement ps=con.prepareStatement(q);
ps.setInt(1, eid);
 ResultSet rs=ps.executeQuery();
 while(rs.next()){
     gs=new getset();
gs.setId(rs.getInt("id"));
gs.setFirat_name(rs.getString("first_name"));
gs.setLast_name(rs.getString("last_name"));
gs.setUsername(rs.getString("username"));
gs.setPassword(rs.getString("password"));
gs.setEmail(rs.getString("email"));
gs.setContact(rs.getString("contact"));
 }
    }catch(Exception e){}
        
        
        return null;
  
    }

    @Override
    public ArrayList<getset> get() {
        ArrayList al=new ArrayList();
    
   try{
    String query="select * from signup";
  Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
  PreparedStatement ps=con.prepareStatement(query);
    ResultSet rs=ps.executeQuery();
    
     while(rs.next()){
    si=new getset();
  
 si.setId(rs.getInt(1));      
si.setFirat_name(rs.getString(2));
si.setLast_name(rs.getString(3));
si.setUsername(rs.getString(4));  
si.setPassword(rs.getString(5));
si.setEmail(rs.getString(6));
si.setContact(rs.getString(7));
     al.add(si);
     }
   }catch(Exception e){e.printStackTrace();} 
    return al;
    
    }

    @Override
    public String emailid(String email1) {
String emailid=null;
        System.out.println("email id :"+email1);
        try{
    String query="select * from signup where email='"+email1+"'";
  Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
  PreparedStatement ps=con.prepareStatement(query);
    ResultSet rs=ps.executeQuery();
    
     while(rs.next()){
 emailid=rs.getString("email");
     }
     
            System.out.println("nikal gai value email id "+emailid);
            
   }catch(Exception e){e.printStackTrace();}
    
    
        return emailid;
    }
    

    
    
    
}
    


   

