package search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.json.simple.JSONArray;

public class search {
    
  public JSONArray serach(String movie_name){
      
      JSONArray json=new JSONArray();
      
      String query="select * from signup where username like'%"+movie_name+"%'";
              try{
                  Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
                  PreparedStatement prep=conn.prepareStatement(query);
                  ResultSet rs=prep.executeQuery();
                  int i=-1;
                  while(rs.next()){
                      System.out.println("value is "+rs.getString(4));
                      json.add(++i,rs.getString(4));
                  }
                  
              }catch(Exception e){
                  e.printStackTrace();
              }
      
return json;    
  }

}
