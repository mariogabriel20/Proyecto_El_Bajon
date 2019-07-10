/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author migfe
 */
public class SqlCategorias extends Conexion{
    
    
    public boolean registrarCategorias(categoriaProducto catp){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO categoria (nombreCategoria,descripcionCategoria,estadoCategoria) VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            
           
            ps.setString(1, catp.getNombre());
            ps.setString(2, catp.getDescripcion());
            ps.setBoolean(3, catp.isEstadoCategoria());
            
            ps.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Error en conexion");
            return false;
        }
         
        
    }
    
    public boolean modificarCategorias(categoriaProducto catp1){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE categoria SET nombreCategoria=?, descripcionCategoria=? WHERE idCategoria=? ";
        try {
            
            
            ps = con.prepareStatement(sql);
            
           
            ps.setString(1, catp1.getNombre());
            ps.setString(2, catp1.getDescripcion());
            ps.setInt(3,catp1.getId());
            
            ps.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Error en conexion");
            return false;
        }
        
        
        
    }
    
    
    public boolean eliminarCategorias(categoriaProducto catp2){
        
        PreparedStatement ps = null;
        
        Connection con = getConexion();
        String sql = "UPDATE categoria SET estadoCategoria=? WHERE idCategoria=? ";
        try {
            
            
            ps = con.prepareStatement(sql);
            
           
            ps.setBoolean(1, catp2.isEstadoCategoria());
            ps.setInt(2,catp2.getId());
            
            ps.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Error en conexion");
            return false;
        }
        
        
        
    }
    
    
}
