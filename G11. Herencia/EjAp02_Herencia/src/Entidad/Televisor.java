/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */
public class Televisor extends Electrodomestico {
    
    private double pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean tdt, double precio, String color, char consumoenergetico, double peso) {
        super(precio, color, consumoenergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    public Televisor crearTelevisor() {
        
        System.out.println("Diseñe su Televisor:");
        System.out.println("------------------------------------------------------");
        Electrodomestico ele = crearElectrodomestico();
        
        double p = ele.getPrecio();
        
        String col = ele.getColor();
        
        char ce = ele.getConsumoenergetico();
        
        double pes = ele.getPeso();
        
        double res;
        
        do {
        
            System.out.println("Ingrese la resolución (en pulgadas) del televisor:");
            res = leer.nextDouble();
        
            if (res<=0) {
                System.out.println("Valor de Pulgadas NO Válido.");
            }
        
        } while (res<=0);
        
        int x = 0;
        boolean tiene = false;
        
        do {
        
        System.out.println("¿El televisor tiene un sintonizador TDT? (S/N)");
        String rpta = leer.next().toUpperCase();
        
        if (rpta.equals("S")) {
            tiene = true;
            x = 1;
        } else if (rpta.equals("N")) {
            tiene = false;
            x = 1;
        }
        
            if (x == 0) {
                System.out.println("Respuesta NO Válida.");
            }
        
        } while (x == 0);
        
        Televisor tele = new Televisor(res, tiene, p, col, ce, pes);
        
        return tele;
        
    }
    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad.
    Si el televisor tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30%
    y si tiene un sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que
    hemos visto en la clase Electrodomestico también deben afectar al precio.
    */
    
    @Override
    public double precioFinal() {
        
        super.precioFinal();
        
        if (this.pulgadas>40) {
            
            precio = precio * 1.3;
            
        }
        
        if (this.tdt) {
            
            precio = precio + 500;
            
        }
        
        System.out.println("El precio final del televisor es: "+precio);
        
        return precio;
        
    }
    
}
