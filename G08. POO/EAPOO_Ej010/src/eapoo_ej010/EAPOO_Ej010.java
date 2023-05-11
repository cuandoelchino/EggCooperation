/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ej010;

import Entidad.Arreglos;
import Servicio.ArreglosServicio;

/**
 *
 * @author franciscovillafuerte
 */

/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales,
y el segundo B, un arreglo de 20 números, también reales. El programa deberá inicializar el arreglo A con números aleatorios
y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números ordenados
al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos resultantes:
el ordenado de 50 elementos y el combinado de 20.
*/

public class EAPOO_Ej010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArreglosServicio servA = new ArreglosServicio();
        
        Arreglos arreglo = new Arreglos();
        
        servA.llenarVector(arreglo.getArregloA());
        
        servA.mostrarVector(arreglo.getArregloA());
        
        servA.ordenarAscendente(arreglo.getArregloA());
        
        servA.mostrarVector(arreglo.getArregloA());
        
        servA.copiarElementos(arreglo.getArregloB(), arreglo);
        
        servA.rellenarConstante(arreglo.getArregloB());
        
        servA.mostrarVector(arreglo.getArregloB());
        
    }
    
}
