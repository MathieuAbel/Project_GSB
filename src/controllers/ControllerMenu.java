
package controllers;

import Vues.Accueil;
import Vues.Menu;
import Vues.Visiteurs;
import Vues.practiciens;
import Vues.Medicament;
import Vues.rapportVisite;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerMenu implements ActionListener {

    private Menu vue;
    private String pass;

    public ControllerMenu(Menu vue, String pass) {
        
        this.vue = vue;
        this.pass = pass;
        vue.getjButtonMenuVisiteur().addActionListener(this);
        vue.getjButtonRDV().addActionListener(this);
        vue.getjButtonDeconnexion().addActionListener(this);
        vue.getjButtonPracticien().addActionListener(this);
        vue.getjButtonMedicaments().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object source = e.getSource();
        
        if (source == vue.getjButtonMenuVisiteur()) {
            Visiteurs vueVisiteur = new Visiteurs();
            ControllersVisiteurs controllers = new ControllersVisiteurs(vueVisiteur, pass);
            vueVisiteur.setVisible(true);
            this.vue.hide();
        }

        if (source == vue.getjButtonRDV()) {
            rapportVisite vueRapportVisiteur = new rapportVisite();
            ControllersRapportVisite controllers = new ControllersRapportVisite(vueRapportVisiteur, pass);
            vueRapportVisiteur.setVisible(true);
            this.vue.hide();
        }
        
        if (source == vue.getjButtonPracticien()) {
            practiciens vueUnen = new practiciens();
            ControllersPracticiens controllers = new ControllersPracticiens(vueUnen, pass);
            vueUnen.setVisible(true);
            this.vue.hide();
        }
        
        if (source == vue.getjButtonMedicaments()){
            Medicament vueMedicament = new Medicament();
            ControllersMedicaments controllers = new ControllersMedicaments(vueMedicament, pass);
            vueMedicament.setVisible(true);
            this.vue.hide();
        }

        if (source == vue.getjButtonDeconnexion()) {
            this.vue.hide();
            Accueil vue = new Accueil();
            ControllerAccueil controllers = new ControllerAccueil(vue);
            vue.setVisible(true);
        }
        
    }
    
}
