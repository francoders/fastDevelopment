package cl.inacap.bibliotecaApp.vista;
import cl.inacap.bilbiotecaApp.controlador.ControladorDistribuidor;
import java.awt.Image;
import java.awt.Toolkit;

public class DistribuidorFrame extends javax.swing.JFrame{
    public DistribuidorFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(getIconImage());
    }

    // ICONO JFRAME PRINCIPAL
    @Override
    public Image getIconImage() {
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        agregar_distribuidor_btn = new javax.swing.JButton();
        limpiar_distribuidor_btn = new javax.swing.JButton();
        flecha = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        nom_distribuidor_txt = new javax.swing.JTextField();
        direccion_distribuidor_txt = new javax.swing.JTextField();
        fono_distribuidor_txt = new javax.swing.JTextField();
        rut_distribuidor_txt = new javax.swing.JTextField();
        anio_distribuidor_txt = new javax.swing.JTextField();
        id_distribuidor_txt = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Fast Development - Distribuidor");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(39, 151, 212));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nombre");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefono");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Rut");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, 20));

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Direccion");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ID");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        jLabel11.setBackground(new java.awt.Color(11, 0, 32));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Distribuidor");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        agregar_distribuidor_btn.setBackground(java.awt.SystemColor.controlLtHighlight);
        agregar_distribuidor_btn.setForeground(new java.awt.Color(0, 0, 0));
        agregar_distribuidor_btn.setText("Agregar");
        agregar_distribuidor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_distribuidor_btnActionPerformed(evt);
            }
        });
        jPanel4.add(agregar_distribuidor_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 140, 50));

        limpiar_distribuidor_btn.setBackground(java.awt.SystemColor.controlLtHighlight);
        limpiar_distribuidor_btn.setForeground(new java.awt.Color(0, 0, 0));
        limpiar_distribuidor_btn.setText("Limpiar textos");
        limpiar_distribuidor_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiar_distribuidor_btnMouseClicked(evt);
            }
        });
        jPanel4.add(limpiar_distribuidor_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 140, 50));

        flecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_img.png"))); // NOI18N
        flecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaMouseClicked(evt);
            }
        });
        jPanel4.add(flecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 70));

        jLabel22.setBackground(new java.awt.Color(102, 102, 102));
        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Año de venta");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        nom_distribuidor_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        nom_distribuidor_txt.setForeground(new java.awt.Color(0, 0, 0));
        nom_distribuidor_txt.setToolTipText("");
        jPanel4.add(nom_distribuidor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 320, 40));

        direccion_distribuidor_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        direccion_distribuidor_txt.setForeground(java.awt.SystemColor.activeCaptionText);
        direccion_distribuidor_txt.setToolTipText("");
        jPanel4.add(direccion_distribuidor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 320, 40));

        fono_distribuidor_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        fono_distribuidor_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(fono_distribuidor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 320, 40));

        rut_distribuidor_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        rut_distribuidor_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(rut_distribuidor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 320, 40));

        anio_distribuidor_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        anio_distribuidor_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(anio_distribuidor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 140, 40));

        id_distribuidor_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        id_distribuidor_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(id_distribuidor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 140, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 610));

        btnDelete.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Eliminar");
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 350, 40));

        btnActualizar.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, 110, 40));

        btnEditar.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 110, 40));

        btnListar.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnListar.setForeground(new java.awt.Color(0, 0, 0));
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel3.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 110, 40));

        tabla = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT", "NOMBRE", "TELEFONO", "AÑO VENTA", "DIRECCION"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setFocusable(false);
        tabla.setRowMargin(4);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla.getColumnModel().getColumn(1).setMaxWidth(220);
            tabla.getColumnModel().getColumn(2).setMaxWidth(250);
            tabla.getColumnModel().getColumn(3).setMaxWidth(80);
            tabla.getColumnModel().getColumn(4).setMaxWidth(70);
            tabla.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 610, 280));

        jLabel21.setBackground(new java.awt.Color(11, 0, 32));
        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(11, 0, 32));
        jLabel21.setText("Tabla de distribuidores");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed

    private void agregar_distribuidor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_distribuidor_btnActionPerformed

    }//GEN-LAST:event_agregar_distribuidor_btnActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void limpiar_distribuidor_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiar_distribuidor_btnMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_limpiar_distribuidor_btnMouseClicked

    private void flechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaMouseClicked
        GestionDatosFrame gtFrame = new GestionDatosFrame();
        gtFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_flechaMouseClicked

    public static void main(String args[]) {
        DistribuidorFrame v = new DistribuidorFrame();
        ControladorDistribuidor con = new ControladorDistribuidor(v);
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregar_distribuidor_btn;
    public javax.swing.JTextField anio_distribuidor_txt;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnListar;
    public javax.swing.JTextField direccion_distribuidor_txt;
    public javax.swing.JLabel flecha;
    public javax.swing.JTextField fono_distribuidor_txt;
    public javax.swing.JTextField id_distribuidor_txt;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    public javax.swing.JButton limpiar_distribuidor_btn;
    public javax.swing.JTextField nom_distribuidor_txt;
    public javax.swing.JTextField rut_distribuidor_txt;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
