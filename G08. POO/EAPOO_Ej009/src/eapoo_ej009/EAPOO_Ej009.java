/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ej009;

import Entidad.Mate;
import Servicio.ServiceMate;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_Ej009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServiceMate servM = new ServiceMate();
        
        Mate operaciones = servM.generarNumeros();
        
        servM.imprimirNumeros(operaciones);
        
        servM.devolverMayor(operaciones);
        
        servM.calcularPotencia(operaciones);
        
        servM.calculaRaiz(operaciones);
        
    }
    
}
