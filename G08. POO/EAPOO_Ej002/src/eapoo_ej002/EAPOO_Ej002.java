/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package eapoo_ej002;

import Entidad.Circunferencia;
import Servicio.CircunferenciaService;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_Ej002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunferenciaService servCirc = new CircunferenciaService();
        
        Circunferencia circ01 = servCirc.crearCircunferencia();
        
        
        
        System.out.println("el área es: "+servCirc.area(circ01));
        
        System.out.println("el perimetro es: "+servCirc.perimetro(circ01));
        
        
    }
    
}
