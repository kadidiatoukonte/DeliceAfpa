package fr.cda.delicesafpa.dto;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Column;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import lombok.Data;

@Data
public class AssignerLivreurDTO {

	

	private int idlivreur;
	private int idcommande;

	public AssignerLivreurDTO() {
		super();
	}

	public AssignerLivreurDTO(int idlivreur, int idcommande) {
		super();
		this.idlivreur = idlivreur;
		this.idcommande = idcommande;
	}

	public int getIdlivreur() {
		return idlivreur;
	}

	public void setIdlivreur(int idlivreur) {
		this.idlivreur = idlivreur;
	}

	public int getIdcommande() {
		return idcommande;
	}

	public void setIdcommande(int idcommande) {
		this.idcommande = idcommande;
	}

	@Override
	public String toString() {
		return "AssignerLivreurDTO [idlivreur=" + idlivreur + ", idcommande=" + idcommande + "]";
	}

	
}
