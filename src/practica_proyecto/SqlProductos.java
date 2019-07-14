
package practica_proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static practica_proyecto.Conexion.getConexion;

/**
 *
 * @author migfe
 */
public class SqlProductos extends Conexion{
    
    public boolean registrarProductos(Producto prod){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO productos (idCategoria,nombreProducto,descripcionProducto,precio,tamanoProducto,estadoProductos) VALUES (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            
           
            ps.setInt(1, prod.getIdCategoria());
            ps.setString(2,prod.getNombre() );
            ps.setString(3, prod.getDescripcion());
            ps.setInt(4, prod.getPrecio());
            ps.setInt(5, prod.getTamanoProducto());
            ps.setBoolean(6, prod.isEstadoProductos());
            
            ps.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Error en conexion");
            return false;
        }
         
        
    }
    
    
    public int existeProducto(String producto){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
            String sql = "SELECT COUNT(nombreProducto) FROM productos WHERE nombreProducto=?";
        try {
            ps = con.prepareStatement(sql);
            
           ps.setString(1, producto);
           
          rs =  ps.executeQuery();
            //con.close();
            
            if(rs.next())
            {
                return rs.getInt(1);
                          
            }
            con.close();
            return 2;
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            //JOptionPane.showMessageDialog(null, "Error en conexion SqlUsuarios" );
            return 2;
        }
         
        
    }
    
    public boolean modificarProductos(Producto prod1){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        //String sql = "UPDATE productos SET nombreProducto=?, descripcionProducto=?, precio=?, tamanoProducto=? WHERE idProducto=? ";
        String sql = "update categoria ca join productos pr on ca.idCategoria = pr.idCategoria SET ca.nombreCategoria=?,pr.nombreProducto=?, pr.descripcionProducto=?, pr.precio=?, tamanoProducto=? where pr.idProducto = ?; ";
        try {
            
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, prod1.getNombreCategoria());
            ps.setString(2, prod1.getNombre());
            ps.setString(3, prod1.getDescripcion());
            ps.setInt(4, prod1.getPrecio());
            ps.setInt(5, prod1.getTamanoProducto());            
            ps.setInt(6, prod1.getIdProducto());
            
            ps.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Error en conexion");
            return false;
        }
        
        
        
    }
    
    public boolean eliminarProductos(Producto prod2){
        
        PreparedStatement ps = null;
        
        Connection con = getConexion();
        String sql = "UPDATE productos SET estadoProductos=? WHERE idProducto=? ";
        try {
            
            
            ps = con.prepareStatement(sql);
            
           
            ps.setBoolean(1, prod2.isEstadoProductos());
            ps.setInt(2,prod2.getIdProducto());
            
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
