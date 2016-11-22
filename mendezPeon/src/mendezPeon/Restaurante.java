/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mendezPeon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Restaurante {

    private String nombre;
    private String direccion;
    private String horario;
    private String tipoComida;
    private ArrayList<Evaluacion> evaluaciones;
    private ArrayList<Sorteo> sorteos;

    public Restaurante() {
        this.nombre = "";
        this.direccion = "";
        this.horario = "";
        this.tipoComida = "";
        this.evaluaciones = new ArrayList();
        this.sorteos = new ArrayList();
    }

    public ArrayList<Sorteo> getSorteos() {
        return sorteos;
    }

    public void setSorteos(ArrayList<Sorteo> sorteos) {
        this.sorteos = sorteos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public static Restaurante recuperar() {
        FileInputStream file = null;
        Restaurante r = new Restaurante();
        try {
            file = new FileInputStream("datos.txt");
            ObjectInputStream input = new ObjectInputStream(file);

            if (input != null) {
                try {
                    r = (Restaurante) input.readObject();
                    input.close();
                } catch (Exception e) {
                    r = new Restaurante();
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Restaurante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Restaurante.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(Restaurante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return r;
    }

}
