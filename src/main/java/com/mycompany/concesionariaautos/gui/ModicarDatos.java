
package com.mycompany.concesionariaautos.gui;

import com.mycompany.concesionariaautos.logica.Automovil;
import com.mycompany.concesionariaautos.logica.ControladoraLogica;
import javax.swing.JOptionPane;

public class ModicarDatos extends javax.swing.JFrame {
    //Instanciasmos las clases necesarios
    public ControllerBotonesModificar controlBtn;
    ControladoraLogica control = null;
    int id_auto;
    Automovil auto;
    
    public ModicarDatos(int id_auto) {
        control = new ControladoraLogica(); 
        initComponents();
        controlBtn = new ControllerBotonesModificar(this);
        cargarDatosAuto(id_auto);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPuertas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCarac = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BotnoesContenedor = new javax.swing.JPanel();
        ContainerBtnAgregar = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        ContainerBtnLimpiar = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        ContainerBtnRegresar = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setText("MODELO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 60, -1));

        txtModelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(51, 51, 51));
        txtModelo.setBorder(null);
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 150, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel2.setText("MARCA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 54, -1));

        txtMarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(51, 51, 51));
        txtMarca.setBorder(null);
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 151, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setText("MOTOR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 221, 54, -1));

        txtMotor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMotor.setForeground(new java.awt.Color(51, 51, 51));
        txtMotor.setBorder(null);
        txtMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotorActionPerformed(evt);
            }
        });
        jPanel1.add(txtMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 220, 151, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setText("COLOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 221, 54, -1));

        txtColor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtColor.setForeground(new java.awt.Color(51, 51, 51));
        txtColor.setBorder(null);
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 220, 151, -1));

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setText("PLACA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 281, 54, -1));

        txtPlaca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(51, 51, 51));
        txtPlaca.setToolTipText("");
        txtPlaca.setBorder(null);
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 280, 151, -1));

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setText("CARACTERÍSTICAS ADICIONALES:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 270, -1));

        txtPuertas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPuertas.setForeground(new java.awt.Color(51, 51, 51));
        txtPuertas.setBorder(null);
        jPanel1.add(txtPuertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 78, -1));

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel8.setText("CANT. PUERTAS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 110, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        txtCarac.setColumns(20);
        txtCarac.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCarac.setForeground(new java.awt.Color(51, 51, 51));
        txtCarac.setRows(5);
        jScrollPane1.setViewportView(txtCarac);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 280, 130));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, 70));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 200));

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 160, 20));

        jSeparator5.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 20, 20));

        jSeparator6.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 160, 20));

        jSeparator7.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 20, 20));

        jSeparator8.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 160, 20));

        jSeparator9.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator9.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 20, 20));

        jSeparator10.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator10.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 160, 20));

        jSeparator11.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator11.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 20, 20));

        jSeparator12.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator12.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 160, 20));

        jSeparator13.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator13.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 20, 20));

        jSeparator14.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator14.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 90, 20));

        jSeparator15.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator15.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 20, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/concesionariaautos/img/Iconos para programas/Iconos para programas/AutoLogo2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 290, 150));

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("MODIFICACIÓN DE DATOS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 500, -1));

        BotnoesContenedor.setBackground(new java.awt.Color(255, 255, 255));
        BotnoesContenedor.setLayout(new java.awt.GridBagLayout());

        ContainerBtnAgregar.setBackground(new java.awt.Color(60, 226, 46));
        ContainerBtnAgregar.setForeground(new java.awt.Color(102, 102, 102));
        ContainerBtnAgregar.setPreferredSize(new java.awt.Dimension(210, 50));
        ContainerBtnAgregar.setLayout(new java.awt.BorderLayout());

        btnAgregar.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(102, 102, 102));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/concesionariaautos/img/Iconos para programas/Iconos para programas/Save-80_icon-icons.com_57276.png"))); // NOI18N
        btnAgregar.setText("Modificar");
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        ContainerBtnAgregar.add(btnAgregar, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        BotnoesContenedor.add(ContainerBtnAgregar, gridBagConstraints);

        ContainerBtnLimpiar.setBackground(new java.awt.Color(240, 215, 64));
        ContainerBtnLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        ContainerBtnLimpiar.setPreferredSize(new java.awt.Dimension(210, 50));
        ContainerBtnLimpiar.setLayout(new java.awt.BorderLayout());

        btnLimpiar.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/concesionariaautos/img/Iconos para programas/Iconos para programas/Clean.png"))); // NOI18N
        btnLimpiar.setText(" Limpiar");
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        ContainerBtnLimpiar.add(btnLimpiar, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        BotnoesContenedor.add(ContainerBtnLimpiar, gridBagConstraints);

        ContainerBtnRegresar.setBackground(new java.awt.Color(184, 63, 227));
        ContainerBtnRegresar.setForeground(new java.awt.Color(102, 102, 102));
        ContainerBtnRegresar.setPreferredSize(new java.awt.Dimension(210, 50));
        ContainerBtnRegresar.setLayout(new java.awt.BorderLayout());

        btnRegresar.setBackground(new java.awt.Color(184, 63, 227));
        btnRegresar.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/concesionariaautos/img/Iconos para programas/Iconos para programas/return_13601.png"))); // NOI18N
        btnRegresar.setText(" Regresar");
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setFocusPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        ContainerBtnRegresar.add(btnRegresar, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        BotnoesContenedor.add(ContainerBtnRegresar, gridBagConstraints);

        jPanel1.add(BotnoesContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 350, 190));

        jPanel3.setBackground(new java.awt.Color(204, 102, 0));

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel11.setText("Concensionaria de Autos");

        jLabel12.setFont(new java.awt.Font("Footlight MT Light", 3, 14)); // NOI18N
        jLabel12.setText("\"Conectando caminos, creando memorias");

        jLabel13.setFont(new java.awt.Font("Footlight MT Light", 3, 14)); // NOI18N
        jLabel13.setText(" ¡bienvenido a tu nueva aventura en auto!\"");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotorActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtModelo.setText("");
        txtMarca.setText("");
        txtColor.setText("");
        txtMotor.setText("");
        txtPlaca.setText("");
        txtPuertas.setText("");
        txtCarac.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Hacer visible la ventana principal
        MenuPrincipal principal = new MenuPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

        // Cerrar la ventana de carga de datos
        this.setVisible(false); 
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String color = txtColor.getText();
        String motor = txtMotor.getText();
        String placa = txtPlaca.getText();
        String carac = txtCarac.getText();
        
        //Verificamos que el usuario ingresó la cantidad de puertas como entero y no cmo string
        try{
            int puertas = Integer.parseInt(txtPuertas.getText());
            
            control.modificarAuto(auto, modelo, marca, color, motor, placa, carac, puertas);
            JOptionPane.showMessageDialog(this, "Los datos se modificaron correctamente", "Modificación correcta", JOptionPane.INFORMATION_MESSAGE);
            
            //Abrimos nuevamente la pantalla de ver datos
        ConsultaAutomovil pantalla = new ConsultaAutomovil();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        this.dispose();
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese un valor entero para el número de puertas", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotnoesContenedor;
    public javax.swing.JPanel ContainerBtnAgregar;
    public javax.swing.JPanel ContainerBtnLimpiar;
    public javax.swing.JPanel ContainerBtnRegresar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea txtCarac;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPuertas;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosAuto(int id_auto) {
        this.auto = control.traerUnAuto(id_auto);
        txtModelo.setText(auto.getModelo());
        txtMarca.setText(auto.getMarca());
        txtColor.setText(auto.getColor());
        txtMotor.setText(auto.getMotor());
        txtPlaca.setText(auto.getPlaca());
        txtPuertas.setText(String.valueOf(auto.getCantPuertas()));
        
    }
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        if (tipo.equals("Info")){
            JOptionPane.showMessageDialog(this, mensaje, titulo,JOptionPane.INFORMATION_MESSAGE);
        
        }else if(tipo.equals("Error")){
            JOptionPane.showMessageDialog(this, mensaje, titulo,JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
}
