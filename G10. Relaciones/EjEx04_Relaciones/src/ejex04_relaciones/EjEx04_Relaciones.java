/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejex04_relaciones;

import Entidad.Alumno;
import Entidad.Voto;
import Servicio.Simulador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class EjEx04_Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MAIN
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Bienvenide a la simulación del sistema de votación de Facilitadores en Egg");
        Simulador s = new Simulador();
        
        System.out.println("¿Con cuántos alumnos desea trabajar?");
        int personas = leer.nextInt();
        ArrayList<Alumno> alum = s.listaAlumnos(personas);
        
        s.imprimirAlumnos(alum);
        
        ArrayList<Voto> votos = s.votacion(alum);
        
        s.mostrarAlumnosVotos(votos);
        
        s.recuentoVotos(alum);
        
        s.facilitadores(alum);
        
    }
    
}
