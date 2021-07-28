/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.modelo;

/**
 * Clase Editorial: respresenta la editorial en la base datos, consta de su nombre 
 * de editorial y su id para poder ser identificado.
 * @author Cristobal Cortés
 * @since 19/06/2020
 * @version 1.0
 * 
 */
public class Editorial {
    private String nombreEditorial;
    private int idEditorial;

    /**
     * Constructor completo de la clase.
     */
    public Editorial() {
        this.nombreEditorial = nombreEditorial;
        this.idEditorial = idEditorial;
    }
    
    /**
     * 
     * @return valor del atributo nombreEditorial 
     */
    public String getNombreEditorial() {
        return nombreEditorial;
    }

    /**
     * 
     * @param nombreEditorial define el nombre de la editorial
     */
    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    /**
     * 
     * @return el valor del atributo idEditorial
     */
    public int getIdEditorial() {
        return idEditorial;
    }

    /**
     * 
     * @param idEditorial define el valor de el id de la editorial
     */
    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

}
