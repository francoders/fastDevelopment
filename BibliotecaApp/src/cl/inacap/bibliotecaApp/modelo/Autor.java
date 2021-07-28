package cl.inacap.bibliotecaApp.modelo;

public class Autor {
    private String nombre;
    private int id;
    private String apellidoPaterno;
    private String apellidoMaterno;

 /**
  * 
  * Constructor recibe los valores del autor
  */
    public Autor() {
        this.nombre = nombre;
        this.id = id;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     *
     * @return valor del atributo id que es el identificador unico del autor
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id define el atributo id del autor
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return valor del atributo nombre donde se obtiene el nombre del autor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre define el nombre del autor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return valor del atributo apellidoPaterno donde se obtiene el primer
     * apellido del autor
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     *
     * @param apellidoPaterno define el primer apellido del autor
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     *
     * @return valor del atributo apellidoPaterno donde se obtiene el segundo
     * apellido del autor
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     *
     * @param apellidoMaterno define el segundo apellido del autor
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

}
