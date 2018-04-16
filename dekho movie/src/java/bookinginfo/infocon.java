package bookinginfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class infocon {
/*movie_name,movie_location ,movie_timmming ,number_of_seats ,seat_number ,total_amount ,tikect_id;*/
bookinginfo boo=new bookinginfo();
    
    public void addata(bookinginfo boo){
       String str="insert into boookinginfo(movie_name,movie_location,movie_timmming,number_of_seats ,seat_number,total_amount ,tikect_id,date,email)values(?,?,?,?,?,?,?,?,?)"; 
        try{
       Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
       PreparedStatement prep=con.prepareStatement(str);
       prep.setString(1, boo.getMovie_name());
       prep.setString(2,boo.getMovie_location());
       prep.setString(3,boo.getMovie_timmming());
       prep.setString(4,boo.getNumber_of_seats());
       prep.setString(5,boo.getSeat_number());
       prep.setString(6,boo.getTotal_amount());
       prep.setString(7,boo.getTikect_id());
       prep.setString(8,boo.getDate());
       prep.setString(9, boo.getEmail());
    prep.executeUpdate(); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /*ublic List<theatergetsetter >get(){
   List<theatergetsetter > list=new ArrayList();*/
    public StringBuilder bookinfo(String movie,String location,String timming,String date){
   StringBuilder st=new  StringBuilder();
        System.out.println("ye mvoe"+movie+location+timming+date);     
        try{
   String str="select * from boookinginfo where movie_name='"+movie+"'and movie_location='"+location+"' and movie_timmming='"+timming+"' and date='"+date+"'";

Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
       PreparedStatement prep=con.prepareStatement(str);
            ResultSet rs=prep.executeQuery();
            while(rs.next()){
     st.append(rs.getString("seat_number")+",") ;
       
            }
   }catch(Exception e){
       e.printStackTrace();
   }
        return st;
        
        
    }
    
    
    
}
