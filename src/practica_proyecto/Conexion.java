/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_proyecto;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author migfe
 */
public class Conexion {
    
    
    private static final String URL = "jdbc:mysql://localhost:3306/bajondb?useTimezone=true&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    
    
    public static Connection getConexion(){
        
        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
        
    }
}
