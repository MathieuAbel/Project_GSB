/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;


/**
 *
 * @author Anas
 */
public class practiciens extends javax.swing.JFrame {
    DefaultComboBoxModel modeleListeens;

    /**
     * Creates new form ens
     */
    public practiciens() {
        initComponents();
        modeleListeens = new DefaultComboBoxModel();
        jComboBoxRecherche.setModel(modeleListeens);
    }
    public DefaultComboBoxModel getModeleListeens() {
        return modeleListeens;
    }

    public JButton getjButtonFermer() {
        return jButtonFermer;
    }

    public JButton getjButtonOK() {
        return jButtonOK;
    }

    public JButton getjButtonPrecedent() {
        return jButtonPrecedent;
    }

    public JButton getjButtonSuivant() {
        return jButtonSuivant;
    }

    public JComboBox getjComboBoxLieuExercice() {
        return jComboBoxLieuExercice;
    }

    public JComboBox getjComboBoxRecherche() {
        return jComboBoxRecherche;
    }

    public JTextField getjTextFieldCN() {
        return jTextFieldCN;
    }

    public JTextField getjTextFieldCP() {
        return jTextFieldCP;
    }

    public JTextField getjTextFieldVille() {
        return jTextFieldVille;
    }

    public JTextField getjTextFieldAdresse() {
        return jTextFieldAdresse;
    }

    public JTextField getjTextFieldNom() {
        return jTextFieldNom;
    }

    public JTextField getjTextFieldNumero() {
        return jTextFieldNumero;
    }

    public JTextField getjTextFieldPrenom() {
        return jTextFieldPrenom;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelRecherche = new javax.swing.JLabel();
        jButtonOK = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelNom = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jLabelPrenom = new javax.swing.JLabel();
        jTextFieldPrenom = new javax.swing.JTextField();
        jLabelAdresse = new javax.swing.JLabel();
        jTextFieldAdresse = new javax.swing.JTextField();
        jLabelCP = new javax.swing.JLabel();
        jTextFieldCP = new javax.swing.JTextField();
        jLabelVille = new javax.swing.JLabel();
        jTextFieldVille = new javax.swing.JTextField();
        jLabelCN = new javax.swing.JLabel();
        jTextFieldCN = new javax.swing.JTextField();
        jLabelLieuexercice = new javax.swing.JLabel();
        jComboBoxLieuExercice = new javax.swing.JComboBox();
        jButtonFermer = new javax.swing.JButton();
        jButtonSuivant = new javax.swing.JButton();
        jButtonPrecedent = new javax.swing.JButton();
        jComboBoxRecherche = new javax.swing.JComboBox();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel1.setText("Practiciens");

        jLabelRecherche.setText("Recherche");

        jButtonOK.setText("OK");

        jLabelNumero.setText("Numéro");

        jTextFieldNumero.setEditable(false);

        jLabelNom.setText("Nom");

        jTextFieldNom.setEditable(false);

        jLabelPrenom.setText("Prénom");

        jTextFieldPrenom.setEditable(false);

        jLabelAdresse.setText("Adresse");

        jTextFieldAdresse.setEditable(false);

        jLabelCP.setText("CP");

        jTextFieldCP.setEditable(false);
        jTextFieldCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPActionPerformed(evt);
            }
        });

        jLabelVille.setText("Ville");

        jTextFieldVille.setEditable(false);

        jLabelCN.setText("Coeff. Notoriété");

        jTextFieldCN.setEditable(false);

        jLabelLieuexercice.setText("Lieu d'exercice");

        jComboBoxLieuExercice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLieuExerciceActionPerformed(evt);
            }
        });

        jButtonFermer.setText("Fermer");
        jButtonFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFermerActionPerformed(evt);
            }
        });

        jButtonSuivant.setText("Suivant");

        jButtonPrecedent.setText("Précédent");

        jComboBoxRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRechercheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelCN, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addComponent(jLabelLieuexercice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonPrecedent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxLieuExercice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonSuivant, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonFermer))
                                .addComponent(jTextFieldNumero)
                                .addComponent(jTextFieldNom)
                                .addComponent(jTextFieldPrenom)
                                .addComponent(jTextFieldAdresse)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(jLabelVille)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldVille, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelRecherche)
                        .addGap(51, 51, 51)
                        .addComponent(jComboBoxRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOK))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRecherche)
                        .addComponent(jComboBoxRecherche)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAdresse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldVille, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelVille))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLieuExercice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLieuexercice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFermer)
                    .addComponent(jButtonSuivant)
                    .addComponent(jButtonPrecedent))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFermerActionPerformed
        
    }//GEN-LAST:event_jButtonFermerActionPerformed

    private void jComboBoxLieuExerciceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLieuExerciceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLieuExerciceActionPerformed

    private void jComboBoxRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRechercheActionPerformed

    private void jTextFieldCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPActionPerformed

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
            java.util.logging.Logger.getLogger(practiciens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practiciens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practiciens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practiciens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practiciens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonSuivant;
    private javax.swing.JComboBox jComboBoxLieuExercice;
    private javax.swing.JComboBox jComboBoxRecherche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAdresse;
    private javax.swing.JLabel jLabelCN;
    private javax.swing.JLabel jLabelCP;
    private javax.swing.JLabel jLabelLieuexercice;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelRecherche;
    private javax.swing.JLabel jLabelVille;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldAdresse;
    private javax.swing.JTextField jTextFieldCN;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JTextField jTextFieldVille;
    // End of variables declaration//GEN-END:variables
}
