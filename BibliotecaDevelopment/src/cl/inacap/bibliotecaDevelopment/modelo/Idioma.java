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
public class Idioma {
    
    private int idIdioma;       //ID DEL IDIOMA
    private String nombreIdioma; // NOMBRE DEL IDIOMA
    private String codigoIdioma; // EJ: ESPAÑOL = ES

    //Constructor
    public Idioma(){
        this.idIdioma = idIdioma;
        this.nombreIdioma = nombreIdioma;
        this.codigoIdioma = codigoIdioma;
    }
    
    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNombreIdioma() {
        return nombreIdioma;
    }

    public void setNombreIdioma(String nombreIdioma) {
        this.nombreIdioma = nombreIdioma;
    }

    public String getCodigoIdioma() {
        return codigoIdioma;
    }

    public void setCodigoIdioma(String codigoIdioma) {
        this.codigoIdioma = codigoIdioma;
    }
    
}
