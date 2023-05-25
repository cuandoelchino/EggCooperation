/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author franciscovillafuerte
 */
public class Voto {
    
    /*
    Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
    un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
    */
    
    private Alumno votante;
    private ArrayList<Alumno> votos;

    public Voto() {
        this.votos = new ArrayList();
    }

    public Voto(Alumno votante, ArrayList<Alumno> votos) {
        this.votante = votante;
        this.votos = votos;
    }

    public Alumno getVotante() {
        return votante;
    }

    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public ArrayList<Alumno> getVotos() {
        return votos;
    }

    public void setVotos(ArrayList<Alumno> votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return votante + ", VOTOS=" + votos ;
    }
    
    
    
}
