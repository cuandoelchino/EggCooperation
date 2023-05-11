/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class CancionService {
    
    public Cancion crearCancion() {
        
        Scanner leer = new Scanner(System.in);
        
        Cancion cancion1 = new Cancion();
        
        System.out.println("Ingrese el título de la canción");
        cancion1.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor de la canción:");
        cancion1.setAutor(leer.next());
        
        return cancion1;
    }
    
    public void mostrarDatos(Cancion cancion1) {
        
        System.out.println(cancion1.toString());
        
    }
    
}
