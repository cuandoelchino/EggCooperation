/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ejex004;

import Entidad.NIF;
import Servicio.NIFService;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_EjEx004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NIFService serv = new NIFService();
        
        NIF persona = serv.crearNif();
        
        serv.mostrar(persona);
        
    }
    
}
