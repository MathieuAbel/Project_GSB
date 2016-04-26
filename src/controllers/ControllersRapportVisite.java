
package controllers;

import Vues.Menu;
import Vues.practiciens;
import Vues.rapportVisite;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.dao.DaoMedicaments;
import models.dao.DaoPraticien;
import models.dao.DaoRapport;
import models.metier.LieuExercice;
import models.metier.Medicaments;
import models.metier.MetierPracticiens;
import models.metier.MetierVisiteur;
import models.metier.RapportVisite;

/**
 *
 * @author btssio
 */
public class ControllersRapportVisite implements ActionListener {
    private rapportVisite vue;
    private String pass;
    private int z = 0;
    private boolean nouveau = false;
    private List<MetierPracticiens> lesPracticiens;
    private List<Medicaments> lesMedicaments;
    private List<RapportVisite> lesRapports;
    private List<LieuExercice> lesLieus;
    private RapportVisite unPracticien;
    private MetierVisiteur unVisiteur;
    private practiciens vuePracticiens = new practiciens();
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public ControllersRapportVisite(rapportVisite vue, String pass) {
        this.vue=vue;
        this.pass = pass;
        afficherLesPraticiens();
        vue.getjButtonNouveau().addActionListener(this);
        vue.getjButtonDetails().addActionListener(this);
        vue.getjButtonFermer().addActionListener(this);
        vue.getjButtonPrecedent().addActionListener(this);
        vue.getjButtonSuivant().addActionListener(this);
        vue.getjButtonEnregistrer().addActionListener(this);
        vuePracticiens.getjButtonFermer().addActionListener(this);
    }
    
    public final void afficherLesPraticiens() {
        try {
            lesPracticiens = DaoPraticien.getAllPracticiens();
            for (MetierPracticiens unPracticien : lesPracticiens) {
                vue.getModeleListeen().addElement(unPracticien);
            }
            lesMedicaments = DaoMedicaments.getAllMedic();
            for (Medicaments unmedoc : lesMedicaments){
                vue.getModelListeMedoc().addElement(unmedoc.toString());
            }
            lesLieus = DaoPraticien.getAllLieuExercice();
            for (LieuExercice unLieu : lesLieus) {
                vuePracticiens.getjComboBoxLieuExercice().addItem(unLieu);
            }
            lesRapports = DaoRapport.getAllRapportVisite();
            setVue(z);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(vue, "Ctrl - erreur SQL");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source =e.getSource();
        
        if (source == vue.getjButtonDetails()){
            vuePracticiens.setVisible(true);
            SetVuesPrac(vue.getjComboBoxPracticien().getSelectedIndex());
            vue.setVisible(false);
        }
        
        if (source == vue.getjButtonFermer()){
            vue.setVisible(false);
            Menu vue = new Menu();
            ControllerMenu controllers = new ControllerMenu(vue, pass);
            vue.setVisible(true);
        }
        
        if (source == vue.getjButtonPrecedent()) {
            if (z > 0) {
                z -= 1;
                setVue(z);
            }
        }
        
        if (source == vue.getjButtonSuivant()) {
            if (z < lesRapports.size() -1) {
                z += 1;
                setVue(z);
            }
        }
        
        if (source == vuePracticiens.getjButtonFermer()){
            vuePracticiens.setVisible(false);
            vue.setVisible(true);
        }
        
        if (source == vue.getjButtonNouveau()) {
            vue.getjTextFieldNumRapport().setText("");
            vue.getjTextFieldModifVisite().setText("");
            vue.getjTextAreaBilan().setText("");
            vue.getjDateChooser1().setDate(null);
        }
        
        if (source == vue.getjButtonEnregistrer()) {
            try {
                String matri = pass;
                int numPraticient = (vue.getjComboBoxPracticien().getSelectedIndex())+1;
                int numRapport = Integer.parseInt(vue.getjTextFieldNumRapport().getText());
                String motifVisite = vue.getjTextFieldModifVisite().getText();
                String date = dateFormat.format(vue.getjDateChooser1().getDate()).toString();
                String bilan = vue.getjTextAreaBilan().getText();
                
                DaoRapport.insertRapport(matri, numRapport, numPraticient, date, bilan, motifVisite);
                lesRapports = DaoRapport.getAllRapportVisite();
            } catch (SQLException ex) {
                Logger.getLogger(ControllersMedicaments.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControllersRapportVisite.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public MetierVisiteur setVisiteurWithFromAccueil(MetierVisiteur myVisiteur){
        unVisiteur=myVisiteur;
        return unVisiteur;
    }        
    
    
    void setVue(int z){
        RapportVisite unRapport = lesRapports.get(z);
        vue.getjTextFieldNumRapport().setText(unRapport.getNumeroRapport());
        vue.getjTextFieldModifVisite().setText(unRapport.getMotifRapport());
        vue.getjTextAreaBilan().setText(unRapport.getBilanRapport());
        vue.getjDateChooser1().setDate(unRapport.getDateRapport());
        vue.getjComboBoxPracticien().setSelectedIndex(Integer.parseInt(unRapport.getNumeroen())-1);
    }
    
    
    void SetVuesPrac(int z) {
        MetierPracticiens monPracticien = lesPracticiens.get(z);
        vuePracticiens.getjTextFieldNumero().setText(monPracticien.getPra_num());
        vuePracticiens.getjTextFieldNom().setText(monPracticien.getPra_nom());
        vuePracticiens.getjTextFieldPrenom().setText(monPracticien.getPra_prenom());
        vuePracticiens.getjTextFieldAdresse().setText(monPracticien.getPra_adresse());
        vuePracticiens.getjTextFieldCP().setText(monPracticien.getPra_cp());
        vuePracticiens.getjTextFieldVille().setText(monPracticien.getPra_ville());
        vuePracticiens.getjTextFieldCN().setText(monPracticien.getPra_coefnotoriete());
        vuePracticiens.getjComboBoxLieuExercice().setSelectedIndex(getIntIndexLieu(lesLieus, monPracticien, -1));
    }
        
    int getIntIndexLieu(List<LieuExercice> myLieu, MetierPracticiens myPracticien, int index) {

        for (LieuExercice unLieu : myLieu) {
            if (unLieu.getTyp_code().equals(myPracticien.getTyp_code())) {
                index = myLieu.indexOf(unLieu);
            }
        }
        return index;
    }
    
    
    void displayRapportVisite() throws SQLException, ClassNotFoundException{
        
        List<RapportVisite> myList = DaoRapport.getRapportVisiteWithVisiteur(setVisiteurWithFromAccueil(unVisiteur));
        
    }
}
