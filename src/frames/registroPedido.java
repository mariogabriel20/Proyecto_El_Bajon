package frames;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class registroPedido extends javax.swing.JFrame {

    //variables globales
    CardLayout cl = new CardLayout();
    FlowLayout fl = new FlowLayout();

    public registroPedido() {
        initComponents();
        //otherComponents();
        this.getContentPane().setBackground(new java.awt.Color(102, 255, 102));
        Container container = this.getContentPane();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        jGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScroll3 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jAnular = new javax.swing.JButton();
        jCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setPreferredSize(new java.awt.Dimension(1044, 620));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/categoria_hamburguesa.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/categoria_completo.png"))); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton2.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/categoría_taco.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton3.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton3.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/categoría_taco.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTitulo.setText("Registro de pedido");

        jGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-guardar-cerrar-48.png"))); // NOI18N
        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("A pagar");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Método de pago");

        jTabla.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Categoría", "Nombre", "Cantidad", "Valor unitario", "Importe"
            }
        ));
        jScroll3.setViewportView(jTabla);

        jAnular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-cancelar-48.png"))); // NOI18N
        jAnular.setText("Anular");
        jAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnularActionPerformed(evt);
            }
        });

        jCerrarSesion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-change-user-30.png"))); // NOI18N
        jCerrarSesion.setText("Cerrar sesión");
        jCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jAnular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(44, 44, 44))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScroll3)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCerrarSesion)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jGuardar)
                                    .addComponent(jAnular)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jCerrarSesion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cl.show(jPanel2, "card1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cl.show(jPanel2, "card2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed

    }//GEN-LAST:event_jGuardarActionPerformed

    private void jAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnularActionPerformed
        ImageIcon icon = new ImageIcon("src/Images&icons/icons8-pregunta-40.png");
        int op = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres anular el pedido?", "Anular Pedido", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
        if (op == 0) {

        }
    }//GEN-LAST:event_jAnularActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cl.show(jPanel2, "card3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCerrarSesionActionPerformed
        inicioSesion frame1 = new inicioSesion();
        frame1.setLocationRelativeTo(null);
        this.setVisible(false);
        frame1.setVisible(true);
    }//GEN-LAST:event_jCerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jAnular;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jCerrarSesion;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JButton jGuardar;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JScrollPane jScroll3;
    public static javax.swing.JTable jTabla;
    public static javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables

    private void otherComponents() {
        ImageIcon icon = new ImageIcon("src/Images&icons/categoria_completo.png");
        jPanel2.setLayout(cl);
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JPanel jPanel5 = new JPanel();
        JLabel label1 = new JLabel("card1");
        JButton boton2 = new JButton("card2");
        JButton boton3 = new JButton("card3");
        JButton boton4 = new JButton("card3");
        //label1.preferredSize().setSize(60, 80);
        boton2.preferredSize().setSize(80, 80);
        boton3.preferredSize().setSize(80, 80);
        boton4.preferredSize().setSize(80, 80);
        label1.setText("");
        label1.setIcon(icon);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel3.add(label1);
        jPanel4.add(boton2);
        jPanel5.add(boton3);
        jPanel5.add(boton4);
        jPanel2.add(jPanel3, "card1");
        jPanel2.add(jPanel4, "card2");
        jPanel2.add(jPanel5, "card3");
        cl.show(jPanel2, "card1");
    }
}
