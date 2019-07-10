package practica_proyecto;

public class Usuario {

    private String idUsuario;
    private String nombreUsuario;
    private String contrasena;
    private String tipoUsuario;
    private boolean estadoUsuario;

    public Usuario(String idUsuario, String contrasena) {
        this.idUsuario = idUsuario;
        this.contrasena = contrasena;
    }

    public Usuario(){
        
    }
    
    public void login() {

    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean isEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    
    
}
