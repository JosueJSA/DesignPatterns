/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import database.ConnectionDatabase;
import database.SecondConnectionDatabase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;


public class Singleton {

    public static void main(String[] args) throws SQLException {
        
        Connection connection_1 = new SecondConnectionDatabase().getConnectionDatabase();
        Connection connection_2 = new SecondConnectionDatabase().getConnectionDatabase();
        
        //Connection connection = new ConnectionDatabase(); No es posible instanciar la clase.
        
        Connection SingletonConnection_1 = ConnectionDatabase.getConnectionDatabase();
        Connection SingletonConnection_2 = ConnectionDatabase.getConnectionDatabase();
        
        /*Operciones sobre algun objeto*/
        connection_1.close();
        SingletonConnection_1.close();
        /*Fin de operaciones*/
        
        List<Connection> connections = Arrays.asList(connection_1, connection_2);
        List<Connection> singletonConnections = Arrays.asList(SingletonConnection_1, SingletonConnection_2);
        
        for(Connection connection : singletonConnections){
            if(connection.isClosed()){
                System.out.println("La conexión " + connection.toString() + " está cerrada");
            }else{
                System.out.println("La conexión " + connection.toString() + " está abierta");
            }
        }
        
        System.out.println("\n::::::::::La clave del patron está en la incstancia, observa las rutas :::::::::::::::::::::\n");
        
        for(Connection connection : connections){
            if(connection.isClosed()){
                System.out.println("La conexión " + connection.toString() + " está cerrada");
            }else{
                System.out.println("La conexión " + connection.toString() + " está abierta");
            }
        }
        
    }
    
}
