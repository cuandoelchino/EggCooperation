/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eapoo_ejex001;

import Entidad.Cancion;
import Servicio.CancionService;

/**
 *
 * @author franciscovillafuerte
 */
public class EAPOO_EjEx001 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Desarrollar una clase Cancion con los siguientes atributos: titulo y autor.
    Se deberá́ definir además dos constructores: uno vacío que inicializa el titulo
    y el autor a cadenas vacías y otro que reciba como parámetros el titulo y el
    autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CancionService serv = new CancionService();
        
        Cancion cancion1 = serv.crearCancion();
        
        serv.mostrarDatos(cancion1);
        
    }
    
}
