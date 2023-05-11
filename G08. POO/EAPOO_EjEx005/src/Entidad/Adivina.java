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
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una
variable mesSecreto de tipo String, y hazla igual a un elemento del array
(por ejemplo, mesSecreto = mes[9].
*/
public class Adivina {
    
    private String[] mes ={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = mes[7]; // "agosto"

    public Adivina() {
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    
}
