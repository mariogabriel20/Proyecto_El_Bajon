package frames;

import java.awt.Cursor;
import javax.swing.ImageIcon;

public class Productos extends javax.swing.JFrame {

    public Productos() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(102,255,102));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jEliminar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jAgregar = new javax.swing.JButton();
        jCategoria = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTitulo2 = new javax.swing.JLabel();
        jScroll2 = new javax.swing.JScrollPane();
        jDescripcion = new javax.swing.JTextArea();
        jScroll1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jModificar = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRegresar = new javax.swing.JButton();
        jBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(810, 634));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(780, 578));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 578));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/eliminar.png"))); // NOI18N
        jEliminar.setText("Eliminar");
        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 450, 130, 40));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 183, 100, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Buscar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 85, -1, -1));

        jAgregar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/guardar.png"))); // NOI18N
        jAgregar.setText("Agregar");
        jPanel1.add(jAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 392, 120, 40));

        jCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-editar-30.png"))); // NOI18N
        jCategoria.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCategoriaMouseMoved(evt);
            }
        });
        jCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCategoriaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCategoriaMouseExited(evt);
            }
        });
        jPanel1.add(jCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 176, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 82, -1, -1));

        jTitulo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTitulo2.setText("Agregar producto ");
        jPanel1.add(jTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jScroll2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jDescripcion.setColumns(20);
        jDescripcion.setRows(5);
        jScroll2.setViewportView(jDescripcion);

        jPanel1.add(jScroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 262, 185, 60));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idProducto", "Categoría", "Nombre", "Descripción", "Precio"
            }
        ));
        jScroll1.setViewportView(jTabla);

        jPanel1.add(jScroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, 440));

        jModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/modificar.png"))); // NOI18N
        jModificar.setText("Modificar");
        jPanel1.add(jModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 392, 130, 40));

        jTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTitulo.setText("Productos");
        jPanel1.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 225, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Descripción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 262, -1, -1));
        jPanel1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 224, 140, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Precio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 342, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Categoría:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 186, -1, -1));
        jPanel1.add(jPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 340, 60, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Exportar:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 85, -1, -1));

        jRegresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-volver-filled-24.png"))); // NOI18N
        jRegresar.setText("Regresar");
        jRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 534, -1, -1));

        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 84, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegresarActionPerformed
        menuPrincipal frame2 = new menuPrincipal();
        frame2.setLocationRelativeTo(null);
        this.setVisible(false);
        frame2.setVisible(true);
    }//GEN-LAST:event_jRegresarActionPerformed

    private void jCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCategoriaMouseClicked
        Categorias frame6 = new Categorias();
        frame6.setLocationRelativeTo(null);
        frame6.setVisible(true);
    }//GEN-LAST:event_jCategoriaMouseClicked

    private void jCategoriaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCategoriaMouseMoved
        ImageIcon icon = new ImageIcon("src/Images&icons/icons8-editar-40.png");
        jCategoria.setIcon(icon);
        jCategoria.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jCategoriaMouseMoved

    private void jCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCategoriaMouseExited
        ImageIcon icon = new ImageIcon("src/Images&icons/icons8-editar-30.png");
        jCategoria.setIcon(icon);
        jCategoria.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jCategoriaMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jAgregar;
    private javax.swing.JTextField jBuscar;
    public static javax.swing.JLabel jCategoria;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    public static javax.swing.JTextArea jDescripcion;
    public static javax.swing.JButton jEliminar;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JButton jModificar;
    public static javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jPrecio;
    public static javax.swing.JButton jRegresar;
    private javax.swing.JScrollPane jScroll1;
    private javax.swing.JScrollPane jScroll2;
    private javax.swing.JTable jTabla;
    public static javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jTitulo2;
    // End of variables declaration//GEN-END:variables
}
