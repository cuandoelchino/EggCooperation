/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ej014;

import Entidad.Movil;
import Servicio.MovilService;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_Ej014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MovilService servicio = new MovilService();
        
        Movil celular = servicio.cargarCelular();
        
        servicio.imprimirDatos(celular);
        
        servicio.mostrarCodigo(celular.getCodigo());
        
    }
    
}
