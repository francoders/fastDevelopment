package cl.inacap.bibliotecaApp.modelo;

public class Categoria {
    private String nombreCategoria;
    private int idCategoria;
    
    /**
     * Constructor completo de la clase. Recibe 2 tipos de atributos
     */
    public Categoria() {
        this.nombreCategoria = nombreCategoria;
        this.idCategoria = idCategoria;
    }
    
    /**
     * 
     * @return Valor del atributo nombreCategoria donde se obtiene el nombre de la categoria
     */
    public String getNombreCategoria() {
        return nombreCategoria;
    }
    
    /**
     * 
     * @param nombreCategoria define el nombre de la categoria
     */
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    /**
     * 
     * @return Valor del atributo idCategoria donde se obtiene el id unico de la categoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }
    
    /**
     * 
     * @param idCategoria define el id unico de la categoria
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
}
