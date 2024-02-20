/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iestr.jmff.t1_p1;

import iestr.jmff.t1_p1.vista.Menu;

/**
 * Clase principal que contiene el metodo main para iniciar la aplicación.
 * Este programa inicia la aplicación llamando a la clase Menu y haciendo visible su interfaz.
 * 
 * @author Daniel Gutierrez Ramirez
 */
public class T1_P1 {
    
    /**
     * Metodo principal que inicia la aplicación.
     * Crea una instancia de la clase Menu y la hace visible.
     * 
     * @param args Los argumentos de la linea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Menu m = new Menu();
        m.setVisible(true);
    }
}