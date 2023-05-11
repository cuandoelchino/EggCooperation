/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eacol_ej004;

import Servicio.PeliculaService;

/**
 *
 * @author franciscovillafuerte
 */
public class EACol_Ej004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MAIN
        
        PeliculaService servP = new PeliculaService();
        
        servP.buclePeli();
        servP.mostrarPelis();
        servP.mostrarPeliMasUnaHora();
        servP.duracionMayorMenor();
        servP.duracionMenorMayor();
        servP.tituloOrdenado();
        servP.directorOrdenado();
        
    }
    
}
