package frames;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.LEFT;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import practica_proyecto.Producto;
import practica_proyecto.SqlVentas;
import practica_proyecto.UsuarioInicio;
import practica_proyecto.Ventas1;

public class registroPedido extends javax.swing.JFrame {

    //variables globales
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<String> categorias = new ArrayList<>();
    ArrayList<Producto> productos = new ArrayList<>();
    int acumPrecio = 0;
    DefaultTableModel modelo;
    CardLayout cl;
    categoria1 cat1 = new categoria1();

    public registroPedido() {
        initComponents();
        precioTotal.setText("$");
        this.getContentPane().setBackground(new java.awt.Color(102, 255, 102));
        cl = (CardLayout) panelProductos.getLayout();
        panelCategorias.setPreferredSize(new Dimension(444, 630));
        llenarCategoriasProductos();
        modelo = (DefaultTableModel) jTabla.getModel();

        try {

            Image img = ImageIO.read(new File("icono2.png"));
            this.setIconImage(img);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void llenarCategoriasProductos() {
        ps = null;
        rs = null;

        try {
            Connection con = practica_proyecto.Conexion.getConexion();
            String sql = "Select nombreCategoria From categoria where estadoCategoria = true";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                categorias.add(rs.getString("nombreCategoria"));
            }

            con.close();

        } catch (SQLException ex) {

            System.err.println(ex.toString());

        }

        try {
            Connection con = practica_proyecto.Conexion.getConexion();
            String sql = "Select pr.nombreProducto, ca.nombreCategoria, pr.precio, pr.tamanoProducto\n"
                    + "From productos pr join categoria ca on pr.idCategoria = ca.idCategoria where pr.estadoProductos = true";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto prod = new Producto();
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setNombreCategoria(rs.getString("nombreCategoria"));
                prod.setPrecio(rs.getInt("precio"));
                prod.setTamanoProducto(rs.getInt("tamanoProducto"));
                productos.add(prod);
            }

            con.close();

        } catch (SQLException ex) {

            System.err.println(ex.toString());

        }

        for (int i = 0; i < categorias.size(); i++) {
            //declaracion de objetos y variables
            JButton botonCategoria = new JButton();
            JPanel panelCategoria = new JPanel();
            String aux = "cat" + (i);

            //configuracion del panel de categorias
            panelCategoria.setLayout(new FlowLayout(LEFT));
            panelCategoria.setBackground(Color.WHITE);
            panelCategoria.setPreferredSize(new Dimension(424, 630));
            panelProductos.add(panelCategoria, "cat" + i);
            for (int j = 0; j < productos.size(); j++) {
                int index = j;
                JButton botonProducto = new JButton();
                botonProducto.setText(productos.get(j).getNombre());
                botonProducto.setFont(new Font("Arial", Font.BOLD, 14));
                botonProducto.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int bandera = 0;
                        for (int h = 0; h < modelo.getRowCount(); h++) {
                            if (modelo.getValueAt(h, 1).equals(productos.get(index).getNombre())) {
                                int aux = Integer.parseInt((String) modelo.getValueAt(h, 2)) + 1;
                                modelo.removeRow(h);
                                modelo.insertRow(0, new Object[]{productos.get(index).getNombreCategoria(), productos.get(index).getNombre(), Integer.toString(aux), Integer.toString(productos.get(index).getPrecio()), Integer.toString(productos.get(index).getTamanoProducto())});
                                actualizarPrecioTotal();
                                bandera = 1;
                                break;
                            }
                        }
                        if (bandera == 0) {
                            modelo.insertRow(modelo.getRowCount(), new Object[]{productos.get(index).getNombreCategoria(), productos.get(index).getNombre(), Integer.toString(1), Integer.toString(productos.get(index).getPrecio()), Integer.toString(productos.get(index).getTamanoProducto())});
                            actualizarPrecioTotal();
                        }
                    }

                });
                if (productos.get(j).getNombreCategoria().equals(categorias.get(i))) {
                    panelCategoria.add(botonProducto);
                }
            }
            panelProductos.add(panelCategoria, aux);

            //configuracion de botones de categorias
            panelCategorias.add(botonCategoria);
            botonCategoria.setText(categorias.get(i));
            botonCategoria.setFont(new Font("Arial", Font.BOLD, 14));
            botonCategoria.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cl.show(panelProductos, aux);
                    SwingUtilities.updateComponentTreeUI(registroPedido.this);
                    registroPedido.this.repaint();
                }
            });

        }
    }

    private void actualizarPrecioTotal() {
        acumPrecio = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            acumPrecio = acumPrecio + (Integer.parseInt((String) modelo.getValueAt(i, 2)) * Integer.parseInt((String) modelo.getValueAt(i, 3)));
        }
        precioTotal.setText("$" + Integer.toString(acumPrecio));
    }

    private void anularPedido() {
        int aux = modelo.getRowCount();
        for (int i = 0; i < aux; i++) {
            modelo.removeRow(0);
        }
        actualizarPrecioTotal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        metodoPago = new javax.swing.JComboBox<>();
        jTitulo = new javax.swing.JLabel();
        jGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ScrollTabla = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable(){
            public boolean isCellEditable (int rowIndex, int colIndex){
                return false;
            }
        };
        jAnular = new javax.swing.JButton();
        jCerrarSesion = new javax.swing.JButton();
        precioTotal = new javax.swing.JTextField();
        ScrollCategoria = new javax.swing.JScrollPane();
        panelCategorias = new javax.swing.JPanel();
        ScrollProducto = new javax.swing.JScrollPane();
        panelProductos = new javax.swing.JPanel();
        masCantidad = new javax.swing.JLabel();
        menosCantidad = new javax.swing.JLabel();
        idUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(980, 602));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        metodoPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        metodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Efectivo", "Tarjeta de débito", "Tarjeta de crédito" }));
        jPanel6.add(metodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 396, -1, -1));

        jTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTitulo.setText("Registro de pedido");
        jPanel6.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 11, -1, -1));

        jGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-guardar-cerrar-48.png"))); // NOI18N
        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        jPanel6.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 462, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("A pagar");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 356, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Método de pago");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 356, -1, -1));

        jTabla.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoría", "Nombre", "Cantidad", "Valor unitario", "Tamaño"
            }
        ));
        jTabla.setFocusable(false);
        ScrollTabla.setViewportView(jTabla);

        jPanel6.add(ScrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 412, -1, 107));

        jAnular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-cancelar-48.png"))); // NOI18N
        jAnular.setText("Anular");
        jAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnularActionPerformed(evt);
            }
        });
        jPanel6.add(jAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 462, -1, -1));

        jCerrarSesion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-change-user-30.png"))); // NOI18N
        jCerrarSesion.setText("Cerrar sesión");
        jCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarSesionActionPerformed(evt);
            }
        });
        jPanel6.add(jCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 530, -1, -1));

        precioTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        precioTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        precioTotal.setFocusable(false);
        precioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTotalActionPerformed(evt);
            }
        });
        jPanel6.add(precioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 392, 80, -1));

        panelCategorias.setBackground(new java.awt.Color(255, 255, 255));
        panelCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorías", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14))); // NOI18N
        panelCategorias.setPreferredSize(new java.awt.Dimension(444, 305));
        panelCategorias.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        ScrollCategoria.setViewportView(panelCategorias);

        jPanel6.add(ScrollCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 464, 304));

        panelProductos.setBackground(new java.awt.Color(255, 255, 255));
        panelProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 14))); // NOI18N
        panelProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelProductos.setLayout(new java.awt.CardLayout());
        ScrollProducto.setViewportView(panelProductos);
        panelProductos.getAccessibleContext().setAccessibleDescription("");

        jPanel6.add(ScrollProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 46, 452, 304));

        masCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-más-24.png"))); // NOI18N
        masCantidad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                masCantidadMouseMoved(evt);
            }
        });
        masCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masCantidadMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                masCantidadMouseExited(evt);
            }
        });
        jPanel6.add(masCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 377, -1, -1));

        menosCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-menos-24.png"))); // NOI18N
        menosCantidad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menosCantidadMouseMoved(evt);
            }
        });
        menosCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosCantidadMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menosCantidadMouseExited(evt);
            }
        });
        jPanel6.add(menosCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 377, -1, -1));
        jPanel6.add(idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 90, -1));

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
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnularActionPerformed
        ImageIcon icon = new ImageIcon("src/Images&icons/icons8-pregunta-40.png");
        int op = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres anular el pedido?", "Anular Pedido", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
        if (op == 0) {
            anularPedido();
        }
    }//GEN-LAST:event_jAnularActionPerformed

    private void jCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCerrarSesionActionPerformed
        ini frame1 = new ini();
        frame1.setLocationRelativeTo(null);
        this.setVisible(false);
        frame1.setVisible(true);
    }//GEN-LAST:event_jCerrarSesionActionPerformed

    private void menosCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosCantidadMouseClicked
        int index = jTabla.getSelectedRow();
        System.out.println(index);
        if (index > -1) {
            if (Integer.parseInt((String) modelo.getValueAt(index, 2)) > 1) {
                int aux = Integer.parseInt((String) modelo.getValueAt(index, 2)) - 1;
                String nombreCategoria = (String) modelo.getValueAt(index, 0);
                String nombre = (String) modelo.getValueAt(index, 1);
                int precio = Integer.parseInt((String) modelo.getValueAt(index, 3));
                int tamano = Integer.parseInt((String) modelo.getValueAt(index, 4));

                modelo.removeRow(index);
                modelo.insertRow(0, new Object[]{nombreCategoria, nombre, Integer.toString(aux), Integer.toString(precio), Integer.toString(tamano)});
                actualizarPrecioTotal();
            } else {
                modelo.removeRow(index);
                actualizarPrecioTotal();
            }
        }
    }//GEN-LAST:event_menosCantidadMouseClicked

    private void menosCantidadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosCantidadMouseMoved
        ImageIcon icon = new ImageIcon("src/Images&icons/icons8-menos-32.png");
        menosCantidad.setIcon(icon);
        menosCantidad.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_menosCantidadMouseMoved

    private void menosCantidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosCantidadMouseExited
        ImageIcon icon = new ImageIcon("src/Images&icons/icons8-menos-24.png");
        menosCantidad.setIcon(icon);
        menosCantidad.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_menosCantidadMouseExited

    private void masCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masCantidadMouseClicked
        int index = jTabla.getSelectedRow();
        if (index > -1) {
            int aux = Integer.parseInt((String) modelo.getValueAt(index, 2)) + 1;
            String nombreCategoria = (String) modelo.getValueAt(index, 0);
            String nombre = (String) modelo.getValueAt(index, 1);
            int precio = Integer.parseInt((String) modelo.getValueAt(index, 3));
            int tamano = Integer.parseInt((String) modelo.getValueAt(index, 4));
            modelo.removeRow(index);
            modelo.insertRow(0, new Object[]{nombreCategoria, nombre, Integer.toString(aux), Integer.toString(precio), Integer.toString(tamano)});
            actualizarPrecioTotal();
        }
    }//GEN-LAST:event_masCantidadMouseClicked

    private void masCantidadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masCantidadMouseMoved
        ImageIcon icon = new ImageIcon("src/Images&icons/icons8-más-32.png");
        masCantidad.setIcon(icon);
        masCantidad.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_masCantidadMouseMoved

    private void masCantidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masCantidadMouseExited
        ImageIcon icon = new ImageIcon("src/Images&icons/icons8-más-24.png");
        masCantidad.setIcon(icon);
        masCantidad.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_masCantidadMouseExited

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        // TODO add your handling code here:
        Date fecha = new Date();
        long d = fecha.getTime();
        
        java.sql.Date f = new java.sql.Date(d);
        
        
        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        int metodo = 0;
        
        
        

        SqlVentas modSql = new SqlVentas();
        Ventas1 modo = new Ventas1();

        if (metodoPago.getSelectedItem().equals("Selecciona")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");

        } else {

            if (metodoPago.getSelectedItem().equals("Efectivo")) {
                metodo = 1;
            } else if (metodoPago.getSelectedItem().equals("Tarjeta de débito")) {
                metodo = 2;
            } else if (metodoPago.getSelectedItem().equals("Tarjeta de crédito")) {
                metodo = 3;
            }

            modo.setIdUsuario(idUsuario.getText());
            System.out.println("el id es" + idUsuario.getText());
            //modo.setDatee((java.sql.Date) fecha);
            //modo.setDatee(new java.sql.Date(fecha));
            modo.setDate(f);
            //modo.setDatee(f);
            System.out.println("la fecha es: " + modo.getDate());
            modo.setMetodoPago(metodo);
           System.out.println("el metodo es : " + metodo );
            modo.setValorTotal(Integer.parseInt(precioTotal.getText().substring(1)));
           int total = Integer.parseInt(precioTotal.getText().substring(1));
           System.out.println("el total es: "+total);
            
            if(modSql.registrarVentas(modo)){
                
                JOptionPane.showMessageDialog(null, "Registro guardado");
                anularPedido();
            } else{
                
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
            

        }


    }//GEN-LAST:event_jGuardarActionPerformed

    private void precioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollCategoria;
    private javax.swing.JScrollPane ScrollProducto;
    public static javax.swing.JScrollPane ScrollTabla;
    public static javax.swing.JTextField idUsuario;
    public static javax.swing.JButton jAnular;
    public static javax.swing.JButton jCerrarSesion;
    public static javax.swing.JButton jGuardar;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel6;
    public static javax.swing.JTable jTabla;
    public static javax.swing.JLabel jTitulo;
    private javax.swing.JLabel masCantidad;
    private javax.swing.JLabel menosCantidad;
    public static javax.swing.JComboBox<String> metodoPago;
    public static javax.swing.JPanel panelCategorias;
    public static javax.swing.JPanel panelProductos;
    private javax.swing.JTextField precioTotal;
    // End of variables declaration//GEN-END:variables

}
