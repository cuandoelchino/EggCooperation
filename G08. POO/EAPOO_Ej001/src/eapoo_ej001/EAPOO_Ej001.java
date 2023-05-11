/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un método
para cargar un libro pidiendo los datos al usuario y luego informar mediante
otro método el número de ISBN, el título, el autor del libro y el numero de
páginas.

*/


package eapoo_ej001;

import Entidad.Libro;
import Servicio.LibroService;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_Ej001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LibroService libServicio = new LibroService();
        
        Libro libro1 = libServicio.crearLibro();
        
        libServicio.mostrarLibro(libro1);
        
    }
    
}
