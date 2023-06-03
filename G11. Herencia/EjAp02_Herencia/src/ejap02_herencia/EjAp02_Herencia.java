/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejap02_herencia;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author franciscovillafuerte
 */
public class EjAp02_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 2
        
        // Lavadora lava = new Lavadora();
        
        // lava = lava.crearLavadora();
        
        // lava.precioFinal();
        
        // System.out.println(" ");
        
        // Televisor tv = new Televisor();
        
        // tv = tv.crearTelevisor();
        
        // tv.precioFinal();
        
        // EJERCICIO 3
        
        /*
        Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
        para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
        Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
        deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
        televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
        precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor
        de 5000, el resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para lavadora y
        5000 para televisor.
        */
        
        ArrayList<Electrodomestico> listae = new  ArrayList();
        
        Electrodomestico tv1 = new Televisor(40, true, 1000, "azul", 'B', 30);
        Electrodomestico tv2 = new Televisor(55, false, 1000, "negro", 'E', 60);
        Electrodomestico lava1 = new Lavadora(28, 1000, "gris", 'A', 17);
        Electrodomestico lava2 = new Lavadora(42, 1000, "blanco", 'B', 48);
        
        listae.add(tv1);
        listae.add(tv2);
        listae.add(lava1);
        listae.add(lava2);
        
        double sumaprecios = 0;
        double sumalava = 0;
        double sumatv = 0;
        
        for (Electrodomestico ele : listae) {
      
            sumaprecios += ele.precioFinal();
            
            if (ele instanceof Lavadora) {
                
                sumalava += ele.getPrecio();
                
            } else {
                
                sumatv += ele.getPrecio();
                    
            }
            
        }
        
        System.out.println("La suma del precio de todos los electrodomésticos es: "+sumaprecios);
        
        System.out.println("La suma del precio de todas las lavadoras es: "+sumalava);
        
        System.out.println("La suma del precio de todos los televisores es: "+sumatv);
        
    }
    
}
