/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class AhorcadoService {
    
    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra
    en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el valor que ingresó el usuario y encontradas en 0.
    */
    
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego() {
        
        Ahorcado juego1 = new Ahorcado();
        
        System.out.println("Ingrese la palabra:");
        juego1.setPalabra(leer.next().split(""));
        //String p = leer.next();
        
        System.out.println("Ingrese la cantidad de errores:");
        juego1.setCantJugadas(leer.nextInt());
        System.out.println("");
        
        String[] vector = new String[juego1.getPalabra().length];
        
        //for (int i = 0; i < vector.length; i++) {
            
           // vector[i] = "_";
            
       // }
        
        Arrays.fill(vector, "_");
      
        juego1.setNuevapalabra(vector);
        
        juego1.setCantLetras(0);
        
        
        
        return juego1;
    }
    
// Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    
    public void longitud(Ahorcado juego1) {
        
        System.out.println("Longitud de la palabra: "+juego1.getPalabra().length);
        
    }
            
    /*
Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
    */  
    
    public int buscar(Ahorcado juego1) {
        
        System.out.println("Ingrese una letra:");
        String letra = leer.next();
        // aqui tenemos que validar si la letra fue ingresada antes.
        
        int bandera=0;
        int contador=0;
        
        for (int i = 0; i < juego1.getPalabra().length; i++) {
            
           if (letra.equalsIgnoreCase(juego1.getNuevapalabra()[i])) {
               
               bandera++;
              
           }
            
        }
        
        // si bandera es mayor a cero la letra está en la palabra y ya fue ingresada anteriormente
        
        if (bandera==0) {
        
          for (int i = 0; i < juego1.getPalabra().length; i++) {
            
             if (letra.equalsIgnoreCase(juego1.getPalabra()[i])) {
               
               contador++;
               
               juego1.getNuevapalabra()[i] = letra;
               
             }
            
          }
        
          if (contador>0) {
            
            System.out.println("Mensaje: La letra pertenece a la palabra");
          } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
          }
        
        } else {
            System.out.println("Mensaje: La letra pertenece a la palabra, pero ya fue ingresada anteriormente");
            
        }
        
        return contador;
    }
    
    
    /*
Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre cuantas
letras han sido encontradas y cuantas le faltan. Este método además deberá devolver true si
la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
    */    
      
    public boolean encontradas(Ahorcado juego1) {
        
        boolean encontro=false;
        int suma = buscar(juego1);
        
        juego1.setCantLetras(juego1.getCantLetras()+suma);
        
        if (juego1.getPalabra().length == juego1.getCantLetras() || (juego1.getCantJugadas()==1 && suma==0) ) {
            
        } else {
        System.out.println("Número de letras (encontradas, faltantes): ("+juego1.getCantLetras()+","+(juego1.getPalabra().length - juego1.getCantLetras() )+")");
        
            System.out.println(Arrays.toString(juego1.getNuevapalabra()));
        
        }
        if (suma>0) {
            encontro = true;
            
        }
        
        return encontro;
    }
    
    
// Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    
    public int intentos(Ahorcado juego1) {
        int p = 0;
        
        if (encontradas(juego1)) {
           
           if (juego1.getPalabra().length == juego1.getCantLetras() ) {
               p=1;
           }
        
        } else {
            
            juego1.setCantJugadas(juego1.getCantJugadas()-1);
        }
        
        if (juego1.getCantJugadas()==0 || p==1) {
            
        } else {
             System.out.println("Número de oportunidades restantes: "+juego1.getCantJugadas());
             System.out.println("------------------------------------------------------");
        }
        return p;
    }
    
    
    /*
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados
e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
    */
    
    public void juego(Ahorcado juego1) {
        int f;
        longitud(juego1);
        System.out.println("");
        do {
            
             f=  intentos(juego1);
            
        } while (juego1.getCantJugadas() != 0 && f != 1);
        
        if (juego1.getCantJugadas() == 0) {
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
            
        } else {
            System.out.println("Mensaje: ¡Ganaste! Has descubierto toda la palabra");
            
            System.out.println(Arrays.toString(juego1.getPalabra()));
            
        }
        
    }
    
    
}
