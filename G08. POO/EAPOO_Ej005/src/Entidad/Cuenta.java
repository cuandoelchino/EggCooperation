/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */
public class Cuenta {
    private int ncuenta;
    private long dni;
    private double saldoactual;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int ncuenta, long dni, double saldoactual, double interes) {
        this.ncuenta = ncuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
        this.interes = interes;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "NumeroCuenta=" + ncuenta + ", DNI=" + dni + '}';
    }
    
}
