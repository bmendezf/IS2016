/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import interfaz.VentanaInicio;
import mendezPeon.Restaurante;

/**
 *
 * @author bruno
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurante r = Restaurante.recuperar();
        VentanaInicio ventana = new VentanaInicio(r);
        ventana.setVisible(true);
    }
    
}
