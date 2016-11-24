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
    private Restaurante instance;
    
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
        instance = Restaurante.inicializarRestaurante();
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
        ArrayList<Sorteo> resultadoEsperado= new ArrayList();
        ArrayList<Sorteo> resultado = instance.getSorteos();
        assertEquals(resultadoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Restaurante.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String resultadoEsperado = "Burguer King";
        String resultado = instance.getNombre();
        assertEquals(resultadoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getDireccion method, of class Restaurante.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        String resultadoEsperado = "18 de julio esq. Ejido";
        String resultado = instance.getDireccion();
        assertEquals(resultadoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of getHorario method, of class Restaurante.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        String resultadoEsperado = "De 8 a 22 horas";
        String resultado = instance.getHorario();
        assertEquals(resultadoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoComida method, of class Restaurante.
     */
    @Test
    public void testGetTipoComida() {
        System.out.println("getTipoComida");
        String resultadoEsperado = "Comida rápida";
        String resultado = instance.getTipoComida();
        assertEquals(resultadoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


}
