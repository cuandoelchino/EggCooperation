/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ej007;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_Ej007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        PersonaService servP = new PersonaService();
        
        Persona[] p1 = new Persona[4];
        
        int bajopeso=0;
        int pesoideal=0;
        int sobrepeso=0;
        int mayordeedad=0;
        
        
        for (int i = 0; i < p1.length; i++) {
            p1[i] = servP.crearPersona();
        }
        
        for (int i = 0; i < p1.length; i++) {
            int imc =  servP.calcularIMC(p1[i]);
            boolean me = servP.esMayorDeEdad(p1[i]);
            
            if (imc==1) {
                sobrepeso++;
            }
            
            if (imc==0) {
                pesoideal++;
            }
            
            if (imc== -1) {
                bajopeso++;
            }
            
            if (me == true) {
                mayordeedad++;
                
            }
            
        }
        
        
        System.out.println("El "+((bajopeso*100)/4)+"% de las personas están por debajo de su peso ideal.");  
        System.out.println("El "+((pesoideal*100)/4)+"% de las personas están en su peso ideal.");   
        System.out.println("El "+((sobrepeso*100)/4)+"% de las personas tienen sobrepeso.");   
        System.out.println("El "+(((4-mayordeedad)*100)/4)+"% de las personas son menores de edad.");   
        System.out.println("El "+((mayordeedad*100)/4)+"% de las personas son mayores de edad.");
        
        
        
        
        
        
        
    }
    
}
