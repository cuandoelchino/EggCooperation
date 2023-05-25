/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */
public class Alumno {
    
    private String nombrecompleto; 
    private int DNI;
    private Integer cantvotos;

    public Alumno() {
    }

    public Alumno(String nombrecompleto, int DNI, Integer cantvotos) {
        this.nombrecompleto = nombrecompleto;
        this.DNI = DNI;
        this.cantvotos = cantvotos;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Integer getCantvotos() {
        return cantvotos;
    }

    public void setCantvotos(Integer cantvotos) {
        this.cantvotos = cantvotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombrecompleto + ", DNI=" + DNI + ", cantvotos=" + cantvotos + '}';
    }
    
}
