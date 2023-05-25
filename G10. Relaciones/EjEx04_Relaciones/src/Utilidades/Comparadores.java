/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author franciscovillafuerte
 */
public class Comparadores {
    
    public static Comparator<Alumno> ordenarVotosDesc = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            
            return o2.getCantvotos().compareTo(o1.getCantvotos());
        }
    };
    
}
