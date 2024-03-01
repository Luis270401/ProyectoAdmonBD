
package com.mycompany.concesionariaautos.gui;

import java.awt.Color;

public class MenuPrincipal extends javax.swing.JFrame {
    //Instanciasmos las clases necesarios
    public ControladoraBotones controlBtn = null;
    
    
    //Variables para la posicion del mouse
    int xMouse, yMouse;
    
    
    public MenuPrincipal() {
        initComponents();
        controlBtn = new ControladoraBotones(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelCerrar = new javax.swing.JPanel();
        evtCerrarVentana = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ContenedorBotones = new javax.swing.JPanel();
        ContainerBtnAlta = new javax.swing.JPanel();
        btnAltaAutos = new javax.swing.JButton();
        ContainerBtnCeb = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        ContainerBtnSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 70, 290, 160));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 690, 10));

        jPanel2.setBackground(new java.awt.Color(204, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Concesionaria De Autos");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText(" \"Explora la diversidad en nuestra concesionaria de autos ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("donde ofrecemos una amplia gama de marcas");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText(" y modelos para encontrar el vehículo perfecto para ti.\"");

        panelCerrar.setBackground(new java.awt.Color(204, 153, 0));
        panelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCerrarMouseEntered(evt);
            }
        });

        evtCerrarVentana.setBackground(new java.awt.Color(204, 153, 0));
        evtCerrarVentana.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        evtCerrarVentana.setForeground(new java.awt.Color(255, 255, 255));
        evtCerrarVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        evtCerrarVentana.setText("X");
        evtCerrarVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        evtCerrarVentana.setPreferredSize(new java.awt.Dimension(40, 40));
        evtCerrarVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                evtCerrarVentanaMouseDragged(evt);
            }
        });
        evtCerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evtCerrarVentanaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                evtCerrarVentanaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                evtCerrarVentanaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelCerrarLayout = new javax.swing.GroupLayout(panelCerrar);
        panelCerrar.setLayout(panelCerrarLayout);
        panelCerrarLayout.setHorizontalGroup(
            panelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCerrarLayout.createSequentialGroup()
                .addComponent(evtCerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        panelCerrarLayout.setVerticalGroup(
            panelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(evtCerrarVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(panelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 700, -1));

        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -20, 370, 700));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO A LA CONCESIONARIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 480, 50));

        ContenedorBotones.setBackground(new java.awt.Color(255, 255, 255));
        ContenedorBotones.setLayout(new java.awt.GridBagLayout());

        ContainerBtnAlta.setBackground(new java.awt.Color(229, 173, 61));
        ContainerBtnAlta.setPreferredSize(new java.awt.Dimension(400, 60));
        ContainerBtnAlta.setLayout(new java.awt.BorderLayout());

        btnAltaAutos.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnAltaAutos.setText("Alta de Automóviles");
        btnAltaAutos.setContentAreaFilled(false);
        btnAltaAutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAltaAutos.setFocusPainted(false);
        btnAltaAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaAutosActionPerformed(evt);
            }
        });
        ContainerBtnAlta.add(btnAltaAutos, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        ContenedorBotones.add(ContainerBtnAlta, gridBagConstraints);

        ContainerBtnCeb.setBackground(new java.awt.Color(229, 173, 61));
        ContainerBtnCeb.setPreferredSize(new java.awt.Dimension(400, 60));
        ContainerBtnCeb.setLayout(new java.awt.BorderLayout());

        btnModificar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnModificar.setText("Consulta, edición y baja");
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        ContainerBtnCeb.add(btnModificar, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        ContenedorBotones.add(ContainerBtnCeb, gridBagConstraints);

        ContainerBtnSalir.setBackground(new java.awt.Color(144, 157, 162));
        ContainerBtnSalir.setPreferredSize(new java.awt.Dimension(400, 60));
        ContainerBtnSalir.setLayout(new java.awt.BorderLayout());

        btnSalir.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        ContainerBtnSalir.add(btnSalir, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        ContenedorBotones.add(ContainerBtnSalir, gridBagConstraints);

        jPanel1.add(ContenedorBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 580, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaAutosActionPerformed
        AltaAutomovil pantalla = new AltaAutomovil();
        
        //Ocultamos la pantalla principal
        this.setVisible(false);
        
        //Mostramos la pantalla de ver Datos
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAltaAutosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ConsultaAutomovil pantalla = new ConsultaAutomovil();
        
        //Ocultamos la pantalla principal
        this.setVisible(false);
        
        //Mostramos la pantalla de ver Datos
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void evtCerrarVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evtCerrarVentanaMousePressed
        //Obtenemos las posiciones x y del mouse
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_evtCerrarVentanaMousePressed

    private void evtCerrarVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evtCerrarVentanaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_evtCerrarVentanaMouseDragged

    private void evtCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evtCerrarVentanaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_evtCerrarVentanaMouseClicked
    
    //ESTOS EVENTOS NO LOS ESTOY OCUPANDO
    private void evtCerrarVentanaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evtCerrarVentanaMouseEntered
        evtCerrarVentana.setBackground(Color.red);
    }//GEN-LAST:event_evtCerrarVentanaMouseEntered

    private void panelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarMouseEntered
        evtCerrarVentana.setBackground(Color.red);
    }//GEN-LAST:event_panelCerrarMouseEntered
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel ContainerBtnAlta;
    public javax.swing.JPanel ContainerBtnCeb;
    public javax.swing.JPanel ContainerBtnSalir;
    private javax.swing.JPanel ContenedorBotones;
    public javax.swing.JButton btnAltaAutos;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel evtCerrarVentana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelCerrar;
    // End of variables declaration//GEN-END:variables
}
