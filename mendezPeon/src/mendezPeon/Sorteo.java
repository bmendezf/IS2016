/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mendezPeon;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Sorteo  implements Serializable{
    private String premio;
    private int cantidadGanadores;
    private ArrayList<Persona> ganadores;

    public Sorteo() {
        premio = "";
        cantidadGanadores = 0;
        ganadores = new ArrayList();
    }
    
    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public int getCantidadGanadores() {
        return cantidadGanadores;
    }

    public void setCantidadGanadores(int cantidadGanadores) {
        this.cantidadGanadores = cantidadGanadores;
    }

    public ArrayList<Persona> getGanadores() {
        return ganadores;
    }

    public void setGanadores(ArrayList<Persona> ganadores) {
        this.ganadores = ganadores;
    }
    
    public Persona getGanador(int numeroGanador) {
        return ganadores.get(numeroGanador);
    }

    public void addGanador(Persona ganador) {
        this.ganadores.add(ganador);
    }
}
