package cl.inacap.bibliotecaApp.vista;

import cl.inacap.bibliotecaApp.modelo.LibroDAO;
import cl.inacap.bilbiotecaApp.controlador.ControladorLibro;
import java.awt.Image;
import java.awt.Toolkit;



public class LibroFrame extends javax.swing.JFrame{
    LibroDAO dao = new LibroDAO();
    public LibroFrame(){
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        dao.buscarIdioma(cbxIdioma);
        dao.buscarEditorial(cbxEditorial);
        dao.buscarAutor(cbxAutor);
        dao.buscarEstado(cbxEstado);
        dao.buscarCategoria(cbxCategoria);
    }   
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono_img.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        txtIdioma = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        cbxEditorial = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        cbxIdioma = new javax.swing.JComboBox<>();
        cbxAutor = new javax.swing.JComboBox<>();
        cbxCategoria = new javax.swing.JComboBox<>();
        flechaa = new javax.swing.JLabel();
        txtNSerie = new javax.swing.JTextField();
        txtIsbn = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtNPaginas = new javax.swing.JTextField();
        txtPReferencia = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        txtIdioma.setBackground(new java.awt.Color(11, 0, 32));
        txtIdioma.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        txtIdioma.setForeground(new java.awt.Color(255, 255, 255));
        txtIdioma.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Fast Development - Libro");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(39, 151, 212));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ISBN");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 90, -1));

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Idioma");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 100, 20));

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Titulo");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Editorial");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jLabel11.setBackground(new java.awt.Color(11, 0, 32));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registro de Libro");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 210, -1));

        btnAgregar.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar Libro");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, 190, 40));

        btnNuevo.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevo.setText("Limpiar texto");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        jPanel4.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 130, 40));

        jLabel24.setBackground(new java.awt.Color(102, 102, 102));
        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("N° Serie");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel25.setBackground(new java.awt.Color(102, 102, 102));
        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Año publicacion");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 190, 20));

        jLabel26.setBackground(new java.awt.Color(102, 102, 102));
        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("N° Páginas ");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel27.setBackground(new java.awt.Color(102, 102, 102));
        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Autor");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 90, -1));

        jLabel29.setBackground(new java.awt.Color(102, 102, 102));
        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Categoria");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 100, 20));

        jLabel30.setBackground(new java.awt.Color(102, 102, 102));
        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Estado");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 100, -1));

        cbxEstado.setBackground(java.awt.SystemColor.controlLtHighlight);
        cbxEstado.setForeground(new java.awt.Color(0, 0, 0));
        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });
        jPanel4.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 190, 40));

        cbxEditorial.setBackground(java.awt.SystemColor.controlLtHighlight);
        cbxEditorial.setForeground(new java.awt.Color(0, 0, 0));
        cbxEditorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEditorialActionPerformed(evt);
            }
        });
        jPanel4.add(cbxEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 430, 40));

        jLabel28.setBackground(new java.awt.Color(102, 102, 102));
        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Precio");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 90, 20));

        cbxIdioma.setBackground(java.awt.SystemColor.controlLtHighlight);
        cbxIdioma.setForeground(new java.awt.Color(0, 0, 0));
        cbxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cbxIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 190, 40));

        cbxAutor.setBackground(java.awt.SystemColor.controlLtHighlight);
        cbxAutor.setForeground(new java.awt.Color(0, 0, 0));
        cbxAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cbxAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 190, 40));

        cbxCategoria.setBackground(java.awt.SystemColor.controlLtHighlight);
        cbxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 190, 40));

        flechaa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_img.png"))); // NOI18N
        flechaa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaaMouseClicked(evt);
            }
        });
        jPanel4.add(flechaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 70));

        txtNSerie.setBackground(java.awt.SystemColor.controlLtHighlight);
        txtNSerie.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(txtNSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 220, 35));

        txtIsbn.setBackground(java.awt.SystemColor.controlLtHighlight);
        txtIsbn.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(txtIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 190, 35));

        txtTitulo.setBackground(java.awt.SystemColor.controlLtHighlight);
        txtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 430, 35));

        txtNPaginas.setBackground(java.awt.SystemColor.controlLtHighlight);
        txtNPaginas.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(txtNPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 110, 35));

        txtPReferencia.setBackground(java.awt.SystemColor.controlLtHighlight);
        txtPReferencia.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(txtPReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 120, 35));

        txtAnio.setBackground(java.awt.SystemColor.controlLtHighlight);
        txtAnio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(txtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 140, 35));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 700));

        btnEliminar.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 600, 40));

        btnActualizar.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 130, 190, 40));

        btnEditar.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 200, 40));

        btnListar.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnListar.setForeground(new java.awt.Color(0, 0, 0));
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel3.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 190, 40));

        tabla = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        tabla.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° SERIE", "ISBN", "TITULO", "N° PÁGINAS", "PRECIO REFE", "AÑO PUBLIC", "IDIOMA", "AUTOR", "CATEGORIA", "EDITORIAL", "ESTADO"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setFocusable(false);
        tabla.setRowMargin(4);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tabla);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 900, 340));

        jLabel21.setBackground(new java.awt.Color(11, 0, 32));
        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(11, 0, 32));
        jLabel21.setText("Tabla de libros");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1513, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
      
    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void cbxEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEditorialActionPerformed

    private void flechaaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaaMouseClicked
        GestionDatosFrame gtFrame = new GestionDatosFrame();
        gtFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_flechaaMouseClicked

    public static void main(String args[]){
       LibroFrame l = new LibroFrame();
       ControladorLibro con = new ControladorLibro(l);
       l.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnListar;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JComboBox<String> cbxAutor;
    public javax.swing.JComboBox<String> cbxCategoria;
    public javax.swing.JComboBox<String> cbxEditorial;
    public javax.swing.JComboBox<String> cbxEstado;
    public javax.swing.JComboBox<String> cbxIdioma;
    public javax.swing.JLabel flechaa;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    public javax.swing.JTable tabla;
    public javax.swing.JTextField txtAnio;
    public javax.swing.JTextField txtIdioma;
    public javax.swing.JTextField txtIsbn;
    public javax.swing.JTextField txtNPaginas;
    public javax.swing.JTextField txtNSerie;
    public javax.swing.JTextField txtPReferencia;
    public javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
