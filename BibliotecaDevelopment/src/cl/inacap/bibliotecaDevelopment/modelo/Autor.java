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
public class Autor {
    
    private int idAutor;   //ID UNICO AUTOR
    private String nombreAutor;  // NOMBRE AUTOR
    private String apellidoPaAutor; // APELLIDO PATERNO AUTOR
    private String apellidoMaAutor; // APELLIDO MATERNO AUTOR

    
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoPaAutor() {
        return apellidoPaAutor;
    }

    public void setApellidoPaAutor(String apellidoPaAutor) {
        this.apellidoPaAutor = apellidoPaAutor;
    }

    public String getApellidoMaAutor() {
        return apellidoMaAutor;
    }

    public void setApellidoMaAutor(String apellidoMaAutor) {
        this.apellidoMaAutor = apellidoMaAutor;
    }
    
}
