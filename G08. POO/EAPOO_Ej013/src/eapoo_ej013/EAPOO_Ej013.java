/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ej013;

import Entidad.Curso;
import Servicio.CursoServicio;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_Ej013 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        CursoServicio serv = new CursoServicio();
        
        Curso curso1 = serv.crearCurso();
        
        serv.calcularGanaciaSemanal(curso1);
        
    }
    
}
