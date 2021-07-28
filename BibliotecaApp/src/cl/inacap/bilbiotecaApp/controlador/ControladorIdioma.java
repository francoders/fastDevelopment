package cl.inacap.bilbiotecaApp.controlador;

import cl.inacap.bibliotecaApp.modelo.Idioma;
import cl.inacap.bibliotecaApp.modelo.IdiomaDAO;
import cl.inacap.bibliotecaApp.vista.IdiomaFrame;
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
public class ControladorIdioma implements ActionListener {

    IdiomaDAO dao = new IdiomaDAO();
    Idioma idioma = new Idioma();
    IdiomaFrame iFrame = new IdiomaFrame();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorIdioma(IdiomaFrame i) {
        this.iFrame = i;
        this.iFrame.listar_idioma_btn.addActionListener(this);
        this.iFrame.agregar_idioma_btn.addActionListener(this);
        this.iFrame.editar_idioma_btn.addActionListener(this);
        this.iFrame.actualizar_idioma_btn.addActionListener(this);
        this.iFrame.eliminar_idioma_btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iFrame.listar_idioma_btn) {
            limpiarTabla();
            listar(iFrame.tabla);
            nuevo();
        }

        if (e.getSource() == iFrame.agregar_idioma_btn) {
            agregar();
            listar(iFrame.tabla);
            nuevo();
        }
        if (e.getSource() == iFrame.editar_idioma_btn) {
            int fila = iFrame.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(iFrame, "Debe seleccionar una fila");
            } else {
                JOptionPane.showMessageDialog(iFrame, "Modifica el dato y haz click en Actualizar");
                String idiomaTxt = (String) iFrame.tabla.getValueAt(fila, 1);
                int id = Integer.parseInt((String) iFrame.tabla.getValueAt(fila, 0).toString());
                iFrame.nom_idioma_txt.setText(idiomaTxt);
                iFrame.id_idioma_txt.setText("" + id);
            }
        }
        if (e.getSource() == iFrame.actualizar_idioma_btn) {
            actualizar();
            listar(iFrame.tabla);
            nuevo();
        }
        if (e.getSource() == iFrame.eliminar_idioma_btn) {
            eliminar();
            listar(iFrame.tabla);
            nuevo();
        }
    }

    public void listar(JTable tabla) {
        centrarCeldas(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Idioma> lista = dao.listar();
        Object[] objeto = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getIdIdioma();
            objeto[1] = lista.get(i).getNombreIdioma();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);

    }

    public void agregar() {
        String idiomaTxt = iFrame.nom_idioma_txt.getText();
        idioma.setNombreIdioma(idiomaTxt);
        int r = dao.agregar(idioma);
        if (r == 1) {
            JOptionPane.showMessageDialog(iFrame, "Idioma agregado");
        } else {
            JOptionPane.showMessageDialog(iFrame, "Error al agregar");
        }
        limpiarTabla();
    }

    public void actualizar() {
        if (iFrame.id_idioma_txt.getText().equals("")) {
            JOptionPane.showMessageDialog(iFrame, "No se identifica el id");
        } else {
            int id = Integer.parseInt(iFrame.id_idioma_txt.getText());
            String idiomaTxt = iFrame.nom_idioma_txt.getText();
            idioma.setNombreIdioma(idiomaTxt);
            idioma.setIdIdioma(id);
            int r = dao.actualizar(idioma);
            if (r == 1) {
                JOptionPane.showMessageDialog(iFrame, "La categoria se ha actualizado");
            } else {
                JOptionPane.showMessageDialog(iFrame, "Error al actualizar");
            }
        }
        limpiarTabla();
    }

    public void eliminar() {
        int fila = iFrame.tabla.getSelectedRow();
        String idioma = (String) iFrame.tabla.getValueAt(fila, 1);
        try {
            if (fila == -1) {
                JOptionPane.showMessageDialog(iFrame, "Debe seleccionar una fila");
            } else {
                JOptionPane.showMessageDialog(iFrame, "El Idioma " + idioma + " fue eliminado");
                int id = Integer.parseInt((String) iFrame.tabla.getValueAt(fila, 0).toString());
                dao.eliminar(id);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        limpiarTabla();
    }

    void nuevo() {
        iFrame.nom_idioma_txt.setText("");
        iFrame.id_idioma_txt.setText("");
        iFrame.requestFocus();
    }

    void limpiarTabla() {
        for (int i = 0; i < iFrame.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < iFrame.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

}
