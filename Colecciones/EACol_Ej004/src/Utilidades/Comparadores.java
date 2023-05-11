/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author franciscovillafuerte
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarTituloAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarDirectorAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
    
}
