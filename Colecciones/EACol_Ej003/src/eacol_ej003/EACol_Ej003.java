/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eacol_ej003;

import Servicio.AlumnoService;

/**
 *
 * @author franciscovillafuerte
 */
public class EACol_Ej003 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // MAIN
        
        AlumnoService servA = new AlumnoService();
        
        servA.bucleAlumno();
        
        servA.notaFinal();
        
    }
    
}
