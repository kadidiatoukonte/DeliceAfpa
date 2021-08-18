package fr.cda.delicesafpa.dto;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Column;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import lombok.Data;

@Data
public class AddCommandeDTO {

	

	private Date datecommande;


	private String adressecommande;

	private int horaire;
	
	private double totcommande;
	
	private int idclient;
	private String idpanier;

	public AddCommandeDTO() {
		super();
	}

	public AddCommandeDTO(Date datecommande, int horaire, double totcommande, int idclient, String idpanier) {
		super();
		this.datecommande = datecommande;
		this.horaire = horaire;
		this.totcommande = totcommande;
		this.idclient = idclient;
		this.idpanier = idpanier;
	}

	
	
	public AddCommandeDTO(int horaire, double totcommande, int idclient, String idpanier) {
		super();
		this.horaire = horaire;
		this.totcommande = totcommande;
		this.idclient = idclient;
		this.idpanier = idpanier;

	}

	
	
	
	
	
	
	
	
	public AddCommandeDTO(Date datecommande, String adressecommande, int horaire, double totcommande, int idclient) {
		super();
		this.datecommande = datecommande;
		this.adressecommande = adressecommande;
		this.horaire = horaire;
		this.totcommande = totcommande;
		this.idclient = idclient;
	}

	public Date getDatecommande() {
		return datecommande;
	}

	public void setDatecommande(Date datecommande) {
		this.datecommande = datecommande;
	}

	public String getAdressecommande() {
		return adressecommande;
	}

	public void setAdressecommande(String adressecommande) {
		this.adressecommande = adressecommande;
	}

	public int getHoraire() {
		return horaire;
	}

	public void setHoraire(int horaire) {
		this.horaire = horaire;
	}

	public double getTotcommande() {
		return totcommande;
	}

	public void setTotcommande(double totcommande) {
		this.totcommande = totcommande;
	}

	public int getIdclient() {
		return idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public String getIdpanier() {
		return idpanier;
	}

	public void setIdpanier(String idpanier) {
		this.idpanier = idpanier;
	}

	@Override
	public String toString() {
		return "AddCommandeDTO [datecommande=" + datecommande + ", adressecommande=" + adressecommande + ", horaire="
				+ horaire + ", totcommande=" + totcommande + ", idclient=" + idclient + "]";
	}



}
