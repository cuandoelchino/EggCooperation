/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */
public class Pelicula {
    
    /*
    Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
    tendremos una clase Pelicula con el título, director y duración de la película (en horas).
    Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
    que se pide a continuación:
    */
    
    private String Titulo,Director;
    private Double duracion; // duracion de la pelicula (en horas)

    public Pelicula() {
    }

    public Pelicula(String Titulo, String Director, Double duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Título=" + Titulo + ", Director=" + Director + ", Duración=" + duracion + '}';
    }
    
    
}
