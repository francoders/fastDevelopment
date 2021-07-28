package cl.inacap.bibliotecaApp.modelo;

public class Distribuidor {
    private int rutDistribuidor;
    private String nombreEmpresa;
    private String direccion;
    private int telefono;
    private int anioVenta;

    
    // Constructor recibe los valores del distribuidor
     
    public Distribuidor(int rutDistribuidor, String nombreEmpresa, String direccion, int telefono, int anioVenta) {
        this.rutDistribuidor = rutDistribuidor;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.anioVenta = anioVenta;
    }
    
     public Distribuidor() {
        
    }
    
    /**
     * 
     * @return valor del rut de la empresa que identifica al distribuidor
     */
    public int getRutDistribuidor() {
        return rutDistribuidor;
    }

    /**
     * 
     * @param rutDistribuidor define el rut del distribuidor 
     */
    public void setRutDistribuidor(int rutDistribuidor) {
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
