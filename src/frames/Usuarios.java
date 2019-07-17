package frames;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import practica_proyecto.SqlUsuarios;
import practica_proyecto.Usuario;

import practica_proyecto.hash;

public class Usuarios extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;

    public Usuarios() {
        initComponents();
        mostrartablausuarios();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1Usuario = new javax.swing.JComboBox<>();
        jRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTitulo2 = new javax.swing.JLabel();
        jScroll = new javax.swing.JScrollPane();
        jTablaUsuarios = new javax.swing.JTable();
        jAgregar = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jUser = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        jModificar = new javax.swing.JButton();
        jPass = new javax.swing.JPasswordField();
        jEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPassConfirma = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setExtendedState(800);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 567));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("idUsuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Tipo de usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jComboBox1Usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1Usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Administrador", "Cajero" }));
        jPanel1.add(jComboBox1Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        jTitulo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTitulo2.setText("Agregar usuario");
        jPanel1.add(jTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 94, -1, -1));

        jTablaUsuarios = new javax.swing.JTable(){
            public boolean isCellEditable (int rowIndex, int colIndex){
                return false;
            }
        };
        jTablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idUsuario", "Nombre", "Contraseña", "Tipo de usuario"
            }
        ));
        jTablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaUsuariosMouseClicked(evt);
            }
        });
        jScroll.setViewportView(jTablaUsuarios);

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));
        jPanel1.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 130, -1));
        jPanel1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 130, -1));

        jModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/modificar.png"))); // NOI18N
        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 130, 40));

        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });
        jPanel1.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 130, -1));

        jEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/eliminar.png"))); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 130, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("<html>Confirmar contraseña:</html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 110, 40));
        jPanel1.add(jPassConfirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 130, -1));

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

    private void limpiarCajas() {

        jUser.setText(null);
        jNombre.setText(null);
        jPass.setText(null);
        jPassConfirma.setText(null);
        jComboBox1Usuario.setSelectedIndex(0);

    }

    private void mostrartablausuarios() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            jTablaUsuarios.setModel(modelo);
            ps = null;
            rs = null;
            Connection con = practica_proyecto.Conexion.getConexion();

            String sql = "Select idUsuario,nombreUsuario, tipoUsuario from Usuario where estadoUsuario = true  ";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("IdUsuario");
            modelo.addColumn("Nombre");
            // modelo.addColumn("Contraseña");
            modelo.addColumn("Tipo Usuario");

            int[] anchos = {186, 186, 204};

            for (int x = 0; x < cantidadColumnas; x++) {
                jTablaUsuarios.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
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


    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        // TODO add your handling code here:

        SqlUsuarios modSql = new SqlUsuarios();
        Usuario mod = new Usuario();

        String pass = new String(jPass.getPassword());
        String passCon = new String(jPassConfirma.getPassword());

        //if(jComboBox1Usuario.getSelectedItem().equals("Selecciona"))
        //{
        //    System.out.println("Lo que esta en la caja es:  " + jComboBox1Usuario.getSelectedItem());
        //}
        if (jUser.getText().equals("") || jNombre.getText().equals("") || pass.equals("") || passCon.equals("") || jComboBox1Usuario.getSelectedItem().equals("Selecciona")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        } else {

            if (pass.equals(passCon)) {

                if (modSql.existeUsuario(jUser.getText()) == 0) {

                    String nuevopass = hash.sha1(pass);

                    mod.setIdUsuario(jUser.getText());
                    mod.setNombreUsuario(jNombre.getText());
                    mod.setContrasena(nuevopass);
                    mod.setTipoUsuario((String) jComboBox1Usuario.getSelectedItem());
                    mod.setEstadoUsuario(true);

                    if (modSql.registrarUsuarios(mod)) {
                        JOptionPane.showMessageDialog(null, "Usuario guardado");
                        mostrartablausuarios();
                        limpiarCajas();
                    } else {

                        JOptionPane.showMessageDialog(null, "Error al guardar usuario");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            } else {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }

    }//GEN-LAST:event_jAgregarActionPerformed

    private void jRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegresarActionPerformed
        menuPrincipal frame2 = new menuPrincipal();
        frame2.setLocationRelativeTo(null);
        this.hide();
        frame2.show();
    }//GEN-LAST:event_jRegresarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        // TODO add your handling code here:

        SqlUsuarios modSql = new SqlUsuarios();
        Usuario mod = new Usuario();

        String pass = new String(jPass.getPassword());
        String passCon = new String(jPassConfirma.getPassword());

        if (jUser.getText().equals("") || jNombre.getText().equals("") || pass.equals("") || passCon.equals("") || jComboBox1Usuario.getSelectedItem().equals("Selecciona")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        } else {

            if (pass.equals(passCon)) {

                String nuevopass = hash.sha1(pass);

                mod.setIdUsuario(jUser.getText());
                mod.setNombreUsuario(jNombre.getText());
                mod.setContrasena(nuevopass);
                mod.setTipoUsuario((String) jComboBox1Usuario.getSelectedItem());
                mod.setEstadoUsuario(true);

                if (modSql.modificarUsuarios(mod)) {
                    JOptionPane.showMessageDialog(null, "Usuario modificado");
                    mostrartablausuarios();
                    limpiarCajas();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al modificar usuario");
                }

            } else {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }

        }
    }//GEN-LAST:event_jModificarActionPerformed

    private void jTablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaUsuariosMouseClicked
        // TODO add your handling code here:
        ps = null;
        rs = null;

        try {
            Connection con = practica_proyecto.Conexion.getConexion();

            int Fila = jTablaUsuarios.getSelectedRow();
            String idUsuario = jTablaUsuarios.getValueAt(Fila, 0).toString();

            //ps = con.prepareStatement("SELECT nombreProducto, descripcionProducto, precio, tamanoProducto FROM productos WHERE idProducto=?");
            ps = con.prepareStatement("SELECT idUsuario, nombreUsuario, contrasena, tipoUsuario FROM Usuario WHERE idUsuario=?");
            ps.setString(1, idUsuario);
            rs = ps.executeQuery();

            while (rs.next()) {

                jUser.setText(rs.getString("idUsuario"));
                jNombre.setText(rs.getString("nombreUsuario"));
                //jPass.setText(rs.getString("contrasena"));
                jComboBox1Usuario.setSelectedItem(rs.getString("tipoUsuario"));

            }

            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.toString());

        }


    }//GEN-LAST:event_jTablaUsuariosMouseClicked

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:

        int desicion = JOptionPane.showConfirmDialog(null, "¿Esta seguro? No podra desacer esta desicion");

        if (desicion == JOptionPane.YES_OPTION) {

            int Fila = jTablaUsuarios.getSelectedRow();
            String idUsuario = (String) jTablaUsuarios.getValueAt(Fila, 0);

            //JOptionPane.showMessageDialog(null,idCategoria);
            System.out.println("el idUsuario es: " + idUsuario);

            SqlUsuarios modSql = new SqlUsuarios();
            Usuario mod = new Usuario();

            mod.setIdUsuario(idUsuario);
            mod.setEstadoUsuario(false);

            if (modSql.eliminarUsuarios(mod)) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado");

                mostrartablausuarios();
                limpiarCajas();

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");

            }
        }
    }//GEN-LAST:event_jEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jAgregar;
    public static javax.swing.JComboBox<String> jComboBox1Usuario;
    public static javax.swing.JButton jEliminar;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JButton jModificar;
    public static javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jPass;
    private javax.swing.JPasswordField jPassConfirma;
    public static javax.swing.JButton jRegresar;
    public static javax.swing.JScrollPane jScroll;
    public static javax.swing.JTable jTablaUsuarios;
    public static javax.swing.JLabel jTitulo;
    public static javax.swing.JLabel jTitulo2;
    public static javax.swing.JTextField jUser;
    // End of variables declaration//GEN-END:variables
}
