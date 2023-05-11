/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Scanner;
import Entidad.Operacion;

/**
 *
 * @author franciscovillafuerte
 */
public class OperacionService {
    
  public Operacion crearOperacion() {
      
      Scanner leer = new Scanner(System.in);
      
      Operacion op1 = new Operacion();
      
      System.out.println("Ingresa el número 1:");
      op1.setNum1(leer.nextInt());
      
      System.out.println("Ingresa el número 2:");
      op1.setNum2(leer.nextInt());
      
      return op1;
  }
    
  public int sumar(Operacion op1) {
      int suma = op1.getNum1() + op1.getNum2();
      
      return suma;
      
  }
  
  public int restar(Operacion op1) {
      int resta = op1.getNum1() - op1.getNum2();
      
      return resta;        
  }
  
  public int multiplicar(Operacion op1) {
      if (op1.getNum1() == 0 || op1.getNum2() == 0) {
          System.out.println("Error. Uno de los números es cero.");
          
          return 0;
          
      } else {
          int mult = op1.getNum1() * op1.getNum2();
          
          return mult;
      }
      
  }
  
  public double dividir(Operacion op1) {
      
      if (op1.getNum2() == 0 || op1.getNum2() == 0) {
          System.out.println("Error. Se trató de hacer una división por cero.");
          return 0;
      } else {
          
          double div = (double) op1.getNum1() / op1.getNum2();
          
          return div;
      }
  }
  
}
