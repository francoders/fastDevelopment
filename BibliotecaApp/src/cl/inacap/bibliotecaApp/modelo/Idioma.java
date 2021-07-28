/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.modelo;

/**
 * Clase Idioma: respresenta el idioma en la base datos, consta de un nombre de idioma y un id que lo identifica
 * @author Cristobal Cortés
 * @since 02/06/2020
 * @version 1.0
 * 
 */
public class Idioma {
    private String nombreIdioma;
    private int idIdioma;

    /**
     * 
     * @return el valor del nombre del idioma 
     */
    public String getNombreIdioma() {
        return nombreIdioma;
    }

    /**
     * 
     * @param nombreIdioma defiene el nombre de idioma que tendra el libro
     */
    public void setNombreIdioma(String nombreIdioma) {
        this.nombreIdioma = nombreIdioma;
    }

    /**
     * 
     * @return el id unico del idioma
     */
    public int getIdIdioma() {
        return idIdioma;
    }

    /**
     * 
     * @param idIdioma define el id del idioma
     */
    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }



}





  