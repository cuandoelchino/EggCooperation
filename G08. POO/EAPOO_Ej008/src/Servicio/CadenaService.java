/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class CadenaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearFrase() {
        
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una frase:");
        c1.setFrase(leer.next());
        
        c1.setLongitud(c1.getFrase().length());
        
        return c1;
    }
    
    // Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    
    public void mostrarVocales (Cadena c1) {
        
        int vocales = 0;
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            
            String letra = c1.getFrase().substring(i, i+1);
            
            
            if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) ||
                 "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || 
                 "u".equalsIgnoreCase(letra) ) {
                
                vocales++; 
                   //System.out.println(letra);
                  // System.out.println(i);
            } 
            
            
        }
     
        System.out.println("El número de vocales en la frase es: "+vocales);
        
    }
    
    // Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    // Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(Cadena c1) {
        
        
        
        for (int i = c1.getLongitud(); i > 0 ;i--) {
            
            String letra = c1.getFrase().substring(i-1, i);
            
            System.out.print(letra);
            
        }
        
       // System.out.println("");
        System.out.println("\n-----------------------------------------------");
        
    }
    
  // Método vecesRepetido(String letra), recibirá un carácter ingresado por el
  //  usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 // Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
    public void vecesRepetido(Cadena c1) {
        System.out.println("Ingrese una letra a buscar en la frase");
        String letra = leer.next();
        
        int repite = 0;
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            
            String let = c1.getFrase().substring(i, i+1);
            
            
            if (letra.equalsIgnoreCase(let) ) {
                
                repite++; 
                  // System.out.println(letra);
                   //System.out.println(i);
            } 
            
           
        }
        
        System.out.println("El caracter ´"+letra+ "´ se repite "+repite+" veces.");
        
    }
    
   // Método compararLongitud(String frase), deberá comparar la longitud de la
   // frase que compone la clase con otra nueva frase ingresada por el usuario.
    
    public void compararLongitud(Cadena c1) {
        System.out.println("Ingrese una nueva frase:");
        String nuevafrase = leer.next();
        int lon2 = nuevafrase.length();
        
        int lon1 = c1.getLongitud();
        
        if (lon1 > lon2) {
            
            System.out.println("La frase inicial tiene una longitud mayor");
        } else if(lon1 < lon2) {
            System.out.println("La nueva frase tiene una longitud mayor");
        } else {
            System.out.println("Las dos frases tienen la misma longitud");
        }
        
    }
    
    //Método unirFrases(String frase), deberá unir la frase contenida en la
    //clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    
    public void unirFrases(Cadena c1) {
        
        System.out.println("Ingrese una nueva frase");
        String nuevafrase = leer.next();
        
        System.out.println(c1.getFrase().concat(" "+nuevafrase));
        
        
    }
     
    // Método reemplazar(String letra), deberá reemplazar todas las letras “a” 
    //que se encuentren en la frase, por algún otro carácter seleccionado por el
    //usuario y mostrar la frase resultante.
    
    public void reemplazar(Cadena c1) {
        System.out.println("Ingrese el caracter para reemplazar la letra ´A´.");
        String nuevocar = leer.next();
        String frase = c1.getFrase().toLowerCase();
        
        System.out.println("Frase final luego de reemplazar las a: " + 
                frase.replace("a", nuevocar));
        
        
    }
    
   // Método contiene(String letra), deberá comprobar si la frase contiene una
   // letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    
    public boolean contiene(Cadena c1) {
        
        boolean contieneletra;
        
        System.out.println("Ingrese una letra a buscar en la frase:");
        String letra = leer.next();
        
        contieneletra = c1.getFrase().contains(letra);
        
        
        
        return contieneletra;
    }
    
}
