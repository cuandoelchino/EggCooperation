/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */
public class Rectangulo implements calculosFormas {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area() {
        double area = base * altura;
        System.out.println("El área del rectángulo es: "+area);
    }

    @Override
    public void perimetro() {
        double perimetro = (base + altura) * 2;
        System.out.println("El perímetro del rectángulo es: "+perimetro);
    }
    
    
    
}
