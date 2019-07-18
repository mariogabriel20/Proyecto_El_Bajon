/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_proyecto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static practica_proyecto.Conexion.getConexion;

/**
 *
 * @author migfe
 */
public class SqlVentas extends Conexion{
    
    
    public boolean registrarVentas(Ventas1 vts){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO ventas (idUsuario,fechaVenta,metodoPago,valorTotal) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            
            
           ps.setString(1, vts.getIdUsuario());
           ps.setDate(2, (Date) vts.getDate());
          
            System.out.println("la fecha que se inserta es: " + vts.getDate());
        
           ps.setInt(3, vts.getMetodoPago());
           ps.setInt(4, vts.getValorTotal());
           
           
           
            ps.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Error en conexion SqlVentas registrarVentas" );
            return false;
        }
         
        
    }
    
}
