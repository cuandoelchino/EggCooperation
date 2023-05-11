/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eacol_ej006;

import Servicio.Service;
import java.util.HashMap;

/**
 *
 * @author franciscovillafuerte
 */
public class EACol_Ej006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MAIN
        
        HashMap<String,Double> productos = new HashMap();
        
        Service serv = new Service();
        
        serv.menuTienda(productos);
        
    }
    
}
