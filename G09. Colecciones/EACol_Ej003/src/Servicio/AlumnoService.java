/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */

public class AlumnoService {
    
    /*
    En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
    toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    pregunta al usuario si quiere crear otro Alumno o no.
    */
    
    
        private Scanner leer;
        private ArrayList<Alumno> alumnos;

        public AlumnoService() {
             this.leer = new Scanner(System.in).useDelimiter("\n");
             this.alumnos = new ArrayList();
        }
        
        
        public void bucleAlumno() {
        
        int op = 0;
        
        do {
        
            Alumno nuevoalum = crearAlumno();
            agregarAlum(nuevoalum);
            
            do {
            System.out.println("--------------------------------------------------");
            System.out.println("Si quiere crear otro alumno ingrese el número 1");
            System.out.println("Si desea salir ingrese el número 2");
            op = leer.nextInt();
            
            switch (op) {
            case 1:
                
                break;
            case 2:
                System.out.println("Saliendo...");
                
                break;
            default:
                System.out.println("OPCIÓN NO VÁLIDA");
            }
            
            } while (op != 1 && op != 2);
            
        } while (op != 2);
        
        }
    
        
    public Alumno crearAlumno() {
        
            String nom;
            int notap,notat,notaf;
        
            System.out.println("Ingrese el nombre del alumno:");
            nom = leer.next();
            System.out.println("Ingrese la nota del examen parcial del alumno:");
            notap = leer.nextInt();
            System.out.println("Ingrese la nota de trabajo en equipo del alumno:");
            notat = leer.nextInt();
            System.out.println("Ingrese la nota del examen final del alumno:");
            notaf = leer.nextInt();
            ArrayList<Integer> notitas = new ArrayList();
            
            notitas.add(notap);
            notitas.add(notat);
            notitas.add(notaf);
            
            return new Alumno(nom,notitas);
        
    }    
    
    public void agregarAlum(Alumno alum) {
        alumnos.add(alum); 
        
    }
    
    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    promedio final, devuelto por el método y mostrado en el main.
    */
    
    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno para conocer su nota final:");
        String nombreabuscar = leer.next();
        
        for (Alumno a : alumnos) {
            if (a.getNombre().equals(nombreabuscar)) {
                double promedio = a.notaFinal();
                System.out.println("La nota final de "+a.getNombre()+" es: "+promedio);
                return;
            }
        }
        System.out.println("Alumno no encontrado en la base de datos.");
    }
    
    
}
