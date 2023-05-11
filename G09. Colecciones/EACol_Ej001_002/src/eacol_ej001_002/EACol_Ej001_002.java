/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eacol_ej001_002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class EACol_Ej001_002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                              /// EJERCICIO 1 ///
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perros = new ArrayList();
        int op = 0;
        String raza;
        
        do {
        
            System.out.println("Ingrese una raza de perro");
            raza = leer.next();
            perros.add(raza);
            
            do {
            System.out.println("--------------------------------------------------");
            System.out.println("Si quiere guardar otro perro ingrese el número 1");
            System.out.println("Si desea salir ingrese el número 2");
            op = leer.nextInt();
            
            switch (op) {
            case 1:
                
                break;
            case 2:
                System.out.println("Saliendo...");
                
                break;
            default:
                System.out.println("Opción no válida");
            }
            
            } while (op != 1 && op != 2);
            
        } while (op != 2);
        
        System.out.println("LISTA DE RAZAS DE PERROS:");
        for (String p : perros) {
            System.out.println(p);
        }
        
        
        
                              /// EJERCICIO 2 ///
            
        Iterator<String> it = perros.iterator();
        
        System.out.println("Ingrese una raza de perro que desee eliminar de la lista");
        String coqui = leer.next();
    
        int aviso=0;
        
    while (it.hasNext()){
        if (it.next().equals(coqui)){
            it.remove();
            aviso =1;
            
        }
    }
    
        if (aviso==0) {
            System.out.println("Raza de perro no encontrada en la lista");
        }
        
        Collections.sort(perros);
        
        System.out.println("LISTA DE RAZAS DE PERROS ORDENADA:");
        
        // while (it.hasNext()){
        //     System.out.print(it.next() + " ");
            
        // }
        // System.out.println();
        
        for (String p : perros) {
            System.out.println(p);
        }
        
         
         
    }
    
}
