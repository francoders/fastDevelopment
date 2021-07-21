/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaDevelopment.modelo;

/**
 *
 * @author Corvalan
 */
public class Distribuidor {
    
    private int rutDistribuidor;
    private String nombreEmpresa;
    private String direccion;
    private int telefono;
    private int anioVenta;

    public int getRutDistribuidor() {
        return rutDistribuidor;
    }

    public void setRutDistribuidor(int rutDistribuidor) {
        this.rutDistribuidor = rutDistribuidor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getAnioVenta() {
        return anioVenta;
    }

    public void setAnioVenta(int anioVenta) {
        this.anioVenta = anioVenta;
    }
    
    
    
}
