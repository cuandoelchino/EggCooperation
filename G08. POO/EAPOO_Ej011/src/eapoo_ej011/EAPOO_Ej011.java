/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ej011;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando
la clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que
se le pedirán al usuario para poner el constructor del objeto Date. Una vez creada
la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha
y la fecha actual, que se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia); Ejemplo fecha actual: Date fechaActual = new Date();
*/
public class EAPOO_Ej011 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el dia de la fecha");
        int dia=leer.nextInt();
        System.out.println("Ingrese el mes de la fecha");
        int mes=leer.nextInt();
        System.out.println("Ingrese el año de la fecha");
        int anio=leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        
        System.out.println(fecha.toString());
        
        Date fechaActual = new Date();
        
        int anios;
        
        if (fechaActual.getMonth()>fecha.getMonth()) {
        
            anios = fechaActual.getYear() - fecha.getYear();
           
        } else if (fechaActual.getMonth()==fecha.getMonth()) {
            
            if (fechaActual.getDate()<fecha.getDate()) {
                
                anios = fechaActual.getYear() - fecha.getYear()-1;
                
            } else {
                
                anios = fechaActual.getYear() - fecha.getYear();
                
            }
                
        } else {
            
            anios = fechaActual.getYear() - fecha.getYear()-1;
            
        }
        
        System.out.println("Desde esa fecha hasta hoy han pasado "+anios+" años.");
        
    }
    
}
