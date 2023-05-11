/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ejex003;

import Entidad.Raices;
import Servicio.RaicesService;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_EjEx003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RaicesService serv = new RaicesService();
        
        Raices ecuacion = serv.crearEcuacion();
        
        serv.calcular(ecuacion);
        
    }
    
}
