/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Scanner;
import Entidad.Circunferencia;

/**
 *
 * @author franciscovillafuerte
 */
public class CircunferenciaService {
    
    public Circunferencia crearCircunferencia() {
        
        Scanner leer = new Scanner(System.in);
        
        Circunferencia circ1 = new Circunferencia();
        
        System.out.println("Ingrese el radio de la circunferencia:");
        circ1.setRadio(leer.nextDouble());
        
        return circ1;
    }
    
    public double area(Circunferencia circ1) {
        // (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐)
        double area = Math.PI * (circ1.getRadio())*(circ1.getRadio()) ;
        
       
       return area; 
    }
    
    public double perimetro(Circunferencia circ1) {
        //(𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨)
        
        double perim = 2* Math.PI * circ1.getRadio();
        
        return perim;
    }
    
    
}
