/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class PeliculaService {
    
    /*
    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    todos sus datos y guardándolos en el objeto Pelicula.
    Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
    crear otra Pelicula o no.
    */
    
    private Scanner leer;
        private ArrayList<Pelicula> peliculas;

        public PeliculaService() {
             this.leer = new Scanner(System.in).useDelimiter("\n");
             this.peliculas = new ArrayList();
        }
        
        
        public void buclePeli() {
        
        int op = 0;
        
        do {
        
            Pelicula nuevapeli = crearPeli();
            agregarPeli(nuevapeli);
            
            do {
            System.out.println("--------------------------------------------------");
            System.out.println("Si quiere crear otra película ingrese el número 1");
            System.out.println("Si desea salir ingrese el número 2");
            op = leer.nextInt();
            
            switch (op) {
            case 1 -> {
                    }
            case 2 -> System.out.println("Saliendo...");
            default -> System.out.println("OPCIÓN NO VÁLIDA");
            }
            
            } while (op != 1 && op != 2);
            
        } while (op != 2);
        
        }
    
        
    public Pelicula crearPeli() {
        
            String nom,dir;
            double dur;
        
            System.out.println("Ingrese el título de la película:");
            nom = leer.next();
            System.out.println("Ingrese el director de la película:");
            dir = leer.next();
            System.out.println("Ingrese la duración de la película en horas:");
            dur = leer.nextDouble();
            
            return new Pelicula(nom,dir,dur);
        
    }    
    
    public void agregarPeli(Pelicula peli) {
        peliculas.add(peli); 
        
    }
    
    // Mostrar en pantalla todas las películas.
    
    public void mostrarPelis() {
        System.out.println("");
        System.out.println("Las películas actuales de la Lista Películas son");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
  
    }
    
    // Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    
    public void mostrarPeliMasUnaHora() {
        System.out.println("");
        System.out.println("Las películas con una duración mayor a 1 hora:");
        for (Pelicula aux : peliculas) {
            if (aux.getDuracion()>1) {
                System.out.println(aux.toString());
            }
        }
  
    }
    
    // Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    
    public void duracionMayorMenor() {
        System.out.println("");
        System.out.println("Películas ordenadas de mayor a menor duración");
            
        Collections.sort(peliculas,Comparadores.ordenarDuracionDesc);
            
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        
    }
    
    // Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    
    public void duracionMenorMayor() {
        System.out.println("");
        System.out.println("Películas ordenadas de menor a mayor duración");
        
        Collections.sort(peliculas,Comparadores.ordenarDuracionAsc);
            
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        
    }
    
    // Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    
    public void tituloOrdenado() {
        System.out.println("");
        System.out.println("Películas ordenadas alfabéticamente según su título:");
        
        Collections.sort(peliculas,Comparadores.ordenarTituloAsc);
        
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        
    }
    
    // Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    
    public void directorOrdenado() {
        System.out.println("");
        System.out.println("Películas ordenadas alfabéticamente según su director:");
        
        Collections.sort(peliculas,Comparadores.ordenarDirectorAsc);
        
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        
    }
    
}
