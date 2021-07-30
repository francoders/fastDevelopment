package cl.inacap.bibliotecaApp.modelo;

public class Distribuidor {

    private int idDist;
    private String rutDistribuidor;
    private String nombreEmpresa;
    private String direccion;
    private int telefono;
    private int anioVenta;

    // Constructor recibe los valores del distribuidor
    public Distribuidor(int idDist, String rutDistribuidor, String nombreEmpresa, String direccion, int telefono, int anioVenta) {
        this.idDist = idDist;
        this.rutDistribuidor = rutDistribuidor;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.anioVenta = anioVenta;
    }

    public Distribuidor() {

    }

    public int getIdDist() {
        return idDist;
    }

    public void setIdDist(int idDist) {
        this.idDist = idDist;
    }
    
    
    public String getRutDistribuidor() {
        return rutDistribuidor;
    }

    /**
     *
     * @param rutDistribuidor define el rut del distribuidor
     */
    public void setRutDistribuidor(String rutDistribuidor) {
        this.rutDistribuidor = rutDistribuidor;
    }

    /**
     *
     * @return el valor del atributo nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     *
     * @param nombreEmpresa define el nombre de la empresa distribuidora
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     *
     * @return el valor de la direccion del distribuidor
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion define la direccion del distribuidor
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return el valor del telefono del distribuidor
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono define el telefono del distribuidor
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return el valor del año de venta del distribuidor
     */
    public int getAnioVenta() {
        return anioVenta;
    }

    /**
     *
     * @param anioVenta define el año de ventas del distribuidor
     */
    public void setAnioVenta(int anioVenta) {
        this.anioVenta = anioVenta;
    }

}
