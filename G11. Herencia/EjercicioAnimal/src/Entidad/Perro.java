/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */
public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    
    
    // @Override
    // public void hacerRuido() {
       
       // System.out.println("Guau");
    // }

    @Override
    public void Alimentarse() {
        System.out.println(nombre+" se alimenta de: "+alimento);
    }
    
}
