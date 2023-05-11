/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class LibroService {
    private Scanner leer;
    private ArrayList<Libro> libros;

    public LibroService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.libros = new ArrayList();
    }
        
        
    public Libro crearLibro() {
        
        System.out.println("Ingrese el título del libro:");
        String titulo = leer.next();
        
        System.out.println("Ingrese el autor del libro:");
        String autor = leer.next();
        
        System.out.println("Ingrese el número de páginas:");
        int nropaginas = leer.nextInt();
        
        return new Libro(autor,titulo,nropaginas);
        
    }
    
    public void agregarLibro(Libro lib){
        
        libros.add(lib);
    }
    
    public void mostrarTitulos() {
        
        System.out.println("Los libros actuales de la Lista Libros son");
        for (Libro aux : libros) {
            System.out.println("título = "+aux.getTitulo());
        }
        System.out.println("cantidad de libros = "+libros.size());
    }
    
    
    // "cantidad" representa la cantidad de objetos de la clase Libro que se
    // crearán y se agregarán a la lista
  
    public void fabricaLibros(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            
            Libro nuevolib = crearLibro();
            agregarLibro(nuevolib);
            
        }
    }
    
}
