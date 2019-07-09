package frames;

import javax.swing.JOptionPane;
import practica_proyecto.SqlCategorias;
import practica_proyecto.categoriaProducto;

public class Categorias extends javax.swing.JFrame {

    public Categorias() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(102, 255, 102));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jAgregar = new javax.swing.JButton();
        jNombre = new javax.swing.JTextField();
        jModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTitulo = new javax.swing.JLabel();
        jEliminar = new javax.swing.JButton();
        jScroll1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScroll2 = new javax.swing.JScrollPane();
        jDescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(810, 634));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jAgregar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/guardar.png"))); // NOI18N
        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, 40));

        jNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 140, -1));

        jModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/modificar.png"))); // NOI18N
        jModificar.setText("Modificar");
        jPanel1.add(jModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 130, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 164, -1, -1));

        jTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTitulo.setText("Categorías");
        jPanel1.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 11, -1, -1));

        jEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/eliminar.png"))); // NOI18N
        jEliminar.setText("Eliminar");
        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 130, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idCategoría", "Nombre", "Descripción"
            }
        ));
        jScroll1.setViewportView(jTable1);

        jPanel1.add(jScroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, -1, 473));

        jRegresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-volver-filled-24.png"))); // NOI18N
        jRegresar.setText("Regresar");
        jRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 534, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Descripción:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 208, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Agregar categoría");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 94, -1, -1));

        jScroll2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jDescripcion.setColumns(20);
        jDescripcion.setRows(5);
        jScroll2.setViewportView(jDescripcion);

        jPanel1.add(jScroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 140, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jRegresarActionPerformed

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        //registroPedido botonsaco = new registroPedido();
        
        SqlCategorias modSql = new SqlCategorias();
        categoriaProducto mod = new categoriaProducto();
        
        mod.setNombre(jNombre.getText());
        mod.setDescripcion(jDescripcion.getText());
        mod.setEstadoCategoria(true);
        
        if(modSql.registrarCategorias(mod))
        {
            JOptionPane.showMessageDialog(null, "Registro guardado");
        }else{
            JOptionPane.showMessageDialog(null, "Error al guardar");
            
        }
        
    }//GEN-LAST:event_jAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jAgregar;
    private javax.swing.JTextArea jDescripcion;
    public static javax.swing.JButton jEliminar;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JButton jModificar;
    public static javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton jRegresar;
    private javax.swing.JScrollPane jScroll1;
    private javax.swing.JScrollPane jScroll2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
