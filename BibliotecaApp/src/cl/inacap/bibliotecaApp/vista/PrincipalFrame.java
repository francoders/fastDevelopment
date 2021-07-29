/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.vista;

import cl.inacap.bilbiotecaApp.controlador.ControladorCategoria;
import cl.inacap.bilbiotecaApp.controlador.ControladorDistribuidor;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Corvalan
 */
public class PrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalFrame() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        
    }

    // ICONO JFRAME PRINCIPAL
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono_img.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        panelIngresoDatos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        gestionDatoPanel = new javax.swing.JLabel();
        ventaLibroPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        entrar_btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Fast Development");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIngresoDatos.setBackground(java.awt.SystemColor.controlHighlight);
        panelIngresoDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelIngresoDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelIngresoDatosMouseClicked(evt);
            }
        });

        gestionDatoPanel.setBackground(new java.awt.Color(11, 0, 32));
        gestionDatoPanel.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 10)); // NOI18N
        gestionDatoPanel.setForeground(new java.awt.Color(11, 0, 32));
        gestionDatoPanel.setText("Gestión de Datos");

        javax.swing.GroupLayout panelIngresoDatosLayout = new javax.swing.GroupLayout(panelIngresoDatos);
        panelIngresoDatos.setLayout(panelIngresoDatosLayout);
        panelIngresoDatosLayout.setHorizontalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel5))
                    .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(gestionDatoPanel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIngresoDatosLayout.setVerticalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gestionDatoPanel)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelIngresoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 130, 40));

        ventaLibroPanel.setBackground(java.awt.SystemColor.controlHighlight);
        ventaLibroPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ventaLibroPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventaLibroPanelMouseClicked(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(11, 0, 32));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(11, 0, 32));
        jLabel20.setText("Ingreso de Ventas");

        javax.swing.GroupLayout ventaLibroPanelLayout = new javax.swing.GroupLayout(ventaLibroPanel);
        ventaLibroPanel.setLayout(ventaLibroPanelLayout);
        ventaLibroPanelLayout.setHorizontalGroup(
            ventaLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventaLibroPanelLayout.createSequentialGroup()
                .addGroup(ventaLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventaLibroPanelLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel7))
                    .addGroup(ventaLibroPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventaLibroPanelLayout.setVerticalGroup(
            ventaLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventaLibroPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(ventaLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(ventaLibroPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 130, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_libro.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 450, 570));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 140, 50));

        txt_password.setBackground(java.awt.SystemColor.controlLtHighlight);
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 250, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Usuario - RUT");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, 40));

        txt_rut.setBackground(java.awt.SystemColor.controlLtHighlight);
        jPanel1.add(txt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 250, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 110, 40));

        entrar_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entrar_btn.setText("Iniciar Sesion");
        jPanel1.add(entrar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 110, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_inicio.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 590, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 880, 580));

        jPanel2.setBackground(new java.awt.Color(39, 151, 212));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 0, 32));
        jLabel1.setText("Biblioteca Fast Development");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 0, 32));
        jLabel2.setText("Sistema de Gestion de Libros");

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_img.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelIngresoDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIngresoDatosMouseClicked
       GestionDatosFrame datos = new GestionDatosFrame();
       datos.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_panelIngresoDatosMouseClicked

    private void ventaLibroPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventaLibroPanelMouseClicked
       IngresoVentas ventas = new IngresoVentas(); 
       ventas.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_ventaLibroPanelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegistroTrabajadorFrame registroTrabajador = new RegistroTrabajadorFrame();
        registroTrabajador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton entrar_btn;
    private javax.swing.JLabel gestionDatoPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel panelIngresoDatos;
    public javax.swing.JTextField txt_password;
    public javax.swing.JTextField txt_rut;
    private javax.swing.JPanel ventaLibroPanel;
    // End of variables declaration//GEN-END:variables
}
