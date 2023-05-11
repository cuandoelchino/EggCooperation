/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Arreglos;
import java.util.Arrays;



/**
 *
 * @author franciscovillafuerte
 */
public class ArreglosServicio {
    
    // El programa deberá inicializar el arreglo A con números aleatorios
    
    public void llenarVector(double[] vector ) {
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = Math.random() * 10;
            
        }
        
    }
    
    // y mostrarlo por pantalla.
    // Mostrar los dos arreglos resultantes:
    // el ordenado de 50 elementos y el combinado de 20.
    
    public void mostrarVector(double[] vector) {
       
        System.out.println(Arrays.toString(vector));
        
        System.out.println("");
        
    }
    
    // Luego, el arreglo A se debe ordenar de menor a mayor
 
    public void ordenarAscendente (double[] vector) {
        
        Arrays.sort(vector);
        
    }
    
    // copiar los primeros 10 números ordenados al arreglo B de 20 elementos,

    
    public void copiarElementos (double[] vector, Arreglos arreglo) {
        
       for (int i = 0; i < 10; i++) {
            
            vector[i] = arreglo.getArregloA()[i];
            
        }
        
    }
    
    // y rellenar los 10 últimos elementos con el valor 0.5
    
    public void rellenarConstante (double[] vector) {
        
        Arrays.fill(vector, 10, 20, 0.5);
        
    }
    
}
