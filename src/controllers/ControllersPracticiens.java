
package controllers;

import Vues.Menu;
import Vues.practiciens;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import models.dao.DaoPraticien;
import models.metier.LieuExercice;
import models.metier.MetierPracticiens;

/**
 *
 * @author btssio
 */
public class ControllersPracticiens implements ActionListener {

    private practiciens vue;
    private String pass;
    private List<MetierPracticiens> lesPracticiens;
    private List<LieuExercice> lesLieus;
    

    public ControllersPracticiens(practiciens vue, String pass) {
        this.vue = vue;
        this.pass = pass;
        afficherLesPraticiens();
        afficherLesLieuExercice();
        vue.getjButtonOK().addActionListener(this);
        vue.getjButtonFermer().addActionListener(this);
        vue.getjButtonPrecedent().addActionListener(this);
        vue.getjButtonSuivant().addActionListener(this);
    }

    public final void afficherLesPraticiens() {
        try {
            lesPracticiens = DaoPraticien.getAllPracticiens();
            for (MetierPracticiens unPracticien : lesPracticiens) {
                vue.getModeleListeens().addElement(unPracticien);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(vue, "Ctrl - erreur SQL");
        }
    }

    public final void afficherLesLieuExercice() {
        try {
            lesLieus = DaoPraticien.getAllLieuExercice();
            for (LieuExercice unLieu : lesLieus) {
                vue.getjComboBoxLieuExercice().addItem(unLieu);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(vue, "Ctrl - erreur SQL");
        }

    }
    
    
    @Override
   public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source == vue.getjButtonOK()) {
            setVues();
        }
        
        if (source == vue.getjButtonPrecedent()) {
            int i = vue.getjComboBoxRecherche().getSelectedIndex();
            int z = i - 1;
            if (z > -1) {

                vue.getjComboBoxRecherche().setSelectedIndex(z);
                setVues();
            }
        }
        
        if (source == vue.getjButtonSuivant()) {
            int i = vue.getjComboBoxRecherche().getSelectedIndex();
            int z = i + 1;
            if (z < vue.getjComboBoxRecherche().getItemCount()) {
                vue.getjComboBoxRecherche().setSelectedIndex(z);
                setVues();
            }
        }
        
        if (source == vue.getjButtonFermer()) {
            vue.setVisible(false);
            Menu vue = new Menu();
            ControllerMenu controllers = new ControllerMenu(vue, pass);
            vue.setVisible(true);
        }
        
    }

    void setVues() {
        MetierPracticiens monPracticien = (MetierPracticiens) vue.getModeleListeens().getSelectedItem();
        vue.getjTextFieldNumero().setText(monPracticien.getPra_num());
        vue.getjTextFieldNom().setText(monPracticien.getPra_nom());
        vue.getjTextFieldPrenom().setText(monPracticien.getPra_prenom());
        vue.getjTextFieldAdresse().setText(monPracticien.getPra_adresse());
        vue.getjTextFieldCP().setText(monPracticien.getPra_cp());
        vue.getjTextFieldVille().setText(monPracticien.getPra_ville());
        vue.getjTextFieldCN().setText(monPracticien.getPra_coefnotoriete());
        vue.getjComboBoxLieuExercice().setSelectedIndex(getIntIndexLieu(lesLieus, monPracticien, -1));
    }


 int getIntIndexLieu(List<LieuExercice> myLieu, MetierPracticiens myPracticien, int index) {

        for (LieuExercice unLieu : myLieu) {
            
            if (unLieu.getTyp_code().equals(myPracticien.getTyp_code())) {
                index = myLieu.indexOf(unLieu);
            }
            
        }
        return index;
    }

}
