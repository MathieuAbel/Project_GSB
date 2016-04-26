
package models.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.metier.MetierVisiteur;
import models.metier.RapportVisite;

/**
 *
 * @author btssio
 */
public class DaoRapport {
    
    public static List<RapportVisite> getAllRapportVisite() throws SQLException, ClassNotFoundException {
        List<RapportVisite> lesRapports = new ArrayList<RapportVisite>(); 
        RapportVisite unRapport;
        Connection con = models.Connect.Connection();      
        Statement state = con.createStatement();
        
        ResultSet res = state.executeQuery("SELECT * FROM RAPPORT_VISITE ORDER BY RAP_NUM");
        
        while(res.next()){
            String visMatricule = res.getString("VIS_MATRICULE");
            String rapNum = res.getString("RAP_NUM");
            String praNum = res.getString("PRA_NUM");
            Date rapDate = res.getDate("RAP_DATE");
            String rapBilan = res.getString("RAP_BILAN");
            String rapMotif = res.getString("RAP_MOTIF");
            unRapport= new RapportVisite(visMatricule, rapNum, praNum, rapDate, rapBilan, rapMotif);
            lesRapports.add(unRapport);
        }
        
        return lesRapports;
        
    }
    
    public static List<RapportVisite> getRapportVisiteWithVisiteur(MetierVisiteur myVisiteur) throws SQLException, ClassNotFoundException {
        Connection con = models.Connect.Connection();      
        Statement state = con.createStatement();
        
        List<RapportVisite> myListRappVisite = null;
        
        ResultSet res = state.executeQuery("SELECT * FROM RAPPORT_VISITE WHERE VIS_MATRICULE ='" + myVisiteur.getMatricule() + "'");
        
        while(res.next()){
            String visMatricule = res.getString("VIS_MATRICULE");
            String rapNum = res.getString("RAP_NUM");
            String praNum = res.getString("PRA_NUM");
            Date rapDate = res.getDate("RAP_DATE");
            String rapBilan = res.getString("RAP_BILAN");
            String rapMotif = res.getString("RAP_MOTIF");
            RapportVisite myRapport= new RapportVisite(visMatricule, rapNum, praNum, rapDate, rapBilan, rapMotif);
            myListRappVisite.add(myRapport);
        }
        
        return myListRappVisite;
    }
    
    public static void insertRapport(String visiteMatricule, int numeroRapport, int numeroen, String dateRapport, String bilanRapport, String motifRapport) throws SQLException, ClassNotFoundException {
        Connection con = models.Connect.Connection();
        Statement state = con.createStatement();
        state.executeQuery("INSERT INTO RAPPORT_VISITE values ('" + visiteMatricule + "','" + numeroRapport + "','" + 
                numeroen + "','" + dateRapport + "','" + bilanRapport + "','" + motifRapport + "')");
        state.close();
        con.close();
    }
    
}
