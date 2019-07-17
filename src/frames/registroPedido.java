package frames;

import static frames.Productos.jComboBox1Producto;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.LEFT;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import practica_proyecto.Producto;

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
                                modelo.insertRow(0, new Object[]{productos.get(index).getNombreCategoria(), productos.get(index).getNombre(), Integer.toString(aux), Integer.toString(productos.get(index).getPrecio()), productos.get(index).getTamanoProducto()});
                                actualizarPrecioTotal();
                                bandera = 1;
                                break;
                            }
                        }
                        if (bandera == 0) {
                            modelo.insertRow(modelo.getRowCount(), new Object[]{productos.get(index).getNombreCategoria(), productos.get(index).getNombre(), Integer.toString(1), Integer.toString(productos.get(index).getPrecio()), productos.get(index).getTamanoProducto()});
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(980, 602));

        metodoPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        metodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTitulo.setText("Registro de pedido");

        jGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images&icons/icons8-guardar-cerrar-48.png"))); // NOI18N
        jGuardar.setText("Guardar");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("A pagar");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Método de pago");

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

        precioTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        precioTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        precioTotal.setFocusable(false);

        panelCategorias.setBackground(new java.awt.Color(255, 255, 255));
        panelCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorías", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14))); // NOI18N
        panelCategorias.setPreferredSize(new java.awt.Dimension(444, 305));
        panelCategorias.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        ScrollCategoria.setViewportView(panelCategorias);

        panelProductos.setBackground(new java.awt.Color(255, 255, 255));
        panelProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 14))); // NOI18N
        panelProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelProductos.setLayout(new java.awt.CardLayout());
        ScrollProducto.setViewportView(panelProductos);
        panelProductos.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(precioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(82, 82, 82)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(metodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jAnular)
                                        .addGap(0, 173, Short.MAX_VALUE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ScrollCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ScrollTabla)
                            .addComponent(ScrollProducto)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCerrarSesion)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollCategoria)
                    .addComponent(ScrollProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jGuardar)
                                .addComponent(jAnular)))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(metodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(precioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(ScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        inicioSesion frame1 = new inicioSesion();
        frame1.setLocationRelativeTo(null);
        this.setVisible(false);
        frame1.setVisible(true);
    }//GEN-LAST:event_jCerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollCategoria;
    private javax.swing.JScrollPane ScrollProducto;
    public static javax.swing.JScrollPane ScrollTabla;
    public static javax.swing.JButton jAnular;
    public static javax.swing.JButton jCerrarSesion;
    public static javax.swing.JButton jGuardar;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel6;
    public static javax.swing.JTable jTabla;
    public static javax.swing.JLabel jTitulo;
    public static javax.swing.JComboBox<String> metodoPago;
    public static javax.swing.JPanel panelCategorias;
    public static javax.swing.JPanel panelProductos;
    private javax.swing.JTextField precioTotal;
    // End of variables declaration//GEN-END:variables

}
