/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class RestauranteTest {
    
    public RestauranteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSorteos method, of class Restaurante.
     */
    @Test
    public void testGetSorteos() {
        System.out.println("getSorteos");
        Restaurante instance = new Restaurante();
        ArrayList<Sorteo> expResult = null;
        ArrayList<Sorteo> result = instance.getSorteos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSorteos method, of class Restaurante.
     */
    @Test
    public void testSetSorteos() {
        System.out.println("setSorteos");
        ArrayList<Sorteo> sorteos = null;
        Restaurante instance = new Restaurante();
        instance.setSorteos(sorteos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Restaurante.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Restaurante.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Restaurante instance = new Restaurante();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Restaurante.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Restaurante.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Restaurante instance = new Restaurante();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorario method, of class Restaurante.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getHorario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorario method, of class Restaurante.
     */
    @Test
    public void testSetHorario() {
        System.out.println("setHorario");
        String horario = "";
        Restaurante instance = new Restaurante();
        instance.setHorario(horario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoComida method, of class Restaurante.
     */
    @Test
    public void testGetTipoComida() {
        System.out.println("getTipoComida");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getTipoComida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoComida method, of class Restaurante.
     */
    @Test
    public void testSetTipoComida() {
        System.out.println("setTipoComida");
        String tipoComida = "";
        Restaurante instance = new Restaurante();
        instance.setTipoComida(tipoComida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvaluaciones method, of class Restaurante.
     */
    @Test
    public void testGetEvaluaciones() {
        System.out.println("getEvaluaciones");
        Restaurante instance = new Restaurante();
        ArrayList<Evaluacion> expResult = null;
        ArrayList<Evaluacion> result = instance.getEvaluaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvaluaciones method, of class Restaurante.
     */
    @Test
    public void testSetEvaluaciones() {
        System.out.println("setEvaluaciones");
        ArrayList<Evaluacion> evaluaciones = null;
        Restaurante instance = new Restaurante();
        instance.setEvaluaciones(evaluaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recuperar method, of class Restaurante.
     */
    @Test
    public void testRecuperar() {
        System.out.println("recuperar");
        Restaurante expResult = null;
        Restaurante result = Restaurante.recuperar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Restaurante.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        Restaurante instance = new Restaurante();
        instance.guardar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inicializarRestaurante method, of class Restaurante.
     */
    @Test
    public void testInicializarRestaurante() {
        System.out.println("inicializarRestaurante");
        Restaurante expResult = null;
        Restaurante result = Restaurante.inicializarRestaurante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
