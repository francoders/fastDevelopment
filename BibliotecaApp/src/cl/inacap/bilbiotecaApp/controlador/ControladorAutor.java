package cl.inacap.bilbiotecaApp.controlador;

import cl.inacap.bibliotecaApp.modelo.Autor;
import cl.inacap.bibliotecaApp.modelo.AutorDAO;
import cl.inacap.bibliotecaApp.vista.AutorFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * Clase ControladorAutor: contiene los metodos para crear, modificar, eliminar y actualizar un autor,
 * este tiene relacion con la parte grafica de la aplicacion, es el que valida el ingreso de los datos y 
 * los muestra en pantalla.
 */
public class ControladorAutor implements ActionListener {
    
    AutorDAO dao = new AutorDAO();
    Autor a = new Autor();
    AutorFrame autorVista = new AutorFrame();
    DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * ControladoAutor: metodo publico que recibe la vista de los autores, mediante un escuchador activa los botones 
     * btnListar, btnAgregar, btnNuevo, btnEditar, btnActualizar y btnEliminar
     * @param a tipo AutorFrame
     * 
     */
    
    public ControladorAutor(AutorFrame a){
        this.autorVista = a;
        this.autorVista.listar_autor_btn.addActionListener(this);
        this.autorVista.agregar_autor_btn.addActionListener(this);
        this.autorVista.limpiar_autor_btn.addActionListener(this);
        this.autorVista.editar_autor_btn.addActionListener(this);
        this.autorVista.actualizar_autor_btn.addActionListener(this);
        this.autorVista.eliminar_autor_btn.addActionListener(this);
    }
    
    /**
     * actionPerformed: metodo publico que proporciona las funciones a cada boton 
     * cuando son clickeados por el usuario
     * @param e tipo ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == autorVista.listar_autor_btn) {
            limpiarTabla();
            listar(autorVista.tabla);
            nuevo();
        }
        if (e.getSource() == autorVista.limpiar_autor_btn) {
            nuevo();
        }
        if (e.getSource() == autorVista.agregar_autor_btn) {
            agregar();
            listar(autorVista.tabla);
            nuevo();
        }
        if (e.getSource() == autorVista.editar_autor_btn) {
            int fila = autorVista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(autorVista, "Debe seleccionar una fila");
           }else{
                JOptionPane.showMessageDialog(autorVista, "Modifica el dato y haz click en Actualizar");
                int id = Integer.parseInt((String) autorVista.tabla.getValueAt(fila, 0).toString());
                String nombre = (String) autorVista.tabla.getValueAt(fila, 1);
                String apellidoPaterno = (String) autorVista.tabla.getValueAt(fila,2);
                String apellidoMaterno = (String) autorVista.tabla.getValueAt(fila,3);
                autorVista.nom_autor_txt.setText(nombre);
                autorVista.ape_paterno_autor.setText(apellidoPaterno);
                autorVista.ape_materno_autor.setText(apellidoMaterno);
                autorVista.id_autor_txt.setText(""+id);
            }
        }
         if (e.getSource() == autorVista.actualizar_autor_btn) {
            actualizar();
            listar(autorVista.tabla);
            nuevo();
        }
        if (e.getSource() == autorVista.eliminar_autor_btn) {
            eliminar();
            listar(autorVista.tabla);
            nuevo();
        }
    }
    
    /**
     * listar: metodo publico que recibe la tabla ubicada en la parte grafica de la aplicacion,
     * centra los contenidos de la tabla con el metodo centrarCeldas, define la tabla como 
     * el modelo de tabla por defecto, llama al listar en la clase AutorDAO, crea un objeto que 
     * contiene los datos de los autores y estos son añadidos a la tabla
     * @param tabla tipo jTable
     */
    public void listar(JTable tabla){
        centrarCeldas(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Autor> lista = dao.listar();
        Object[] objeto = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
        objeto[0] = lista.get(i).getId();
        objeto[1] = lista.get(i).getNombre();
        objeto[2] = lista.get(i).getApellidoPaterno();
        objeto[3] = lista.get(i).getApellidoMaterno();
        modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);
        
    }
    
    /**
     * agregar: metodo publico que obtiene los valores ingresados por el usuario y 
     * los añade usando el metodo agregar de la clase AutorDAO
     */
    public void agregar(){
        String nombre = autorVista.nom_autor_txt.getText();
        String apellidoPaterno = autorVista.ape_paterno_autor.getText();
        String apellidoMaterno = autorVista.ape_materno_autor.getText();
        a.setNombre(nombre);
        a.setApellidoPaterno(apellidoPaterno);
        a.setApellidoMaterno(apellidoMaterno);
        int r = dao.agregar(a);
        if (r == 1) {
            JOptionPane.showMessageDialog(autorVista, "Autor agregado");
        }else{
            JOptionPane.showMessageDialog(autorVista, "Error al agregar");
        }
        limpiarTabla();
    }
    
    
    /**
     * actualizar: metodo publico que al seleccionar un autor, muestra los valores nuevamente
     * en los jTextField para poder ser modificados
     */
    public void actualizar(){
        if (autorVista.id_autor_txt.getText().equals("")) {
            JOptionPane.showMessageDialog(autorVista, "No se identifica el id");
        }else{
            int id = Integer.parseInt(autorVista.id_autor_txt.getText());
            String nombre = autorVista.nom_autor_txt.getText();
            String apellidoPaterno = autorVista.ape_paterno_autor.getText();
            String apellidoMaterno = autorVista.ape_materno_autor.getText();
            a.setNombre(nombre);
            a.setId(id);
            a.setApellidoPaterno(apellidoPaterno);
            a.setApellidoMaterno(apellidoMaterno);
            int r = dao.actualizar(a);
            if (r == 1) {
                JOptionPane.showMessageDialog(autorVista, "El autor se ha actualizado");
            }else{
                JOptionPane.showMessageDialog(autorVista, "Error al actualizar");
            }
        }
        limpiarTabla();
    }
   
    /**
     * eliminar: metodo publico que eliminar a los usuarios de la tabla mediante el id 
     * que se encuentra en la fila correspondiente a este
     */
    public void eliminar(){
        int fila = autorVista.tabla.getSelectedRow();
        try {
            if (fila == -1) {
                JOptionPane.showMessageDialog(autorVista, "Debe seleccionar una fila");
            }else{
            JOptionPane.showMessageDialog(autorVista, "Categoria Eliminada");
            int id = Integer.parseInt((String) autorVista.tabla.getValueAt(fila, 0).toString());
            dao.eliminar(id); 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        limpiarTabla();
    }
    /**
     * nuevo: metodo que deja en blanco los jTextField
     */
     void nuevo() {
        autorVista.nom_autor_txt.setText("");
        autorVista.ape_paterno_autor.setText("");
        autorVista.ape_materno_autor.setText("");
        autorVista.id_autor_txt.setText("");
        autorVista.requestFocus();
    }
     
    /**
     * limpiarTabla: metodo que deja en blanco la tabla de autores
     */
     void limpiarTabla() {
        for (int i = 0; i < autorVista.tabla.getRowCount(); i++) {
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
        for (int i = 0; i < autorVista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }
}
