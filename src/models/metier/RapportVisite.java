/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.metier;

/**
 *
 * @author btssio
 */
public class RapportVisite {
    private String visiteMatricule;
    private String numeroRapport;
    private String numeroen;
    private java.sql.Date dateRapport;
    private String bilanRapport;
    private String motifRapport;

    public RapportVisite(String visiteMatricule, String numeroRapport, String numeroen, java.sql.Date dateRapport, String bilanRapport, String motifRapport) {
        this.visiteMatricule = visiteMatricule;
        this.numeroRapport = numeroRapport;
        this.numeroen = numeroen;
        this.dateRapport = dateRapport;
        this.bilanRapport = bilanRapport;
        this.motifRapport = motifRapport;
    }
    
    public String getVisiteMatricule() {
        return visiteMatricule;
    }

    public void setVisiteMatricule(String visiteMatricule) {
        this.visiteMatricule = visiteMatricule;
    }

    public String getNumeroRapport() {
        return numeroRapport;
    }

    public void setNumeroRapport(String numeroRapport) {
        this.numeroRapport = numeroRapport;
    }

    public String getNumeroen() {
        return numeroen;
    }

    public void setNumeroen(String numeroen) {
        this.numeroen = numeroen;
    }

    public java.sql.Date getDateRapport() {
        return dateRapport;
    }

    public void setDateRapport(java.sql.Date dateRapport) {
        this.dateRapport = dateRapport;
    }

    public String getBilanRapport() {
        return bilanRapport;
    }

    public void setBilanRapport(String bilanRapport) {
        this.bilanRapport = bilanRapport;
    }

    public String getMotifRapport() {
        return motifRapport;
    }

    public void setMotifRapport(String motifRapport) {
        this.motifRapport = motifRapport;
    }
    
}