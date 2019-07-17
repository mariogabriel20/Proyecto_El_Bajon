package frames;

import static frames.Productos.jTablaProductos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practica_proyecto.SqlCategorias;
import practica_proyecto.categoriaProducto;
import practica_proyecto.Conexion;
import static frames.Productos.jComboBox1Producto;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Categorias extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;

    public Categorias() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(102, 255, 102));
        mostrartabla();
        
        try{
            
         Image img  = ImageIO.read(new File("icono2.png")); 
         this.setIconImage(img);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    private void limpiarCajas() {

        jNombre.setText(null);
        jDescripcion.setText(null);
    }

    private void mostrartabla() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);
            ps = null;
            rs = null;
            Connection con = practica_proyecto.Conexion.getConexion();

            //String sql = "Select idCategoria,nombreCategoria, descripcionCategoria from categoria  ";
            String sql = "Select idCategoria,nombreCategoria, descripcionCategoria from categoria where estadoCategoria = true ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Nombre Categoria");
            modelo.addColumn("Descripcion");

            int[] anchos = {50, 100, 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                jTable1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }

            while (rs.next()) {

                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);

            }

            con.close();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

    }

    private void mostrartablaproductos() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            jTablaProductos.setModel(modelo);
            ps = null;
            rs = null;
            Connection con = practica_proyecto.Conexion.getConexion();

            //String sql = "Select idCategoria,nombreCategoria, descripcionCategoria from categoria  ";
            String sql = "select pr.idProducto,ca.nombreCategoria,pr.nombreProducto, pr.descripcionProducto, pr.precio,pr.tamanoProducto \n"
                    + "from categoria ca join productos pr on ca.idCategoria = pr.idCategoria \n"
                    + "where ca.estadoCategoria = 1;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Id");
            modelo.addColumn("Categoria");
            modelo.addColumn("Nombre Producto");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Precio");
            modelo.addColumn("Tamaño");

            int[] anchos = {50, 85, 85, 130, 50, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                jTablaProductos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }

            while (rs.next()) {

                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);

            }
            con.close();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

    }

    private void llenarcomboproductos() {

        ps = null;
        rs = null;

        try {
            Connection con = practica_proyecto.Conexion.getConexion();
            String sql = "Select nombreCategoria From categoria where estadoCategoria = true";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                jComboBox1Producto.addItem(rs.getString("nombreCategoria"));
            }

            con.close();

        } catch (SQLException ex) {

            System.err.println(ex.toString());

        }

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
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });
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
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 130, 40));

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable (int rowIndex, int colIndex){
                return false;
            }
        };
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
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

        if (jNombre.getText().equals("") || jDescripcion.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");

        } else {

            if (modSql.existeCategoria(jNombre.getText()) == 0) {

                ///
                mod.setNombre(jNombre.getText());
                mod.setDescripcion(jDescripcion.getText());
                mod.setEstadoCategoria(true);

                if (modSql.registrarCategorias(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    mostrartabla();
                    limpiarCajas();
                    jComboBox1Producto.removeAllItems();
                    llenarcomboproductos(); // llena o actualiza el combo box de productos
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");

                }
                ///
            } else {
                JOptionPane.showMessageDialog(null, "La categoria ya existe");
            }
        }
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        // TODO add your handling code here:

        int Fila = jTable1.getSelectedRow();
        int idCategoria = (int) jTable1.getValueAt(Fila, 0);

        //JOptionPane.showMessageDialog(null,idCategoria);
        SqlCategorias modSql = new SqlCategorias();
        categoriaProducto mod = new categoriaProducto();

        if (jNombre.getText().equals("") || jDescripcion.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");

        } else {

            if (modSql.existeCategoria(jNombre.getText()) == 0 || modSql.existeCategoria(jNombre.getText()) == 1 ) {

                //
                mod.setId(idCategoria);
                mod.setNombre(jNombre.getText());
                mod.setDescripcion(jDescripcion.getText());
                mod.setEstadoCategoria(true);

                if (modSql.modificarCategorias(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro modificado");
                    mostrartabla();
                    mostrartablaproductos();
                    limpiarCajas();
                    jComboBox1Producto.removeAllItems();
                    llenarcomboproductos(); // llena o actualiza el combo box de productos
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar");

                }

            } else {
                JOptionPane.showMessageDialog(null, "La categoria ya existe");
            }
            ////
        }

    }//GEN-LAST:event_jModificarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        // Evento cuando se selecciona una fila de la tabla llena el campo de texto

        ps = null;
        rs = null;

        try {
            Connection con = practica_proyecto.Conexion.getConexion();

            int Fila = jTable1.getSelectedRow();
            String idCategoria = jTable1.getValueAt(Fila, 0).toString();

            ps = con.prepareStatement("SELECT idCategoria, nombreCategoria, descripcionCategoria FROM categoria WHERE idCategoria=?");
            ps.setString(1, idCategoria);
            rs = ps.executeQuery();

            while (rs.next()) {

                jNombre.setText(rs.getString("nombreCategoria"));
                jDescripcion.setText(rs.getString("descripcionCategoria"));

            }

            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
        
        int desicion = JOptionPane.showConfirmDialog(null, "¿Esta seguro? No podra desacer esta desicion");

        if (desicion == JOptionPane.YES_OPTION) {
            
        
        ///
        int Fila = jTable1.getSelectedRow();
        int idCategoria = (int) jTable1.getValueAt(Fila, 0);

        //JOptionPane.showMessageDialog(null,idCategoria);
        SqlCategorias modSql = new SqlCategorias();
        categoriaProducto mod = new categoriaProducto();

        mod.setId(idCategoria);
        mod.setEstadoCategoria(false);

        if (modSql.eliminarCategorias(mod)) {
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            mostrartabla();
            mostrartablaproductos();
            limpiarCajas();
            jComboBox1Producto.removeAllItems();
            llenarcomboproductos(); // llena o actualiza el combo box de productos
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar");

        }
        ////
        }
        
        
    }//GEN-LAST:event_jEliminarActionPerformed


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
