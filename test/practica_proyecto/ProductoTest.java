/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_proyecto;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author beach
 */
public class ProductoTest {
    
    public ProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class Producto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Producto instance = new Producto(0,"","",categoriaProducto.class.cast(this),0);
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Producto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Producto instance = new Producto(0,"","",categoriaProducto.class.cast(this),0);
        instance.setId(id);
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto(0,"","",categoriaProducto.class.cast(this),0);
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Producto instance = new Producto(0,"","",categoriaProducto.class.cast(this),0);
        instance.setNombre(nombre);
    }

    /**
     * Test of getDescripcion method, of class Producto.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Producto instance = new Producto(0,"","",categoriaProducto.class.cast(this),0);
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescripcion method, of class Producto.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Producto instance = new Producto(0,"","",categoriaProducto.class.cast(this),0);
        instance.setDescripcion(descripcion);
    }

    /**
     * Test of getCategoria method, of class Producto.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        Producto instance = new Producto(0,"","",categoriaProducto.class.cast(this),0);
        categoriaProducto expResult = null;
        categoriaProducto result = instance.getCategoria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategoria method, of class Producto.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        categoriaProducto categoria = null;
        Producto instance = new Producto(0,"","",categoriaProducto.class.cast(this),0);
        instance.setCategoria(categoria);
    }

    /**
     * Test of getPrecio method, of class Producto.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Producto instance = new Producto(0,"","",categoriaProducto.class.cast(this),0);
        int expResult = 0;
        int result = instance.getPrecio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        int precio = 0;
        Producto instance = new Producto(0,"","",categoriaProducto.class.cast(this),0);
        instance.setPrecio(precio);
    }
    
}
