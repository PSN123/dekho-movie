package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDao {
    String  username,password,inputuser,inputpassword;
public  boolean validate(String s1,String s2){
    boolean status=false;
   this.inputuser=s1;
   this.inputpassword=s2; 
try{
    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
    PreparedStatement ps=con.prepareStatement("select * from signup where username=? and password=?");
ps.setString(1,s1);
ps.setString(2, s2);

    ResultSet rs=ps.executeQuery();
while(rs.next()){
   username=  rs.getString(4);
    password = rs.getString(5);

    status=true;
}
}catch(Exception e){System.out.println(e);}    
    
    return status;
    
}


public boolean uservalidate()throws Exception {

    boolean hack=false;
        if(inputuser.equals(username)&& inputpassword.equals(password)){
       hack=true;
       
       }else{
            hack=false;
        }
    
    
    return hack;
    
}

}
