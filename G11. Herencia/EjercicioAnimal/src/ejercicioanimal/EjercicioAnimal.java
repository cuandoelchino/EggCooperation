/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioanimal;

import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author franciscovillafuerte
 */
public class EjercicioAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ArrayList<Animal> animales = new ArrayList();
        
        // Animal a = new Animal();
        // Animal b = new Perro();
        // Animal c = new Gato();
        
        // animales.add(a);
        // animales.add(b);
        // animales.add(c);
        
        // for (Animal animal : animales) {
            
           // animal.hacerRuido();
            
        // }
        
        // EJERCICIO 1
        
        Perro perro1 = new Perro("Stich", "Carnívoro", 15, "Doberman");
        perro1.Alimentarse();
        
        Perro perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        
        Gato gato1 = new Gato("Pelusa", "Galletas", 15,"Siamés");
        gato1.Alimentarse();
        
        Caballo caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
        
    }
    
}
