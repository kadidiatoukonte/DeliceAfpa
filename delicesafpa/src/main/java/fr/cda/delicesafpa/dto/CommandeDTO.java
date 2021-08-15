package fr.cda.delicesafpa.dto;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Column;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import lombok.Data;

@Data
public class CommandeDTO {

	private int idcommande;	
	

	private Date datecommande;


	private String adressecommande;

	private LocalTime horaire;
	
	private double totcommande;
	
	private Client idclient;
	
	
	private Panier panier;


	public CommandeDTO(int idcommande, Date datecommande, String adressecommande, LocalTime horaire,double totcommande, Client idclient,Panier panier) {
		super();
		this.idcommande = idcommande;
		this.datecommande = datecommande;
		this.adressecommande = adressecommande;
		this.horaire = horaire;
		this.idclient = idclient;
		this.totcommande = totcommande;
		this.panier = panier;

	}
	
	public CommandeDTO() {
	
	}

	public CommandeDTO(Date datecommande, String adressecommande, LocalTime horaire,double totcommande, Client idclient,Panier panier) {
		super();
		this.datecommande = datecommande;
		this.adressecommande = adressecommande;
		this.horaire = horaire;
		this.idclient = idclient;
		this.totcommande = totcommande;
		this.panier = panier;

	}

	public int getIdcommande() {
		return idcommande;
	}

	public void setIdcommande(int idcommande) {
		this.idcommande = idcommande;
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

	public LocalTime getHoraire() {
		return horaire;
	}

	public void setHoraire(LocalTime horaire) {
		this.horaire = horaire;
	}

	public Client getIdclient() {
		return idclient;
	}

	public void setIdclient(Client idclient) {
		this.idclient = idclient;
	}

	@Override
	public String toString() {
		return "CommandeDTO [idcommande=" + idcommande + ", datecommande=" + datecommande + ", adressecommande="
				+ adressecommande + ", horaire=" + horaire + ", idclient=" + idclient + "]";
	}

	public double getTotcommande() {
		return totcommande;
	}

	public void setTotcommande(double totcommande) {
		this.totcommande = totcommande;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	




}
