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
        }
        if (e.getSource() == libroVista.btnAgregar) {
            agregar();
            listar(libroVista.tabla);
        }
        if (e.getSource() == libroVista.btnEliminar) {
            eliminar();
            listar(libroVista.tabla);
        }
        if (e.getSource() == libroVista.btnEditar) {
            int fila = libroVista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(libroVista, "Debe seleccionar una fila");
            } else {
                JOptionPane.showMessageDialog(libroVista, "Modifica el dato y haz click en Actualizar");
            }
        }
        if (e.getSource() == libroVista.btnActualizar) {
            actualizar();
            listar(libroVista.tabla);

        }
    }

    public void agregar() {
        int nSerie = Integer.parseInt(libroVista.txtNSerie.getText());
        int isbn = Integer.parseInt(libroVista.txtIsbn.getText());
        String titulo = libroVista.txtTitulo.getText();
        int nPaginas = Integer.parseInt(libroVista.txtNPaginas.getText());
        int pReferencia = Integer.parseInt(libroVista.txtPReferencia.getText());
        int anioPublic = Integer.parseInt(libroVista.txtAnio.getText());
        int idioma = Integer.parseInt((String) libroVista.cbxIdioma.getSelectedItem());
        int autor = Integer.parseInt((String) libroVista.cbxAutor.getSelectedItem());
        int editorial = Integer.parseInt((String) libroVista.cbxEditorial.getSelectedItem());
        int categoria = Integer.parseInt((String) libroVista.cbxCategoria.getSelectedItem());
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
                    int r = dao.agregar(l);


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
            int idioma = Integer.parseInt((String) libroVista.cbxIdioma.getSelectedItem());
            int autor = Integer.parseInt((String) libroVista.cbxAutor.getSelectedItem());
            int editorial = Integer.parseInt((String) libroVista.cbxEditorial.getSelectedItem());
            int categoria = Integer.parseInt((String) libroVista.cbxCategoria.getSelectedItem());
   //         int estado = Integer.parseInt((String) libroVista.cbxEstado.getSelectedItem());;
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
  //          l.setEstado(estado);
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
    
   
    
}
