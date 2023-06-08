/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package her.ejextra01;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoAMotor;
import Entidad.Velero;
import Entidad.YateLujo;
import Servicio.AlquilerService;
import java.util.Scanner;

/**
 *
 * @author franciscovillafuerte
 */
public class HerEjExtra01 {

    /**
     * @param args the command line arguments
     */
    
    /*
    En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el nombre,
    documento del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de alquiler y devolución),
    por un valor módulo de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y sumándole el atributo
    particular de cada barco. En los veleros se suma el número de mástiles, en los barcos a motor se le suma la potencia
    en CV y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los métodos necesarios que permitan
    al usuario elegir el barco que quiera alquilar y mostrarle el precio final de su alquiler.
    */
    
    public static void main(String[] args) {
        // MAIN
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        AlquilerService servicio = new AlquilerService();
        
        Alquiler alq = servicio.crearAlquiler();
        
        System.out.println("Para esas fechas tenemos disponible los siguientes tipos de Barco:");
        System.out.println("1. Barco Standard");
        System.out.println("2. Velero");
        System.out.println("3. Barco a Motor");
        System.out.println("4. Yate de Lujo");
        
        int op = 0;
        
        do {
        
        System.out.println("Ingrese el número del tipo de barco que desea alquilar:");
        op = leer.nextInt();
        
        switch (op) {
            case 1:
                Barco barco1 = new Barco();
                barco1 = barco1.crearBarco();
                alq.setTipobarco(barco1);
                servicio.imprimirInformacion(alq);
                
                System.out.println("Tipo de Barco: Barco Standard");
                System.out.println("Matrícula="+barco1.getMatricula());
                System.out.println("Eslora="+barco1.getEslora());
                System.out.println("Año de Fabricación="+barco1.getAniofab());
                
                break;
            case 2:
                Velero velero1 = new Velero();
                velero1 = velero1.crearVelero();
                alq.setTipobarco(velero1);
                servicio.imprimirInformacion(alq);
                
                System.out.println("Tipo de Barco: Velero");
                System.out.println("Matrícula="+velero1.getMatricula());
                System.out.println("Eslora="+velero1.getEslora());
                System.out.println("Año de Fabricación="+velero1.getAniofab());
                System.out.println("Número de Mástiles="+velero1.getNumeromastiles());
                
                break;
            case 3:
                BarcoAMotor bm1 = new BarcoAMotor();
                bm1 = bm1.crearBMotor();
                alq.setTipobarco(bm1);
                servicio.imprimirInformacion(alq);
                
                System.out.println("Tipo de Barco: Barco a Motor");
                System.out.println("Matrícula="+bm1.getMatricula());
                System.out.println("Eslora="+bm1.getEslora());
                System.out.println("Año de Fabricación="+bm1.getAniofab());
                System.out.println("CV="+bm1.getPotencia());
                
                break;
            case 4:
                YateLujo yate1 = new YateLujo();
                yate1 = yate1.crearYate();
                alq.setTipobarco(yate1);
                servicio.imprimirInformacion(alq);
                
                System.out.println("Tipo de Barco: Yate de Lujo");
                System.out.println("Matrícula="+yate1.getMatricula());
                System.out.println("Eslora="+yate1.getEslora());
                System.out.println("Año de Fabricación="+yate1.getAniofab());
                System.out.println("CV="+yate1.getPotencia());
                System.out.println("Número de Camarotes="+yate1.getNrocamarotes());
                
                break;
            default:
                System.out.println("Opción NO Válida.");
        }
        
        } while (op > 4 || op < 1);
        
        servicio.calculoAlquiler(alq);
        
    }
    
}
