
package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.metier.LieuExercice;
import models.metier.MetierPracticiens;

/**
 *
 * @author btssio
 */
public class DaoPraticien {
    
    public static List<MetierPracticiens> getAllPracticiens() throws SQLException, ClassNotFoundException {         
        List<MetierPracticiens> lesPracticiens = new ArrayList<MetierPracticiens>(); 
        MetierPracticiens unPracticien;
        Connection con = models.Connect.Connection();      
        Statement state = con.createStatement();

        ResultSet res = state.executeQuery("SELECT * FROM PRATICIEN ORDER BY PRA_NOM, PRA_PRENOM");
        
        while (res.next()) {
            String pra_num = res.getString("PRA_NUM");
            String pra_nom = res.getString("PRA_NOM");
            String pra_prenom = res.getString("PRA_PRENOM");
            String pra_adresse = res.getString("PRA_ADRESSE");
            String pra_cp = res.getString("PRA_CP");
            String pra_ville = res.getString("PRA_VILLE");
            String pra_coefnotoriete = res.getString("PRA_COEFNOTORIETE");
            String typ_code = res.getString("TYP_CODE");
            unPracticien = new MetierPracticiens(pra_num, pra_nom, pra_prenom, pra_adresse, pra_cp, pra_ville, pra_coefnotoriete, typ_code);
            lesPracticiens.add(unPracticien);
        }
        
        return lesPracticiens;
    }
    
    public static List<LieuExercice> getAllLieuExercice() throws SQLException, ClassNotFoundException {         
        List<LieuExercice> lesLieus = new ArrayList<LieuExercice>(); 
        LieuExercice unLieu;
        Connection con = models.Connect.Connection();      
        Statement state = con.createStatement();

        ResultSet res = state.executeQuery("SELECT * FROM TYPE_PRATICIEN");    

        while (res.next()) {
            String typ_code = res.getString("TYP_CODE");
            String typ_libelle = res.getString("TYP_LIBELLE");
            String typ_lieu = res.getString("TYP_LIEU");
            
            unLieu = new LieuExercice(typ_code, typ_libelle, typ_lieu);
            lesLieus.add(unLieu);
           
        }
        return lesLieus;
    }
    
}
