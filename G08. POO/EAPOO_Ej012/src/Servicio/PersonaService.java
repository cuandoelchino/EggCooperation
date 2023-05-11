/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class PersonaService {
    
    /*
    Agregar un método de creación del objeto que respete la siguiente firma: crearPersona(). 
    Este método rellena el objeto mediante un Scanner y le pregunta al usuario el nombre y
    la fecha de nacimiento de la persona a crear, recordemos que la fecha de nacimiento debe
    guardarse en un Date y los guarda en el objeto.
    */
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona() {
        
        Persona persona1 = new Persona();
        
        System.out.println("Ingrese el nombre de la persona:");
        persona1.setNombre(leer.next());
        
        System.out.println("Ingrese el día de su fecha de nacimiento:");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes de su fecha de nacimiento:");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el año de su fecha de nacimiento:");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        persona1.setFechanac(fecha);
        
        System.out.println("-------------------------------------------------");
        
        return persona1;
        
    }
    
    /*
    Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
    Tener en cuenta que para conocer la edad de la persona también se debe conocer la fecha actual.
    */
    
    public int calcularEdad(Persona persona1) {
        
        int edad;
         
        Date fechaActual = new Date();
         
        if (fechaActual.getMonth()>persona1.getFechanac().getMonth()) {
            
            edad = fechaActual.getYear() - persona1.getFechanac().getYear();
             
        } else if (fechaActual.getMonth()==persona1.getFechanac().getMonth()) {
            
            if (fechaActual.getDate()<persona1.getFechanac().getDate()) {
                
                edad = fechaActual.getYear() - persona1.getFechanac().getYear()-1;
                
            } else {
                
                edad = fechaActual.getYear() - persona1.getFechanac().getYear();
                
            }
            
        } else {
            
            edad = fechaActual.getYear() - persona1.getFechanac().getYear()-1;
            
        }
     
        System.out.println("La edad de "+persona1.getNombre()+" es: "+edad+" años");
        
        return edad;
        
    }
    
    /*
    Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y
    retorna true en caso de que el receptor tenga menor edad que la persona que se recibe
    como parámetro, o false en caso contrario.
    */
    
    public boolean menorQue(Persona persona1) {
        
        boolean menorque = false;
        int edad1 = calcularEdad(persona1);
        
        System.out.println("Ingrese la edad de otra persona:");
        int edad2 = leer.nextInt();
        
        if (edad1 < edad2) {
            
            menorque = true;
            
            System.out.println(persona1.getNombre()+" es menor");
            
        }
        
        return menorque;
        
    }
    
    // Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
    
    public void mostrarPersona(Persona persona1) { 
        
        System.out.println(persona1.toString());
    
    }

    
}
