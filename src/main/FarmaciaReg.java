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
public class FarmaciaReg extends javax.swing.JInternalFrame {
    public FarmaciaReg() {
        initComponents();
        verDatos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        lblCodigoFarmacia = new javax.swing.JLabel();
        lblNombreFarmacia = new javax.swing.JLabel();
        lblDireccionFarmacia = new javax.swing.JLabel();
        lblCiudadFarmacia = new javax.swing.JLabel();
        txtCodigoFarmacia = new javax.swing.JTextField();
        txtNombreFarmacia = new javax.swing.JTextField();
        txtDireccionFarmacia = new javax.swing.JTextField();
        txtCiudadFarmacia = new javax.swing.JTextField();
        pnlOpciones = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        spnDatos = new javax.swing.JScrollPane();
        tblFarmacia = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Farmacias");
        setPreferredSize(new java.awt.Dimension(600, 500));
        setRequestFocusEnabled(false);

        pnlFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));

        lblCodigoFarmacia.setText("Código");

        lblNombreFarmacia.setText("Nombre");

        lblDireccionFarmacia.setText("Dirección");

        lblCiudadFarmacia.setText("Ciudad:");

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccionFarmacia)
                    .addComponent(lblCiudadFarmacia)
                    .addComponent(lblNombreFarmacia)
                    .addComponent(lblCodigoFarmacia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccionFarmacia, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addComponent(txtNombreFarmacia)
                    .addComponent(txtCodigoFarmacia)
                    .addComponent(txtCiudadFarmacia))
                .addGap(6, 6, 6))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoFarmacia)
                    .addComponent(txtCodigoFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreFarmacia)
                    .addComponent(txtNombreFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionFarmacia)
                    .addComponent(txtDireccionFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudadFarmacia)
                    .addComponent(txtCiudadFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
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
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap())
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

        tblFarmacia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblFarmacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFarmaciaMouseClicked(evt);
            }
        });
        spnDatos.setViewportView(tblFarmacia);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(spnDatos)
                .addGap(6, 6, 6))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(spnDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFormulario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
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
            añadir = conexion.prepareStatement("select * from farmacia");
            ResultSet rs = añadir.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel Df = (DefaultTableModel) tblFarmacia.getModel();
            Df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a <= c; a++){
                    v2.add(rs.getString("codigo_farmacia"));
                    v2.add(rs.getString("nombre_farmacia"));
                    v2.add(rs.getString("direccion_farmacia"));
                    v2.add(rs.getString("codigo_ciudad"));
                }
                Df.addRow(v2);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FarmaciaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(FarmaciaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String codigoFarmacia = txtCodigoFarmacia.getText();
        String nombreFarmacia = txtNombreFarmacia.getText();
        String direccionFarmacia = txtDireccionFarmacia.getText();
        String codigoCiudad = txtCiudadFarmacia.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("insert into farmacia(codigo_farmacia, nombre_farmacia, direccion_farmacia, codigo_ciudad)values(?, ?, ?, ?)");
            añadir.setString(1, codigoFarmacia);
            añadir.setString(2, nombreFarmacia);
            añadir.setString(3, direccionFarmacia);
            añadir.setString(4, codigoCiudad);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Farmacia Añadida");
            verDatos();
            txtCodigoFarmacia.setText("");
            txtNombreFarmacia.setText("");
            txtDireccionFarmacia.setText("");
            txtCiudadFarmacia.setText("");
            txtCodigoFarmacia.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FarmaciaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(FarmaciaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        DefaultTableModel Df = (DefaultTableModel) tblFarmacia.getModel();
        int selectedIndex = tblFarmacia.getSelectedRow();        
        try {
            int codigoActual = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());  
            String codigo = txtCodigoFarmacia.getText();
            int codigoNuevo = Integer.parseInt(codigo);
            String nombre = txtNombreFarmacia.getText();
            String direccion = txtDireccionFarmacia.getText();
            String ciudadString = txtCiudadFarmacia.getText();
            int ciudad = Integer.parseInt(ciudadString);
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("update farmacia set codigo_farmacia = ?, nombre_farmacia = ?, direccion_farmacia = ?, codigo_ciudad = ? where codigo_farmacia = ?");
            añadir.setInt(1, codigoNuevo);
            añadir.setString(2, nombre);
            añadir.setString(3, direccion);
            añadir.setInt(4, ciudad);
            añadir.setInt(5, codigoActual);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Farmacia Modificada");
            verDatos();
            txtCodigoFarmacia.setText("");
            txtNombreFarmacia.setText("");
            txtDireccionFarmacia.setText("");
            txtCodigoFarmacia.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FarmaciaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(FarmaciaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel Df = (DefaultTableModel) tblFarmacia.getModel();
        int selectedIndex = tblFarmacia.getSelectedRow();        
        try {
            int codigoActual = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("delete from farmacia where codigo_farmacia = ?");
            añadir.setInt(1, codigoActual);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Farmacia Eliminada");
            verDatos();
            txtCodigoFarmacia.setText("");
            txtNombreFarmacia.setText("");
            txtDireccionFarmacia.setText("");
            txtCiudadFarmacia.setText("");
            txtCodigoFarmacia.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FarmaciaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(FarmaciaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblFarmaciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFarmaciaMouseClicked
        DefaultTableModel Df = (DefaultTableModel) tblFarmacia.getModel();
        int selectedIndex = tblFarmacia.getSelectedRow();        
        txtCodigoFarmacia.setText(Df.getValueAt(selectedIndex, 0).toString());
        txtNombreFarmacia.setText(Df.getValueAt(selectedIndex, 1).toString());
        txtDireccionFarmacia.setText(Df.getValueAt(selectedIndex, 2).toString());
        txtCiudadFarmacia.setText(Df.getValueAt(selectedIndex, 3).toString());
    }//GEN-LAST:event_tblFarmaciaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblCiudadFarmacia;
    private javax.swing.JLabel lblCodigoFarmacia;
    private javax.swing.JLabel lblDireccionFarmacia;
    private javax.swing.JLabel lblNombreFarmacia;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JScrollPane spnDatos;
    private javax.swing.JTable tblFarmacia;
    private javax.swing.JTextField txtCiudadFarmacia;
    private javax.swing.JTextField txtCodigoFarmacia;
    private javax.swing.JTextField txtDireccionFarmacia;
    private javax.swing.JTextField txtNombreFarmacia;
    // End of variables declaration//GEN-END:variables
}
