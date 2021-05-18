/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import database.ConnectionDatabase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;


public class Singleton {

    public static void main(String[] args) throws SQLException {
        
        //Connection connection = new ConnectionDatabase(); No es posible instanciar la clase.
        
        Connection connection_1 = ConnectionDatabase.getConnectionDatabase();
        Connection connection_2 = ConnectionDatabase.getConnectionDatabase();
        
        /*Operciones sobre algun objeto*/
        connection_1.close();
        /*Fin de operaciones*/
        
        List<Connection> connections = Arrays.asList(connection_1, connection_2);
        for(Connection connection : connections){
            if(connection.isClosed()){
                System.out.println("La conexión " + connection.toString() + " está cerrada");
            }else{
                System.out.println("La conexión " + connection.toString() + " está abierta");
            }
        }
        
    }
    
}
