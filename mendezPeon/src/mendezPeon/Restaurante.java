/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mendezPeon;

import java.util.*;

/**
 *
 * @author bruno
 */
public class Restaurante {

    private String nombre;
    private String direccion;
    private String horario;
    private String tipoComida;
    private ArrayList<Evaluacion> evaluaciones;

    public Restaurante() {
        this.nombre = "";
        this.direccion = "";
        this.horario = "";
        this.tipoComida = "";
        this.evaluaciones = new ArrayList();
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
        return new Restaurante();
    }

}
