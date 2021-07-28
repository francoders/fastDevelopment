package cl.inacap.bibliotecaApp.modelo;

/**
 *
 * @author Corvalan
 */
public class Libro {
 private int nSerie;
    private String titulo;
    private int isbn;
    private int autores;
    private int idiomas;
    private int categorias;
    private int editorial;
    private int numeroDePag;
    private int añoDePublicacion;
    private int estado;

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

    public int getAutores() {
        return autores;
    }

    public void setAutores(int autores) {
        this.autores = autores;
    }

    public int getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(int idiomas) {
        this.idiomas = idiomas;
    }

    public int getCategorias() {
        return categorias;
    }

    public void setCategorias(int categorias) {
        this.categorias = categorias;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
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
        this.stock= stock;
    }
}
   