/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciolistalibros;

import Servicio.LibroService;

/**
 *
 * @author franciscovillafuerte
 */
public class EjercicioListaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
    
      LibroService servLib = new LibroService();
       
      servLib.fabricaLibros(3);
      
      servLib.mostrarTitulos();
        
        
    }
    
}
