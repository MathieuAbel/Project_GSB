
package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.metier.Medicaments;

/**
 *
 * @author btssio
 */
public class DaoMedicaments {
    
    public static List<Medicaments> getAllMedic() throws SQLException,ClassNotFoundException{
        List<Medicaments> lesMedicaments = new ArrayList<Medicaments>(); 
        Medicaments unMedoc;
        Connection con = models.Connect.Connection();      
        Statement state = con.createStatement();

        ResultSet res = state.executeQuery("SELECT * FROM MEDICAMENT");
        
        while (res.next()) {
            String depotLegal = res.getString("MED_DEPOTLEGAL");
            String nomCommercial = res.getString("MED_NOMCOMMERCIAL");
            String fam_code = res.getString("FAM_CODE");
            String composition = res.getString("MED_COMPOSITION");
            String effect = res.getString("MED_EFFETS");
            String contreIndic = res.getString("MED_CONTREINDIC");
            String prixEchantillon = res.getString("MED_PRIXECHANTILLON");
            unMedoc = new Medicaments(depotLegal,nomCommercial,fam_code,composition,effect,contreIndic,prixEchantillon);
            lesMedicaments.add(unMedoc);
        }
    
        return lesMedicaments;
    }
    
}
