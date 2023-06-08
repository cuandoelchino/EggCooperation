/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alquiler;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class AlquilerService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Random r = new Random();
    
    public Alquiler crearAlquiler() {
        
        System.out.println("Sistema de Alquiler de Amarres de Barcos");
        
        Alquiler newalquiler = new Alquiler();
        
        System.out.println("Ingrese su nombre:");
        newalquiler.setNombre(leer.next());
        
        System.out.println("Ingrese su DNI:");
        newalquiler.setDocumento(leer.nextInt());
        
        System.out.println("Ingrese la fecha de alquiler: (DD/MM/AAAA)");
        newalquiler.setFechaalquiler(leer.next());
        
        System.out.println("Ingrese la fecha de devolución: (DD/MM/AAAA)");
        newalquiler.setFecharetorno(leer.next());
        
        newalquiler.setPosicionamarre(1+r.nextInt(20));
        
        return newalquiler;
   
    }
    
    public void imprimirInformacion(Alquiler a) {
        System.out.println("-------------------------------------------------------");
        System.out.println("Información de la Reserva:");
        
        System.out.println("Nombre="+a.getNombre());
        System.out.println("Documento="+a.getDocumento());
        System.out.println("Fecha de Alquiler="+a.getFechaalquiler());
        System.out.println("Fecha de Devolución="+a.getFecharetorno());
        System.out.println("Posición del Amarre="+a.getPosicionamarre());
        System.out.println("-------------------------------------------------------");
        
    }
    
    
    public void calculoAlquiler(Alquiler a) {
        double montoalq = CalculadoraDias(a.getFechaalquiler(), a.getFecharetorno()) * a.getTipobarco().calculoModulo();
        
        System.out.println("Precio Final del Alquiler: "+montoalq);
    }
    
    
    public long CalculadoraDias(String fecha1, String fecha2) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate f1 = LocalDate.parse(fecha1, formatter);
        
        LocalDate f2 = LocalDate.parse(fecha2, formatter);
        
        long dias = ChronoUnit.DAYS.between(f1, f2);
        
        return dias;
    }
    
}
