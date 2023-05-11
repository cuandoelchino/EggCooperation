/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ejex006;

import Entidad.Ahorcado;
import Servicio.AhorcadoService;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_EjEx006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AhorcadoService serv = new AhorcadoService();
        
        Ahorcado juego1 = serv.crearJuego();
        
        serv.juego(juego1);
        
        
    }
    
}
