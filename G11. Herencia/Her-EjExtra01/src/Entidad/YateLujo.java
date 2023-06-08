/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


/**
 *
 * @author franciscovillafuerte
 */
public class YateLujo extends BarcoAMotor {
    
    private int nrocamarotes;

    public YateLujo(int nrocamarotes, int potencia, String matricula, double eslora, int aniofab) {
        super(potencia, matricula, eslora, aniofab);
        this.nrocamarotes = nrocamarotes;
    }

    public YateLujo() {
    }

    public int getNrocamarotes() {
        return nrocamarotes;
    }

    public void setNrocamarotes(int nrocamarotes) {
        this.nrocamarotes = nrocamarotes;
    }


    public YateLujo crearYate() {
        
        BarcoAMotor barco1 = crearBMotor();
        
        int ncamarotes = 1 + random.nextInt(5);
        
        return new YateLujo(ncamarotes, barco1.getPotencia(), barco1.getMatricula(), barco1.getEslora(), barco1.getAniofab());
        
    }
    
    @Override
    public double calculoModulo() {
        return (super.calculoModulo() + nrocamarotes);
    }
    
}
