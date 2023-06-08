/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author franciscovillafuerte
 */
public class Barco {
    
    // Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
    
    protected String matricula;
    protected double eslora; // en metros
    protected int aniofab;

    public Barco(String matricula, double eslora, int aniofab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.aniofab = aniofab;
    }

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAniofab() {
        return aniofab;
    }

    public void setAniofab(int aniofab) {
        this.aniofab = aniofab;
    }
    
    
    // generar una matrícula de manera aleatoria
    
    Random random = new Random();
    
    public String generarMatriculas() {
        
        String[] matriculas = {"7-SE-2-5-10", "1-AT-5-67-98", "3-VA-4-808-11", "6-ST-2-144-16", "9-BA-1-1-14"};
        return matriculas[random.nextInt(matriculas.length)];
    }
    
    // crear un Barco con valores aleatorios
    
    public Barco crearBarco() {
        
        Barco barco1 = new Barco();
        
        barco1.setMatricula(generarMatriculas());
        
        barco1.setEslora(5 + random.nextInt(20));
        
        barco1.setAniofab(1995 + random.nextInt(25));
        
        return barco1;
    }
    
    /*
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de alquiler y devolución),
    por un valor módulo de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
    */
    
    public double calculoModulo() {
       return (10 * eslora);
    }
    
}
