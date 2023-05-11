/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import Entidad.Libro;
import java.util.Scanner;
/**
 *
 * @author franciscovillafuerte
 */
public class LibroService {
    
    
    
    public Libro crearLibro() {
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Libro libro1 = new Libro();
        
        System.out.println("Ingrese el numero de ISBN:");
        libro1.setISBN(leer.nextInt());
        
        System.out.println("Ingrese el titulo del libro:");
        libro1.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor del libro:");
        libro1.setAutor(leer.next());
        
        System.out.println("Ingrese el numero de paginas:");
        libro1.setNropaginas(leer.nextInt());
        
        return libro1;
        
    }
    
    public void mostrarLibro(Libro libro1) {
        
        System.out.println(libro1.toString());
        
    }
    
}
