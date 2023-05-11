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
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber
tener un constructor vacío, parametrizado y get y set. En el main se creará el
objeto y se usará el Math.random para generar los dos números y se guardaran en
el objeto con su respectivos set. Deberá además implementar los siguientes métodos:
  ver los videos relacionados con este tema, antes de empezar los ejercicios, los
  podrás encontrar en tu aula virtual o en nuestro canal de YouTube.
*/

public class Mate {
    
    private double num1;
    private double num2;

    public Mate() {
    }

    public Mate(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Mate{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
    
}
