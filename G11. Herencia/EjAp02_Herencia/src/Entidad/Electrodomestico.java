/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class Electrodomestico {
    
    // Electrodoméstico con los siguientes atributos: precio, color, consumo energético (letras entre A y F) y peso.
    
    protected double precio;
    protected String color;
    protected char consumoenergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoenergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoenergetico = consumoenergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoenergetico() {
        return consumoenergetico;
    }

    public void setConsumoenergetico(char consumoenergetico) {
        this.consumoenergetico = consumoenergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
   /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible.
    */
    
    public char comprobarConsumoEnergetico(char letra) {
        
        String let = String.valueOf(letra);
        
        if (let.equalsIgnoreCase("a") || let.equalsIgnoreCase("b") ||
            let.equalsIgnoreCase("c") || let.equalsIgnoreCase("d") || 
            let.equalsIgnoreCase("e")) {
            
            
            
        } else {
            
            letra = 'F';
            
        }
        
        return letra;
        
    }
    
    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco,
    negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método
    se invocará al crear el objeto y no será visible.
    */
    
    public String comprobarColor(String color) {
        
        if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") ||
            color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            
            
            
        } else {
            
            color = "blanco";
            
        }
        
        return color;
         
    }
    
    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el electrodoméstico,
    también llama los métodos para comprobar el color y el consumo. Al precio se le da un valor base de $1000.
    */
    
    Scanner leer = new Scanner(System.in);
    
    public Electrodomestico crearElectrodomestico() {
       
        System.out.println("Ingrese el color del electrodoméstico:");
        String col = leer.nextLine();
        
        col = comprobarColor(col);
        
        System.out.println("Ingrese el consumo energético del eletrodoméstico:");
        
        char cons = leer.nextLine().charAt(0);
        
        cons = comprobarConsumoEnergetico(cons);
        
        double p;
        
        do {
        
        System.out.println("Ingrese el peso del electrodoméstico:");
        
        p = leer.nextDouble();
        
            if (p<=0) {
                System.out.println("Valor de Peso NO Válido.");
            }
        
        } while (p<=0);
        
        Electrodomestico elect = new Electrodomestico(1000, col, cons, p);
        
        return elect;
    }
    
    public double precioFinal() {
        
        String var = String.valueOf(consumoenergetico).toUpperCase();
        
        switch (var) {
            case "A":
                precio = precio + 1000;
                break;
            case "B":
                precio = precio + 800;
                break;
            case "C":
                precio = precio + 600;
                break;
            case "D":
                precio = precio + 500;
                break;
            case "E":
                precio = precio + 300;
                break;
            case "F":
                precio = precio + 100;
                break;
        }
        
        if (peso>=1 && peso <=19) {
            
            precio = precio + 100;
            
        } else if (peso>=20 && peso <=49) {
            
            precio = precio + 500;
            
        } else if (peso>=50 && peso <=79) {
            
            precio = precio + 800;
            
        } else if (peso>=80) {
            
            precio = precio + 1000;
            
        }
        
        return precio;
        
    }
    
    
}
