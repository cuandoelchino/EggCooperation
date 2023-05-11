/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Adivina;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */

/*
El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir
que vuelva a intentar adivinar el mes secreto.
Un ejemplo de ejecución del programa podría ser este:

Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero

No ha acertado. Intente adivinarlo introduciendo otro mes: agosto

¡Ha acertado!
*/
public class AdivinaService {
    
    Scanner leer = new Scanner(System.in);
    
    public void adivinaMes(Adivina intento) {
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        String mes1 = leer.next();
        int contador = 0;
        
        if (mes1.equals(intento.getMesSecreto())) {
            
            System.out.println("¡Ha acertado!");
            
        } else {
            
            do {
                
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                mes1 = leer.next();
                
                if (mes1.equals(intento.getMesSecreto())) {
            
                     System.out.println("¡Ha acertado!");
                     contador = 1;
                } 
                
            } while (contador == 0);
            
        }
        
    }
    
    
    
}
