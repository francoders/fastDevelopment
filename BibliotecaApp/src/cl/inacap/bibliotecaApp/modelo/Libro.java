package cl.inacap.bibliotecaApp.modelo;

/**
 *
 * @author Corvalan
 */
public class Libro {

    private int nSerie;
    private String titulo;
    private int isbn;
    private String autores;
    private String idiomas;
    private String categorias;
    private String editorial;
    private int numeroDePag;
    private int añoDePublicacion;
    private String estado;

    private int precioReferencia;
    private int stock;

    public Libro() {
        this.nSerie = nSerie;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autores = autores;
        this.idiomas = idiomas;
        this.categorias = categorias;
        this.editorial = editorial;
        this.numeroDePag = numeroDePag;
        this.añoDePublicacion = añoDePublicacion;
        this.estado = estado;
        this.precioReferencia = precioReferencia;
        this.stock = stock;
    }

    public int getNSerie() {
        return nSerie;
    }

    public void setNSerie(int NSerie) {
        this.nSerie = NSerie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroDePag() {
        return numeroDePag;
    }

    public void setNumeroDePag(int numeroDePag) {
        this.numeroDePag = numeroDePag;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecioReferencia() {
        return precioReferencia;
    }

    public void setPrecioReferencia(int precioReferencia) {
        this.precioReferencia = precioReferencia;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
