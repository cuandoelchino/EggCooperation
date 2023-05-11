/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ej012;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_Ej012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaService servicioP = new PersonaService();
        
        Persona persona1 = servicioP.crearPersona();
        
        servicioP.mostrarPersona(persona1);
      
        // servicioP.calcularEdad(persona1);
        
        servicioP.menorQue(persona1);
        
    }
    
}
