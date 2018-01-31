/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author shehan
 */
public class database {
    private Connection con;
    public Connection getconnection()throws ClassNotFoundException, SQLException{
         Class.forName("org.sqlite.JDBC");
       con = DriverManager.getConnection("jdbc:sqlite:DB/login"); 
       
       try (Connection con = DriverManager.getConnection("jdbc:sqlite:DB/login");
                Statement stmt = con.createStatement()) {
            // create a new table
           
//            System.out.printf("fjsh");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
    public ResultSet getData(String name) throws SQLException, ClassNotFoundException{
        con=getconnection();
        PreparedStatement pre =con.prepareStatement("select *from login where name =?;");
        pre.setString(1, name);
        ResultSet rs = pre.executeQuery();
        
        return rs;
        
    }
    public void addData(String name,String key,String time) throws SQLException, ClassNotFoundException{
        con=getconnection();
        
        PreparedStatement pre =con.prepareStatement("insert into login values (?,?,?);");
        pre.setString(1, name);
        pre.setString(2, time);
        pre.setString(3, key);
        
        pre.execute();
        con.close();
        
    }
    
}
