/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ej005;

import Entidad.Cuenta;
import Servicio.CuentaService;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_Ej005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO el código main va aquí
        
        Scanner leer = new Scanner(System.in);
        
        CuentaService servCuenta = new CuentaService();
        
        Cuenta c1 = servCuenta.crearCuenta();
        
              int opcion;      
        
          do {
            System.out.println("\n---------------------");
            System.out.println("MENU BANCARIO");
            System.out.println("1 - Ingresar dinero"); 
            System.out.println("2 - Retirar dinero"); 
            System.out.println("3 - Extraccion rapida"); 
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Consultar datos");
            System.out.println("6 - SALIR"); 
            System.out.println("---------------------"); 
            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    servCuenta.ingresar(c1);
                    break;
                case 2:
                    servCuenta.retirar(c1);
                    break;
                case 3:
                    servCuenta.extraccionRapida(c1);
                    break;
                case 4:
                    servCuenta.consultarSaldo(c1);
                    break;
                case 5:
                    servCuenta.consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Saliendo . . . .");
                    break;
                default:
                    System.out.println("Error al elegir una opcion. Intente nuevamente.");
                    
            }
        } while (opcion != 6);
    }
        
        
        
        
        
    }
    
