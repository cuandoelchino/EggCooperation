/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class CursoServicio {
    
    /*
    método cargarAlumnos(): este método le permitirá al usuario ingresar los
    alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar
    esta información en un arreglo e iterar con un bucle, solicitando en cada
    repetición que se ingrese el nombre de cada alumno.
    */
    
    Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(String[] vector) {
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.println("Ingrese el nombre del alumno "+(i+1)+":");
            vector[i] = leer.next();
            
        }
        
    }
    
    /*
    Método crearCurso(): el método crear curso, le pide los valores de los
    atributos al usuario y después se le asignan a sus respectivos atributos
    para llenar el objeto Curso. En este método invocaremos al método
    cargarAlumnos() para asignarle valor al atributo alumnos
    */
    
    public Curso crearCurso() {
        
        Curso curso1 = new Curso();
        
        System.out.println("Ingrese el nombre del curso:");
        curso1.setNombreCurso(leer.next());
        
        System.out.println("Ingrese la cantidad de horas por día:");
        curso1.setCantidadHorasPorDia(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de días por semana:");
        curso1.setCantidadDiasPorSemana(leer.nextInt());
        
        System.out.println("Ingrese el turno (mañana-´M´ o tarde-´T´):");
        curso1.setTurno(leer.next());
        
        System.out.println("Ingrese el precio por hora:");
        curso1.setPrecioPorHora(leer.nextDouble());
        
        cargarAlumnos(curso1.getAlumnos());
        
        return curso1;
    }
    
    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la
    ganancia en una semana por curso. Para ello, se deben multiplicar la
    cantidad de horas por día, el precio por hora, la cantidad de alumnos y
    la cantidad de días a la semana que se repite el encuentro.
    */
    
    public double calcularGanaciaSemanal(Curso curso1) {
        
        double gananciaSem = curso1.getCantidadDiasPorSemana() * curso1.getCantidadHorasPorDia() * curso1.getPrecioPorHora() * curso1.getAlumnos().length;
        
        System.out.println("La ganancia semanal del curso "+curso1.getNombreCurso()+" es: "+gananciaSem);
        
        return gananciaSem;
    }
    
}
