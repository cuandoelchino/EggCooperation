/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class NIFService {
    
    /*
    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra
    que le corresponderá. Una vez calculado, le asigna la letra que le corresponde
    según el resultado del calculo.
    */
    
    Scanner leer = new Scanner(System.in);
    
    public NIF crearNif() {
        
        NIF persona = new NIF();
        
        System.out.println("Ingrese el número de DNI:");
        persona.setDNI(leer.nextLong());
        
        System.out.println(persona.getDNI());
        
        persona.setNIF(calcularLetra(persona.getDNI()));
                
        return persona;
    }
    
    /*
    La letra correspondiente al dígito verificador se calculará a traves de un
    método que funciona de la siguiente manera: Para calcular la letra se toma
    el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22).
    El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto
    de la división para obtener la letra correspondiente.
    */
    
    public String calcularLetra(long DNI) {
          
      int resto = (int) DNI % 23;
      
      String[] vector = new String[23];
      
      llenarVector(vector);
      
      return vector[resto];
      
    }
    
    public void llenarVector(String[] vector) {
        
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
         for (int i = 0; i < vector.length; i++) {
            
            vector[i] = letras.substring(i, i+1);
            
        }
        
    }
    
    /*
    Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y
    la letra en mayúscula; por ejemplo: 00395469-F).
    */
    
    public void mostrar(NIF persona) {
        
        System.out.println("NIF="+persona.getDNI()+"-"+persona.getNIF());
        
    }
    
}
