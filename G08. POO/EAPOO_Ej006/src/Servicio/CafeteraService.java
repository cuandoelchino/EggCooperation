/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class CafeteraService {
    
    Scanner leer = new Scanner(System.in);
    
    public Cafetera infoCafetera() {
    
    Cafetera c1 = new Cafetera();
    
        System.out.println("Ingrese la capacidad máxima de la cafetera:");
        c1.setCapacidadMaxima(leer.nextDouble());
        
        c1.setCantidadActual(0);
        
        return c1;
    }
    
    public Cafetera llenarCafetera(Cafetera c1) {
        
        System.out.println("Llenando la cafetera...");
        
        c1.setCantidadActual(c1.getCapacidadMaxima());
        
        System.out.println("Cafetera llena.");
        
        return c1;
    }
    
    /*
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y
simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza,
y de no haberse llenado en cuanto quedó la taza.
    */
    
    public Cafetera servirTaza(Cafetera c1) {
        
        System.out.println("Ingrese el tamaño de su taza:");
        int tamañotaza = leer.nextInt();
        System.out.println("Sirviendo café en la taza...");
        if (c1.getCantidadActual() >= tamañotaza) {
            System.out.println("Se llenó la taza.");
            c1.setCantidadActual(c1.getCantidadActual()-tamañotaza);
            
        } else {
            System.out.println("No se llenó la taza");
            System.out.println("La cantidad actual en la taza es: "+c1.getCantidadActual());
            c1.setCantidadActual(0);
                       
        }
        return c1;
    }
    
    // Método vaciarCafetera(): pone la cantidad de café actual en cero.
    
    public Cafetera vaciarCafetera(Cafetera c1) {
        System.out.println("Vaciando la cafetera...");
        c1.setCantidadActual(0);
        System.out.println("Cafetera vacía.");
        return c1;
    }
    
   // Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
   // recibe y se añade a la cafetera la cantidad de café indicada.
    
    public Cafetera agregarCafe(Cafetera c1) {
        System.out.println("Ingrese la cantidad de café a agregar:");
        int agregar = leer.nextInt();
        double capmax = c1.getCapacidadMaxima();
        double cantact = c1.getCantidadActual();
        
        if (cantact + agregar > capmax) {
            System.out.println("La cafetera está llena.");
            c1.setCantidadActual(c1.getCapacidadMaxima());
        } else {
            System.out.println("Agregando café...");
            c1.setCantidadActual(cantact + agregar);
            System.out.println("Café agregado.");
        }
        
        return c1;
    }
    
    
}
