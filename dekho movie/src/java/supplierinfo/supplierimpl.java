/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supplierinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Pradeep Negi
 */
public class supplierimpl  {
    
 supplierprofile sp=new supplierprofile();
 
 public int addata( supplierprofile sp) throws SQLException{
     
     
     String query="insert into supplierprofile(username,password,email,phone,owner_name,place,number_of_hall)values(?,?,?,?,?,?,?)";
     
     Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
     PreparedStatement prep=con.prepareStatement(query);
     prep.setString(1,sp.getUsername());
     prep.setString(2,sp.getPassword());
     prep.setString(2,sp.getConfirm_Password());
     prep.setString(3,sp.getEmail());
     prep.setString(4,sp.getPhone());
     prep.setString(5,sp.getOwner_name());
     prep.setString(6,sp.getPlace());
     prep.setString(7,sp.getNumber_of_hall());
     prep.execute();
     return 1;
     
 }
    
}
