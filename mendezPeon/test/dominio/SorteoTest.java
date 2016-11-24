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
    
    private Sorteo instance;
    
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
        instance = new Sorteo();
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
        String resultadoEsperado = "Cena";
        instance.setPremio(resultadoEsperado);
        String resultado = instance.getPremio();
        assertEquals(resultadoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getCantidadGanadores method, of class Sorteo.
     */
    @Test
    public void testGetCantidadGanadores() {
        System.out.println("getCantidadGanadores");
        instance.setCantidadGanadores(5);
        int resultadoEsperado = 5;
        int resultado = instance.getCantidadGanadores();
        assertEquals(resultadoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getGanadores method, of class Sorteo.
     */
    @Test
    public void testGetGanadores() {
        System.out.println("getGanadores");
        ArrayList<Persona> resultadoEsperado = new ArrayList() ;
        ArrayList<Persona> resultado = instance.getGanadores();
        assertEquals(resultadoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getGanador method, of class Sorteo.
     */
    @Test
    public void testGetGanador() {
        System.out.println("getGanador");
        Persona p = new Persona();
        instance.addGanador(p);
        int numeroGanador = 0;
        Persona resultadoEsperado = p;
        Persona resultado = instance.getGanador(numeroGanador);
        assertEquals(resultadoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
