/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejap01_rel;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.PService;
import java.util.ArrayList;

/**
 *
 * @author franciscovillafuerte
 */
public class EjAp01_Rel {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
    */
    public static void main(String[] args) {
        
        // Perro perrito1 = new Perro("Almendra","Boxer", "grande",2);
        
        // Perro perrito2 = new Perro("Simba","Chusco","mediano",3);
        
        // Persona p1 = new Persona("Carlos", "Vega", 30, 49377483, perrito1);
        
        // Persona p2 = new Persona("Tatiana","Basadre",40,42355677,perrito2);
        
        // System.out.println(p1.toString());
        // System.out.println(p2.toString());
        
        
        // EJ EX 01
        
        /*
        Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona.
        Nuestro programa va a tener que contar con muchas personas y muchos perros.
        El programa deberá preguntarle a cada persona, que perro según su nombre, quiere adoptar.
        Dos personas no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
        se le debe informar a la persona.
        Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las personas con sus respectivos perros.
        */
        
        PService s = new PService();
        
        ArrayList<Perro> perros = s.crearPerro();
        
        ArrayList<Persona> personas = s.crearPersona();
        
        s.adopcionPerros(personas, perros);
        
        s.mostrarPersonas(personas);
        
    }
    
}
