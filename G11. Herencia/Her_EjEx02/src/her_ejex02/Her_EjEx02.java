/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package her_ejex02;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class Her_EjEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MAIN
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<Edificio> edificios = new ArrayList();
        
        int op;
        
        System.out.println("Programa de Diseño de Edificios");
        
        do {
        
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1. Diseñar Polideportivo");
        System.out.println("2. Diseñar Edificio de Oficinas");
        System.out.println("3. Salir");
        op = leer.nextInt();
        
        switch (op) {
            case 1:
                edificios.add(new Polideportivo().crearPolideportivo());
                break;
            case 2:
                edificios.add(new EdificioDeOficinas().crearEO());
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción NO Válida.");
        }
        
        } while (op != 3);
        
         /*
        Por último, en el main vamos a crear un ArrayList de tipo Edificio.
        El ArrayList debe contener dos polideportivos y dos edificios de oficinas.
        Luego, recorrer este array y ejecutar los métodos calcularSuperficie y
        calcularVolumen en cada Edificio. Se deberá mostrar la superficie y el
        volumen de cada edificio.
        
        Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos
        son techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar
        al método cantPersonas() y mostrar los resultados de cada edificio de oficinas.
        */
         
        int canttechados = 0;
        int cantabiertos = 0;
        
        for (Edificio aux : edificios) {
            System.out.println("-----------------------------------------------");
            aux.calcularSuperficie();
            aux.calcularVolumen();
            
            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).isTechado()) {
                    canttechados++;
                    System.out.println("El Polideportivo es Techado.");
                } else {
                    cantabiertos++;
                    System.out.println("El Polideportivo es Abierto.");
                }
            } else {
                ((EdificioDeOficinas) aux).cantPersonas();
            }
        }
        
        System.out.println(" ");
        System.out.println("Cantidad de Polideportivos Techados: "+canttechados);
        System.out.println("Cantidad de Polideportivos Abiertos: "+cantabiertos);
        
    }
    
}
