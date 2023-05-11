/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author franciscovillafuerte
 */

/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
constructor vacío, constructor parametrizado, get y set.
*/
public class Persona {
    
    private String nombre;
    
    private Date fechanac;

    public Persona() {
    }

    public Persona(String nombre, Date fechanac) {
        this.nombre = nombre;
        this.fechanac = fechanac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechanac=" + fechanac + '}';
    }
    
    
}
