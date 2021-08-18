package fr.cda.delicesafpa.dto;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Column;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import lombok.Data;

@Data
public class CommandeTableDetailDTO {



	private String adressecommande;

	private String horaire;
	
	
	private String nomclient;

	
	private String  telephone;
	
	private int  status;
	
	private String  livreur;




	public CommandeTableDetailDTO() {
	
	}





	public String getAdressecommande() {
		return adressecommande;
	}





	public void setAdressecommande(String adressecommande) {
		this.adressecommande = adressecommande;
	}





	public String getHoraire() {
		return horaire;
	}





	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}





	public String getNomclient() {
		return nomclient;
	}





	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}





	public String getTelephone() {
		return telephone;
	}





	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}





	public int getStatus() {
		return status;
	}





	public void setStatus(int status) {
		this.status = status;
	}





	public CommandeTableDetailDTO(String adressecommande, String horaire, String nomclient, String telephone,
			int status) {
		super();
		this.adressecommande = adressecommande;
		this.horaire = horaire;
		this.nomclient = nomclient;
		this.telephone = telephone;
		this.status = status;
	}





	public String getLivreur() {
		return livreur;
	}





	public void setLivreur(String livreur) {
		this.livreur = livreur;
	}





	public CommandeTableDetailDTO(String adressecommande, String horaire, String nomclient, String telephone,
			int status, String livreur) {
		super();
		this.adressecommande = adressecommande;
		this.horaire = horaire;
		this.nomclient = nomclient;
		this.telephone = telephone;
		this.status = status;
		this.livreur = livreur;
	}





}
