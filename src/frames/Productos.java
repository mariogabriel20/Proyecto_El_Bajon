package frames;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practica_proyecto.Producto;

import practica_proyecto.SqlProductos;

public class Productos extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;

    public Productos() {
        initComponents();
        jIdCategoria.setVisible(false);
        mostrartablaproductos();
        llenarcomboproductos();
        this.getContentPane().setBackground(new java.awt.Color(102, 255, 102));
        
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

        jPanel1 = new javax.swing.JPanel();
        jEliminar = new javax.swing.JButton();
        jComboBox1Producto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jAgregar = new javax.swing.JButton();
        jCategoria = new javax.swing.JLabel();
        jTitulo2 = new javax.swing.JLabel();
        jScroll2 = new javax.swing.JScrollPane();
        jDescripcionProducto = new javax.swing.JTextArea();
        jScroll1 = new javax.swing.JScrollPane();
        jTablaProductos = new javax.swing.JTable();
        jModificar = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jNombreProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPrecioProducto = new javax.swing.JTextField();
        jRegresar = new javax.swing.JButton();
        jBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3Producto = new javax.swing.JComboBox<>();
        jIdCategoria = new javax.swing.JTextField();
        jbtnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(780, 578));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 578));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/eliminar.png"))); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 130, 40));

        jComboBox1Producto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        jPanel1.add(jComboBox1Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 100, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Buscar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 85, -1, -1));

        jAgregar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/guardar.png"))); // NOI18N
        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 120, 40));

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
        jPanel1.add(jCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        jTitulo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTitulo2.setText("Agregar producto ");
        jPanel1.add(jTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        jScroll2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jDescripcionProducto.setColumns(20);
        jDescripcionProducto.setRows(5);
        jScroll2.setViewportView(jDescripcionProducto);

        jPanel1.add(jScroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 185, 60));

        jTablaProductos = new javax.swing.JTable(){
            public boolean isCellEditable (int rowIndex, int colIndex){
                return false;
            }
        };
        jTablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaProductosMouseClicked(evt);
            }
        });
        jScroll1.setViewportView(jTablaProductos);

        jPanel1.add(jScroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, 440));

        jModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/modificar.png"))); // NOI18N
        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 130, 40));

        jTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTitulo.setText("Productos");
        jPanel1.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Descripción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));
        jPanel1.add(jNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 140, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Precio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Categoría:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));
        jPanel1.add(jPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 60, -1));

        jRegresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-volver-filled-24.png"))); // NOI18N
        jRegresar.setText("Regresar");
        jRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, -1, -1));

        jBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBuscarKeyPressed(evt);
            }
        });
        jPanel1.add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 84, 90, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Tamaño:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jComboBox3Producto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox3Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "1", "2" }));
        jPanel1.add(jComboBox3Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 110, -1));
        jPanel1.add(jIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 80, -1));

        jbtnbuscar.setText("B");
        jbtnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, -1));

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
                    + "where pr.estadoProductos = true;";
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

    private void buscartablaproductos() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            jTablaProductos.setModel(modelo);
            ps = null;
            rs = null;
            Connection con = practica_proyecto.Conexion.getConexion();

            
            String sql = "select pr.idProducto,ca.nombreCategoria,pr.nombreProducto, pr.descripcionProducto, pr.precio,pr.tamanoProducto "
                    + "from categoria ca join productos pr on ca.idCategoria= pr.idCategoria "
                    + "WHERE pr.nombreProducto LIKE '%"+ jBuscar.getText() +"%' and pr.estadoProductos = true  "
                    + "OR ca.nombreCategoria LIKE '%"+ jBuscar.getText() +"%' and pr.estadoProductos = true "
                    + "OR pr.idProducto LIKE '%"+ jBuscar.getText() +"%' and pr.estadoProductos = true";
                  
                       
                       
                        

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

    private void obtenerid() {

        ps = null;
        rs = null;

        try {

            Connection con = practica_proyecto.Conexion.getConexion();
            boolean estado = true;
            String nombreCategoria = (String) jComboBox1Producto.getSelectedItem();
            System.out.println("El seleccionado es: " + nombreCategoria);
            ps = con.prepareStatement("Select idCategoria From categoria where estadoCategoria = ? And nombreCategoria= ?");
            ps.setBoolean(1, estado);
            ps.setString(2, nombreCategoria);
            rs = ps.executeQuery();

            while (rs.next()) {

                jIdCategoria.setText(rs.getString("idCategoria"));
            }

            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }

    }

    private void limpiarCajas() {

        jComboBox1Producto.setSelectedIndex(0);
        jNombreProducto.setText(null);
        jDescripcionProducto.setText(null);
        jPrecioProducto.setText(null);
        jComboBox3Producto.setSelectedIndex(0);
    }

   


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

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        // TODO add your handling code here:
        obtenerid();
        //int seleccionado = Integer.parseInt((String) jComboBox3Producto.getSelectedItem());
        //System.out.println("el tamaño es " + seleccionado);
        SqlProductos modSql = new SqlProductos();
        Producto mod = new Producto();

        if (jComboBox1Producto.getSelectedItem().equals("Selecciona") || jNombreProducto.getText().equals("") || jDescripcionProducto.getText().equals("") || jPrecioProducto.getText().equals("") || jComboBox3Producto.getSelectedItem().equals("Selecciona")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        } else {

            if (modSql.existeProducto(jNombreProducto.getText()) == 0) {

                ///
                mod.setIdCategoria(Integer.parseInt(jIdCategoria.getText()));
                mod.setNombre(jNombreProducto.getText());
                mod.setDescripcion(jDescripcionProducto.getText());
                mod.setPrecio(Integer.parseInt(jPrecioProducto.getText()));
                mod.setTamanoProducto(Integer.parseInt((String) jComboBox3Producto.getSelectedItem()));
                mod.setEstadoProductos(true);
                

                if (modSql.registrarProductos(mod)) {
                    JOptionPane.showMessageDialog(null, "Producto guardado");
                    mostrartablaproductos();
                    limpiarCajas();
                    jComboBox1Producto.removeAllItems();
                    llenarcomboproductos(); // llena o actualiza el combo box de productos
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");

                }
                ////
            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe");
            }

        }
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        // TODO add your handling code here:

        int Fila = jTablaProductos.getSelectedRow();
        int idProducto = (int) jTablaProductos.getValueAt(Fila, 0);

        //JOptionPane.showMessageDialog(null,idCategoria);
        SqlProductos modSql = new SqlProductos();
        Producto mod = new Producto();

        if (jComboBox1Producto.getSelectedItem().equals("Selecciona") || jNombreProducto.getText().equals("") || jDescripcionProducto.getText().equals("") || jPrecioProducto.getText().equals("") || jComboBox3Producto.getSelectedItem().equals("Selecciona")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        } else {

            if (modSql.existeProducto(jNombreProducto.getText()) == 1 || modSql.existeProducto(jNombreProducto.getText()) == 0) {

                ///
                mod.setIdProducto(idProducto);
                mod.setNombre(jNombreProducto.getText());
                mod.setDescripcion(jDescripcionProducto.getText());
                mod.setPrecio(Integer.parseInt(jPrecioProducto.getText()));
                mod.setTamanoProducto(Integer.parseInt((String) jComboBox3Producto.getSelectedItem()));
                mod.setNombreCategoria((String) jComboBox1Producto.getSelectedItem());

                if (modSql.modificarProductos(mod)) {
                    JOptionPane.showMessageDialog(null, "Producto modificado");
                    mostrartablaproductos();
                    limpiarCajas();

                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar");

                }
                ////
            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe");
            }
        }
    }//GEN-LAST:event_jModificarActionPerformed

    private void jTablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaProductosMouseClicked
        // TODO add your handling code here:
        // Evento cuando se selecciona una fila de la tabla llena el campo de texto
        /*jNombreProducto.setText(null);
        jDescripcionProducto.setText(null);
        jPrecioProducto.setText(null);
        jComboBox3Producto.setSelectedIndex(0);
         */

        ps = null;
        rs = null;

        try {
            Connection con = practica_proyecto.Conexion.getConexion();

            int Fila = jTablaProductos.getSelectedRow();
            String idProducto = jTablaProductos.getValueAt(Fila, 0).toString();

            //ps = con.prepareStatement("SELECT nombreProducto, descripcionProducto, precio, tamanoProducto FROM productos WHERE idProducto=?");
            ps = con.prepareStatement("select pr.idProducto,ca.nombreCategoria,pr.nombreProducto, pr.descripcionProducto, pr.precio,pr.tamanoProducto \n"
                    + "from categoria ca join productos pr on ca.idCategoria = pr.idCategoria \n"
                    + "where pr.idProducto=?");
            ps.setString(1, idProducto);
            rs = ps.executeQuery();

            while (rs.next()) {

                jComboBox1Producto.setSelectedItem(rs.getString("ca.nombreCategoria"));
                jNombreProducto.setText(rs.getString("pr.nombreProducto"));
                jDescripcionProducto.setText(rs.getString("pr.descripcionProducto"));
                jPrecioProducto.setText(rs.getString("pr.precio"));
                jComboBox3Producto.setSelectedItem(rs.getString("pr.tamanoProducto"));

            }

            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.toString());

        }
    }//GEN-LAST:event_jTablaProductosMouseClicked

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:

        int desicion = JOptionPane.showConfirmDialog(null, "¿Esta seguro? No podra desacer esta desicion");

        if (desicion == JOptionPane.YES_OPTION) {

            ///
            int Fila = jTablaProductos.getSelectedRow();
            int idProducto = (int) jTablaProductos.getValueAt(Fila, 0);

            //JOptionPane.showMessageDialog(null,idCategoria);
            SqlProductos modSql = new SqlProductos();
            Producto mod = new Producto();

            mod.setIdProducto(idProducto);
            mod.setEstadoProductos(false);

            if (modSql.eliminarProductos(mod)) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                mostrartablaproductos();
                limpiarCajas();

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");

            }
            //

        }


    }//GEN-LAST:event_jEliminarActionPerformed

    
    
    
    
    private void jbtnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbuscarActionPerformed
        // TODO add your handling code here:
        
        buscartablaproductos();
        
    }//GEN-LAST:event_jbtnbuscarActionPerformed

    private void jBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscartablaproductos();
        }
    }//GEN-LAST:event_jBuscarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jAgregar;
    private javax.swing.JTextField jBuscar;
    public static javax.swing.JLabel jCategoria;
    public static javax.swing.JComboBox<String> jComboBox1Producto;
    private javax.swing.JComboBox<String> jComboBox3Producto;
    public static javax.swing.JTextArea jDescripcionProducto;
    public static javax.swing.JButton jEliminar;
    private javax.swing.JTextField jIdCategoria;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JButton jModificar;
    public static javax.swing.JTextField jNombreProducto;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jPrecioProducto;
    public static javax.swing.JButton jRegresar;
    private javax.swing.JScrollPane jScroll1;
    private javax.swing.JScrollPane jScroll2;
    public static javax.swing.JTable jTablaProductos;
    public static javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jTitulo2;
    private javax.swing.JButton jbtnbuscar;
    // End of variables declaration//GEN-END:variables
}
