package cl.inacap.bibliotecaApp.modelo;

public class Autor {
    private String nombre;
    private int id;
    private String apellidoPaterno;
    private String apellidoMaterno;


    // Constructor recibe los valores del autor
    public Autor() {
        this.nombre = nombre;
        this.id = id;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    // valor del atributo id que es el identificador unico del autor
    public int getId() {
        return id;
    }

    // id define el atributo id del autor
    public void setId(int id) {
        this.id = id;
    }

    // valor del atributo nombre donde se obtiene el nombre del autor
    public String getNombre() {
        return nombre;
    }

    // nombre define el nombre del autor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // valor del atributo apellidoPaterno donde se obtiene el primer apellido del autor
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    // apellidoPaterno define el primer apellido del autor
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    // valor del atributo apellidoPaterno donde se obtiene el segundo apellido del autor
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }


    // apellidoMaterno define el segundo apellido del autor
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

}
