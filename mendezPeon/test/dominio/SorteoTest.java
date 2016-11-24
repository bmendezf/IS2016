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
public class SorteoTest {
    
    public SorteoTest() {
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
     * Test of getPremio method, of class Sorteo.
     */
    @Test
    public void testGetPremio() {
        System.out.println("getPremio");
        Sorteo instance = new Sorteo();
        String expResult = "";
        String result = instance.getPremio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPremio method, of class Sorteo.
     */
    @Test
    public void testSetPremio() {
        System.out.println("setPremio");
        String premio = "";
        Sorteo instance = new Sorteo();
        instance.setPremio(premio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadGanadores method, of class Sorteo.
     */
    @Test
    public void testGetCantidadGanadores() {
        System.out.println("getCantidadGanadores");
        Sorteo instance = new Sorteo();
        int expResult = 0;
        int result = instance.getCantidadGanadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidadGanadores method, of class Sorteo.
     */
    @Test
    public void testSetCantidadGanadores() {
        System.out.println("setCantidadGanadores");
        int cantidadGanadores = 0;
        Sorteo instance = new Sorteo();
        instance.setCantidadGanadores(cantidadGanadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGanadores method, of class Sorteo.
     */
    @Test
    public void testGetGanadores() {
        System.out.println("getGanadores");
        Sorteo instance = new Sorteo();
        ArrayList<Persona> expResult = null;
        ArrayList<Persona> result = instance.getGanadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGanadores method, of class Sorteo.
     */
    @Test
    public void testSetGanadores() {
        System.out.println("setGanadores");
        ArrayList<Persona> ganadores = null;
        Sorteo instance = new Sorteo();
        instance.setGanadores(ganadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGanador method, of class Sorteo.
     */
    @Test
    public void testGetGanador() {
        System.out.println("getGanador");
        int numeroGanador = 0;
        Sorteo instance = new Sorteo();
        Persona expResult = null;
        Persona result = instance.getGanador(numeroGanador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGanador method, of class Sorteo.
     */
    @Test
    public void testAddGanador() {
        System.out.println("addGanador");
        Persona ganador = null;
        Sorteo instance = new Sorteo();
        instance.addGanador(ganador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
