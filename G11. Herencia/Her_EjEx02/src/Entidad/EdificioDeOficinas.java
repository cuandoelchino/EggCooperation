/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */
public class EdificioDeOficinas extends Edificio {

    protected int numofi; // número de oficinas
    protected int cantp; // cantidad de personas por oficina
    protected int numpisos; // número de pisos

    public EdificioDeOficinas(int numofi, int cantp, int numpisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numofi = numofi;
        this.cantp = cantp;
        this.numpisos = numpisos;
    }

    public EdificioDeOficinas() {
    }

    public int getNumofi() {
        return numofi;
    }

    public void setNumofi(int numofi) {
        this.numofi = numofi;
    }

    public int getCantp() {
        return cantp;
    }

    public void setCantp(int cantp) {
        this.cantp = cantp;
    }

    public int getNumpisos() {
        return numpisos;
    }

    public void setNumpisos(int numpisos) {
        this.numpisos = numpisos;
    }
    
    

    @Override
    public void calcularSuperficie() {
        double superficie = largo * ancho;
       
        System.out.println("La superficie del Edificio de Oficinas es: "+superficie);
    }

    @Override
    public void calcularVolumen() {
        double vol = largo * ancho * alto;
        System.out.println("El volumen del Edificio de Oficinas es: "+vol);
    }

    /*
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio,
    el usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número
    de piso (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(),
    que muestre cuantas personas entrarían en un piso y cuantas en todo el edificio.
    */
    
    public void cantPersonas() {
        
       int persxpiso = cantp*numofi;
       int persxedif = persxpiso * numpisos;
       
       System.out.println("Número de personas por piso: "+persxpiso);
       System.out.println("Número de personas en todo el edificio: "+persxedif);       
              
    }
    
    public EdificioDeOficinas crearEO() {
        
        EdificioDeOficinas eo = new EdificioDeOficinas();
        
        System.out.println("Ingrese el número de oficinas por piso:");
        eo.setNumofi(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de personas por oficina:");
        eo.setCantp(leer.nextInt());
        
        System.out.println("Ingrese el número de pisos del Edificio de Oficinas:");
        eo.setNumpisos(leer.nextInt());
        
        System.out.println("Ingrese el ancho del Edificio de Oficinas:");
        eo.setAncho(leer.nextDouble());
    
        System.out.println("Ingrese la altura del Edificio de Oficinas:");
        eo.setAlto(leer.nextDouble());
    
        System.out.println("Ingrese el largo del Edificio de Oficinas:");
        eo.setLargo(leer.nextDouble());
        
        return eo;
    }
    
}
