/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class Service {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void menuTienda(HashMap<String,Double> prod) {
        int op = 0;
        do {
            
                System.out.println("TIENDA EL CHINITO");
                System.out.println("1. Ingrese un nuevo producto con su precio");
                System.out.println("2. Modificar el precio de un producto");
                System.out.println("3. Eliminar un producto");
                System.out.println("4. Mostrar todos los productos");
                System.out.println("5. Salir");
                op = leer.nextInt();
                
                switch (op) {
                case 1:
                    ingresarProd(prod);
                    break;
                case 2:
                    modificarPrecio(prod);
                    break;
                case 3:
                    eliminarProd(prod);
                    break;
                case 4:
                    mostrarProd(prod);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
                
            
        } while (op!=5);
        
    }
    
    public void ingresarProd(HashMap<String,Double> prod) {
        
        System.out.println("Ingrese el nombre del producto:");
        String nombre = leer.next();
              
        System.out.println("Ingrese el precio del producto:");
        double precio = leer.nextDouble();
        
        prod.put(nombre, precio);
        
    }
    
    public void modificarPrecio(HashMap<String,Double> prod) {
        
        System.out.println("Ingrese el nombre del producto para modificar su precio");
        String nomprod = leer.next();
        
        if (prod.containsKey(nomprod)) {
            
            System.out.println("Ingrese el nuevo precio:");
            double nuevoprecio = leer.nextDouble();
            
            prod.replace(nomprod, nuevoprecio);
            
        } else {
            
            System.out.println("Producto no encontrado.");
            
        }
                
    }
    
    public void eliminarProd(HashMap<String,Double> prod) {
        
        System.out.println("Ingrese el nombre del producto que desea eliminar:");
        String nomprod = leer.next();
        
        if (prod.containsKey(nomprod)) {
            
            prod.remove(nomprod);
            
        } else {
            System.out.println("Producto no encontrado.");
        }
        
    }
    
    public void mostrarProd(HashMap<String,Double> prod) {
        
        if (prod.isEmpty()) {
            
            System.out.println("No hay productos en la tienda.");
            
        } else {
            System.out.println("Productos en la tienda:");
            
            for (Map.Entry<String, Double> entry : prod.entrySet()) {
            
            System.out.println("nombre = "+entry.getKey()+", precio = "+entry.getValue());
            
            }  
            
        }
        
    }
    
}
