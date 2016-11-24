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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Persona.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCi method, of class Persona.
     */
    @Test
    public void testGetCi() {
        System.out.println("getCi");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getCi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCi method, of class Persona.
     */
    @Test
    public void testSetCi() {
        System.out.println("setCi");
        int ci = 0;
        Persona instance = new Persona();
        instance.setCi(ci);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Persona.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 0;
        Persona instance = new Persona();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMail method, of class Persona.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getMail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMail method, of class Persona.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        Persona instance = new Persona();
        instance.setMail(mail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCorreo method, of class Persona.
     */
    @Test
    public void testVerificarCorreoCorrecto() {
        System.out.println("verificarCorreoCorrecto");
        String correo = "brunomendez93@gmail.com";
        boolean resultado = Persona.verificarCorreo(correo);
        assertTrue(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testVerificarCorreoError1() {
        System.out.println("verificarCorreoError1");
        String correo = "brunomendez93gmail.com";
        boolean resultado = Persona.verificarCorreo(correo);
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testVerificarCorreoError2() {
        System.out.println("verificarCorreoError2");
        String correo = "@gmail.com";
        boolean resultado = Persona.verificarCorreo(correo);
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testVerificarCorreoError3() {
        System.out.println("verificarCorreoError3");
        String correo = "brunomendez93@gmailcom";
        boolean resultado = Persona.verificarCorreo(correo);
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of validarTelefono method, of class Persona.
     */
    @Test
    public void testValidarTelefonoVacio() {
        System.out.println("validarTelefonoVacio");
        String tel = "";
        boolean resultado = Persona.validarTelefono(tel);
        assertTrue(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testValidarTelefonoLargo8() {
        System.out.println("validarTelefonoLargo8");
        String tel = "12341234";
        boolean resultado = Persona.validarTelefono(tel);
        assertTrue(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testValidarTelefonoLargo9() {
        System.out.println("validarTelefonoLargo9");
        String tel = "099123123";
        boolean resultado = Persona.validarTelefono(tel);
        assertTrue(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testValidarTelefonoMenor() {
        System.out.println("validarTelefonoMenor");
        String tel = "1234567";
        boolean resultado = Persona.validarTelefono(tel);
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testValidarTelefonoMayor() {
        System.out.println("validarTelefonoMayor");
        String tel = "1234567891";
        boolean resultado = Persona.validarTelefono(tel);
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    /**
     * Test of verificarCI method, of class Persona.
     */
    @Test
    public void testVerificarCI() {
        System.out.println("verificarCI");
        String CI = "";
        boolean expResult = false;
        boolean result = Persona.verificarCI(CI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testVerificarCIVacio() {
        System.out.println("VerificarCIVacio");
        String ci = "";
        boolean resultado = Persona.validarTelefono(ci);
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testValidarCILargo8() {
        System.out.println("validarTelefonoLargo8");
        String tel = "12341234";
        boolean resultado = Persona.validarTelefono(tel);
        assertTrue(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testValidarTelefonoLargo7() {
        System.out.println("validarTelefonoLargo7");
        String tel = "9123123";
        boolean resultado = Persona.validarTelefono(tel);
        assertTrue(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testValidarCIMenor() {
        System.out.println("validarCIMenor");
        String ci = "123456";
        boolean resultado = Persona.validarTelefono(ci);
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testValidarCIMayor() {
        System.out.println("validarCIMayor");
        String ci = "123456789";
        boolean resultado = Persona.validarTelefono(ci);
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of inicializarPersona method, of class Persona.
     */
    @Test
    public void testInicializarPersona() {
        System.out.println("inicializarPersona");
        Persona instance = new Persona();
        instance.inicializarPersona();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
