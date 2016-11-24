/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

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
public class EvaluacionTest {
    
    public EvaluacionTest() {
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
     * Test of getPersona method, of class Evaluacion.
     */
    @Test
    public void testGetPersona() {
        System.out.println("getPersona");
        Evaluacion instance = new Evaluacion();
        Persona expResult = null;
        Persona result = instance.getPersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersona method, of class Evaluacion.
     */
    @Test
    public void testSetPersona() {
        System.out.println("setPersona");
        Persona persona = null;
        Evaluacion instance = new Evaluacion();
        instance.setPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstrellas method, of class Evaluacion.
     */
    @Test
    public void testGetEstrellas() {
        System.out.println("getEstrellas");
        Evaluacion instance = new Evaluacion();
        int expResult = 0;
        int result = instance.getEstrellas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstrellas method, of class Evaluacion.
     */
    @Test
    public void testSetEstrellas() {
        System.out.println("setEstrellas");
        int estrellas = 0;
        Evaluacion instance = new Evaluacion();
        instance.setEstrellas(estrellas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResenia method, of class Evaluacion.
     */
    @Test
    public void testGetResenia() {
        System.out.println("getResenia");
        Evaluacion instance = new Evaluacion();
        String expResult = "";
        String result = instance.getResenia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResenia method, of class Evaluacion.
     */
    @Test
    public void testSetResenia() {
        System.out.println("setResenia");
        String resenia = "";
        Evaluacion instance = new Evaluacion();
        instance.setResenia(resenia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inicializarEvaluacion method, of class Evaluacion.
     */
    @Test
    public void testInicializarEvaluacion() {
        System.out.println("inicializarEvaluacion");
        Evaluacion instance = new Evaluacion();
        instance.inicializarEvaluacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
