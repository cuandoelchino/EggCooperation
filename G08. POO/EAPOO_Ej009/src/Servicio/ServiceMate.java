/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Mate;

/**
 *
 * @author franciscovillafuerte
 */
public class ServiceMate {
    
    public Mate generarNumeros() {
        
        Mate operaciones = new Mate();
        
        operaciones.setNum1(Math.random() * 10);
        operaciones.setNum2(Math.random() * 10);
        
        return operaciones;
    }
    
    // a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    
    public void devolverMayor(Mate operaciones) {
        
        if ( operaciones.getNum1() > operaciones.getNum2() ) {
            
            System.out.println("El primer num es mayor.");
            
        } else if ( operaciones.getNum1() < operaciones.getNum2() ) {
            
            System.out.println("El segundo num es mayor.");
            
        } else {
            
            System.out.println("Los dos números son iguales.");
            
        }
        
    }
   
    /*
    Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
    */
    
    public double calcularPotencia(Mate operaciones) {
        
        double potencia;
        
        long num1 = Math.round(operaciones.getNum1());
        long num2 = Math.round(operaciones.getNum2());
        
         if ( num1 >= num2 ) {
            
            potencia = Math.pow(num1, num2);
            
            System.out.println("La potencia de "+num1+" elevado a "+num2+" = "+potencia);
            
        } else {
            
            potencia = Math.pow(num2, num1);
            
            System.out.println("La potencia de "+num2+" elevado a "+num1+" = "+potencia);
            
        } 
        
        return potencia;
        
    }
    
    /*
    Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    
    public double calculaRaiz(Mate operaciones) {
        
        double raiz;
        
        raiz = Math.sqrt(Math.abs(Math.min(operaciones.getNum1(), operaciones.getNum2())));
        
        System.out.println("La raíz cuadrada del valor absoluto de "+
                            Math.min(operaciones.getNum1(), operaciones.getNum2())+ " es: "+raiz);
        
        return raiz;
        
    }
    
    public void imprimirNumeros(Mate operaciones) {
        
        System.out.println(operaciones.toString());
        
    }
    
}
