/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */

/*
Realizar un programa en Java donde se creen dos arreglos:
el primero será un arreglo A de 50 números reales,
y el segundo B, un arreglo de 20 números, también reales. 
*/

public class Arreglos {
    
    private double[] arregloA = new double[50];
    private double[] arregloB = new double[20];

    public Arreglos() {
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }
    
}
