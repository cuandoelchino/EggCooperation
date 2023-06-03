/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */
public class Circulo implements calculosFormas {
    
    private double radio;
    private double diametro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    } 

    @Override
    public void area() {
        double area = PI * radio * radio;
        System.out.println("El área del círculo es: "+area);
    }

    @Override
    public void perimetro() {
        double perimetro = PI * diametro;
        System.out.println("El perímetro del círculo es: "+perimetro);
    }
    
    
    
}
