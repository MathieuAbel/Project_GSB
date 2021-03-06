/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;



public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonMenuVisiteur = new javax.swing.JButton();
        jButtonRDV = new javax.swing.JButton();
        jButtonDeconnexion = new javax.swing.JButton();
        jButtonPracticien = new javax.swing.JButton();
        jButtonMedicaments = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        jLabel1.setText("Menu");

        jButtonMenuVisiteur.setText("Visiteurs");
        jButtonMenuVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuVisiteurActionPerformed(evt);
            }
        });

        jButtonRDV.setText("Rapport de visite");
        jButtonRDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRDVActionPerformed(evt);
            }
        });

        jButtonDeconnexion.setText("Deconnexion");
        jButtonDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeconnexionActionPerformed(evt);
            }
        });

        jButtonPracticien.setText("Practiciens");

        jButtonMedicaments.setText("Medicaments");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRDV, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMenuVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPracticien, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMedicaments, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonDeconnexion)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonMenuVisiteur)
                .addGap(30, 30, 30)
                .addComponent(jButtonRDV)
                .addGap(30, 30, 30)
                .addComponent(jButtonPracticien)
                .addGap(30, 30, 30)
                .addComponent(jButtonMedicaments)
                .addGap(30, 30, 30)
                .addComponent(jButtonDeconnexion)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuVisiteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMenuVisiteurActionPerformed

    private void jButtonRDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRDVActionPerformed

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JButton jButtonMedicaments;
    private javax.swing.JButton jButtonMenuVisiteur;
    private javax.swing.JButton jButtonPracticien;
    private javax.swing.JButton jButtonRDV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public JButton getjButtonMenuVisiteur() {
        return jButtonMenuVisiteur;
    }

    public JButton getjButtonMedicaments(){
        return jButtonMedicaments;
    }
    
    public JButton getjButtonRDV() {
        return jButtonRDV;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public JButton getjButtonDeconnexion() {
        return jButtonDeconnexion;
    }

    public JButton getjButtonPracticien() {
        return jButtonPracticien;
    }




}
