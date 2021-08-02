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
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
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
                String correoTxt = (String) clienteVista.tabla.getValueAt(fila, 5);
                int telefonotxt = Integer.parseInt((String) clienteVista.tabla.getValueAt(fila, 6).toString());
                String rutTxt = (String) clienteVista.tabla.getValueAt(fila, 7);
                clienteVista.id_cliente_txt.setText("" + id);
                clienteVista.fecha_nacimiento_txt.setText(fechaTxt);
                clienteVista.ape_pa_txt.setText(apellido_paternoTxt);
                clienteVista.ape_ma_txt.setText(apellido_maternotxt);
                clienteVista.direccion_cliente_txt.setText(direccionTxt);
                clienteVista.correo_txt1.setText(correoTxt);
                clienteVista.telefono_cliente_txt.setText("" + telefonotxt);
                clienteVista.rut_cliente_txt.setText(rutTxt);
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
    
    /**
     * limpiarTabla: metodo que deja en blanco la tabla de categorias
     */
    private void limpiarTabla() {
        for (int i = 0; i < clienteVista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void listar(JTable tabla) {
        centrarCeldas(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Cliente> lista = dao.listar();
        Object[] objeto = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getIdCliente();
            objeto[1] = lista.get(i).getFechaNacimientoCliente();
            objeto[2] = lista.get(i).getApePaternoCliente();
            objeto[3] = lista.get(i).getApeMaternoCliente();
            objeto[4] = lista.get(i).getDireccionCliente();
            objeto[5] = lista.get(i).getCorreoCliente();
            objeto[6] = lista.get(i).getTelefonoCliente();
            objeto[7] = lista.get(i).getRutCliente();
            objeto[8] = lista.get(i).getNombreCliente();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);

    }

    private void nuevo() {
        clienteVista.id_cliente_txt.setText("");
        clienteVista.fecha_nacimiento_txt.setText("");
        clienteVista.ape_pa_txt.setText("");
        clienteVista.ape_ma_txt.setText("");
        clienteVista.direccion_cliente_txt.setText("");
        clienteVista.correo_txt1.setText("");
        clienteVista.telefono_cliente_txt.setText("");
        clienteVista.rut_cliente_txt.setText("");
        clienteVista.nom_cliente_txt.setText("");
        clienteVista.requestFocus();
    }

    private void agregar() {
        try {
            int idTxt = Integer.parseInt(clienteVista.id_cliente_txt.getText());
            cl.setIdCliente(idTxt);
            String fechaTxt = clienteVista.fecha_nacimiento_txt.getText();
            cl.setFechaNacimientoCliente(fechaTxt);
            String apePaTxt = clienteVista.ape_pa_txt.getText();
            cl.setApePaternoCliente(apePaTxt);
            String apeMaTxt = clienteVista.ape_ma_txt.getText();
            cl.setApeMaternoCliente(apeMaTxt);
            String direccionTxt = clienteVista.direccion_cliente_txt.getText();
            cl.setDireccionCliente(direccionTxt);
            String correoTxt = clienteVista.correo_txt1.getText();
            cl.setCorreoCliente(correoTxt);
            int telefonoTxt = Integer.parseInt(clienteVista.telefono_cliente_txt.getText());
            cl.setTelefonoCliente(telefonoTxt);
            String rutTxt = clienteVista.rut_cliente_txt.getText();
            cl.setRutCliente(rutTxt);
            String nomTxt = clienteVista.nom_cliente_txt.getText();
            cl.setNombreCliente(nomTxt);
            int r = dao.agregar(cl);
            if (r == 1) {
                JOptionPane.showMessageDialog(clienteVista, "Cliente Agregado");
            } else {
                JOptionPane.showMessageDialog(clienteVista, "Error, ID ya utilizado");
            }
            limpiarTabla();

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    /**
     * eliminar: metodo publico que elimina a las categorias de la tabla
     * mediante el id que se encuentra en la fila correspondiente a este
     */
    private void eliminar() {
        int fila = clienteVista.tabla.getSelectedRow();
        try {
            if (fila == -1) {
            JOptionPane.showMessageDialog(clienteVista, "Debe seleccionar una fila");
        }else{
            JOptionPane.showMessageDialog(clienteVista, "Cliente Eliminado");
            int id = Integer.parseInt((String) clienteVista.tabla.getValueAt(fila, 1).toString());
            dao.eliminar(id); 
        }
        } catch (Exception e) {
            System.out.println(e);            
        }
        limpiarTabla();
    }

    private void actualizar() {
        if (clienteVista.id_cliente_txt.getText().equals("")) {
            JOptionPane.showMessageDialog(clienteVista, "ID no seleccionado");
        } else {
            int idTxt = Integer.parseInt(clienteVista.id_cliente_txt.getText());
            String fechaTxt = clienteVista.fecha_nacimiento_txt.getText();
            String apePaTxt = clienteVista.ape_pa_txt.getText();
            String apeMaTxt = clienteVista.ape_ma_txt.getText();
            String direccionTxt = clienteVista.direccion_cliente_txt.getText();
            String correoTxt = clienteVista.correo_txt1.getText();
            int telefonoTxt = Integer.parseInt(clienteVista.telefono_cliente_txt.getText());
            String rutTxt = clienteVista.rut_cliente_txt.getText();
            String nomTxt = clienteVista.nom_cliente_txt.getText();
            
            cl.setIdCliente(idTxt);
            cl.setFechaNacimientoCliente(fechaTxt);
            cl.setApePaternoCliente(apePaTxt);
            cl.setApeMaternoCliente(apeMaTxt);
            cl.setDireccionCliente(direccionTxt);
            cl.setCorreoCliente(correoTxt);
            cl.setTelefonoCliente(telefonoTxt);
            cl.setRutCliente(rutTxt);
            cl.setNombreCliente(nomTxt);
            int r = dao.actualizar(cl);
            if (r == 1) {
                JOptionPane.showMessageDialog(clienteVista, "El Cliente Seleccionado se a actualizado");
            } else {
                JOptionPane.showMessageDialog(clienteVista, "Error al Actualizar");
            }
        }
        limpiarTabla();
    }

    private void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < clienteVista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

}
