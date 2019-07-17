package frames;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.imageio.ImageIO;

import javax.swing.JOptionPane;
import practica_proyecto.SqlUsuarios;
import practica_proyecto.UsuarioInicio;
import practica_proyecto.hash;


public class ini extends javax.swing.JFrame {

    public ini() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try{
            
         Image img  = ImageIO.read(new File("icono2.png")); 
         this.setIconImage(img);
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSalir = new javax.swing.JButton();
        jNombreUser = new javax.swing.JLabel();
        jPassUsuario = new javax.swing.JLabel();
        jUser = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jIniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jUserFocusLost(evt);
            }
        });
        jUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jUserKeyPressed(evt);
            }
        });
        getContentPane().add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 140, -1));

        jPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPassFocusLost(evt);
            }
        });
        jPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassKeyPressed(evt);
            }
        });
        getContentPane().add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 140, -1));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/logo_bajon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, -250, 750, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSalirActionPerformed

    private void jIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarActionPerformed
        login();
    }//GEN-LAST:event_jIniciarActionPerformed

    private void jUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jUserKeyPressed

    private void jPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jPassKeyPressed

    private void jUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUserFocusGained
        // TODO add your handling code here:
        if (jUser.getText().trim().toLowerCase().equals("usuario")) {
            jUser.setText("");
            jUser.setForeground(Color.black);
        }
    }//GEN-LAST:event_jUserFocusGained

    private void jUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUserFocusLost
        // TODO add your handling code here:
        if (jUser.getText().trim().toLowerCase().equals("")) {
            jUser.setText("Usuario");
            jUser.setForeground(new java.awt.Color(153, 153, 153));
        }
    }//GEN-LAST:event_jUserFocusLost

    private void jPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassFocusGained
        // TODO add your handling code here:
        if (jPass.getText().trim().toLowerCase().equals("contraseña")) {
            jPass.setText("");
            jPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPassFocusGained

    private void jPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassFocusLost
        // TODO add your handling code here:
        if (jPass.getText().trim().toLowerCase().equals("")) {
            jPass.setText("contraseña");
            jPass.setForeground(new java.awt.Color(153, 153, 153));
        }
    }//GEN-LAST:event_jPassFocusLost

    private void login() {

        SqlUsuarios modSql = new SqlUsuarios();
        UsuarioInicio mod = new UsuarioInicio();

        String pass = new String(jPass.getPassword());

        if (!jUser.getText().equals("") || pass.equals("")) {
            String nuevopass = hash.sha1(pass);

            mod.setIdUsuario(jUser.getText());
            mod.setContrasena(nuevopass);

            if (modSql.login(mod)) {
                //this.dispose();

                if (mod.getTipoUsuario().equals("Administrador")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido/a " + mod.getNombreUsuario());
                    //JOptionPane.showMessageDialog(null, "el idUsuario es: " + mod.getIdUsuario());
                    //JOptionPane.showMessageDialog(null, "el tipo usuario es: " + mod.getTipoUsuario());

                    menuPrincipal frame2 = new menuPrincipal();
                    frame2.setLocationRelativeTo(null);
                    frame2.setTitle("Menú");
                    this.setVisible(false);
                    frame2.setVisible(true);

                } else if (mod.getTipoUsuario().equals("Cajero")) {

                    JOptionPane.showMessageDialog(null, "Bienvenido/a " + mod.getNombreUsuario());
                    // JOptionPane.showMessageDialog(null, "el idUsuario es: " + mod.getIdUsuario());
                    // JOptionPane.showMessageDialog(null, "el tipo usuario es: " + mod.getTipoUsuario());

                    registroPedido frame7 = new registroPedido();
                    frame7.setLocationRelativeTo(null);
                    frame7.setTitle("Registro de pedido");
                    this.setVisible(false);
                    frame7.setVisible(true);
                }

            } else {

                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jIniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jNombreUser;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JLabel jPassUsuario;
    private javax.swing.JButton jSalir;
    private javax.swing.JTextField jUser;
    // End of variables declaration//GEN-END:variables
}
