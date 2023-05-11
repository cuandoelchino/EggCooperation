/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class MovilService {
    
    /*
    Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios
    para instanciar un objeto Celular y poder cargarlo en nuestro programa.
    */
    
    Scanner leer = new Scanner(System.in);
    
    public Movil cargarCelular() {
        
        Movil Celular = new Movil();
        
        System.out.println("Ingrese la marca del celular:");
        Celular.setMarca(leer.next());
        
        System.out.println("Ingrese el modelo del celular:");
        Celular.setModelo(leer.next());
        
        System.out.println("Ingrese el precio del celular:");
        Celular.setPrecio(leer.nextDouble());
        
        System.out.println("Ingrese la memoria RAM del celular:");
        Celular.setMemoriaRam(leer.nextInt());
        
        System.out.println("Ingrese el almacenamiento del celular:");
        Celular.setAlmacenamiento(leer.nextInt());
        
        ingresarCodigo(Celular.getCodigo());
        
        return Celular;
    }
    
    /*
    Método ingresarCodigo(): este método permitirá ingresar el código completo de
    siete números de un celular. Para ello, puede utilizarse un bucle repetitivo
    */
    
    public void ingresarCodigo(int[] vector) {
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.println("Ingrese el elemento "+(i+1)+" del código del celular:");
            vector[i] = leer.nextInt();
            
        }
        
    }
    
    public void imprimirDatos(Movil Celular) {
        
        System.out.println(Celular.toString());
        
    }
    
     public void mostrarCodigo(int[] vector) {
         
         System.out.print("codigo="); 
       
        System.out.println(Arrays.toString(vector));
        
    }
    
}
