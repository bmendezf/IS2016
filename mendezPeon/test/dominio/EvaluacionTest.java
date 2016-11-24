package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvaluacionTest {
    
    private Evaluacion instance;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Evaluacion();
        instance.inicializarEvaluacion();
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of inicializarEvaluacion method, of class Evaluacion.
     */

    
    @Test
    public void testInicializarEvaluacionEstrellas() {
        System.out.println("inicializarEvaluacionEstrellas");
        
        int resultadoEsperado = 3;
        int resultadoObtenido = instance.getEstrellas();
        assertEquals(resultadoEsperado,resultadoObtenido);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInicializarEvaluacionResenia() {
        System.out.println("inicializarEvaluacionResenia");
        
        String resultadoEsperado = "";
        String resultadoObtenido = instance.getResenia();
        assertEquals(resultadoEsperado,resultadoObtenido);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
