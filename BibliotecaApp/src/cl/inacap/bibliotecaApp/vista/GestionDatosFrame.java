/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.vista;

import cl.inacap.bilbiotecaApp.controlador.ControladorAutor;
import cl.inacap.bilbiotecaApp.controlador.ControladorCategoria;
import cl.inacap.bilbiotecaApp.controlador.ControladorCliente;
import cl.inacap.bilbiotecaApp.controlador.ControladorCompra;
import cl.inacap.bilbiotecaApp.controlador.ControladorDistribuidor;
import cl.inacap.bilbiotecaApp.controlador.ControladorEditorial;
import cl.inacap.bilbiotecaApp.controlador.ControladorIdioma;
import cl.inacap.bilbiotecaApp.controlador.ControladorLibro;
import cl.inacap.bilbiotecaApp.controlador.ControladorTrabajador;
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
        btnBack = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        panelTrabajador = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        panelCliente = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        panelEditorial = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        panelEditorial1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        PanelComprar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        panelEditorial3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Datos - Fast Development");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(39, 151, 212));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 0, 32));
        jLabel1.setText("Gestión de Biblioteca ");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 74));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_img.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 23, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("_______________________");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 530, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 190));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 190));

        panelLibro.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelLibro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLibroMouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(11, 0, 32));
        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(11, 0, 32));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro_img.png"))); // NOI18N
        jLabel18.setText(" Libro");

        javax.swing.GroupLayout panelLibroLayout = new javax.swing.GroupLayout(panelLibro);
        panelLibro.setLayout(panelLibroLayout);
        panelLibroLayout.setHorizontalGroup(
            panelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel18)
                .addGap(128, 128, 128)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLibroLayout.setVerticalGroup(
            panelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibroLayout.createSequentialGroup()
                .addGroup(panelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLibroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5))
                    .addGroup(panelLibroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel18)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(panelLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 220, 90));

        panelIdioma.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelIdioma.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelIdioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelIdiomaMouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(11, 0, 32));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(11, 0, 32));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/idioma_img.png"))); // NOI18N
        jLabel19.setText(" Idioma");

        javax.swing.GroupLayout panelIdiomaLayout = new javax.swing.GroupLayout(panelIdioma);
        panelIdioma.setLayout(panelIdiomaLayout);
        panelIdiomaLayout.setHorizontalGroup(
            panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdiomaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel19)
                .addGap(116, 116, 116)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIdiomaLayout.setVerticalGroup(
            panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdiomaLayout.createSequentialGroup()
                .addGroup(panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIdiomaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6))
                    .addGroup(panelIdiomaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 190, 90));

        panelDistribuidor.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelDistribuidor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDistribuidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDistribuidorMouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(11, 0, 32));
        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(11, 0, 32));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/distribuidor_img.png"))); // NOI18N
        jLabel22.setText(" Distribuidor");

        javax.swing.GroupLayout panelDistribuidorLayout = new javax.swing.GroupLayout(panelDistribuidor);
        panelDistribuidor.setLayout(panelDistribuidorLayout);
        panelDistribuidorLayout.setHorizontalGroup(
            panelDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistribuidorLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel22)
                .addGap(72, 72, 72)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDistribuidorLayout.setVerticalGroup(
            panelDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistribuidorLayout.createSequentialGroup()
                .addGroup(panelDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDistribuidorLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9))
                    .addGroup(panelDistribuidorLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel22)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(panelDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 340, 90));

        panelAutor.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelAutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAutorMouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(11, 0, 32));
        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(11, 0, 32));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/autor_img.png"))); // NOI18N
        jLabel24.setText(" Autor");

        javax.swing.GroupLayout panelAutorLayout = new javax.swing.GroupLayout(panelAutor);
        panelAutor.setLayout(panelAutorLayout);
        panelAutorLayout.setHorizontalGroup(
            panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel24)
                .addGap(128, 128, 128)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAutorLayout.setVerticalGroup(
            panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutorLayout.createSequentialGroup()
                .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11))
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel24)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(panelAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 190, 90));

        panelCategoria.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCategoriaMouseClicked(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(11, 0, 32));
        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(11, 0, 32));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categoria_img.png"))); // NOI18N
        jLabel23.setText(" Categoria");

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23)
                .addGap(94, 94, 94)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoriaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        jPanel1.add(panelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 220, 90));

        panelTrabajador.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelTrabajador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTrabajadorMouseClicked(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(11, 0, 32));
        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(11, 0, 32));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trabajador_img.png"))); // NOI18N
        jLabel25.setText(" Trabajador");

        javax.swing.GroupLayout panelTrabajadorLayout = new javax.swing.GroupLayout(panelTrabajador);
        panelTrabajador.setLayout(panelTrabajadorLayout);
        panelTrabajadorLayout.setHorizontalGroup(
            panelTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajadorLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrabajadorLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(78, 78, 78))
        );
        panelTrabajadorLayout.setVerticalGroup(
            panelTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajadorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(panelTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 340, -1));

        panelCliente.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelClienteMouseClicked(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(11, 0, 32));
        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(11, 0, 32));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente_img.png"))); // NOI18N
        jLabel26.setText(" Cliente");

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel13))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(panelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 340, -1));

        panelEditorial.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelEditorial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEditorialMouseClicked(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(11, 0, 32));
        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(11, 0, 32));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editorial_img.png"))); // NOI18N
        jLabel27.setText(" Editorial");

        javax.swing.GroupLayout panelEditorialLayout = new javax.swing.GroupLayout(panelEditorial);
        panelEditorial.setLayout(panelEditorialLayout);
        panelEditorialLayout.setHorizontalGroup(
            panelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(118, 118, 118)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEditorialLayout.setVerticalGroup(
            panelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorialLayout.createSequentialGroup()
                .addGroup(panelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditorialLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14))
                    .addGroup(panelEditorialLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel27)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(panelEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 190, 90));

        panelEditorial1.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelEditorial1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEditorial1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEditorial1MouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(11, 0, 32));
        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(11, 0, 32));
        jLabel28.setText("Vender");

        javax.swing.GroupLayout panelEditorial1Layout = new javax.swing.GroupLayout(panelEditorial1);
        panelEditorial1.setLayout(panelEditorial1Layout);
        panelEditorial1Layout.setHorizontalGroup(
            panelEditorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorial1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel28)
                .addGap(98, 98, 98)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEditorial1Layout.setVerticalGroup(
            panelEditorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorial1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelEditorial1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelEditorial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 120, 50));

        PanelComprar.setBackground(java.awt.SystemColor.controlLtHighlight);
        PanelComprar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelComprarMouseClicked(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(11, 0, 32));
        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(11, 0, 32));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Comprar");

        javax.swing.GroupLayout PanelComprarLayout = new javax.swing.GroupLayout(PanelComprar);
        PanelComprar.setLayout(PanelComprarLayout);
        PanelComprarLayout.setHorizontalGroup(
            PanelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelComprarLayout.setVerticalGroup(
            PanelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComprarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(PanelComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 130, 50));

        panelEditorial3.setBackground(java.awt.SystemColor.controlLtHighlight);
        panelEditorial3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEditorial3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEditorial3MouseClicked(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(11, 0, 32));
        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(11, 0, 32));
        jLabel30.setText("Arrendar");

        javax.swing.GroupLayout panelEditorial3Layout = new javax.swing.GroupLayout(panelEditorial3);
        panelEditorial3.setLayout(panelEditorial3Layout);
        panelEditorial3Layout.setHorizontalGroup(
            panelEditorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorial3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(106, 106, 106)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEditorial3Layout.setVerticalGroup(
            panelEditorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorial3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditorial3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelEditorial3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 120, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLibroMouseClicked
        LibroFrame libro = new LibroFrame();
        ControladorLibro con = new ControladorLibro(libro);
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

        DistribuidorFrame v = new DistribuidorFrame();
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

    private void panelTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTrabajadorMouseClicked
        TrabajadorFrame tr = new TrabajadorFrame();
        ControladorTrabajador con = new ControladorTrabajador(tr);
        tr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelTrabajadorMouseClicked

    private void panelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelClienteMouseClicked
        ClienteFrame cl = new ClienteFrame();
        ControladorCliente con = new ControladorCliente(cl);
        cl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelClienteMouseClicked

    private void panelEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEditorialMouseClicked
        EditorialFrame e = new EditorialFrame();
        ControladorEditorial con = new ControladorEditorial(e);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelEditorialMouseClicked

    private void panelEditorial1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEditorial1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEditorial1MouseClicked

    private void PanelComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelComprarMouseClicked
        CompraFrame com = new CompraFrame();
        ControladorCompra con = new ControladorCompra(com);
        com.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PanelComprarMouseClicked

    private void panelEditorial3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEditorial3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEditorial3MouseClicked

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
    private javax.swing.JPanel PanelComprar;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel panelAutor;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelDistribuidor;
    private javax.swing.JPanel panelEditorial;
    private javax.swing.JPanel panelEditorial1;
    private javax.swing.JPanel panelEditorial3;
    private javax.swing.JPanel panelIdioma;
    private javax.swing.JPanel panelLibro;
    private javax.swing.JPanel panelTrabajador;
    // End of variables declaration//GEN-END:variables
}
