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
public class UsuarioTest {
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of login method, of class Usuario.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        Usuario instance = new Usuario("juan","");
        instance.login();
    }

    /**
     * Test of getIdUsuario method, of class Usuario.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Usuario instance = new Usuario("juan","");
        String expResult = "juan";
        String result = instance.getIdUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdUsuario method, of class Usuario.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        String idUsuario = "";
        Usuario instance = new Usuario("juan","");
        instance.setIdUsuario(idUsuario);
    }

    /**
     * Test of getContrasena method, of class Usuario.
     */
    @Test
    public void testGetContrasena() {
        System.out.println("getContrasena");
        Usuario instance = new Usuario("juan","");
        String expResult = "";
        String result = instance.getContrasena();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContrasena method, of class Usuario.
     */
    @Test
    public void testSetContrasena() {
        System.out.println("setContrasena");
        String contrasena = "";
        Usuario instance = new Usuario("juan","");
        instance.setContrasena(contrasena);
    }
}
