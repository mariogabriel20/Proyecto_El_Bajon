package frames;

public class menuPrincipal extends javax.swing.JFrame {

    public menuPrincipal() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(102,255,102));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jVentas = new javax.swing.JButton();
        jCerrarSesion = new javax.swing.JButton();
        jUsuarios = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        jProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jVentas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-ventas-totales-80.png"))); // NOI18N
        jVentas.setText("Ventas");
        jVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVentasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 10, 0, 0);
        jPanel1.add(jVentas, gridBagConstraints);

        jCerrarSesion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-change-user-30.png"))); // NOI18N
        jCerrarSesion.setText("Cerrar sesión");
        jCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarSesionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(154, 86, 11, 10);
        jPanel1.add(jCerrarSesion, gridBagConstraints);

        jUsuarios.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-grupo-de-usuarios-hombre-hombre-80.png"))); // NOI18N
        jUsuarios.setText("Usuarios");
        jUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuariosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 109, 0, 0);
        jPanel1.add(jUsuarios, gridBagConstraints);

        jTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTitulo.setText("Menú Principal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 66, 0, 0);
        jPanel1.add(jTitulo, gridBagConstraints);

        jProductos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-pancho-80.png"))); // NOI18N
        jProductos.setText("Productos");
        jProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProductosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 60, 0, 10);
        jPanel1.add(jProductos, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCerrarSesionActionPerformed
        inicioSesion frame1 = new inicioSesion();
        frame1.setLocationRelativeTo(null);
        this.setVisible(false);
        frame1.setVisible(true);
    }//GEN-LAST:event_jCerrarSesionActionPerformed

    private void jUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuariosActionPerformed
        Usuarios frame4 = new Usuarios();
        frame4.setLocationRelativeTo(null);
        this.setVisible(false);
        frame4.setVisible(true);
    }//GEN-LAST:event_jUsuariosActionPerformed

    private void jVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVentasActionPerformed
        Ventas frame3 = new Ventas();
        frame3.setLocationRelativeTo(null);
        this.setVisible(false);
        frame3.setVisible(true);
    }//GEN-LAST:event_jVentasActionPerformed

    private void jProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductosActionPerformed
        Productos frame5 = new Productos();
        frame5.setLocationRelativeTo(null);
        this.setVisible(false);
        frame5.setVisible(true);
    }//GEN-LAST:event_jProductosActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jCerrarSesion;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton jProductos;
    public static javax.swing.JLabel jTitulo;
    public static javax.swing.JButton jUsuarios;
    public static javax.swing.JButton jVentas;
    // End of variables declaration//GEN-END:variables
}
