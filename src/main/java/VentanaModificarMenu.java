/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fabrizzio
 */
public class VentanaModificarMenu extends javax.swing.JFrame {
    Terminal Ter;
    /**
     * Creates new form ModificacionDatosPasajero
     */
    public VentanaModificarMenu(Terminal Ter) {
        this.Ter  = Ter;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotonNombre = new javax.swing.JButton();
        BotonTipoPasajero = new javax.swing.JButton();
        BotonCambioBus = new javax.swing.JButton();
        BotonCambioAsiento = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RutModificar = new javax.swing.JTextField();
        DestinoModificar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Que datos desea modificar?");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        BotonNombre.setText("Nombre");
        BotonNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonNombreMouseClicked(evt);
            }
        });
        BotonNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNombreActionPerformed(evt);
            }
        });

        BotonTipoPasajero.setText("Tipo de Pasajero");
        BotonTipoPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonTipoPasajeroMouseClicked(evt);
            }
        });
        BotonTipoPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTipoPasajeroActionPerformed(evt);
            }
        });

        BotonCambioBus.setText("Cambio de Bus");
        BotonCambioBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCambioBusMouseClicked(evt);
            }
        });
        BotonCambioBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambioBusActionPerformed(evt);
            }
        });

        BotonCambioAsiento.setText("Cambio de asiento");
        BotonCambioAsiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCambioAsientoMouseClicked(evt);
            }
        });
        BotonCambioAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambioAsientoActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel2.setText("En el mismo Bus");

        RutModificar.setText("Rut");
        RutModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutModificarActionPerformed(evt);
            }
        });

        DestinoModificar.setText("Destino Actual");
        DestinoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinoModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Volver)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonNombre)
                    .addComponent(RutModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTipoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonCambioBus)
                    .addComponent(BotonCambioAsiento)
                    .addComponent(DestinoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RutModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DestinoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Volver, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonNombre)
                            .addComponent(BotonCambioBus))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonTipoPasajero)
                            .addComponent(BotonCambioAsiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonNombreActionPerformed

    private void BotonNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNombreMouseClicked
        VentanaModNombre VentanaN = new VentanaModNombre(Ter,RutModificar.getText(),DestinoModificar.getText());
        VentanaN.setVisible(true);
        
    }//GEN-LAST:event_BotonNombreMouseClicked

    private void BotonCambioBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCambioBusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCambioBusMouseClicked

    private void BotonCambioBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambioBusActionPerformed
        VentanaCamBus VentanaB = new VentanaCamBus(Ter,RutModificar.getText(),DestinoModificar.getText());
        VentanaB.setVisible(true);
    }//GEN-LAST:event_BotonCambioBusActionPerformed

    private void BotonTipoPasajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTipoPasajeroMouseClicked
        VentanaModTipo VentanaT = new VentanaModTipo(Ter,RutModificar.getText(),DestinoModificar.getText());
        VentanaT.setVisible(true);
    }//GEN-LAST:event_BotonTipoPasajeroMouseClicked

    private void BotonTipoPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTipoPasajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonTipoPasajeroActionPerformed

    private void BotonCambioAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambioAsientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCambioAsientoActionPerformed

    private void BotonCambioAsientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCambioAsientoMouseClicked
        VentanaCamAsiento VentanaA = new VentanaCamAsiento(Ter,RutModificar.getText(),DestinoModificar.getText());
        VentanaA.setVisible(true);
    }//GEN-LAST:event_BotonCambioAsientoMouseClicked

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolverActionPerformed

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        this.dispose();
    }//GEN-LAST:event_VolverMouseClicked

    private void RutModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RutModificarActionPerformed

    private void DestinoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinoModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificarMenu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCambioAsiento;
    private javax.swing.JButton BotonCambioBus;
    private javax.swing.JButton BotonNombre;
    private javax.swing.JButton BotonTipoPasajero;
    private javax.swing.JTextField DestinoModificar;
    private javax.swing.JTextField RutModificar;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
