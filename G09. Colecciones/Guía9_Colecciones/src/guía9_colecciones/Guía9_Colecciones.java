/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guía9_colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author franciscovillafuerte
 */
public class Guía9_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       //LISTAS:
    ArrayList<Integer> numerosA = new ArrayList(); //Lista de tipo Integer
   
    int x = 20;
   
    numerosA. add(x); //Agregamos el numero 20 a la lista, en la posición O
    numerosA. add(50);
    numerosA. add(4);
    numerosA. add(13);
    numerosA. add(3);

       // for (Integer num : numerosA) {
       //     System.out.println(num);
       // }
       // System.out.println("----------------------------------------------");
    numerosA.remove(4);

       // for (Integer num : numerosA) {
       //     System.out.println(num);
       // }

       
       //CONJUNTOS:
    HashSet<Integer> numerosB = new HashSet();
   
    Integer y = 20;
   
    numerosB.add(y);
    numerosB.add(24);
    numerosB.add(23);
    numerosB.add(4);
    numerosB.add(1);

       // for (Integer num : numerosB) {
       //     System.out.println(num);
       // }
       // System.out.println("----------------------------------------------");
        
    numerosB.remove(24);

       // for (Integer num : numerosB) {
       //     System.out.println(num);
       // }
    

       //MAPAS:
    HashMap<Integer, String> alumnos = new HashMap();
   
    int dniAlumno1 = 34576189;
   
    String nombreAlumno1 = "Pepe";
    String nombreAlumno2 = "Paloma";
    String nombreAlumno3 = "Juan";
 
    alumnos.put(dniAlumno1, nombreAlumno1); //Agregamos la llave y el valor
    alumnos.put(34236763, nombreAlumno2);
    alumnos.put(23456653, nombreAlumno3);
    alumnos.put(45365643, "Lorena");
    alumnos.put(35343454, "Fernanda");
   
       // Con Map.Entry
       // Recorrer las dos partes del mapa
       // entry.getKey() trae la llave y entry.getValue() trae los valores del mapa

        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("documento="+entry.getKey()
            +", nombre="+entry.getValue());
        }

    alumnos.remove(34236763); //Eliminamos al alumno 2: Paloma 
         
       // Sin Map.Entry
       // Mostrar solo las llaves
       
        for (Integer dni : alumnos.keySet()) {
            System.out.println("Documento: "+dni);
        }
   
       // Mostrar solo los valores
       
        for (String nombres : alumnos.values()) {
            System.out.println("Nombre: "+nombres);   
        }
   
        
       //DETECCIÓN DE ERRORES  
    HashMap<Integer, String> personas = new HashMap();
    
    String n1 = "Albus";
    String n2 = "Severus";
      
    personas.put(13423414,n1);
    personas.put(24353433,n2);
     
   
       //DETECCIÓN DE ERRORES 
   
    ArrayList<String> bebidas = new ArrayList();
    
    bebidas.add("café");
    bebidas.add("té");
    
    Iterator<String> it = bebidas.iterator();
    
    while (it.hasNext()){
        if (it.next().equals("café")){
            it.remove();
        }
    }
    
    
    } 
    
}
