/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bilbiotecaApp.controlador;

import cl.inacap.bibliotecaApp.modelo.Cliente;
import cl.inacap.bibliotecaApp.modelo.ClienteDAO;
import cl.inacap.bibliotecaApp.vista.ClienteFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Corvalan
 */
public class ControladorCliente {

    ClienteDAO dao = new ClienteDAO();
    Cliente cl = new Cliente();
    ClienteFrame clienteVista = new ClienteFrame();
    DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * ControladoAutor: metodo publico que recibe la vista de los autores,
     * mediante un escuchador activa los botones btnListar, btnAgregar,
     * btnNuevo, btnEditar, btnActualizar y btnEliminar
     *
     * @param cl tipo ClienteFrame
     *
     */

    public ControladorCliente(ClienteFrame cl) {
        this.clienteVista = cl;
    }
    
}
