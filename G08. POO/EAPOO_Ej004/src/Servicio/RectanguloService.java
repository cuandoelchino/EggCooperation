/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class RectanguloService {
    
    public Rectangulo crearRectangulo() {
        
        Scanner leer = new Scanner(System.in);
        
        Rectangulo rectangulo01 = new Rectangulo();
        
        System.out.println("Ingrese la base del Rectángulo:");
        rectangulo01.setBase(leer.nextDouble());

        System.out.println("Ingrese la altura del Rectángulo:");
        rectangulo01.setAltura(leer.nextDouble());
        
        return rectangulo01;
        
    }
    
    public double superficie(Rectangulo rectangulo01) {
        // Superficie = base * altura
        
        double superficie = rectangulo01.getBase() * rectangulo01.getAltura();
        
        return superficie;
        
    }
    
    public double perimetro (Rectangulo rectangulo01) {
        //Perímetro = (base + altura) * 2
        
        double perimetro = (rectangulo01.getBase() + rectangulo01.getAltura())*2;
        
        return perimetro;
        
    }
    
    public void dibujo (Rectangulo rectangulo01) {
        
        for (int i = 0; i < rectangulo01.getAltura();i++){
            for (int j = 0; j < rectangulo01.getBase();j++) {
                
                if (i == 0 || i == rectangulo01.getAltura()-1 || j == 0 || j == rectangulo01.getBase()-1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
       
    }
    
}
