/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class PuntosService {
    
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos() {
        
        Puntos punto1 = new Puntos();
        
        System.out.println("Ingrese la coordenada X del primer punto:");
        punto1.setX1(leer.nextDouble());
        
        System.out.println("Ingrese la coordenada Y del primer punto:");
        punto1.setY1(leer.nextDouble());
        
        System.out.println("Ingrese la coordenada X del segundo punto:");
        punto1.setX2(leer.nextDouble());
        
        System.out.println("Ingrese la coordenada Y del segundo punto:");
        punto1.setY2(leer.nextDouble());
        
        return punto1;
    }

    public double distanciaPuntos(Puntos punto1) {
        
        double d;
        
        d = Math.sqrt((Math.pow(punto1.getX2() - punto1.getX1(), 2)) + (Math.pow(punto1.getY2() - punto1.getY1(), 2)));
        
        System.out.println("La distancia entre los dos puntos es: "+d);
        
        return d;
    }
    
}
