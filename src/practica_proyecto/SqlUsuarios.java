
package practica_proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static practica_proyecto.Conexion.getConexion;

/**
 *
 * @author migfe
 */
public class SqlUsuarios extends Conexion {
    
    public boolean registrarCategorias(Usuario usr){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO Usuario (idUsuario,nombreUsuario,contrasena,tipoUsuario,estadoUsuario) VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            
           ps.setString(1, usr.getIdUsuario());
           ps.setString(2, usr.getNombreUsuario());
           ps.setString(3, usr.getContrasena());
           ps.setString(4,usr.getTipoUsuario() );
           ps.setBoolean(5, usr.isEstadoUsuario());
           
            ps.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Error en conexion SqlUsuarios" );
            return false;
        }
         
        
    }
    
    
    public boolean modificarUsuarios(Usuario usr1){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE usuario SET idUsuario=?, nombreUsuario=?, contrasena=?, tipoUsuario=? WHERE idUsuario=? ";
        //String sql = "update categoria ca join productos pr on ca.idCategoria = pr.idCategoria SET ca.nombreCategoria=?,pr.nombreProducto=?, pr.descripcionProducto=?, pr.precio=?, tamanoProducto=? where pr.idProducto = ?; ";
        try {
            
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, usr1.getIdUsuario());
            ps.setString(2, usr1.getNombreUsuario());
            ps.setString(3, usr1.getContrasena());
            ps.setString(4, usr1.getTipoUsuario());
            ps.setString(5, usr1.getIdUsuario());
            
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
