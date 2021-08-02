/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bilbiotecaApp.controlador;

import cl.inacap.bibliotecaApp.modelo.Trabajador;
import cl.inacap.bibliotecaApp.modelo.TrabajadorDAO;
import cl.inacap.bibliotecaApp.vista.TrabajadorFrame;
import cl.inacap.bibliotecaApp.vista.TrabajadorTelefonosFrame;
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
public class ControladorTelefono implements ActionListener {

    TrabajadorTelefonosFrame fonoVista = new TrabajadorTelefonosFrame();
    TrabajadorDAO dao = new TrabajadorDAO();
    Trabajador tr = new Trabajador();
    TrabajadorFrame trabajadorVista = new TrabajadorFrame();
    DefaultTableModel modelo = new DefaultTableModel();

    //CONTROLADOR DE TELEFONOS
    public ControladorTelefono(TrabajadorTelefonosFrame fono) {
        this.fonoVista = fono;
        this.fonoVista.actualizar_fono_btn.addActionListener(this);
        this.fonoVista.editar_fono_btn.addActionListener(this);
        this.fonoVista.listar_fono_btn.addActionListener(this);
        this.fonoVista.fono_1_txt.addActionListener(this);
        this.fonoVista.fono_2_txt.addActionListener(this);
        this.fonoVista.fono_3_txt.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == fonoVista.listar_fono_btn) {
            limpiarTabla();
            listarFono(fonoVista.tablaFono);
            nuevo();
        }
        if (e.getSource() == fonoVista.editar_fono_btn) {
            int fila = fonoVista.tablaFono.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(fonoVista, "Debe seleccionar una fila");
            } else {
                int tel1 = Integer.parseInt((String) fonoVista.tablaFono.getValueAt(fila, 1).toString());
                int tel2 = Integer.parseInt((String) fonoVista.tablaFono.getValueAt(fila, 2).toString());
                int tel3 = Integer.parseInt((String) fonoVista.tablaFono.getValueAt(fila, 3).toString());

                fonoVista.fono_1_txt.setText("" + tel1);
                fonoVista.fono_2_txt.setText("" + tel2);
                fonoVista.fono_3_txt.setText("" + tel3);
            }
        }
        if (e.getSource() == fonoVista.actualizar_fono_btn) {
            actualizarFono();
            listarFono(fonoVista.tablaFono);
            nuevo();

        }
    }

    //Telefono Listar    
    private void listarFono(JTable tablaFono) {
        centrarCeldas(tablaFono);
        modelo = (DefaultTableModel) tablaFono.getModel();
        tablaFono.setModel(modelo);
        List<Trabajador> lista = dao.listar();
        Object[] objeto = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getIdTrabajador();
            objeto[1] = lista.get(i).getTelefonoTrabajador();
            objeto[2] = lista.get(i).getTelefono2();
            objeto[3] = lista.get(i).getTelefono3();
            modelo.addRow(objeto);
        }
        tablaFono.setRowHeight(35);
        tablaFono.setRowMargin(10);
    }

    /**
     * ... ACTUALIZAR TELEFONOS ...
     */
    public void actualizarFono() {
        if (fonoVista.fono_1_txt.getText().equals("")) {
            JOptionPane.showMessageDialog(fonoVista, "No se Identifica el ID debe selecionar la opcion Editar");
        } else {
            int tel1 = Integer.parseInt(fonoVista.fono_1_txt.getText());
            int tel2 = Integer.parseInt(fonoVista.fono_2_txt.getText());
            int tel3 = Integer.parseInt(fonoVista.fono_3_txt.getText());
            tr.setTelefonoTrabajador(tel1);
            tr.setTelefono2(tel2);
            tr.setTelefono3(tel3);
            int r = dao.actualizar(tr);
            if (r == 1) {
                JOptionPane.showMessageDialog(fonoVista, "El distribuidor se ha actualizado");
            } else {
                JOptionPane.showMessageDialog(fonoVista, "Error al actualizar");
            }
        }
        limpiarTabla();
    }

    private void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < fonoVista.tablaFono.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    private void limpiarTabla() {
        for (int i = 0; i < fonoVista.tablaFono.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void nuevo() {
        fonoVista.fono_1_txt.setText("");
        fonoVista.fono_2_txt.setText("");
        fonoVista.fono_3_txt.setText("");
    }

}
