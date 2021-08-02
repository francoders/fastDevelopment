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
public class Cliente {

    private int idCliente;
    private String rutCliente;
    private String apePaternoCliente;
    private String apeMaternoCliente;
    private String direccionCliente;
    private int telefonoCliente;
    private String correoCliente;
    private String fechaNacimientoCliente;
    private String nombreCliente;

    /**
     * Constructor completo de la clase.
     */
    public Cliente() {
        this.rutCliente = rutCliente;
        this.apePaternoCliente = apePaternoCliente;
        this.apeMaternoCliente = apeMaternoCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
        this.fechaNacimientoCliente = fechaNacimientoCliente;
        this.nombreCliente = nombreCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getApePaternoCliente() {
        return apePaternoCliente;
    }

    public void setApePaternoCliente(String apePaternoCliente) {
        this.apePaternoCliente = apePaternoCliente;
    }

    public String getApeMaternoCliente() {
        return apeMaternoCliente;
    }

    public void setApeMaternoCliente(String apeMaternoCliente) {
        this.apeMaternoCliente = apeMaternoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getFechaNacimientoCliente() {
        return fechaNacimientoCliente;
    }

    public void setFechaNacimientoCliente(String fechaNacimientoCliente) {
        this.fechaNacimientoCliente = fechaNacimientoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    
}
