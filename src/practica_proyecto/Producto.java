package practica_proyecto;

public class Producto {

    private int idProducto;
    private int idCategoria;
    private String nombre;
    private String descripcion;
    private String nombreCategoria;
    private int precio;
    private int tamanoProducto;
    private boolean estadoProductos;

    public Producto() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getTamanoProducto() {
        return tamanoProducto;
    }

    public void setTamanoProducto(int tamanoProducto) {
        this.tamanoProducto = tamanoProducto;
    }

    public boolean isEstadoProductos() {
        return estadoProductos;
    }

    public void setEstadoProductos(boolean estadoProductos) {
        this.estadoProductos = estadoProductos;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    
    
    
}
