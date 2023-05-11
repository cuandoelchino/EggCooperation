/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */

/*
la cual deberá contener como atributos, un vector con la palabra a buscar,
la cantidad de letras encontradas y la cantidad jugadas máximas que puede
realizar el usuario. Definir los siguientes métodos con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
*/

public class Ahorcado {
    
    private int cantLetras;
    private String[] palabra;
    private int cantJugadas;
    private String[] nuevapalabra;

    public Ahorcado() {
    }

    public Ahorcado(int cantLetras, String[] palabra, int cantJugadas, String[] nuevapalabra) {
        this.cantLetras = cantLetras;
        this.palabra = palabra;
        this.cantJugadas = cantJugadas;
        this.nuevapalabra = nuevapalabra;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    public String[] getNuevapalabra() {
        return nuevapalabra;
    }

    public void setNuevapalabra(String[] nuevapalabra) {
        this.nuevapalabra = nuevapalabra;
    }
    
    
    
}
