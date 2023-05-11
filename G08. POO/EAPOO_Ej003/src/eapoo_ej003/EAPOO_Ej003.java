/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ej003;

import Entidad.Operacion;
import Servicio.OperacionService;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_Ej003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperacionService servOp = new OperacionService();
        
        Operacion op1 = servOp.crearOperacion();
        
        int suma = servOp.sumar(op1);
        int resta = servOp.restar(op1);
        int mult = servOp.multiplicar(op1);
        double div = servOp.dividir(op1);
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La división es: "+div);
        
        
    }
    
}
