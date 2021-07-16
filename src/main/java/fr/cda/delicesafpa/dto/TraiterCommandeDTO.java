package fr.cda.delicesafpa.dto;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.TraiterCommande;
import lombok.Data;

@Data
public class TraiterCommandeDTO {
	private int idcommande;	
	private Date datecommande;
	private String adressecommande;
	private LocalTime horaire;
	private ClientDTO idclient;
	private Set<TraiterCommandeDTO> traiterCommande;
    private EmployeDTO employe;
	private PanierDTO panier;
	private List<TraiterCommandeDTO> listCommande;

	public TraiterCommandeDTO() {
		
	}

	public TraiterCommandeDTO(Date datecommande, String adressecommande, LocalTime horaire, ClientDTO idclient,
			EmployeDTO employe, PanierDTO panier) {
		super();
		this.datecommande = datecommande;
		this.adressecommande = adressecommande;
		this.horaire = horaire;
		this.idclient = idclient;
		this.employe = employe;
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

	public ClientDTO getIdclient() {
		return idclient;
	}

	public void setIdclient(ClientDTO idclient) {
		this.idclient = idclient;
	}

	public Set<TraiterCommandeDTO> getTraiterCommande() {
		return traiterCommande;
	}

	public void setTraiterCommande(Set<TraiterCommandeDTO> traiterCommande) {
		this.traiterCommande = traiterCommande;
	}

	public EmployeDTO getEmploye() {
		return employe;
	}

	public void setEmploye(EmployeDTO employe) {
		this.employe = employe;
	}

	public PanierDTO getPanier() {
		return panier;
	}

	public void setPanier(PanierDTO panier) {
		this.panier = panier;
	}

	public List<TraiterCommandeDTO> getListCommande() {
		return listCommande;
	}

	public void setListCommande(List<TraiterCommandeDTO> listCommande) {
		this.listCommande = listCommande;
	}

	@Override
	public String toString() {
		return "CommandeDTO [idcommande=" + idcommande + ", datecommande=" + datecommande + ", adressecommande="
				+ adressecommande + ", horaire=" + horaire + ", idclient=" + idclient + ", traiterCommande="
				+ traiterCommande + ", employe=" + employe + ", panier=" + panier + "]";
	};
	

}
