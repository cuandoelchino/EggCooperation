/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


/**
 *
 * @author franciscovillafuerte
 */
public class BarcoAMotor extends Barco {
    
    protected int potencia; // en CV

    public BarcoAMotor(int potencia, String matricula, double eslora, int aniofab) {
        super(matricula, eslora, aniofab);
        this.potencia = potencia;
    }

    public BarcoAMotor() {
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


    public BarcoAMotor crearBMotor() {
        
        Barco barco1 = crearBarco();
        
        int potenciaCV = random.nextInt(5000)+ 500;
        
        return new BarcoAMotor(potenciaCV, barco1.getMatricula(), barco1.getEslora(), barco1.getAniofab());
       
    }
    
    @Override
    public double calculoModulo() {
        return (super.calculoModulo() + potencia);
    }
    
}
