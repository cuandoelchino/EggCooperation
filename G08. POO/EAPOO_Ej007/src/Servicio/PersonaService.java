/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class PersonaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona() {
        
        Persona p1 = new Persona();
        
        System.out.print("Ingrese su nombre: ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese su edad: ");
        p1.setEdad(leer.nextInt());
        int i = 0;
        do {
            String sex;
            System.out.print("Ingrese su sexo (M,F,O): ");
            //System.out.println("M - para Masculino");
            //System.out.println("F - para Femenino");
            //System.out.println("O - para Otro");
            sex = leer.next();
            
            if ("M".equals(sex ) || "F".equals(sex) || "O".equals(sex) ) {
                i = 1;
                p1.setSexo(sex);
                
            } else {
                System.out.println("Opción de sexo no válida.");
            }
            
        } while (i == 0);
        
        System.out.print("Ingrese su peso en kg: ");
        p1.setPeso(leer.nextDouble());
        
        System.out.print("Ingrese su altura en metros: ");
        p1.setAltura(leer.nextDouble());
        System.out.println("-----------------------------------------------");
        return p1;
    }
    
    public int calcularIMC ( Persona p1) {
        
        // peso en kg / (altura^2 en mt2)
        
        double formula;
        int rpta = 3;
        
        formula = p1.getPeso() / Math.pow(p1.getAltura(), 2);
                
        if (formula < 20) {
            rpta = -1;
            System.out.println(p1.getNombre() +" está por debajo de su peso ideal.");
        }
        
        if (formula >= 20 && formula <= 25) {
            rpta = 0;
             System.out.println(p1.getNombre() +" está en su peso ideal."); 
        }
        
        if (formula >25) {
            rpta = 1;
            System.out.println(p1.getNombre() +" tiene sobrepeso."); 
            
        }
        return rpta;
    }
    
    public boolean esMayorDeEdad(Persona p1) {
        boolean mayordedad=false;
        if (p1.getEdad() >=18) {
            mayordedad = true;
        System.out.println(p1.getNombre() +" es mayor de edad.");
        } else {
            System.out.println(p1.getNombre() +" es menor de edad.");
        }
        System.out.println("-----------------------------------------------");
        return mayordedad;
    }
    
}
