/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author bruno
 */
public class Persona  implements Serializable{

    private String nombre;
    private int telefono;
    private String mail;
    private int ci;

    public Persona() {
        this.nombre = "";
        this.telefono = 0;
        this.mail = "";
        this.ci = 0;
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

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
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

    public static boolean validarTelefono(String tel) {
        boolean correcto = false;
        if (tel.equals("")) {
            correcto = true;
        } else {
            if (tel.length() == 8 || tel.length() == 9) {
                try {
                    Integer.parseInt(tel);
                    correcto = true;
                } catch (NumberFormatException e) {
                    correcto = false;
                }
            }
        }
        return correcto;
    }

    public static boolean verificarCI(String CI) {
        boolean r = false;
        if ((CI.length() == 8 || CI.length() == 7)) {
            try {
                Integer.parseInt(CI);
                r = true;
            } catch (NumberFormatException e) {
                r = false;
            }
        }
        return r;
    }
    
    public void inicializarPersona() {
        
        this.setNombre("Ana");
        this.setTelefono(123456789);
        this.setMail("prueba@gmail.com");
        this.setCi(12345672);
        
    }
	

}
