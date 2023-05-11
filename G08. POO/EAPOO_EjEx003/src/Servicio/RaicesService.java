/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class RaicesService {
    
    Scanner leer = new Scanner(System.in);
    
    public Raices crearEcuacion() {
        
        Raices ecuacion = new Raices();
        
        System.out.println("Las ecuaciones de segundo grado tienen la siguiente forma:");
        System.out.println("ax2+bx+c=0 donde a ≠ 0");
        
        System.out.println("Ingrese el coeficiente a:");
        ecuacion.setA(leer.nextDouble());
        
        System.out.println("Ingrese el coeficiente b:");
        ecuacion.setB(leer.nextDouble());
        
        System.out.println("Ingrese el coeficiente c:");
        ecuacion.setC(leer.nextDouble());
        
        return ecuacion;
    }
    
// Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c
    
    public double getDiscriminante(Raices ecuacion) {
        
        double d;
        
        d = (Math.pow(ecuacion.getB(), 2))-(4*ecuacion.getA()*ecuacion.getC());
        
        return d;
    }

// Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    
    public boolean tieneRaices(Raices ecuacion) {
        
        boolean r = false;
        
        if (getDiscriminante(ecuacion) >= 0) {
            r = true;
            // System.out.println("La ecuación tiene dos soluciones.");
        }
        
        return r;
    }
    
// Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    
    public boolean tieneRaiz(Raices ecuacion) {
        
        boolean r = false;
        
        if (getDiscriminante(ecuacion) == 0) {
            r = true;
            // System.out.println("La ecuación tiene una única solución.");
        }
        
        return r;
    }
    
    
// Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    
    public void obtenerRaices(Raices ecuacion) {
        
        if (tieneRaices(ecuacion)) {
            
            double r1,r2;
            
            r1 = (-ecuacion.getB() + Math.sqrt((Math.pow(ecuacion.getB(), 2))-(4*ecuacion.getA()*ecuacion.getC())))/(2*ecuacion.getA());
            
            r2 = (-ecuacion.getB() - Math.sqrt((Math.pow(ecuacion.getB(), 2))-(4*ecuacion.getA()*ecuacion.getC())))/(2*ecuacion.getA());
            
            System.out.println("Las dos posibles soluciones son:");
            System.out.println("solucion1="+r1);
            System.out.println("solucion2="+r2);
            
        }
        
    }
    
// Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    
      public void obtenerRaiz(Raices ecuacion) {
        
        if (tieneRaiz(ecuacion)) {
            
            double r;
            
            r = (-ecuacion.getB())/(2*ecuacion.getA());
            
            System.out.println("La única solución es:");
            System.out.println("solucion="+r);
            
        }
        
    }
      
      /*
      Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
      y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
      con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
      métodos y en caso de no existir solución, se mostrará un mensaje.
      */   
      
      public void calcular(Raices ecuacion) {
          
          if (tieneRaiz(ecuacion)) {
              
              obtenerRaiz(ecuacion);
              
          } else if (tieneRaices(ecuacion)) {
              
              obtenerRaices(ecuacion);
              
          } else {
              
              System.out.println("La ecuación no tiene solución.");
              
          }
          
      }
    
}
