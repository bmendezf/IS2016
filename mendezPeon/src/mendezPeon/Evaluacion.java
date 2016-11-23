/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mendezPeon;

import java.io.Serializable;

/**
 *
 * @author bruno
 */
public class Evaluacion implements Serializable{
    private Persona persona;
    private int estrellas;
    private String resenia;

    public Evaluacion() {
        this.persona = new Persona();
        this.estrellas = 0;
        this.resenia = "";
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }
    
    
  
}
