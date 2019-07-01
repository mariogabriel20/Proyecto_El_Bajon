package frames;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import practica_proyecto.Usuario;

public class inicioSesion extends javax.swing.JFrame {

    public inicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jUser = new javax.swing.JFormattedTextField();
        jPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTitulo.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jTitulo.setText("Inicio de Sesión");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 82, 15, 80);
        jPanel1.add(jTitulo, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jUser.setForeground(new java.awt.Color(153, 153, 153));
        jUser.setText("Usuario");
        jUser.setToolTipText("Ingrese aquí su nombre de usuario");
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 18, 0, 80);
        jPanel2.add(jUser, gridBagConstraints);

        jPass.setForeground(new java.awt.Color(153, 153, 153));
        jPass.setText("contraseña");
        jPass.setToolTipText("Ingrese aquí su contraseña");
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 80);
        jPanel2.add(jPass, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 108, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 81, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jIniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-entrar-26.png"))); // NOI18N
        jIniciar.setText("Iniciar");
        jIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIniciarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 31, 0);
        jPanel2.add(jIniciar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarActionPerformed
        login();
    }//GEN-LAST:event_jIniciarActionPerformed

    private void jPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jPassKeyPressed

    private void jUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jUserKeyPressed

    private void jUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUserFocusGained
        if(jUser.getText().trim().toLowerCase().equals("usuario")){
            jUser.setText("");
            jUser.setForeground(Color.black);
        }
    }//GEN-LAST:event_jUserFocusGained

    private void jUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUserFocusLost
        if(jUser.getText().trim().toLowerCase().equals("")){
            jUser.setText("Usuario");
            jUser.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_jUserFocusLost

    private void jPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassFocusGained
        if(jPass.getText().trim().toLowerCase().equals("contraseña")){
            jPass.setText("");
            jPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPassFocusGained

    private void jPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassFocusLost
        if(jPass.getText().trim().toLowerCase().equals("")){
            jPass.setText("contraseña");
            jPass.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_jPassFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jIniciar;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPasswordField jPass;
    public static javax.swing.JLabel jTitulo;
    public static javax.swing.JFormattedTextField jUser;
    // End of variables declaration//GEN-END:variables

    private void login() {
        Usuario user1 = new Usuario(jUser.getText(), jPass.getText());
        if (user1.getIdUsuario().equals("admin") && user1.getContrasena().equals("1234")) {
            menuPrincipal frame2 = new menuPrincipal();
            frame2.setLocationRelativeTo(null);
            frame2.setTitle("Menú");
            this.setVisible(false);
            frame2.setVisible(true);
        } else if (user1.getIdUsuario().equals("cajero") && user1.getContrasena().equals("1234")) {
            registroPedido frame7 = new registroPedido();
            frame7.setLocationRelativeTo(null);
            frame7.setTitle("Registro de pedido");
            this.setVisible(false);
            frame7.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña errónea", "Error", JOptionPane.PLAIN_MESSAGE);
        }
        Usuario user = new Usuario(jUser.getText(), jPass.getText());
        System.out.println("Nombre: "+user.getIdUsuario());
    }
}
