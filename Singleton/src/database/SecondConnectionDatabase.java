/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class SecondConnectionDatabase {
    
    private Connection connection = null;
    
    public Connection getConnectionDatabase(){
        establishConnection();
        return connection;
    }
    
    private void establishConnection(){
        try{
            connection = (Connection) DriverManager.getConnection(
                "jdbc:mysql://185.31.40.56:3306/example_singleton",
                "example", 
                "Example1324_@"
            );
        }catch(SQLException sqlException){
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, sqlException);
        } 
    } 
    
}
