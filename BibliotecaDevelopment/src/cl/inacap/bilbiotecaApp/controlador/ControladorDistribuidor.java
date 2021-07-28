package cl.inacap.bilbiotecaApp.controlador;

import cl.inacap.bibliotecaApp.modelo.Distribuidor;
import cl.inacap.bibliotecaApp.modelo.DistribuidorDAO;
import cl.inacap.bibliotecaApp.vista.DistribuidorVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * Clase ControladorDistribuidor: contiene los metodos para crear, modificar, eliminar y actualizar un distribuidor,
 * este tiene relacion con la parte grafica de la aplicacion, es el que valida el ingreso de los datos y 
 * los muestra en pantalla.
 * @author Cristobal Cortés
 * @since 12/05/2020
 * @version 1.0
 */
public class ControladorDistribuidor implements ActionListener {

    DistribuidorDAO dao = new DistribuidorDAO();
    Distribuidor d = new Distribuidor();
    DistribuidorVista distribuidorVista = new DistribuidorVista();
    DefaultTableModel modelo = new DefaultTableModel();

    
     /**
     * ControladorDistribuiodor: metodo publico que recibe la vista de los distribuidores, mediante un escuchador activa los botones 
     * btnListar, btnAgregar, btnNuevo, btnEditar, btnActualizar y btnEliminar
     * @param d tipo DistribuidorVista
     * 
     */
    public ControladorDistribuidor(DistribuidorVista d) {
        this.distribuidorVista = d;
        this.distribuidorVista.btnListar.addActionListener(this);
        this.distribuidorVista.btnAgregar.addActionListener(this);
        this.distribuidorVista.btnEditar.addActionListener(this);
        this.distribuidorVista.btnDelete.addActionListener(this);
        this.distribuidorVista.btnActualizar.addActionListener(this);
        this.distribuidorVista.btnNuevo.addActionListener(this);
    }
    
    /**
     * actionPerformed: metodo publico que proporciona las funciones a cada boton 
     * cuando son clickeados por el usuario
     * @param e tipo ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == distribuidorVista.btnListar) {
            limpiarTabla();
            listar(distribuidorVista.tabla);
            nuevo();
        }
        if (e.getSource() == distribuidorVista.btnAgregar) {
            agregar();
            listar(distribuidorVista.tabla);
            nuevo();
        }
        if (e.getSource() == distribuidorVista.btnEditar) {
            int fila = distribuidorVista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(distribuidorVista, "Debe seleccionar una fila");
            } else {
                
                String nombre = (String) distribuidorVista.tabla.getValueAt(fila, 0);
                String direccion = (String) distribuidorVista.tabla.getValueAt(fila, 1);
                int tel = Integer.parseInt((String) distribuidorVista.tabla.getValueAt(fila, 2).toString());
                int rut = Integer.parseInt((String) distribuidorVista.tabla.getValueAt(fila, 3).toString());
                int anioVenta = Integer.parseInt((String)distribuidorVista.tabla.getValueAt(fila, 4).toString());
                distribuidorVista.txtNom.setText(nombre);
                distribuidorVista.txtDireccion.setText(direccion);
                distribuidorVista.txtTel.setText(""+tel);
                distribuidorVista.txtRut.setText(""+rut);
                distribuidorVista.txtAnio.setText(""+anioVenta);
            }
        }
        if (e.getSource() == distribuidorVista.btnActualizar) {
            actualizar();
            listar(distribuidorVista.tabla);
            nuevo();

        }
        if (e.getSource() == distribuidorVista.btnDelete) {
            eliminar();
            listar(distribuidorVista.tabla);
            nuevo();
        }
        if (e.getSource() == distribuidorVista.btnNuevo) {
            nuevo();
        }

    }
    /**
     * nuevo: metodo que deja en blanco los jTextField
     */
    void nuevo() {
        distribuidorVista.txtRut.setText("");
        distribuidorVista.txtNom.setText("");
        distribuidorVista.txtTel.setText("");
        distribuidorVista.txtDireccion.setText("");
        distribuidorVista.txtAnio.setText("");
        distribuidorVista.txtNom.requestFocus();
    }
    
    /**
     * eliminar: metodo publico que eliminar a los distribuidores de la tabla mediante el id 
     * que se encuentra en la fila correspondiente a este
     */
    public void eliminar() {
        int fila = distribuidorVista.tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(distribuidorVista, "Debe seleccionar una fila");
        } else {
            int rut = Integer.parseInt((String) distribuidorVista.tabla.getValueAt(fila, 3).toString());
            dao.eliminar(rut);
            System.out.println("El rut es" + rut);
            JOptionPane.showMessageDialog(distribuidorVista, "El distribuidor ha sido eliminado!!!");
        }
        limpiarTabla();
    }

     /**
     * agregar: metodo publico que obtiene los valores ingresados por el usuario y 
     * los añade usando el metodo agregar de la clase DistribuidorDAO
     */
    public void agregar() {
        String nombre = distribuidorVista.txtNom.getText().trim();
        String direccion = distribuidorVista.txtDireccion.getText().trim();
        int tel = Integer.parseInt(distribuidorVista.txtTel.getText().toString().trim());
        int rut = Integer.parseInt(distribuidorVista.txtRut.getText().toString().trim());
        int anioVenta = Integer.parseInt(distribuidorVista.txtAnio.getText().toString().trim());
        
        d.setNombreEmpresa(nombre);
        d.setDireccion(direccion);
        d.setTelefono(tel);
        d.setRutDistribuidor(rut);
        d.setAnioVenta(anioVenta);
       
        int r = dao.agregar(d);
        if (r == 1) {
            JOptionPane.showMessageDialog(distribuidorVista, "Distribuidor agregado");
        } else {
            JOptionPane.showMessageDialog(distribuidorVista, "Error al agregar");
        }
        limpiarTabla();
    }

    /**
     * actualizar: metodo publico que al seleccionar un distribuidor, muestra los valores nuevamente
     * en los jTextField para poder ser modificados
     */
    public void actualizar() {
        if (distribuidorVista.txtRut.getText().equals("")) {
            JOptionPane.showMessageDialog(distribuidorVista, "No se Identifica el rut debe selecionar la opcion Editar");
        } else {
            int rut = Integer.parseInt(distribuidorVista.txtRut.getText());
            String nombre = distribuidorVista.txtNom.getText();
            String direccion = distribuidorVista.txtDireccion.getText();
            int tel = Integer.parseInt(distribuidorVista.txtTel.getText());
            int anioVenta = Integer.parseInt(distribuidorVista.txtAnio.getText());
            
            d.setNombreEmpresa(nombre);
            d.setDireccion(direccion);
            d.setTelefono(tel);
            d.setRutDistribuidor(rut);  
            d.setAnioVenta(anioVenta);
            int r = dao.actualizar(d);
            if (r == 1) {
                JOptionPane.showMessageDialog(distribuidorVista, "El distribuidor se ha actualizado");
            } else {
                JOptionPane.showMessageDialog(distribuidorVista, "Error al actualizar");
            }
        }
        limpiarTabla();
    }
    
    /**
     * listar: metodo publico que recibe la tabla ubicada en la parte grafica de la aplicacion,
     * centra los contenidos de la tabla con el metodo centrarCeldas, define la tabla como 
     * el modelo de tabla por defecto, llama al listar en la clase DistribuidorDAO, crea un objeto que 
     * contiene los datos de los distribuidores y estos son añadidos a la tabla
     * @param tabla tipo jTable
     */
    public void listar(JTable tabla) {
        centrarCeldas(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Distribuidor> lista = dao.listar();
        Object[] objeto = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getNombreEmpresa();
            objeto[1] = lista.get(i).getDireccion();
            objeto[2] = lista.get(i).getTelefono(); 
            objeto[3] = lista.get(i).getRutDistribuidor();
            objeto[4] = lista.get(i).getAnioVenta();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);

    }
       
    
     /**
      * centrarCeldas: metodo que recibe la tabla y las centra de manera ordenada
      * @param tabla de tipo JTable
      */
    void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < distribuidorVista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }
    
     /**
     * limpiarTabla: metodo que deja en blanco la tabla de distribuidores
     */
    void limpiarTabla() {
        for (int i = 0; i < distribuidorVista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
}
