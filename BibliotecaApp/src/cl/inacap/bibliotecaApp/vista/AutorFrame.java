/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.vista;

import cl.inacap.bilbiotecaApp.controlador.ControladorAutor;
import cl.inacap.bilbiotecaApp.controlador.ControladorCategoria;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Corvalan
 */
public class AutorFrame extends javax.swing.JFrame {

    /**
     * Creates new form Libro
     */
    public AutorFrame() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono_img.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nom_autor_txt = new javax.swing.JTextField();
        ape_paterno_autor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ape_materno_autor = new javax.swing.JTextField();
        agregar_autor_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        limpiar_autor_btn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        id_autor_txt = new javax.swing.JTextField();
        flecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        eliminar_autor_btn = new javax.swing.JButton();
        listar_autor_btn = new javax.swing.JButton();
        editar_autor_btn = new javax.swing.JButton();
        actualizar_autor_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autor - FastDevelopment");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(39, 151, 212));
        jPanel2.setForeground(new java.awt.Color(51, 0, 51));

        nom_autor_txt.setBackground(new java.awt.Color(255, 255, 255));
        nom_autor_txt.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        nom_autor_txt.setForeground(new java.awt.Color(0, 0, 0));
        nom_autor_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nom_autor_txt.setToolTipText("");
        nom_autor_txt.setBorder(null);
        nom_autor_txt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nom_autor_txt.setSelectedTextColor(new java.awt.Color(11, 0, 32));

        ape_paterno_autor.setBackground(new java.awt.Color(255, 255, 255));
        ape_paterno_autor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        ape_paterno_autor.setForeground(new java.awt.Color(0, 0, 0));
        ape_paterno_autor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ape_paterno_autor.setToolTipText("");
        ape_paterno_autor.setBorder(null);
        ape_paterno_autor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ape_paterno_autor.setSelectedTextColor(new java.awt.Color(11, 0, 32));

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Apellido Paterno");

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Apellido Materno");

        ape_materno_autor.setBackground(new java.awt.Color(255, 255, 255));
        ape_materno_autor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        ape_materno_autor.setForeground(new java.awt.Color(0, 0, 0));
        ape_materno_autor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ape_materno_autor.setToolTipText("");
        ape_materno_autor.setBorder(null);
        ape_materno_autor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ape_materno_autor.setSelectedTextColor(new java.awt.Color(11, 0, 32));

        agregar_autor_btn.setBackground(new java.awt.Color(255, 255, 255));
        agregar_autor_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        agregar_autor_btn.setText("Agregar");
        agregar_autor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_autor_btnActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(11, 0, 32));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ingresar Autor");

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nombre");

        limpiar_autor_btn.setBackground(new java.awt.Color(255, 255, 255));
        limpiar_autor_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        limpiar_autor_btn.setText("Limpiar texto");
        limpiar_autor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_autor_btnActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID");

        id_autor_txt.setBackground(new java.awt.Color(255, 255, 255));
        id_autor_txt.setForeground(new java.awt.Color(0, 0, 0));

        flecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_img.png"))); // NOI18N
        flecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(flecha, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(ape_paterno_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(nom_autor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(agregar_autor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(limpiar_autor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ape_materno_autor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(id_autor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(flecha))
                .addGap(51, 51, 51)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom_autor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ape_paterno_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ape_materno_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_autor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar_autor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar_autor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 600));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno"
            }
        ));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 550, 280));

        jLabel18.setBackground(new java.awt.Color(11, 0, 32));
        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(11, 0, 32));
        jLabel18.setText("Tabla de autores");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, -1));

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(11, 0, 32));
        jLabel19.setText("Selecciona un autor en la tabla, puedes listar, editar, ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        eliminar_autor_btn.setBackground(new java.awt.Color(255, 255, 255));
        eliminar_autor_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        eliminar_autor_btn.setText("Eliminar");
        eliminar_autor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_autor_btnActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_autor_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 370, 37));

        listar_autor_btn.setBackground(new java.awt.Color(255, 255, 255));
        listar_autor_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        listar_autor_btn.setText("Listar");
        listar_autor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_autor_btnActionPerformed(evt);
            }
        });
        jPanel1.add(listar_autor_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 120, 37));

        editar_autor_btn.setBackground(new java.awt.Color(255, 255, 255));
        editar_autor_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        editar_autor_btn.setText("Editar");
        editar_autor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_autor_btnActionPerformed(evt);
            }
        });
        jPanel1.add(editar_autor_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 120, 37));

        actualizar_autor_btn.setBackground(new java.awt.Color(255, 255, 255));
        actualizar_autor_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        actualizar_autor_btn.setText("Actualizar");
        actualizar_autor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_autor_btnActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar_autor_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 110, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_autor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_autor_btnActionPerformed

        
    }//GEN-LAST:event_agregar_autor_btnActionPerformed

    private void eliminar_autor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_autor_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_autor_btnActionPerformed

    private void listar_autor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_autor_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listar_autor_btnActionPerformed

    private void editar_autor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_autor_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editar_autor_btnActionPerformed

    private void actualizar_autor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_autor_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizar_autor_btnActionPerformed

    private void limpiar_autor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_autor_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiar_autor_btnActionPerformed

    private void flechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaMouseClicked
        GestionDatosFrame gtFrame = new GestionDatosFrame();
        gtFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_flechaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       AutorFrame a = new AutorFrame();
       ControladorAutor con = new ControladorAutor(a);
       a.setVisible(true);
       a.setLocationRelativeTo(null);
        
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizar_autor_btn;
    public javax.swing.JButton agregar_autor_btn;
    public javax.swing.JTextField ape_materno_autor;
    public javax.swing.JTextField ape_paterno_autor;
    public javax.swing.JButton editar_autor_btn;
    public javax.swing.JButton eliminar_autor_btn;
    public javax.swing.JLabel flecha;
    public javax.swing.JTextField id_autor_txt;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton limpiar_autor_btn;
    public javax.swing.JButton listar_autor_btn;
    public javax.swing.JTextField nom_autor_txt;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
