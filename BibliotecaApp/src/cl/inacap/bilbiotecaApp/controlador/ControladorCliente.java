/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bilbiotecaApp.controlador;

import cl.inacap.bibliotecaApp.modelo.Cliente;
import cl.inacap.bibliotecaApp.modelo.ClienteDAO;
import cl.inacap.bibliotecaApp.vista.ClienteFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Corvalan
 */
public class ControladorCliente implements ActionListener {

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
        this.clienteVista.listar_cl_btn.addActionListener(this);
        this.clienteVista.agregar_cliente_btn.addActionListener(this);
        this.clienteVista.editar_cl_btn.addActionListener(this);
        this.clienteVista.eliminar_cl_btn.addActionListener(this);
        this.clienteVista.actualizar_cl_btn.addActionListener(this);
        this.clienteVista.limpiar_cliente_btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clienteVista.listar_cl_btn) {
            limpiarTabla();
            listar(clienteVista.tabla);
            nuevo();

        }
        if (e.getSource() == clienteVista.agregar_cliente_btn) {
            agregar();
            listar(clienteVista.tabla);
            nuevo();
        }
        if (e.getSource() == clienteVista.editar_cl_btn) {
            int fila = clienteVista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(clienteVista, "Debe seleccionar una fila");
            } else {
                JOptionPane.showMessageDialog(clienteVista, "Modifica el dato y haz click en Actualizar");
                int id = Integer.parseInt((String) clienteVista.tabla.getValueAt(fila, 0).toString());
                String fechaTxt = (String) clienteVista.tabla.getValueAt(fila, 1);
                String apellido_paternoTxt = (String) clienteVista.tabla.getValueAt(fila, 2);
                String apellido_maternotxt = (String) clienteVista.tabla.getValueAt(fila, 3);
                String direccionTxt = (String) clienteVista.tabla.getValueAt(fila, 4);
                int telefonotxt = Integer.parseInt((String) clienteVista.tabla.getValueAt(fila, 5).toString());
                String rutTxt = (String) clienteVista.tabla.getValueAt(fila, 6);
                String correoTxt = (String) clienteVista.tabla.getValueAt(fila, 7);
                clienteVista.id_cliente_txt.setText("" + id);
                clienteVista.flecha1.setText(fechaTxt);
                clienteVista.ape_pa_cliente_txt.setText(apellido_paternoTxt);
                clienteVista.ape_ma_cliente_txt.setText(apellido_maternotxt);
                clienteVista.direccion_cliente_txt.setText(categoriaTxt);
                clienteVista.correo_txt1.setText(telefonotxt);
                clienteVista.id_cliente_txt.setText();


            }
        }
        if (e.getSource() == clienteVista.eliminar_cl_btn) {
            eliminar();
            listar(clienteVista.tabla);
            nuevo();
        }
        if (e.getSource() == clienteVista.limpiar_cliente_btn) {
            nuevo();
        }
        if (e.getSource() == clienteVista.actualizar_cl_btn) {
            actualizar();
            listar(clienteVista.tabla);
            nuevo();
        }

    }

    private void limpiarTabla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void listar(JTable tabla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void nuevo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
