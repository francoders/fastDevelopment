package cl.inacap.bilbiotecaApp.controlador;

import cl.inacap.bibliotecaApp.modelo.Conexion;
import cl.inacap.bibliotecaApp.modelo.Libro;
import cl.inacap.bibliotecaApp.modelo.LibroDAO;
import cl.inacap.bibliotecaApp.vista.LibroFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class ControladorLibro implements ActionListener{
    LibroDAO dao = new LibroDAO();
    Libro l = new Libro();
    LibroFrame libroVista = new LibroFrame();
    Connection con;
    Conexion conectar = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorLibro(LibroFrame l){
        this.libroVista = l;
        this.libroVista.btnListar.addActionListener(this);
        this.libroVista.btnActualizar.addActionListener(this);
        this.libroVista.btnAgregar.addActionListener(this);
        this.libroVista.btnEliminar.addActionListener(this);
        this.libroVista.btnEditar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == libroVista.btnListar) {
            limpiarTabla();
            listar(libroVista.tabla);
            nuevo();
        }
        if (e.getSource() == libroVista.btnAgregar) {
            agregar();
            listar(libroVista.tabla);
        }
        if (e.getSource() == libroVista.btnEditar) {
            int fila = libroVista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(libroVista, "Debe seleccionar una fila");
            } else {
                int nSerie = Integer.parseInt((String) libroVista.tabla.getValueAt(fila, 0).toString());
                int isbn = Integer.parseInt((String) libroVista.tabla.getValueAt(fila, 1).toString());
                String titulo = libroVista.tabla.getValueAt(fila, 2).toString();
                
                int nPaginas = Integer.parseInt((String) libroVista.tabla.getValueAt(fila, 3).toString());
                int pReferencia = Integer.parseInt((String) libroVista.tabla.getValueAt(fila, 4).toString());
                int anioPublic = Integer.parseInt((String) libroVista.tabla.getValueAt(fila, 5).toString());
                String idioma =  libroVista.tabla.getValueAt(fila, 6).toString();
                String autor =  libroVista.tabla.getValueAt(fila, 7).toString();
                String editorial =  libroVista.tabla.getValueAt(fila, 8).toString();
                String categoria = libroVista.tabla.getValueAt(fila, 9).toString();
                String estado = libroVista.tabla.getValueAt(fila, 10).toString();

                libroVista.txtNSerie.setText("" + nSerie);
                libroVista.txtIsbn.setText("" +isbn);
                libroVista.txtTitulo.setText(titulo);

            }
        }
        if (e.getSource() == libroVista.btnActualizar) {
            actualizar();
            listar(libroVista.tabla);
            nuevo();

        } 
        if (e.getSource() == libroVista.btnEliminar) {
            eliminar();
            listar(libroVista.tabla);
            nuevo();
        }
        if (e.getSource() == libroVista.btnNuevo) {
            nuevo();
        }

    }

    public void agregar() {
        try {
            int nSerie = Integer.parseInt(libroVista.txtNSerie.getText());
            int isbn = Integer.parseInt(libroVista.txtIsbn.getText());
            String titulo = libroVista.txtTitulo.getText();
            int nPaginas = Integer.parseInt(libroVista.txtNPaginas.getText());
            int pReferencia = Integer.parseInt(libroVista.txtPReferencia.getText());
            int anioPublic = Integer.parseInt(libroVista.txtAnio.getText());
            String idioma = (String) libroVista.cbxIdioma.getSelectedItem();
            String autor = (String) libroVista.cbxAutor.getSelectedItem();
            String editorial = (String) libroVista.cbxEditorial.getSelectedItem();
            String categoria = (String) libroVista.cbxCategoria.getSelectedItem();
            String estado = (String) libroVista.cbxEstado.getSelectedItem();
            l.setNSerie(nSerie);
            l.setIsbn(isbn);
            l.setTitulo(titulo);
            l.setNumeroDePag(nPaginas);
            l.setPrecioReferencia(pReferencia);
            l.setAñoDePublicacion(anioPublic);
            l.setIdiomas(idioma);
            l.setAutores(autor);
            l.setEditorial(editorial);
            l.setCategorias(categoria);
            l.setEstado(estado);

            //VALIDACION CAMPO VACIO
            if (libroVista.txtNSerie.getText().equals("")) {
                JOptionPane.showMessageDialog(libroVista, "Ingrese un Numero de Serie");
                limpiarTabla();
            } else if (libroVista.txtIsbn.getText().equals("")) {
                JOptionPane.showMessageDialog(libroVista, "Ingrese un ISBN");
                limpiarTabla();
            }else if (libroVista.txtTitulo.getText().equals("")) {
                JOptionPane.showMessageDialog(libroVista, "Ingrese un Titulo");
                limpiarTabla();
            } else if (libroVista.txtNPaginas.getText().equals("")) {
                JOptionPane.showMessageDialog(libroVista, "Ingrese una cantidad de Paginas");
                limpiarTabla();
            } else if (nPaginas <= 0) {
                JOptionPane.showMessageDialog(libroVista, "El libro debe poseer Paginas");
                limpiarTabla();
            } else if (pReferencia <= 0) {
                JOptionPane.showMessageDialog(libroVista, "ingrese un valor valido para libro");
                limpiarTabla();
            } else if (libroVista.txtPReferencia.getText().equals("")) {
                JOptionPane.showMessageDialog(libroVista, "Ingrese un Precio de Referencia");
                limpiarTabla();
            } else if (libroVista.txtAnio.getText().equals("")) {
                JOptionPane.showMessageDialog(libroVista, "Ingrese un año de publicacion");
                limpiarTabla();
            } else {
                int r = dao.agregar(l);
                limpiarTabla();
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
        limpiarTabla();
    }

    public void eliminar() {
        int fila = libroVista.tabla.getSelectedRow();
        String libro = (String) libroVista.tabla.getValueAt(fila, 2);
        try {
            if (fila == -1) {
                JOptionPane.showMessageDialog(libroVista, "Debe seleccionar una fila");
        }else{
            JOptionPane.showMessageDialog(libroVista, "El libro llamado " + libro + " fue eliminado");
            int nSerie = Integer.parseInt((String) libroVista.tabla.getValueAt(fila, 0).toString());
            dao.eliminar(nSerie); 
        }
        } catch (Exception e) {
            System.out.println(e);            
        }
        
        limpiarTabla();
    }
    public void actualizar(){
        if (libroVista.txtNSerie.getText().equals("")) {
            JOptionPane.showMessageDialog(libroVista, "No se identifica el numero de serie");
        }else{
            int nSerie = Integer.parseInt(libroVista.txtNSerie.getText());
            int isbn = Integer.parseInt(libroVista.txtIsbn.getText());
            String titulo = libroVista.txtTitulo.getText();
            int nPaginas = Integer.parseInt(libroVista.txtNPaginas.getText());
            int precio = Integer.parseInt(libroVista.txtPReferencia.getText());
            int anio = Integer.parseInt(libroVista.txtAnio.getText());
            String idioma = (String) libroVista.cbxIdioma.getSelectedItem();
            String autor = (String) libroVista.cbxAutor.getSelectedItem();
            String editorial =(String) libroVista.cbxEditorial.getSelectedItem();
            String categoria = (String) libroVista.cbxCategoria.getSelectedItem();
            String estado = (String) libroVista.cbxEstado.getSelectedItem();
            l.setNSerie(nSerie);
            l.setIsbn(isbn);
            l.setTitulo(titulo);
            l.setNumeroDePag(nPaginas);
            l.setPrecioReferencia(precio);
            l.setAñoDePublicacion(anio);
            l.setIdiomas(idioma);
            l.setAutores(autor);
            l.setEditorial(editorial);
            l.setCategorias(categoria);
           l.setEstado(estado);
            int  r = dao.actualizar(l);
            if (r == 1) {
                JOptionPane.showMessageDialog(libroVista, "El libro se ha actualizado");
            }else{
                JOptionPane.showMessageDialog(libroVista, "Error al actualizar");
            }
        }
        limpiarTabla();
    }
    
    public void listar(JTable tabla) {
        centrarCeldas(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Libro> lista = dao.listar();
        Object[] objeto = new Object[10];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getNSerie();
            objeto[1] = lista.get(i).getIsbn();
            objeto[2] = lista.get(i).getTitulo();
            objeto[3] = lista.get(i).getNumeroDePag();
            objeto[4] = lista.get(i).getPrecioReferencia();
            objeto[5] = lista.get(i).getAñoDePublicacion();
            objeto[6] = lista.get(i).getIdiomas();
            objeto[7] = lista.get(i).getAutores();
            objeto[8] = lista.get(i).getCategorias();
            objeto[9] = lista.get(i).getEditorial();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);
    }
    void limpiarTabla() {
        for (int i = 0; i < libroVista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    } 
    void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < libroVista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    private void nuevo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
