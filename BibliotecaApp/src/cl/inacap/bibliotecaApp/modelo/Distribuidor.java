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

    
    //Validacion Rut
    public boolean Validacion_Rut(){
        
        Boolean lDevuelve = false;
        int Ult = this.rutDistribuidor.length(); // |1 |8 |2 |1 |6 |5 |7 |1 |- |9 | = 10? = 9
        int Largo = this.rutDistribuidor.length() - 3;
        int Constante = 2;
        int Suma = 0;
        int Digito = 0;

        for (int i = Largo; i >= 0; i--) {

            Suma = Suma + Integer.parseInt(this.rutDistribuidor.substring(i, i + 1)) * Constante;
            Constante = Constante + 1;
            if (Constante == 8) {
                Constante = 2;
            }
        }
        String Ultimo = this.rutDistribuidor.substring(Ult - 1).toUpperCase();
        Digito = 11 - (Suma % 11);
        if (Digito == 10 && Ultimo.equals("K")) {
            lDevuelve = true;
        } else {
            if (Digito == 11 && Ultimo.equals("0")) {
                lDevuelve = true;
            } else {

                if (Digito == Integer.parseInt(Ultimo)) {

                    lDevuelve = true;

                }
            }
        }
        return lDevuelve;
    }

    
}
