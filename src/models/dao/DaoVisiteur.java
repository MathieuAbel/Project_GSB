
package models.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.metier.Labo;
import models.metier.MetierVisiteur;
import models.metier.Secteur;

/**
 *
 * @author btssio
 */
public class DaoVisiteur {
    
    public static List<MetierVisiteur> getAllVisiteur() throws SQLException, ClassNotFoundException {         
        List<MetierVisiteur> lesVisiteurs = new ArrayList<MetierVisiteur>(); 
        MetierVisiteur unVisiteur;
        Connection con = models.Connect.Connection();      
        Statement state = con.createStatement();

        ResultSet res = state.executeQuery("SELECT * FROM VISITEUR");    

        while (res.next()) {
            String matricule = res.getString("VIS_MATRICULE");
            String nom = res.getString("VIS_NOM");
            String prenom = res.getString("Vis_PRENOM");
            String adresse = res.getString("VIS_ADRESSE");
            String cp = res.getString("VIS_CP");;
            String ville = res.getString("VIS_VILLE");
            Date date = res.getDate("VIS_DATEEMBAUCHE");
            String secCode = res.getString("SEC_CODE");
            String labCode = res.getString("LAB_CODE");
            unVisiteur = new MetierVisiteur(matricule, nom, prenom, adresse, cp, ville, date, secCode, labCode);
            lesVisiteurs.add(unVisiteur);
        }
        
        return lesVisiteurs;
    }
    
    public static List<Labo> getAllLab() throws SQLException, ClassNotFoundException {         
        List<Labo> lesLabos = new ArrayList<Labo>(); 
        Labo unLabo;
        Connection con = models.Connect.Connection();      
        Statement state = con.createStatement();

        ResultSet res = state.executeQuery("SELECT * FROM LABO");    

        while (res.next()) {
            String labCode = res.getString("LAB_CODE");
            String labNom = res.getString("LAB_NOM");
            String labChefVente = res.getString("LAB_CHEFVENTE");
            
            unLabo = new Labo(labCode, labNom, labChefVente);
            lesLabos.add(unLabo);
            
        }
        
        return lesLabos;
    }
  
    public static List<Secteur> getAllSecteurs() throws SQLException, ClassNotFoundException {         
        List<Secteur> lesSecteurs = new ArrayList<Secteur>(); 
        Secteur unSecteur;
        Connection con = models.Connect.Connection();      
        Statement state = con.createStatement();
      
        ResultSet res = state.executeQuery("SELECT * FROM SECTEUR");    
      
        while (res.next()) {
            String codeSecteur = res.getString("SEC_CODE");
            String libelleSecteur = res.getString("SEC_LIBELLE");
            
            
            unSecteur = new Secteur(codeSecteur, libelleSecteur);
            lesSecteurs.add(unSecteur);
            
        }
        
        return lesSecteurs;
    }
    
}
