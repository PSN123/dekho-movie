package theater_partner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class theater{
theatergetsetter tgs=new theatergetsetter();
 
public int addata(theatergetsetter tgs)
{
    try{
   Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData", "hr", "hr");
   String str="insert into pradeepdata(select_movie,select_theater_location,select_date,select_time,image)values(?,?,?,?,?)";
   
   PreparedStatement ps=con.prepareStatement(str);
   ps.setString(1, tgs.getSelect_movie());
   ps.setString(2, tgs.getSelect_theater_location());
   ps.setString(3, tgs.getSelect_date());
   ps.setString(4, tgs.getSelect_time());
   ps.setString(5,tgs.getImage());
ps.execute();
        System.out.println("Data Aa Rahas"+ps);
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
   return 1;
   }
    
public List<theatergetsetter >get(){
   List<theatergetsetter > list=new ArrayList();
   try{
String str="select * from pradeepdata";
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData", "hr", "hr");
  PreparedStatement ps=con.prepareStatement(str);
       ResultSet rs=ps.executeQuery();
     while(rs.next()){
       theatergetsetter tgs=new theatergetsetter();
       tgs.setId(rs.getInt("id"));
       tgs.setSelect_movie(rs.getString("select_movie"));
       tgs.setSelect_theater_location(rs.getString("select_theater_location"));  
       tgs.setSelect_date(rs.getString("select_date"));
       tgs.setSelect_time(rs.getString("select_time"));
       tgs.setImage(rs.getString("image"));
        list.add(tgs);
       
   }
   } catch(Exception e){
       
             }
return list;
   } 
 public void delete(int id) {
try{   
    String query="delete from pradeepdata where id="+id;
     Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
     PreparedStatement ps=con.prepareStatement(query);
  
     ps.executeUpdate();
   }catch(Exception e){e.printStackTrace();}

}


}
