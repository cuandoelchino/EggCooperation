/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class PService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    // PERSONA: nombre, apellido, edad, documento, Perro
    
    // PERRO: nombre, raza, tamaño, edad
    
    
        //PERSONAS    
        
        // Función para generar un nombre aleatorio
public static String generarNombreAleatorio() {
    String[] nombres = {"Pedro", "Juan", "Maria", "Luisa", "Diego", "Carmen", "Gabriela", "Andres", "Sofia", "Javier", "Lucia", "Fernanda", "Francisco", "Paloma", "Antonio", "Carlos"};
    Random random = new Random();
    return nombres[random.nextInt(nombres.length)];
}

// Función para generar un apellido aleatorio
public static String generarApellidoAleatorio() {
    String[] apellidos = {"Torres", "Garcia", "Perez", "Fernandez", "Lopez", "Rodriguez", "Gonzalez", "Martinez", "Sanchez", "Diaz", "Alvarez", "Romero", "Trujillo", "Zavala", "Aguinaga", "Palomino"};
    Random random = new Random();
    return apellidos[random.nextInt(apellidos.length)];
}
        
        //PERROS
        String[] nombresPerros = {"Tommy", "Timon", "Zeus", "Milo", "Botitas", "Lady", "Bobby", "Ron", "Simba", "Almendra", "Kala", "Arya", "Coco", "Luna", "Bruno", "Pucho", "Charly", "Tati", "Zoe", "Nala"};
    
        // Función para generar una raza aleatoria
public static String generarRazaAleatoria() {
    String[] razas = {"Doberman", "Labrador Retriever", "Beagle", "Cocker Spaniel", "Pastor Alemán", "Bulldog", "Golden Retriever", "Poodle", "Rottweiler", "Chihuahua", "Husky Siberiano", "Boxer"};
    Random random = new Random();
    return razas[random.nextInt(razas.length)];
} 
        
        // Función para generar un tamaño aleatorio
public static String generarTamanoAleatorio() {
    String[] tamanios = {"pequeño", "mediano", "grande"};
    Random random = new Random();
    return tamanios[random.nextInt(tamanios.length)];
}
        
        Random random = new Random();

        public ArrayList<Perro> crearPerro(){
         ArrayList <Perro> perrosList = new ArrayList() ;
            for (int i = 0; i < nombresPerros.length; i++) {
              Perro perro = new Perro ();
               perro.setNombre(nombresPerros[i]);
               perro.setEdad(random.nextInt(8));
               perro.setRaza(generarRazaAleatoria());
               perro.setTamano(generarTamanoAleatorio());
               
               perrosList.add(perro);
            }
            return perrosList;
        }
        
        // Creamos un conjunto para llevar un registro de los nombres y apellidos ya utilizados
        HashSet<String> nombresApellidosUtilizados = new HashSet<>();
        
        // Creamos un conjunto para llevar un registro de los DNI ya utilizados
        HashSet<Integer> dniUtilizados = new HashSet<>();
        
        public ArrayList<Persona> crearPersona(){
         ArrayList <Persona> personasList = new ArrayList();
            for (int i = 0; i < nombresPerros.length; i++) {
             Persona person = new Persona(); 
             
             String nombre = "";
             String apellido = "";
             Integer dni = 0;
    
              // Generamos nuevos valores aleatorios para el nombre y apellido hasta que no se hayan utilizado anteriormente
              while (true) {
              nombre = generarNombreAleatorio();
              apellido = generarApellidoAleatorio();
              String nombreApellido = nombre + " " + apellido;
              if (!nombresApellidosUtilizados.contains(nombreApellido)) {
               nombresApellidosUtilizados.add(nombreApellido);
               break;
               }
              }
              
              // Generamos nuevos valores aleatorios para el DNI hasta que no se hayan utilizado anteriormente
              while (true) {
              dni = 10000000+random.nextInt(80000000);
              if (!dniUtilizados.contains(dni)) {
               dniUtilizados.add(dni);
               break;
               }
              }
             
              person.setNombre(nombre);
              person.setApellido(apellido);
              person.setDocumento(dni);
              person.setEdad(random.nextInt(41)+18);
             
              personasList.add(person);
             
            }
            
            return personasList;
        }
        
        // Creamos un conjunto para llevar un registro de los nombres de perro ya adoptados
        HashSet<String> nombresPerrosAdoptados = new HashSet<>();
        
        public void adopcionPerros(ArrayList<Persona> personas, ArrayList<Perro> perros){
            
            int aviso = 0;
            
            System.out.println("Bienvenido al centro de adopción Patitas");
            System.out.println("Esta es la lista de perros disponible para adopción responsable:");
            
            for (Perro perr : perros) {
                System.out.println(perr.toString());    
            }
            
            
            for (int i = 0; i < personas.size(); i++) {
                
                do {
                
                System.out.println(personas.get(i).getNombre()+" "+personas.get(i).getApellido()+", indica el nombre del perro que deseas adoptar:");
                String nombreperro = leer.next();
                
                
                if (nombresPerrosAdoptados.contains(nombreperro)) {
                    
                    System.out.println(nombreperro+" ya ha sido adoptado");
                    aviso = 1;
                    
                } 
                
                
                
                for (Perro p : perros) {
                    
                    if (p.getNombre().equals(nombreperro) && !nombresPerrosAdoptados.contains(nombreperro)) {
                        personas.get(i).setPerro(p);
                        nombresPerrosAdoptados.add(p.getNombre());
                        aviso = 2;
                    }
                    
                }
                
                if (!nombresPerrosAdoptados.contains(nombreperro)) {
                    
                    System.out.println("El nombre ingresado no coincide con ningún nombre de nuestra Lista");
                    aviso = 1;
                } 
                
                } while (aviso==1);
                
            }
            
            
        }
        
        public void mostrarPersonas(ArrayList<Persona> people) {
            
            
            System.out.println("Lista de personas con sus respectivos perros:");
            for (Persona per : people) {
                System.out.println(per.toString());
            }
        }
        
        
}

