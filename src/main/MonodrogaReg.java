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
public class MonodrogaReg extends javax.swing.JInternalFrame {
    public MonodrogaReg() {
        initComponents();
        verDatos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        lblCodigoMonodroga = new javax.swing.JLabel();
        lblNombreMonodroga = new javax.swing.JLabel();
        txtCodigoMonodroga = new javax.swing.JTextField();
        txtNombreMonodroga = new javax.swing.JTextField();
        pnlOpciones = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        spnDatos = new javax.swing.JScrollPane();
        tblMonodroga = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Monodrogas");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(500, 400));

        pnlFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));

        lblCodigoMonodroga.setText("Código");

        lblNombreMonodroga.setText("Nombre");

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreMonodroga)
                    .addComponent(lblCodigoMonodroga))
                .addGap(6, 6, 6)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreMonodroga)
                    .addComponent(txtCodigoMonodroga))
                .addGap(6, 6, 6))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoMonodroga)
                    .addComponent(txtCodigoMonodroga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMonodroga)
                    .addComponent(txtNombreMonodroga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        tblMonodroga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMonodroga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonodrogaMouseClicked(evt);
            }
        });
        spnDatos.setViewportView(tblMonodroga);

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
                .addGap(6, 6, 6)
                .addComponent(spnDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
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
                    .addComponent(pnlDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(6, 6, 6))
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
            añadir = conexion.prepareStatement("select * from monodroga");
            ResultSet rs = añadir.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel Df = (DefaultTableModel) tblMonodroga.getModel();
            Df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a <= c; a++){
                    v2.add(rs.getString("codigo_monodroga"));
                    v2.add(rs.getString("nombre_monodroga"));
                }
                Df.addRow(v2);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MonodrogaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(MonodrogaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String codigoMonodroga = txtCodigoMonodroga.getText();
        String nombreMonodroga = txtNombreMonodroga.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("insert into monodroga(codigo_monodroga, nombre_monodroga)values(?, ?)");
            añadir.setString(1, codigoMonodroga);
            añadir.setString(2, nombreMonodroga);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Monodroga Añadida");
            verDatos();
            txtCodigoMonodroga.setText("");
            txtNombreMonodroga.setText("");
            txtCodigoMonodroga.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MonodrogaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(MonodrogaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        DefaultTableModel Df = (DefaultTableModel) tblMonodroga.getModel();
        int selectedIndex = tblMonodroga.getSelectedRow();        
        try {
            int codigoActual = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());  
            String codigo = txtCodigoMonodroga.getText();
            int codigoNuevo = Integer.parseInt(codigo);
            String nombreMonodroga = txtNombreMonodroga.getText();
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("update monodroga set codigo_monodroga = ?, nombre_monodroga = ? where codigo_monodroga = ?");
            añadir.setInt(1, codigoNuevo);
            añadir.setString(2, nombreMonodroga);
            añadir.setInt(3, codigoActual);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Monodroga Modificada");
            verDatos();
            txtCodigoMonodroga.setText("");
            txtNombreMonodroga.setText("");
            txtCodigoMonodroga.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MonodrogaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(MonodrogaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel Df = (DefaultTableModel) tblMonodroga.getModel();
        int selectedIndex = tblMonodroga.getSelectedRow();        
        try {
            int codigoActual = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("delete from monodroga where codigo_monodroga = ?");
            añadir.setInt(1, codigoActual);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Monodroga Eliminada");
            verDatos();
            txtCodigoMonodroga.setText("");
            txtNombreMonodroga.setText("");
            txtCodigoMonodroga.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MonodrogaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(MonodrogaReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblMonodrogaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonodrogaMouseClicked
        DefaultTableModel Df = (DefaultTableModel) tblMonodroga.getModel();
        int selectedIndex = tblMonodroga.getSelectedRow();        
        txtCodigoMonodroga.setText(Df.getValueAt(selectedIndex, 0).toString());
        txtNombreMonodroga.setText(Df.getValueAt(selectedIndex, 1).toString());
    }//GEN-LAST:event_tblMonodrogaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblCodigoMonodroga;
    private javax.swing.JLabel lblNombreMonodroga;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JScrollPane spnDatos;
    private javax.swing.JTable tblMonodroga;
    private javax.swing.JTextField txtCodigoMonodroga;
    private javax.swing.JTextField txtNombreMonodroga;
    // End of variables declaration//GEN-END:variables
}
