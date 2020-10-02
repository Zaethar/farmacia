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
public class MedicamentoReg extends javax.swing.JInternalFrame {
    public MedicamentoReg() {
        initComponents();
        verDatos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        lblCodigoMedicamento = new javax.swing.JLabel();
        lblNombreMedicamento = new javax.swing.JLabel();
        lblConcentracionMedicamento = new javax.swing.JLabel();
        lblCodigoPresentacionMedicamento = new javax.swing.JLabel();
        lblCodigoViaAdministracionMedicamento = new javax.swing.JLabel();
        lblCodigoLaboratorioMedicamento = new javax.swing.JLabel();
        txtCodigoMedicamento = new javax.swing.JTextField();
        txtNombreMedicamento = new javax.swing.JTextField();
        txtConcentracionMedicamento = new javax.swing.JTextField();
        txtCodigoPresentacionMedicamento = new javax.swing.JTextField();
        txtCodigoViaAdministracionMedicamento = new javax.swing.JTextField();
        txtCodigoLaboratorioMedicamento = new javax.swing.JTextField();
        pnlOpciones = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        spnDatos = new javax.swing.JScrollPane();
        tblMedicamento = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Medicamentos");

        pnlFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));

        lblCodigoMedicamento.setText("Código de Medicamento");

        lblNombreMedicamento.setText("Nombre");

        lblConcentracionMedicamento.setText("Concentración");

        lblCodigoPresentacionMedicamento.setText("Código de Presentación");

        lblCodigoViaAdministracionMedicamento.setText("Código de Vía de Administración");

        lblCodigoLaboratorioMedicamento.setText("Código de Laboratorio");

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigoMedicamento)
                    .addComponent(lblCodigoViaAdministracionMedicamento)
                    .addComponent(lblCodigoPresentacionMedicamento)
                    .addComponent(lblConcentracionMedicamento)
                    .addComponent(lblNombreMedicamento)
                    .addComponent(lblCodigoLaboratorioMedicamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoMedicamento)
                    .addComponent(txtConcentracionMedicamento)
                    .addComponent(txtCodigoPresentacionMedicamento)
                    .addComponent(txtCodigoViaAdministracionMedicamento)
                    .addComponent(txtCodigoLaboratorioMedicamento)
                    .addComponent(txtNombreMedicamento))
                .addGap(6, 6, 6))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoMedicamento)
                    .addComponent(txtCodigoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMedicamento)
                    .addComponent(txtNombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConcentracionMedicamento)
                    .addComponent(txtConcentracionMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoPresentacionMedicamento)
                    .addComponent(txtCodigoPresentacionMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoViaAdministracionMedicamento)
                    .addComponent(txtCodigoViaAdministracionMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoLaboratorioMedicamento)
                    .addComponent(txtCodigoLaboratorioMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        tblMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C M", "Nombre", "Concentración", "C P", "C V", "C L"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicamentoMouseClicked(evt);
            }
        });
        spnDatos.setViewportView(tblMedicamento);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(spnDatos)
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(spnDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            añadir = conexion.prepareStatement("select * from medicamento");
            ResultSet rs = añadir.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel Df = (DefaultTableModel) tblMedicamento.getModel();
            Df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a = 1; a <= c; a++){
                    v2.add(rs.getString("codigo_medicamento"));
                    v2.add(rs.getString("nombre_medicamento"));
                    v2.add(rs.getString("concentracion_medicamento"));
                    v2.add(rs.getString("codigo_presentacion"));
                    v2.add(rs.getString("codigo_via_administracion"));
                    v2.add(rs.getString("codigo_laboratorio"));
                }
                Df.addRow(v2);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CiudadReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(CiudadReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String codigoMedicamento = txtCodigoMedicamento.getText();
        String nombreMedicamento = txtNombreMedicamento.getText();
        String concentracionMedicamento = txtConcentracionMedicamento.getText();
        String codigoPresentacionMedicamento = txtCodigoPresentacionMedicamento.getText();
        String codigoViaAdministracionMedicamento = txtCodigoViaAdministracionMedicamento.getText();
        String codigoLaboratorioMedicamento = txtCodigoLaboratorioMedicamento.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("insert into medicamento(codigo_medicamento, nombre_medicamento, concentracion_medicamento, codigo_presentacion, codigo_via_administracion, codigo_laboratorio)values(?, ?, ?, ?, ?, ?)");
            añadir.setString(1, codigoMedicamento);
            añadir.setString(2, nombreMedicamento);
            añadir.setString(3, concentracionMedicamento);
            añadir.setString(4, codigoPresentacionMedicamento);
            añadir.setString(5, codigoViaAdministracionMedicamento);
            añadir.setString(6, codigoLaboratorioMedicamento);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Medicamento Añadido");
            verDatos();
            txtCodigoMedicamento.setText("");
            txtNombreMedicamento.setText("");
            txtConcentracionMedicamento.setText("");
            txtCodigoPresentacionMedicamento.setText("");
            txtCodigoViaAdministracionMedicamento.setText("");
            txtCodigoLaboratorioMedicamento.setText("");
            txtCodigoMedicamento.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MedicamentoReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(MedicamentoReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        DefaultTableModel Df = (DefaultTableModel) tblMedicamento.getModel();
        int selectedIndex = tblMedicamento.getSelectedRow();        
        try {
            int codigoActual = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());  
            String codigo = txtCodigoMedicamento.getText();
            int codigoNuevo = Integer.parseInt(codigo);
            String nombreMedicamento = txtNombreMedicamento.getText();
            String concentracionMedicamento = txtConcentracionMedicamento.getText();
            String codigoPresentacionMedicamento = txtCodigoPresentacionMedicamento.getText();
            String codigoViaAdministracionMedicamento = txtCodigoViaAdministracionMedicamento.getText();
            String codigoLaboratorioMedicamento = txtCodigoLaboratorioMedicamento.getText();
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("update medicamento set codigo_medicamento = ?, nombre_medicamento = ?, concentracion_medicamento = ?, codigo_presentacion = ?, codigo_via_administracion = ?, codigo_laboratorio = ? where codigo_medicamento = ?");
            añadir.setInt(1, codigoNuevo);
            añadir.setString(2, nombreMedicamento);
            añadir.setString(3, concentracionMedicamento);
            añadir.setString(4, codigoPresentacionMedicamento);
            añadir.setString(5, codigoViaAdministracionMedicamento);
            añadir.setString(6, codigoLaboratorioMedicamento);
            añadir.setInt(7, codigoActual);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Medicamento Modificado");
            verDatos();
            txtCodigoMedicamento.setText("");
            txtNombreMedicamento.setText("");
            txtConcentracionMedicamento.setText("");
            txtCodigoPresentacionMedicamento.setText("");
            txtCodigoViaAdministracionMedicamento.setText("");
            txtCodigoLaboratorioMedicamento.setText("");
            txtCodigoMedicamento.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MedicamentoReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(MedicamentoReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel Df = (DefaultTableModel) tblMedicamento.getModel();
        int selectedIndex = tblMedicamento.getSelectedRow();        
        try {
            int codigoActual = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            añadir = conexion.prepareStatement("delete from medicamento where codigo_medicamento = ?");
            añadir.setInt(1, codigoActual);
            añadir.executeUpdate();
            JOptionPane.showMessageDialog(this, "Medicamento Eliminado");
            verDatos();
            txtCodigoMedicamento.setText("");
            txtNombreMedicamento.setText("");
            txtConcentracionMedicamento.setText("");
            txtCodigoPresentacionMedicamento.setText("");
            txtCodigoViaAdministracionMedicamento.setText("");
            txtCodigoLaboratorioMedicamento.setText("");
            txtCodigoMedicamento.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MedicamentoReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(MedicamentoReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicamentoMouseClicked
        DefaultTableModel Df = (DefaultTableModel) tblMedicamento.getModel();
        int selectedIndex = tblMedicamento.getSelectedRow();        
        txtCodigoMedicamento.setText(Df.getValueAt(selectedIndex, 0).toString());
        txtNombreMedicamento.setText(Df.getValueAt(selectedIndex, 1).toString());
        txtConcentracionMedicamento.setText(Df.getValueAt(selectedIndex, 2).toString());
        txtCodigoPresentacionMedicamento.setText(Df.getValueAt(selectedIndex, 3).toString());
        txtCodigoViaAdministracionMedicamento.setText(Df.getValueAt(selectedIndex, 4).toString());
        txtCodigoLaboratorioMedicamento.setText(Df.getValueAt(selectedIndex, 5).toString());
    }//GEN-LAST:event_tblMedicamentoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblCodigoLaboratorioMedicamento;
    private javax.swing.JLabel lblCodigoMedicamento;
    private javax.swing.JLabel lblCodigoPresentacionMedicamento;
    private javax.swing.JLabel lblCodigoViaAdministracionMedicamento;
    private javax.swing.JLabel lblConcentracionMedicamento;
    private javax.swing.JLabel lblNombreMedicamento;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JScrollPane spnDatos;
    private javax.swing.JTable tblMedicamento;
    private javax.swing.JTextField txtCodigoLaboratorioMedicamento;
    private javax.swing.JTextField txtCodigoMedicamento;
    private javax.swing.JTextField txtCodigoPresentacionMedicamento;
    private javax.swing.JTextField txtCodigoViaAdministracionMedicamento;
    private javax.swing.JTextField txtConcentracionMedicamento;
    private javax.swing.JTextField txtNombreMedicamento;
    // End of variables declaration//GEN-END:variables
}
