/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mendezPeon;

/**
 *
 * @author bruno
 */
public class Persona {

    private String nombre;
    private int telefono;
    private String mail;

    public Persona() {
        this.nombre = "";
        this.telefono = 0;
        this.mail = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static boolean verificarCorreo(String correo) {
        boolean c;
        if (correo.matches("^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,4}$")) {
            c = true;
        } else {
            c = false;
        }
        return c;
    }

    public static boolean validarTelefono(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
