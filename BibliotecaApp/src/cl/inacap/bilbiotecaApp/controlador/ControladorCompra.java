/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bilbiotecaApp.controlador;

import cl.inacap.bibliotecaApp.modelo.Compra;
import cl.inacap.bibliotecaApp.modelo.CompraDAO;
import cl.inacap.bibliotecaApp.vista.CompraFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Corvalan
 */
public class ControladorCompra implements ActionListener{

    CompraDAO dao = new CompraDAO();
    Compra com = new Compra();
    CompraFrame compraVista = new CompraFrame();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorCompra(CompraFrame com) {
        this.compraVista = com;
        this.compraVista.btnAgregar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
