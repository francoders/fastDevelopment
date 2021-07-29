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
    
    private int rutTrabajador;
    private String nombreTrabajador;
    private String passwordTrabajador;

    public int getRutTrabajador() {
        return rutTrabajador;
    }

    public void setRutTrabajador(int rutTrabajador) {
        this.rutTrabajador = rutTrabajador;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getPasswordTrabajador() {
        return passwordTrabajador;
    }

    public void setPasswordTrabajador(String passwordTrabajador) {
        this.passwordTrabajador = passwordTrabajador;
    }
    
    
}
