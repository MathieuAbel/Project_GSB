
package models.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.metier.MetierVisiteur;

public class Dao {
    
    public static MetierVisiteur getConnection(String login, String mdp) throws SQLException, ClassNotFoundException {
        
        Connection con = models.Connect.Connection();      
        Statement state = con.createStatement();
        
        MetierVisiteur unVisiteur = null;
        
        ResultSet res = state.executeQuery("SELECT * FROM VISITEUR WHERE VIS_NOM ='" + login + "' AND VIS_MATRICULE = '" + mdp + "'");
        
        if (res.next()) {
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
        } else {
            
        }
        return unVisiteur;
    }
    
}
