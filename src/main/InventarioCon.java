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
import net.proteanit.sql.DbUtils; 
public class InventarioCon extends javax.swing.JInternalFrame {
    public InventarioCon() {
        initComponents();
        verDatos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConsulta = new javax.swing.JPanel();
        lblConsulta = new javax.swing.JLabel();
        cmbConsulta = new javax.swing.JComboBox<>();
        txtConsulta = new javax.swing.JTextField();
        pnlDatos = new javax.swing.JPanel();
        spnDatos = new javax.swing.JScrollPane();
        tblInventarioCon = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta de Inventario");

        pnlConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        lblConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        lblConsulta.setText("Buscar Por :");

        cmbConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código de Medicamento", "Código de Farmacia", "Cantidad", "Precio" }));
        cmbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConsultaActionPerformed(evt);
            }
        });

        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbConsulta, 0, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtConsulta)
                .addContainerGap())
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        tblInventarioCon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Medicamento", "Código Farmacia", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spnDatos.setViewportView(tblInventarioCon);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            añadir = conexion.prepareStatement("select * from inventario");
            ResultSet rs = añadir.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel Df = (DefaultTableModel) tblInventarioCon.getModel();
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
            Logger.getLogger(CiudadReg.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (SQLException ex) {
            Logger.getLogger(CiudadReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void cmbConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConsultaActionPerformed
        txtConsulta.setText("");
        txtConsulta.requestFocus();
    }//GEN-LAST:event_cmbConsultaActionPerformed
    private void txtConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyReleased
        try {
            String itemSeleccionado = (String)cmbConsulta.getSelectedItem();
            String seleccion = "";
            if (itemSeleccionado == "Código de Personal"){
                seleccion = "codigo_medicamento";
            }
            if (itemSeleccionado == "Código de Farmacia"){
                seleccion = "codigo_farmacia";
            }
            if (itemSeleccionado == "Cantidad"){
                seleccion = "cantidad_medicamento";
            }
            if (itemSeleccionado == "Precio"){
                seleccion = "precio_medicamento";
            }
            String consulta = "select * from inventario where "+seleccion+" = ?";
            System.out.println(consulta);
            PreparedStatement pst = conexion.prepareStatement(consulta);
            pst.setString(1, txtConsulta.getText());
            ResultSet rs = pst.executeQuery();
            tblInventarioCon.setModel(DbUtils.resultSetToTableModel(rs));
            while(rs.next()){           
            }
            pst.close();
        }
         catch (SQLException ex) {
            Logger.getLogger(CiudadReg.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_txtConsultaKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbConsulta;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JScrollPane spnDatos;
    private javax.swing.JTable tblInventarioCon;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
