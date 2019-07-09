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
public class categoriaProductoTest {
    
    public categoriaProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class categoriaProducto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        categoriaProducto instance = new categoriaProducto(0,"","");
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class categoriaProducto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        categoriaProducto instance = new categoriaProducto(0,"","");
        instance.setId(id);
    }

    /**
     * Test of getNombre method, of class categoriaProducto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        categoriaProducto instance = new categoriaProducto(0,"","");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class categoriaProducto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        categoriaProducto instance = new categoriaProducto(0,"","");
        instance.setNombre(nombre);
    }

    /**
     * Test of getDescripcion method, of class categoriaProducto.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        categoriaProducto instance = new categoriaProducto(0,"","");
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescripcion method, of class categoriaProducto.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        categoriaProducto instance = new categoriaProducto(0,"","");
        instance.setDescripcion(descripcion);
    }
    
}
