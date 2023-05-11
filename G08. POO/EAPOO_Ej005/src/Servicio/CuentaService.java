/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class CuentaService {
    
     Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta() {
        
        Cuenta c1 = new Cuenta();
        
        System.out.println("Ingrese el DNI del titular de la cuenta:");
        c1.setDni(leer.nextLong());
        
        System.out.println("Ingrese el número de cuenta:");
        c1.setNcuenta(leer.nextInt());
        
        //System.out.println("Ingrese su saldo actual:");
        c1.setSaldoactual(0);
        
        System.out.println("Cuenta creada con éxito.");
        
        return c1;
    }

    public Cuenta ingresar (Cuenta c1) {
        double ingreso;
        System.out.println("Ingrese la cantidad de dinero que desea depositar:");
        ingreso = leer.nextDouble();
        
        c1.setSaldoactual(c1.getSaldoactual() + ingreso);
        
        System.out.println("Depósito realizado con éxito.");
        
        return c1;
    }
    
    public Cuenta retirar (Cuenta c1) {
        double retiro;
        System.out.println("Ingrese el monto que desea retirar:");
        retiro = leer.nextDouble();
        if (c1.getSaldoactual() < retiro) {
            System.out.println("El monto que desea retirar es mayor al saldo actual.");
            c1.setSaldoactual(0);
        } else {
            c1.setSaldoactual(c1.getSaldoactual()-retiro);
            System.out.println("Retiro realizado con éxito.");
        }
        return c1;
    }
    
    public Cuenta extraccionRapida (Cuenta c1) {
        double veint = c1.getSaldoactual()*0.2;
        System.out.println("Ingrese el monto que desea retirar:");
        System.out.println("No puede exceder el 20% de su saldo actual: $"+veint);
        double retiro = leer.nextDouble();
        
        if ( retiro > veint) {
            System.out.println("El monto que desea retirar excede el 20% de su saldo actual.");
        } else {
            c1.setSaldoactual(c1.getSaldoactual()-retiro);
            System.out.println("Extracción Rápida realizada con éxito.");
        }
        
        return c1;
        
    }
   
    public void consultarSaldo(Cuenta c1){
        
        double sald = c1.getSaldoactual();
        System.out.println("Su saldo disponible es: "+sald);
        
    }
    
    public void consultarDatos(Cuenta c1) {
        
        System.out.println(c1.toString());
      
    }
    
}
