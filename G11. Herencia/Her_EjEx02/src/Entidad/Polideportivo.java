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
public class Polideportivo extends Edificio {
    
    protected String nombre;
    protected boolean techado; // tipo de instalación: puede ser Techado (true) o Abierto (false)

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public Polideportivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    
    

    @Override
    public void calcularSuperficie() {
       double superficie = largo * ancho;
       
        System.out.println("La superficie del Polideportivo es: "+superficie);
    }

    @Override
    public void calcularVolumen() {
       double vol = largo * ancho * alto;
        System.out.println("El volumen del Polideportivo es: "+vol);
    }

    
   
public Polideportivo crearPolideportivo() {
    
    Polideportivo poli = new Polideportivo();
    
    System.out.println("Ingrese el nombre del Polideportivo:");
    poli.setNombre(leer.next());
    
    int aviso = 0;
    
    do {
    
    System.out.println("¿El Polideportivo es Techado? (S/N)");
    String r = leer.next();
    
    if (r.equalsIgnoreCase("S")) {
        poli.setTechado(true);
        aviso = 1;
    } else if (r.equalsIgnoreCase("N")) {
        poli.setTechado(false);
        aviso = 1;
    }
    
        if (aviso==0) {
            System.out.println("Respuesta NO Válida.");
        }
    
    } while (aviso == 0);
    
    System.out.println("Ingrese el ancho del Polideportivo:");
    poli.setAncho(leer.nextDouble());
    
    System.out.println("Ingrese la altura del Polideportivo:");
    poli.setAlto(leer.nextDouble());
    
    System.out.println("Ingrese el largo del Polideportivo:");
    poli.setLargo(leer.nextDouble());
    
    return poli;
}
   

    
   
    
    
    
    
}
