package practica_proyecto;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private categoriaProducto categoria;
    private int precio;

    public Producto(int id, String nombre, String descripcion, categoriaProducto categoria, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public categoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(categoriaProducto categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
