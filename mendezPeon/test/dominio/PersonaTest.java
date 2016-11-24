package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PersonaTest {
    

    private Persona instance;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Persona();
        instance.inicializarPersona();
    }
    
    @After
    public void tearDown() {
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
    
    
    
   
    
    @Test
    public void testVerificarCIVacio() {
        System.out.println("VerificarCIVacio");
        String ci = "";
        boolean resultado = Persona.verificarCI(ci);
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
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testValidarCIMenor() {
        System.out.println("validarCIMenor");
        String ci = "123456";
        boolean resultado = Persona.verificarCI(ci);
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testValidarCIMayor() {
        System.out.println("validarCIMayor");
        String ci = "123456789";
        boolean resultado = Persona.verificarCI(ci);
        assertFalse(resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of inicializarPersona method, of class Persona.
     */
    @Test
    public void testInicializarPersonaNombre() {
        System.out.println("inicializarPersonaNombre");
        
        String resultadoEsperado = "Ana";
        String resultadoObtenido = instance.getNombre();
        assertEquals(resultadoEsperado,resultadoObtenido);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInicializarPersonaTelefono() {
        System.out.println("inicializarPersonaTelefono");
        
        int resultadoEsperado = 123456789;
        int resultadoObtenido = instance.getTelefono();
        assertEquals(resultadoEsperado,resultadoObtenido);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInicializarPersonaMail() {
        System.out.println("inicializarPersonaMail");
        
        String resultadoEsperado = "prueba@gmail.com";
        String resultadoObtenido = instance.getMail();
        assertEquals(resultadoEsperado,resultadoObtenido);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInicializarPersonaCI() {
        System.out.println("inicializarPersonaCI");
        
        int resultadoEsperado = 12345672;
        int resultadoObtenido = instance.getCi();
        assertEquals(resultadoEsperado,resultadoObtenido);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
