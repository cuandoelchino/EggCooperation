/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class Service {
    
    /*
    El programa pedirá un país en un bucle, se guardará el país en el conjunto
    y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
    si decide salir, se mostrará todos los países guardados en el conjunto.
    */
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void buclePais(HashSet<String> paises) {
        
        int op = 0;
        String p;
        
        do {
        
            System.out.println("Ingrese un país:");
            p = leer.next();
            paises.add(p);
            
            do {
            System.out.println("--------------------------------------------------");
            System.out.println("Si quiere ingresar otro país digite el número 1");
            System.out.println("Si desea salir digite el número 2");
            op = leer.nextInt();
            
            switch (op) {
            case 1 -> {
                    }
            case 2 -> System.out.println("Saliendo...");
            default -> System.out.println("OPCIÓN NO VÁLIDA");
            }
            
            } while (op != 1 && op != 2);
            
        } while (op != 2);
        
        mostrarPaises(paises);
        
    }
    
    public void mostrarPaises(HashSet<String> paises) {
        System.out.println("");
        System.out.println("Países que forman parte del conjunto:");
        
        for (String aux : paises) {
            System.out.println(aux);
        }
        
    }
    
    // Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    // cómo se ordena un conjunto.
    
    public void ordenarPaises(HashSet<String> paises) {
        ArrayList<String> pai = new ArrayList(paises);
        
        Collections.sort(pai);
        
        System.out.println("");
        System.out.println("Los países ordenados alfabéticamente:");
        
        for (String aux : pai) {
            System.out.println(aux);
        }
        
    }
    
    /*
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    al usuario.
    */
    
    public void eliminarPais(HashSet<String> paises) {
        
        System.out.println("Ingrese un país que desee eliminar del conjunto:");
        String pais = leer.next();
        
        int aviso=0;
        
        Iterator<String> it = paises.iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(pais)) {
                it.remove();
                aviso=1;
            }
        }
        
        if (aviso==1) {
            mostrarPaises(paises);
        } else {
            System.out.println("El país ingresado NO forma parte del conjunto.");
        }
        
    }
    
}
