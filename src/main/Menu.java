package main;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

import clase.conexion;


public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        conexion conexion = new conexion();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/background.png"));

        Image image = icon.getImage();
        paneEscritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        mbPrincipal = new javax.swing.JMenuBar();
        mnuControl = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        mnuRegistro = new javax.swing.JMenu();
        miCiudad = new javax.swing.JMenuItem();
        miFarmacia = new javax.swing.JMenuItem();
        miPersonal = new javax.swing.JMenuItem();
        sep1 = new javax.swing.JPopupMenu.Separator();
        miLaboratorio = new javax.swing.JMenuItem();
        miMedicamento = new javax.swing.JMenuItem();
        miMedicamentoMonodroga = new javax.swing.JMenuItem();
        miMedicamentoAccionTerapeutica = new javax.swing.JMenuItem();
        miMonodroga = new javax.swing.JMenuItem();
        miAccionMedica = new javax.swing.JMenuItem();
        miPresentacion = new javax.swing.JMenuItem();
        miViaAdministracion = new javax.swing.JMenuItem();
        sep2 = new javax.swing.JPopupMenu.Separator();
        miStock = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        miPersonalCon = new javax.swing.JMenuItem();
        sep3 = new javax.swing.JPopupMenu.Separator();
        miMedicamentoCon = new javax.swing.JMenuItem();
        sep4 = new javax.swing.JPopupMenu.Separator();
        miInventarioCon = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia");
        setPreferredSize(new java.awt.Dimension(700, 500));

        mnuControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sistema.png"))); // NOI18N
        mnuControl.setText("Sistema");

        miSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        miSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mnuControl.add(miSalir);

        mbPrincipal.add(mnuControl);

        mnuRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        mnuRegistro.setText("Registros");

        miCiudad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        miCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ciudad.png"))); // NOI18N
        miCiudad.setText("Ciudades");
        miCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCiudadActionPerformed(evt);
            }
        });
        mnuRegistro.add(miCiudad);

        miFarmacia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        miFarmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/farmacia.png"))); // NOI18N
        miFarmacia.setText("Farmacias");
        miFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFarmaciaActionPerformed(evt);
            }
        });
        mnuRegistro.add(miFarmacia);

        miPersonal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        miPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personal.png"))); // NOI18N
        miPersonal.setText("Personales");
        miPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPersonalActionPerformed(evt);
            }
        });
        mnuRegistro.add(miPersonal);
        mnuRegistro.add(sep1);

        miLaboratorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        miLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/laboratorio.png"))); // NOI18N
        miLaboratorio.setText("Laboratorio");
        miLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLaboratorioActionPerformed(evt);
            }
        });
        mnuRegistro.add(miLaboratorio);

        miMedicamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        miMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicamento.png"))); // NOI18N
        miMedicamento.setText("Medicamento");
        miMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMedicamentoActionPerformed(evt);
            }
        });
        mnuRegistro.add(miMedicamento);

        miMedicamentoMonodroga.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        miMedicamentoMonodroga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicamento.png"))); // NOI18N
        miMedicamentoMonodroga.setText("Medicamento - Monodroga");
        miMedicamentoMonodroga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMedicamentoMonodrogaActionPerformed(evt);
            }
        });
        mnuRegistro.add(miMedicamentoMonodroga);

        miMedicamentoAccionTerapeutica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        miMedicamentoAccionTerapeutica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicamento.png"))); // NOI18N
        miMedicamentoAccionTerapeutica.setText("Medicamento - Acción Terapéutica");
        miMedicamentoAccionTerapeutica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMedicamentoAccionTerapeuticaActionPerformed(evt);
            }
        });
        mnuRegistro.add(miMedicamentoAccionTerapeutica);

        miMonodroga.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        miMonodroga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/monodroga.png"))); // NOI18N
        miMonodroga.setText("Monodroga");
        miMonodroga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMonodrogaActionPerformed(evt);
            }
        });
        mnuRegistro.add(miMonodroga);

        miAccionMedica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        miAccionMedica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accion_terapeutica.png"))); // NOI18N
        miAccionMedica.setText("Acción Terapéutica");
        miAccionMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAccionMedicaActionPerformed(evt);
            }
        });
        mnuRegistro.add(miAccionMedica);

        miPresentacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        miPresentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/presentacion.png"))); // NOI18N
        miPresentacion.setText("Tipo de Presentación");
        miPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPresentacionActionPerformed(evt);
            }
        });
        mnuRegistro.add(miPresentacion);

        miViaAdministracion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        miViaAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/via_administracion.png"))); // NOI18N
        miViaAdministracion.setText("Vía de Administración");
        miViaAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miViaAdministracionActionPerformed(evt);
            }
        });
        mnuRegistro.add(miViaAdministracion);
        mnuRegistro.add(sep2);

        miStock.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        miStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario.png"))); // NOI18N
        miStock.setText("Inventario");
        miStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStockActionPerformed(evt);
            }
        });
        mnuRegistro.add(miStock);

        mbPrincipal.add(mnuRegistro);

        mnuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        mnuConsultas.setText("Consultas");

        miPersonalCon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        miPersonalCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/personal.png"))); // NOI18N
        miPersonalCon.setText("Personal");
        miPersonalCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPersonalConActionPerformed(evt);
            }
        });
        mnuConsultas.add(miPersonalCon);
        mnuConsultas.add(sep3);

        miMedicamentoCon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        miMedicamentoCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicamento.png"))); // NOI18N
        miMedicamentoCon.setText("Medicamento");
        miMedicamentoCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMedicamentoConActionPerformed(evt);
            }
        });
        mnuConsultas.add(miMedicamentoCon);
        mnuConsultas.add(sep4);

        miInventarioCon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        miInventarioCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario.png"))); // NOI18N
        miInventarioCon.setText("Inventario");
        miInventarioCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInventarioConActionPerformed(evt);
            }
        });
        mnuConsultas.add(miInventarioCon);

        mbPrincipal.add(mnuConsultas);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N
        jMenu1.setText("Ayuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manual.png"))); // NOI18N
        jMenuItem1.setText("Manual");
        jMenu1.add(jMenuItem1);

        mbPrincipal.add(jMenu1);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    private void miFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFarmaciaActionPerformed
        FarmaciaReg FarmaciaReg = new FarmaciaReg();
        paneEscritorio.add(FarmaciaReg);
        FarmaciaReg.show();
    }//GEN-LAST:event_miFarmaciaActionPerformed

    private void miPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPersonalActionPerformed
        PersonalReg PersonalReg = new PersonalReg();
        paneEscritorio.add(PersonalReg);
        PersonalReg.show();
    }//GEN-LAST:event_miPersonalActionPerformed

    private void miLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLaboratorioActionPerformed
        LaboratorioReg LaboratorioReg = new LaboratorioReg();
        paneEscritorio.add(LaboratorioReg);
        LaboratorioReg.show();
    }//GEN-LAST:event_miLaboratorioActionPerformed

    private void miPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPresentacionActionPerformed
        PresentacionReg PresentacionReg = new PresentacionReg();
        paneEscritorio.add(PresentacionReg);
        PresentacionReg.show();
    }//GEN-LAST:event_miPresentacionActionPerformed

    private void miMonodrogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMonodrogaActionPerformed
        MonodrogaReg MonodrogaReg = new MonodrogaReg();
        paneEscritorio.add(MonodrogaReg);
        MonodrogaReg.show();
    }//GEN-LAST:event_miMonodrogaActionPerformed

    private void miAccionMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAccionMedicaActionPerformed
        AccionTerapeuticaReg AccionTerapeuticaReg = new AccionTerapeuticaReg();
        paneEscritorio.add(AccionTerapeuticaReg);
        AccionTerapeuticaReg.show();
    }//GEN-LAST:event_miAccionMedicaActionPerformed

    private void miMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMedicamentoActionPerformed
        MedicamentoReg MedicamentoReg = new MedicamentoReg();
        paneEscritorio.add(MedicamentoReg);
        MedicamentoReg.show();
    }//GEN-LAST:event_miMedicamentoActionPerformed

    private void miPersonalConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPersonalConActionPerformed
        PersonalCon PersonalCon = new PersonalCon();
        paneEscritorio.add(PersonalCon);
        PersonalCon.show();
    }//GEN-LAST:event_miPersonalConActionPerformed

    private void miMedicamentoConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMedicamentoConActionPerformed
        MedicamentoCon MedicamentoCon = new MedicamentoCon();
        paneEscritorio.add(MedicamentoCon);
        MedicamentoCon.show();
    }//GEN-LAST:event_miMedicamentoConActionPerformed

    private void miCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCiudadActionPerformed
        CiudadReg CiudadReg = new CiudadReg();
        paneEscritorio.add(CiudadReg);
        CiudadReg.show();
    }//GEN-LAST:event_miCiudadActionPerformed

    private void miStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStockActionPerformed
        InventarioReg InventarioReg = new InventarioReg();
        paneEscritorio.add(InventarioReg);
        InventarioReg.show();
    }//GEN-LAST:event_miStockActionPerformed

    private void miViaAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miViaAdministracionActionPerformed
        ViaAdministracionReg ViaAdministracionReg = new ViaAdministracionReg();
        paneEscritorio.add(ViaAdministracionReg);
        ViaAdministracionReg.show();
    }//GEN-LAST:event_miViaAdministracionActionPerformed

    private void miMedicamentoMonodrogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMedicamentoMonodrogaActionPerformed
        MedicamentoMonodrogaReg MedicamentoMonodrogaReg = new MedicamentoMonodrogaReg();
        paneEscritorio.add(MedicamentoMonodrogaReg);
        MedicamentoMonodrogaReg.show();
    }//GEN-LAST:event_miMedicamentoMonodrogaActionPerformed

    private void miMedicamentoAccionTerapeuticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMedicamentoAccionTerapeuticaActionPerformed
        MedicamentoAccionTerapeuticaReg MedicamentoAccionTerapeuticaReg = new MedicamentoAccionTerapeuticaReg();
        paneEscritorio.add(MedicamentoAccionTerapeuticaReg);
        MedicamentoAccionTerapeuticaReg.show();
    }//GEN-LAST:event_miMedicamentoAccionTerapeuticaActionPerformed

    private void miInventarioConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInventarioConActionPerformed
        InventarioCon InventarioCon = new InventarioCon();
        paneEscritorio.add(InventarioCon);
        InventarioCon.show();
    }//GEN-LAST:event_miInventarioConActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miAccionMedica;
    private javax.swing.JMenuItem miCiudad;
    private javax.swing.JMenuItem miFarmacia;
    private javax.swing.JMenuItem miInventarioCon;
    private javax.swing.JMenuItem miLaboratorio;
    private javax.swing.JMenuItem miMedicamento;
    private javax.swing.JMenuItem miMedicamentoAccionTerapeutica;
    private javax.swing.JMenuItem miMedicamentoCon;
    private javax.swing.JMenuItem miMedicamentoMonodroga;
    private javax.swing.JMenuItem miMonodroga;
    private javax.swing.JMenuItem miPersonal;
    private javax.swing.JMenuItem miPersonalCon;
    private javax.swing.JMenuItem miPresentacion;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JMenuItem miStock;
    private javax.swing.JMenuItem miViaAdministracion;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenu mnuControl;
    private javax.swing.JMenu mnuRegistro;
    private javax.swing.JDesktopPane paneEscritorio;
    private javax.swing.JPopupMenu.Separator sep1;
    private javax.swing.JPopupMenu.Separator sep2;
    private javax.swing.JPopupMenu.Separator sep3;
    private javax.swing.JPopupMenu.Separator sep4;
    // End of variables declaration//GEN-END:variables
}
