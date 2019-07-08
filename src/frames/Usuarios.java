package frames;

public class Usuarios extends javax.swing.JFrame {

    public Usuarios() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(102,255,102));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTitulo2 = new javax.swing.JLabel();
        jScroll = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jAgregar = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jUser = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        jModificar = new javax.swing.JButton();
        jPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setExtendedState(800);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(810, 634));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 567));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("idUsuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 164, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Tipo de usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 295, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Administrador", "Cajero", "" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 292, -1, -1));

        jRegresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-volver-filled-24.png"))); // NOI18N
        jRegresar.setText("Regresar");
        jRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 534, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 250, -1, -1));

        jTitulo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTitulo2.setText("Agregar usuario");
        jPanel1.add(jTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 94, -1, -1));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idUsuario", "Nombre", "Contraseña", "Tipo de usuario"
            }
        ));
        jScroll.setViewportView(jTabla);

        jPanel1.add(jScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 462, 488));

        jAgregar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/guardar.png"))); // NOI18N
        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, 40));

        jTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTitulo.setText("Registro de usuarios");
        jTitulo.setPreferredSize(new java.awt.Dimension(300, 29));
        jPanel1.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 11, 241, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 207, -1, -1));
        jPanel1.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 163, 125, -1));
        jPanel1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 206, 125, -1));

        jModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/modificar.png"))); // NOI18N
        jModificar.setText("Modificar");
        jPanel1.add(jModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 130, 40));

        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });
        jPanel1.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 249, 125, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/eliminar.png"))); // NOI18N
        jButton1.setText("Eliminar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegresarActionPerformed
        menuPrincipal frame2 = new menuPrincipal();
        frame2.setLocationRelativeTo(null);
        this.hide();
        frame2.show();
    }//GEN-LAST:event_jRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jAgregar;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JButton jModificar;
    public static javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jPass;
    public static javax.swing.JButton jRegresar;
    public static javax.swing.JScrollPane jScroll;
    public static javax.swing.JTable jTabla;
    public static javax.swing.JLabel jTitulo;
    public static javax.swing.JLabel jTitulo2;
    public static javax.swing.JTextField jUser;
    // End of variables declaration//GEN-END:variables
}
