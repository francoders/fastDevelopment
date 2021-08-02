/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.modelo;
 
/**
 *
 * @author Corvalan
 */
public class Compra {
    private int idCompra;
    private int folioFactura;
    private int numSerieLibro;
    private String nomDistribuidor;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getFolioFactura() {
        return folioFactura;
    }

    public void setFolioFactura(int folioFactura) {
        this.folioFactura = folioFactura;
    }

    public int getNumSerieLibro() {
        return numSerieLibro;
    }

    public void setNumSerieLibro(int numSerieLibro) {
        this.numSerieLibro = numSerieLibro;
    }

    public String getNomDistribuidor() {
        return nomDistribuidor;
    }

    public void setNomDistribuidor(String nomDistribuidor) {
        this.nomDistribuidor = nomDistribuidor;
    }
    
    
    
}
