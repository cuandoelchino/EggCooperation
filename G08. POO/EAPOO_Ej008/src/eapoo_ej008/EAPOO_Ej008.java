/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ej008;

import Entidad.Cadena;
import Servicio.CadenaService;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_Ej008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CadenaService servCad = new CadenaService();
                
        Cadena c1 = servCad.crearFrase();        
        
        
        // servCad.mostrarVocales(c1);
        
        // servCad.invertirFrase(c1);
        
        
        
        // otro método para revertir:
        
        // StringBuilder stringbuilder = new StringBuilder(c1.getFrase());
        
        // String vuelta = stringbuilder.reverse().toString();
        
        // System.out.println(vuelta);
        
    
       
        // servCad.vecesRepetido(c1);
      
        // servCad.compararLongitud(c1);
      
        // servCad.unirFrases(c1);
      
        // servCad.reemplazar(c1);
        
        System.out.println(servCad.contiene(c1));
        
    }
    
}
