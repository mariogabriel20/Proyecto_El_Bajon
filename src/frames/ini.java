package frames;

import java.util.Locale;

public class ini extends javax.swing.JFrame {

    public ini() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSalir = new javax.swing.JButton();
        jNombreUser = new javax.swing.JLabel();
        jPassUsuario = new javax.swing.JLabel();
        jNombretxt = new javax.swing.JTextField();
        jPasstxt = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jIniciar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/logo_bajon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, 230));

        jSalir.setBackground(java.awt.Color.green);
        jSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jNombreUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jNombreUser.setText("Usuario:");
        getContentPane().add(jNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jPassUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPassUsuario.setText("Contraseña:");
        getContentPane().add(jPassUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jNombretxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jNombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 140, -1));

        jPasstxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jPasstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 140, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        jLabel2.setText("Inicio de Sesión");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jIniciar.setBackground(java.awt.Color.green);
        jIniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-entrar-26.png"))); // NOI18N
        jIniciar.setText("Iniciar");
        jIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, -120, 750, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSalirActionPerformed

    private void jIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarActionPerformed
        
    }//GEN-LAST:event_jIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jNombreUser;
    private javax.swing.JTextField jNombretxt;
    private javax.swing.JLabel jPassUsuario;
    private javax.swing.JPasswordField jPasstxt;
    private javax.swing.JButton jSalir;
    // End of variables declaration//GEN-END:variables
}
