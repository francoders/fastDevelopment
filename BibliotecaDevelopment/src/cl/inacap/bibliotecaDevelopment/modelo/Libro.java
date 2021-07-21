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
public class Libro {
    
    private int numSerie;      // NUMERICO EJ: 123456789
    private int isbn;          // 13NUM. 923-23-9876-731-1 = PREFIJO EAN|COD.PAIS|COD.EDITORIAL|NUM LIBRO|DIGITO CONTROL
    private String titulo;     // TITULO
    private int numPaginas;    // NUM PAGINAS
    private int precio;        // PRECIO LIBRO
    private int anioPublicacion; //AÑO PUBLICACION

    
    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
}
