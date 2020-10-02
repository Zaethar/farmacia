package main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class InventarioReg extends javax.swing.JInternalFrame {
    public InventarioReg() {
        initComponents();
        verDatos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        lblCodigoMedicamento = new javax.swing.JLabel();
        lblCodigoFarmacia = new javax.swing.JLabel();
        lblCantidadMedicamento = new javax.swing.JLabel();
        lblPrecioMedicamento = new javax.swing.JLabel();
        txtCodigoMedicamento = new javax.swing.JTextField();
        txtCodigoFarmacia = new javax.swing.JTextField();
        txtCantidadMedicamento = new javax.swing.JTextField();
        txtPrecioMedicamento = new javax.swing.JTextField();
        pnlOpciones = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        spnDatos = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Inventario");
        setPreferredSize(new java.awt.Dimension(500, 482));

        pnlFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));

        lblCodigoMedicamento.setText("Código de Medicamento");

        lblCodigoFarmacia.setText("Código de Farmacia");

        lblCantidadMedicamento.setText("Cantidad ");

        lblPrecioMedicamento.setText("Precio");

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigoMedicamento)
                    .addComponent(lblCodigoFarmacia)
                    .addComponent(lblCantidadMedicamento)
                    .addComponent(lblPrecioMedicamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoMedicamento)
                    .addComponent(txtPrecioMedicamento)
                    .addComponent(txtCodigoFarmacia)
                    .addComponent(txtCantidadMedicamento))
                .addContainerGap())
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoMedicamento)
                    .addComponent(txtCodigoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoFarmacia)
                    .addComponent(txtCodigoFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadMedicamento)
                    .addComponent(txtCantidadMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioMedicamento)
                    .addComponent(txtPrecioMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnAñadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addGap(6, 6, 6))
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadir)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(6, 6, 6))
        );

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C Medicamento", "C Farmacia", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventarioMouseClicked(evt);
            }
        });
        spnDatos.setViewportView(tblInventario);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(spnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection conexion;
    PreparedStatement añadir;
    private void verDatos(){
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("select * from inventario");
            ResultSet rs = añadir.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel Df = (DefaultTableModel) tblInventario.getModel();
            Df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a <= c; a++){
                    v2.add(rs.getString("codigo_medicamento"));
                    v2.add(rs.getString("codigo_farmacia"));
                    v2.add(rs.getString("cantidad_medicamento"));
                    v2.add(rs.getString("precio_medicamento"));
                }
                Df.addRow(v2);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InventarioReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(InventarioReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String codigoMedicamento = txtCodigoMedicamento.getText();
        String codigoFarmacia = txtCodigoFarmacia.getText();
        String cantidadMedicamento = txtCantidadMedicamento.getText();
        String precioMedicamento = txtPrecioMedicamento.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("insert into inventario(codigo_medicamento, codigo_farmacia, cantidad_medicamento, precio_medicamento)values(?, ?, ?, ?)");
            añadir.setString(1, codigoMedicamento);
            añadir.setString(2, codigoFarmacia);
            añadir.setString(3, cantidadMedicamento);
            añadir.setString(4, precioMedicamento);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Medicamentos añadidos al Inventario");
            verDatos();
            txtCodigoMedicamento.setText("");
            txtCodigoFarmacia.setText("");
            txtCantidadMedicamento.setText("");
            txtPrecioMedicamento.setText("");
            txtCodigoMedicamento.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InventarioReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(InventarioReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        DefaultTableModel Df = (DefaultTableModel) tblInventario.getModel();
        int selectedIndex = tblInventario.getSelectedRow();        
        try {
            int codigoActual = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());  
            String codigo = txtCodigoMedicamento.getText();
            int codigoNuevo = Integer.parseInt(codigo);
            String codigoFarmacia = txtCodigoFarmacia.getText();
            String cantidadMedicamento = txtCantidadMedicamento.getText();
            String precioMedicamento = txtPrecioMedicamento.getText();
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("update inventario set codigo_medicamento = ?, codigo_farmacia = ?, cantidad_medicamento = ?, precio_medicamento = ? where codigo_medicamento = ?");
            añadir.setInt(1, codigoNuevo);
            añadir.setString(2, codigoFarmacia);
            añadir.setString(3, cantidadMedicamento);
            añadir.setString(4, precioMedicamento);
            añadir.setInt(5, codigoActual);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos Modificados");
            verDatos();
            txtCodigoMedicamento.setText("");
            txtCodigoFarmacia.setText("");
            txtCantidadMedicamento.setText("");
            txtPrecioMedicamento.setText("");
            txtCodigoMedicamento.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InventarioReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(InventarioReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel Df = (DefaultTableModel) tblInventario.getModel();
        int selectedIndex = tblInventario.getSelectedRow();        
        try {
            int codigoActual = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("delete from inventario where codigo_medicamento = ?");
            añadir.setInt(1, codigoActual);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Datos Eliminados");
            verDatos();
            txtCodigoMedicamento.setText("");
            txtCodigoFarmacia.setText("");
            txtCantidadMedicamento.setText("");
            txtPrecioMedicamento.setText("");
            txtCodigoMedicamento.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InventarioReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(InventarioReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventarioMouseClicked
        DefaultTableModel Df = (DefaultTableModel) tblInventario.getModel();
        int selectedIndex = tblInventario.getSelectedRow();        
        txtCodigoMedicamento.setText(Df.getValueAt(selectedIndex, 0).toString());
        txtCodigoFarmacia.setText(Df.getValueAt(selectedIndex, 1).toString());
        txtCantidadMedicamento.setText(Df.getValueAt(selectedIndex, 2).toString());
        txtPrecioMedicamento.setText(Df.getValueAt(selectedIndex, 3).toString());
    }//GEN-LAST:event_tblInventarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblCantidadMedicamento;
    private javax.swing.JLabel lblCodigoFarmacia;
    private javax.swing.JLabel lblCodigoMedicamento;
    private javax.swing.JLabel lblPrecioMedicamento;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JScrollPane spnDatos;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtCantidadMedicamento;
    private javax.swing.JTextField txtCodigoFarmacia;
    private javax.swing.JTextField txtCodigoMedicamento;
    private javax.swing.JTextField txtPrecioMedicamento;
    // End of variables declaration//GEN-END:variables
}
