package fr.cda.delicesafpa.dto;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;

import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.StatusCommande;
import lombok.Data;



@Data
public class TraiterCommandeTableDTO {

	

    
    private int idcommande;

    private int idstatus;

	
	private String horaire;

	private String adresse;
	
	
	public TraiterCommandeTableDTO() {
		super();
	}


	public int getIdcommande() {
		return idcommande;
	}


	public void setIdcommande(int idcommande) {
		this.idcommande = idcommande;
	}


	public int getIdstatus() {
		return idstatus;
	}


	public void setIdstatus(int idstatus) {
		this.idstatus = idstatus;
	}


	public String getHoraire() {
		return horaire;
	}


	public void String(String horaire) {
		this.horaire = horaire;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public TraiterCommandeTableDTO(int idcommande, int idstatus, String horaire, String adresse) {
		super();
		this.idcommande = idcommande;
		this.idstatus = idstatus;
		this.horaire = horaire;
		this.adresse = adresse;
	}


	
}
