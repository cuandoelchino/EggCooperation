/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejap04_herencia;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author franciscovillafuerte
 */
public class EjAp04_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo cir = new Circulo(4.5, 9);
        cir.area();
        cir.perimetro();
        
        System.out.println("-------------------------------------------");
        
        Rectangulo r = new Rectangulo(6,3.4);
        r.area();
        r.perimetro();
        
    }
    
}
