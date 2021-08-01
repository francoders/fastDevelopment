/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.modelo;

/**
 *
 * @author Corvalan
 */
public class Trabajador {
    
    private int idTrabajador;
    private String rutTrabajador;
    private String nombreTrabajador;
    private String apePaternoTr;
    private String apeMaternoTr;
    private String direccionTr;
    private int telefonoTrabajador;
    private String correoTrabajador;
    private String fechaContratoTr;
    
    
    public Trabajador() {
        this.rutTrabajador = rutTrabajador;
        this.nombreTrabajador = nombreTrabajador;
        this.apePaternoTr = apePaternoTr;
        this.apeMaternoTr = apeMaternoTr;
        this.direccionTr = direccionTr;
        this.telefonoTrabajador = telefonoTrabajador;
        this.correoTrabajador = correoTrabajador;
        this.fechaContratoTr = fechaContratoTr;   
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getRutTrabajador() {
        return rutTrabajador;
    }

    public void setRutTrabajador(String rutTrabajador) {
        this.rutTrabajador = rutTrabajador;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getApePaternoTr() {
        return apePaternoTr;
    }

    public void setApePaternoTr(String apePaternoTr) {
        this.apePaternoTr = apePaternoTr;
    }

    public String getApeMaternoTr() {
        return apeMaternoTr;
    }

    public void setApeMaternoTr(String apeMaternoTr) {
        this.apeMaternoTr = apeMaternoTr;
    }

    public String getDireccionTr() {
        return direccionTr;
    }

    public void setDireccionTr(String direccionTr) {
        this.direccionTr = direccionTr;
    }

    public int getTelefonoTrabajador() {
        return telefonoTrabajador;
    }

    public void setTelefonoTrabajador(int telefonoTrabajador) {
        this.telefonoTrabajador = telefonoTrabajador;
    }

    public String getCorreoTrabajador() {
        return correoTrabajador;
    }

    public void setCorreoTrabajador(String correoTrabajador) {
        this.correoTrabajador = correoTrabajador;
    }

    public String getFechaContratoTr() {
        return fechaContratoTr;
    }

    public void setFechaContratoTr(String fechaContratoTr) {
        this.fechaContratoTr = fechaContratoTr;
    }

    
    
}
