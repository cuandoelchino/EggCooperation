/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;



/**
 *
 * @author franciscovillafuerte
 */
public class Velero extends Barco {
    
    private int numeromastiles;

    public Velero(int numeromastiles, String matricula, double eslora, int aniofab) {
        super(matricula, eslora, aniofab);
        this.numeromastiles = numeromastiles;
    }

    public Velero() {
    }

    public int getNumeromastiles() {
        return numeromastiles;
    }

    public void setNumeromastiles(int numeromastiles) {
        this.numeromastiles = numeromastiles;
    }
    
    
    public Velero crearVelero() {
        
        Barco barco1 = crearBarco();
        
        int mastiles = random.nextInt(5)+1;
        
        return new Velero(mastiles, barco1.getMatricula(), barco1.getEslora(), barco1.getAniofab());
       
    }
    
    /*
    En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y sumándole el atributo
    particular de cada barco. En los veleros se suma el número de mástiles, en los barcos a motor se le suma la potencia
    en CV y en los yates se suma la potencia en CV y el número de camarotes.
    */
    
    @Override
    public double calculoModulo() {
      return (super.calculoModulo() +numeromastiles);
    }
    
}
