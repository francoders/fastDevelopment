package cl.inacap.bilbiotecaApp.controlador;

import cl.inacap.bibliotecaApp.modelo.Categoria;
import cl.inacap.bibliotecaApp.modelo.CategoriaDAO;

import cl.inacap.bibliotecaApp.vista.CategoriaFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * Clase ControladorAutor: contiene los metodos para crear, modificar, eliminar y actualizar una categoria,
 * este tiene relacion con la parte grafica de la aplicacion, es el que valida el ingreso de los datos y 
 * los muestra en pantalla.
 */
public class ControladorCategoria implements ActionListener {
    CategoriaDAO dao = new CategoriaDAO();
    Categoria c = new Categoria();
    CategoriaFrame categoriaVista = new CategoriaFrame();
    DefaultTableModel modelo = new DefaultTableModel();
    
     /**
     * ControladorCategoria: metodo publico que recibe la vista de las categorias, mediante un escuchador activa los botones 
     * btnListar, btnAgregar, btnNuevo, btnEditar, btnActualizar y btnEliminar
     * @param c tipo CategoriaFrame
     * 
     */
    
    public ControladorCategoria(CategoriaFrame c){
        this.categoriaVista = c;
        this.categoriaVista.btnListar.addActionListener(this);
        this.categoriaVista.btnAgregar.addActionListener(this);
        this.categoriaVista.btnEditar.addActionListener(this);
        this.categoriaVista.btnEliminar.addActionListener(this);
        this.categoriaVista.btnActualizar.addActionListener(this);
        this.categoriaVista.btnNuevo.addActionListener(this);
    }

    /**
     * actionPerformed: metodo publico que proporciona las funciones a cada
     * boton cuando son clickeados por el usuario
     *
     * @param e tipo ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == categoriaVista.btnListar) {
            limpiarTabla();
            listar(categoriaVista.tabla);
            nuevo();

        }
        if (e.getSource() == categoriaVista.btnAgregar) {
            agregar();
            listar(categoriaVista.tabla);
            nuevo();
        }
        if (e.getSource() == categoriaVista.btnEditar) {
            int fila = categoriaVista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(categoriaVista, "Debe seleccionar una fila");
            } else {
                JOptionPane.showMessageDialog(categoriaVista, "Modifica el dato y haz click en Actualizar");
                String categoriaTxt = (String) categoriaVista.tabla.getValueAt(fila, 0);
                int id = Integer.parseInt((String) categoriaVista.tabla.getValueAt(fila, 1).toString());
                categoriaVista.txtCategoria.setText(categoriaTxt);
                categoriaVista.txtId.setText("" + id);
            }
        }
        if (e.getSource() == categoriaVista.btnEliminar) {
            eliminar();
            listar(categoriaVista.tabla);
            nuevo();
        }
        if (e.getSource() == categoriaVista.btnNuevo) {
            nuevo();
        }
        if (e.getSource() == categoriaVista.btnActualizar) {
            actualizar();
            listar(categoriaVista.tabla);
            nuevo();
        }

    }

    /**
     * nuevo: metodo que deja en blanco los jTextField
     */
    void nuevo() {
        categoriaVista.txtCategoria.setText("");
        categoriaVista.txtId.setText("");
        categoriaVista.requestFocus();
    }

    /**
     * agregar: metodo publico que obtiene los valores ingresados por el usuario
     * y los añade usando el metodo agregar de la clase CategoriaDAO
     */
    public void agregar() {
        String categoriaTxt = categoriaVista.txtCategoria.getText();
        c.setNombreCategoria(categoriaTxt);
        if (categoriaTxt.equals("")) {
            JOptionPane.showMessageDialog(categoriaVista, "Ingrese una Categoria!");
        } else {

            int r = dao.agregar(c);
            if (r == 1) {
                JOptionPane.showMessageDialog(categoriaVista, "Categoria agregada");
            } else {
                JOptionPane.showMessageDialog(categoriaVista, "Error al agregar");
            }
            limpiarTabla();
        }
    }

    /**
     * actualizar: metodo publico que al seleccionar una categoria, muestra los valores nuevamente
     * en los jTextField para poder ser modificados
     */
    public void actualizar(){
        if (categoriaVista.txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(categoriaVista, "No se identifica el id");
        }else{
            int id = Integer.parseInt(categoriaVista.txtId.getText());
            String categoriaTxt = categoriaVista.txtCategoria.getText();
            c.setNombreCategoria(categoriaTxt);
            c.setIdCategoria(id);
            int  r = dao.actualizar(c);
            if (r == 1) {
                JOptionPane.showMessageDialog(categoriaVista, "La categoria se ha actualizado");
            }else{
                JOptionPane.showMessageDialog(categoriaVista, "Error al actualizar");
            }
        }
        limpiarTabla();
    }
    
    /**
     * listar: metodo publico que recibe la tabla ubicada en la parte grafica de la aplicacion,
     * centra los contenidos de la tabla con el metodo centrarCeldas, define la tabla como 
     * el modelo de tabla por defecto, llama al listar en la clase CategoriaDAO, crea un objeto que 
     * contiene los datos de las categorias y estos son añadidos a la tabla
     * @param tabla tipo jTable
     */
    public void listar(JTable tabla) {
        centrarCeldas(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Categoria> lista = dao.listar();
        Object[] objeto = new Object[2];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getNombreCategoria();
            objeto[1] = lista.get(i).getIdCategoria();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);

    }
    
    /**
     * eliminar: metodo publico que elimina a las categorias de la tabla mediante el id 
     * que se encuentra en la fila correspondiente a este
     */
    public void eliminar(){
        int fila = categoriaVista.tabla.getSelectedRow();
        try {
            if (fila == -1) {
            JOptionPane.showMessageDialog(categoriaVista, "Debe seleccionar una fila");
        }else{
            JOptionPane.showMessageDialog(categoriaVista, "Categoria Eliminada");
            int id = Integer.parseInt((String) categoriaVista.tabla.getValueAt(fila, 1).toString());
            dao.eliminar(id); 
        }
        } catch (Exception e) {
            System.out.println(e);            
        }
        
        limpiarTabla();
    }
    /**
     * limpiarTabla: metodo que deja en blanco la tabla de categorias
     */
    void limpiarTabla() {
        for (int i = 0; i < categoriaVista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
     /**
      * centrarCeldas: metodo que recibe la tabla y las centra de manera ordenada
      * @param tabla de tipo JTable
      */
    void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < categoriaVista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }
      
    
}
