/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.vista;

import cl.inacap.bilbiotecaApp.controlador.ControladorAutor;
import cl.inacap.bilbiotecaApp.controlador.ControladorCategoria;
import cl.inacap.bilbiotecaApp.controlador.ControladorDistribuidor;
import cl.inacap.bilbiotecaApp.controlador.ControladorIdioma;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Corvalan
 */
public class GestionDatosFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalFrame
     */
    public GestionDatosFrame() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        
    }

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JLabel();
        panelLibro = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelIdioma = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelDistribuidor = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        panelAutor = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        panelCategoria = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panelDistribuidor1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        panelDistribuidor2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Datos - Fast Development");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(39, 151, 212));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 0, 32));
        jLabel1.setText("Gestion de Biblioteca ");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 0, 32));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_img.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBack)
                        .addGap(282, 282, 282)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 190));

        panelLibro.setBackground(java.awt.SystemColor.controlHighlight);
        panelLibro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLibroMouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(11, 0, 32));
        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(11, 0, 32));
        jLabel18.setText("LIBROS");

        javax.swing.GroupLayout panelLibroLayout = new javax.swing.GroupLayout(panelLibro);
        panelLibro.setLayout(panelLibroLayout);
        panelLibroLayout.setHorizontalGroup(
            panelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibroLayout.createSequentialGroup()
                .addGroup(panelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLibroLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel5))
                    .addGroup(panelLibroLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLibroLayout.setVerticalGroup(
            panelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1.add(panelLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 210, 120));

        panelIdioma.setBackground(java.awt.SystemColor.controlHighlight);
        panelIdioma.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelIdioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelIdiomaMouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(11, 0, 32));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(11, 0, 32));
        jLabel19.setText("IDIOMA");

        javax.swing.GroupLayout panelIdiomaLayout = new javax.swing.GroupLayout(panelIdioma);
        panelIdioma.setLayout(panelIdiomaLayout);
        panelIdiomaLayout.setHorizontalGroup(
            panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdiomaLayout.createSequentialGroup()
                .addGroup(panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIdiomaLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel6))
                    .addGroup(panelIdiomaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIdiomaLayout.setVerticalGroup(
            panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdiomaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1.add(panelIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 210, 120));

        panelDistribuidor.setBackground(java.awt.SystemColor.controlHighlight);
        panelDistribuidor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDistribuidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDistribuidorMouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(11, 0, 32));
        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(11, 0, 32));
        jLabel22.setText("Distribuidor");

        javax.swing.GroupLayout panelDistribuidorLayout = new javax.swing.GroupLayout(panelDistribuidor);
        panelDistribuidor.setLayout(panelDistribuidorLayout);
        panelDistribuidorLayout.setHorizontalGroup(
            panelDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistribuidorLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel22)
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelDistribuidorLayout.setVerticalGroup(
            panelDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistribuidorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel9))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(panelDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 300, 90));

        panelAutor.setBackground(java.awt.SystemColor.controlHighlight);
        panelAutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAutorMouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(11, 0, 32));
        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(11, 0, 32));
        jLabel24.setText("AUTOR");

        javax.swing.GroupLayout panelAutorLayout = new javax.swing.GroupLayout(panelAutor);
        panelAutor.setLayout(panelAutorLayout);
        panelAutorLayout.setHorizontalGroup(
            panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutorLayout.createSequentialGroup()
                .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel11))
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel24)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAutorLayout.setVerticalGroup(
            panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1.add(panelAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 210, 120));

        panelCategoria.setBackground(java.awt.SystemColor.controlHighlight);
        panelCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCategoriaMouseClicked(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(11, 0, 32));
        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(11, 0, 32));
        jLabel23.setText("CATEGORIA");

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel10))
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addComponent(jLabel23)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(panelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 210, 120));

        panelDistribuidor1.setBackground(java.awt.SystemColor.controlHighlight);
        panelDistribuidor1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDistribuidor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDistribuidor1MouseClicked(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(11, 0, 32));
        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(11, 0, 32));
        jLabel25.setText("Trabajador");

        javax.swing.GroupLayout panelDistribuidor1Layout = new javax.swing.GroupLayout(panelDistribuidor1);
        panelDistribuidor1.setLayout(panelDistribuidor1Layout);
        panelDistribuidor1Layout.setHorizontalGroup(
            panelDistribuidor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistribuidor1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel25)
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelDistribuidor1Layout.setVerticalGroup(
            panelDistribuidor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistribuidor1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelDistribuidor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel12))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(panelDistribuidor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 300, -1));

        panelDistribuidor2.setBackground(java.awt.SystemColor.controlHighlight);
        panelDistribuidor2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDistribuidor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDistribuidor2MouseClicked(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(11, 0, 32));
        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(11, 0, 32));
        jLabel26.setText("Cliente");

        javax.swing.GroupLayout panelDistribuidor2Layout = new javax.swing.GroupLayout(panelDistribuidor2);
        panelDistribuidor2.setLayout(panelDistribuidor2Layout);
        panelDistribuidor2Layout.setHorizontalGroup(
            panelDistribuidor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistribuidor2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        panelDistribuidor2Layout.setVerticalGroup(
            panelDistribuidor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistribuidor2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelDistribuidor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel13))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(panelDistribuidor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 300, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLibroMouseClicked
       LibroFrame libro = new LibroFrame();
       libro.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_panelLibroMouseClicked

    private void panelIdiomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelIdiomaMouseClicked
        IdiomaFrame i = new IdiomaFrame();
        ControladorIdioma con = new ControladorIdioma(i);
        i.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_panelIdiomaMouseClicked

    private void panelDistribuidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDistribuidorMouseClicked
       
       DistribuidorFrame v =new DistribuidorFrame();
       ControladorDistribuidor con = new ControladorDistribuidor(v);
       v.setVisible(true);
       v.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_panelDistribuidorMouseClicked

    private void panelAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAutorMouseClicked
        AutorFrame a = new AutorFrame();
        ControladorAutor con = new ControladorAutor(a);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelAutorMouseClicked

    private void panelCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCategoriaMouseClicked
       
        CategoriaFrame c = new CategoriaFrame();
        ControladorCategoria con = new ControladorCategoria(c);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelCategoriaMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        PrincipalFrame principal = new PrincipalFrame();
        principal.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseClicked

    private void panelDistribuidor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDistribuidor1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelDistribuidor1MouseClicked

    private void panelDistribuidor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDistribuidor2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelDistribuidor2MouseClicked

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
            java.util.logging.Logger.getLogger(GestionDatosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDatosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDatosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDatosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDatosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel panelAutor;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelDistribuidor;
    private javax.swing.JPanel panelDistribuidor1;
    private javax.swing.JPanel panelDistribuidor2;
    private javax.swing.JPanel panelIdioma;
    private javax.swing.JPanel panelLibro;
    // End of variables declaration//GEN-END:variables
}
