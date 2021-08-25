/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author Pranali
 */
public class ConnectionProvider {
    
    public static Connection getCon()
             
    {
        
        String url="jdbc:mysql://localhost:3306/hostel";
        String user="root";
        String pass="root";
    try
        
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver load successful");
        Connection con = DriverManager.getConnection(url,user,pass);
        
        return con;
        
    }
    catch(Exception e)
    {
        return null;
        
    }
    
    }
    
}
