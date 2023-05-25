/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alumno;
import Entidad.Voto;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author franciscovillafuerte
 */
public class Simulador {
    
    /*La clase Simulador debe tener un método que genere un listado de alumnos manera aleatoria y lo retorne.
    Las combinaciones de nombre y apellido deben ser generadas de manera aleatoria. Nota: usar listas de tipo
    String para generar los nombres y los apellidos.
    */
    public ArrayList<String> listaNombres(int x) {
        ArrayList<String> nombres = new ArrayList();
        
        for (int i = 0; i < x; i++) {
            String n = generarNombreAleatorio();
            String a = generarApellidoAleatorio();
            String na = n + " " + a;
            
            nombres.add(na);
            
        }
        
        return nombres;
    }
    
    // Función para generar un nombre aleatorio
public String generarNombreAleatorio() {
    String[] nombres = {"Pedro", "Juan", "Maria", "Luisa", "Diego", "Carmen", "Gabriela", "Andres", "Sofia", "Javier", "Lucia", "Fernanda", "Francisco", "Paloma", "Antonio", "Carlos"};
    return nombres[random.nextInt(nombres.length)];
}

// Función para generar un apellido aleatorio
public String generarApellidoAleatorio() {
    String[] apellidos = {"Torres", "Garcia", "Perez", "Fernandez", "Lopez", "Rodriguez", "Gonzalez", "Martinez", "Sanchez", "Diaz", "Alvarez", "Romero", "Trujillo", "Zavala", "Aguinaga", "Palomino"};
    return apellidos[random.nextInt(apellidos.length)];
}
    
    /*
     Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un rango real de números de documentos.
    Y agregar a los alumnos su DNI. Este método debe retornar la lista de dnis.
    */

        // Creamos un conjunto para llevar un registro de los DNI ya utilizados
        HashSet<Integer> dniUtilizados = new HashSet<>();
        
         Random random = new Random();
    
    public ArrayList<Integer> listaDNI (int x) {
        ArrayList<Integer> dnilist = new ArrayList();
        
        for (int i = 0; i < x; i++) {
            Integer dni = 0;
            
            // Generamos nuevos valores aleatorios para el DNI hasta que no se hayan utilizado anteriormente
              while (true) {
              dni = 10000000+random.nextInt(80000000);
              if (!dniUtilizados.contains(dni)) {
               dniUtilizados.add(dni);
               break;
               }
              }
            
             dnilist.add(dni);
        }
     
        return dnilist;
    }
    
    
    /*
    Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de objetos Alumno,
    elegidos por el usuario, y le asigne los nombres y los dnis de las dos listas a cada objeto Alumno.
    No puede haber dos alumnos con el mismo dni, pero si con el mismo nombre.
    */
    
    public ArrayList<Alumno> listaAlumnos(int x) {
        
        ArrayList<String> listanom = listaNombres(x);
        ArrayList<Integer> listadni = listaDNI(x);
        ArrayList<Alumno> listaalum = new ArrayList();
        
        for (int i = 0; i < x; i++) {
            
            String nombre = listanom.get(i);
            int dni = listadni.get(i);
            
            Alumno alum = new Alumno(nombre, dni,0);
            
            listaalum.add(alum);
        }
        
        return listaalum;
    }
    
    
    // Se debe imprimir por pantalla el listado de alumnos.
    
    public void imprimirAlumnos(ArrayList<Alumno> alumnos) {
        System.out.println("Lista de Alumnos:");
        for (Alumno a : alumnos) {
            System.out.println(a.toString());
        }
        System.out.println("----------------------------------------------------------------");
    }
    
    /*
    Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
    para cada alumno genera tres votos de manera aleatoria. En este método debemos guardar
    a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de votos
    a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
    Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al mismo
    alumno. Utilizar un hashset para resolver esto.
    */
    
    public ArrayList<Voto> votacion(ArrayList<Alumno> alumnos) {
        
        ArrayList<Voto> listaVoto = new ArrayList();
        
        for (int i = 0; i < alumnos.size(); i++) {
           Voto votos = new Voto(); 
           votos.setVotante(alumnos.get(i));
           
            // Creamos una lista para guardar los 3 votos del alumno i
            ArrayList<Alumno> v = new ArrayList();
           
            // Creamos un conjunto para llevar un registro de los índices que no pueden ser votados
            HashSet<Integer> indicesProhibidos = new HashSet<>();
            
            indicesProhibidos.add(i);
            
            // For que simula los 3 votos de cada alumno
          for (int m = 0; m < 3; m++) {  
            int y = 0;
            // Generamos nuevos valores aleatorios para el índice hasta que no se hayan utilizado anteriormente
            while (true) {
               y = random.nextInt(alumnos.size());
             
             if (!indicesProhibidos.contains(y)) {
                indicesProhibidos.add(y);
                break;
             }
            }
            
            v.add(alumnos.get(y));
            
            int votosactuales = alumnos.get(y).getCantvotos();
            alumnos.get(y).setCantvotos(votosactuales+1);
            
          }
          
          votos.setVotos(v);
          listaVoto.add(votos);
            
        }
        
        return listaVoto;
        
    }
    
    // Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales fueron sus 3 votos.
    
    public void mostrarAlumnosVotos(ArrayList<Voto> listaVoto) {
        System.out.println("Lista de Alumnos con su cantidad de votos y sus 3 VOTOS:");
        for (Voto vot : listaVoto) {
            System.out.println(vot.toString());
        }
    }
    
    /*
    Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos
    y comienza a hacer el recuento de votos.
    */
    
    public void recuentoVotos(ArrayList<Alumno> alumnos) {
        Collections.sort(alumnos,Comparadores.ordenarVotosDesc);
    }
    
    /*
    Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear
    5 facilitadores suplentes con los 5 segundos alumnos más votados. A continuación,
    mostrar los 5 facilitadores y los 5 facilitadores suplentes.
    */
    
    public void facilitadores(ArrayList<Alumno> alumnos) {
        
        ArrayList<Alumno> facilit = new ArrayList();
        ArrayList<Alumno> facilitsup = new ArrayList();
        
        for (int i = 0; i < 5; i++) {
            facilit.add(alumnos.get(i));
            facilitsup.add(alumnos.get(5+i));
        }
        System.out.println(" ");
        System.out.println("Los 5 facilitadores son:");
        for (Alumno f : facilit) {
            System.out.println(f.toString());
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Los 5 facilitadores suplentes son:");
        for (Alumno fs : facilitsup) {
            System.out.println(fs.toString());
        }
        
    }
    
}
