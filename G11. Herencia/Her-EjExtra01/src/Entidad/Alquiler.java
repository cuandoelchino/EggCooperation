/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;



/**
 *
 * @author franciscovillafuerte
 */
public class Alquiler {
    
    /*
    Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler,
    fecha de devolución, la posición del amarre y el barco que lo ocupará.
    */
    
    private String nombre;
    private int documento;
    private String fechaalquiler;
    private String fecharetorno;
    private int posicionamarre;
    private Barco tipobarco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, String fechaalquiler, String fecharetorno, int posicionamarre, Barco tipobarco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaalquiler = fechaalquiler;
        this.fecharetorno = fecharetorno;
        this.posicionamarre = posicionamarre;
        this.tipobarco = tipobarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getFechaalquiler() {
        return fechaalquiler;
    }

    public void setFechaalquiler(String fechaalquiler) {
        this.fechaalquiler = fechaalquiler;
    }

    public String getFecharetorno() {
        return fecharetorno;
    }

    public void setFecharetorno(String fecharetorno) {
        this.fecharetorno = fecharetorno;
    }

    public int getPosicionamarre() {
        return posicionamarre;
    }

    public void setPosicionamarre(int posicionamarre) {
        this.posicionamarre = posicionamarre;
    }

    public Barco getTipobarco() {
        return tipobarco;
    }

    public void setTipobarco(Barco tipobarco) {
        this.tipobarco = tipobarco;
    }
    
}
