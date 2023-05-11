/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franciscovillafuerte
 */
public class Libro {
    private String Autor,Titulo;
    private int nrodepaginas;

    public Libro() {
    }

    public Libro(String Autor, String Titulo, int nrodepaginas) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.nrodepaginas = nrodepaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getNrodepaginas() {
        return nrodepaginas;
    }

    public void setNrodepaginas(int nrodepaginas) {
        this.nrodepaginas = nrodepaginas;
    }

}
