/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */
public class Lavadora extends Electrodomestico {
    
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoenergetico, double peso) {
        super(precio, color, consumoenergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public Lavadora crearLavadora() {
        System.out.println("Diseñe su Lavadora:");
        System.out.println("------------------------------------------------------");
        Electrodomestico ele = crearElectrodomestico();
        
        double p = ele.getPrecio();
        
        String col = ele.getColor();
        
        char ce = ele.getConsumoenergetico();
        
        double pes = ele.getPeso();
        
        double car;
        
        do {
        
        System.out.println("Ingrese la carga del electrodoméstico");
        car = leer.nextDouble();
        
        if (car<=0) {
                System.out.println("Valor de Carga NO Válido.");
            }
        
        } while (car<=0);
        
        Lavadora lav = new Lavadora(car, p, col, ce, pes);
        
        return lav;
    }
    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad.
    Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual,
    no se incrementará el precio. Este método debe llamar al método padre y añadir el código necesario.
    Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar al precio.
    */
    
    @Override
    public double precioFinal() {
        
        super.precioFinal();
        
        if (this.carga>30) {
            
            precio = precio + 500;
        }
        
        System.out.println("El precio final de la lavadora es: "+precio);
        
        return precio;
        
    }
    
}
