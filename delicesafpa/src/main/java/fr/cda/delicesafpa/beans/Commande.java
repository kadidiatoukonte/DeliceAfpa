package fr.cda.delicesafpa.beans;

import java.awt.Image;
import java.math.BigInteger;
import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


/*CREATE TABLE delicesafpa.commande(
idcommande        SERIAL NOT NULL ,
datecommande      DATE  NOT NULL ,
adressecommande   VARCHAR (50) NOT NULL ,
idclient          INT  NOT NULL ,
idemploye         INT   ,
idpanier          INT  NOT NULL  ,
PRIMARY KEY (idcommande)
);*/


@Entity
@Table(name = "commande")
public class Commande implements java.io.Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcommande;	
	
	@Column(name = "datecommande")
	private Date datecommande;

	@Column(name = "adressecommande")
	private String adressecommande;

	@Column(name = "horaire")
	private LocalTime horaire;
	
	@ManyToOne
	@JoinColumn(name = "idclient", nullable = false)
	private Client idclient;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "idcommande",fetch = FetchType.EAGER)
	Set<TraiterCommande> traiterCommande;

	
    
	@ManyToOne @JoinColumn(name="idemploye", nullable=true)
    private Employe employe;/*livreur*/
	
	@OneToOne (cascade = CascadeType.REMOVE)  
    @JoinColumn( name="idPanier", nullable = true)
	private Panier panier;

	public Commande() {};
	
	

	public Commande(Date datecommande, String adressecommande, LocalTime horaire, Client idclient, Employe employe,
			Panier panier) {
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



	public Client getIdclient() {
		return idclient;
	}



	public void setIdclient(Client idclient) {
		this.idclient = idclient;
	}


	@JsonIgnore
	public Set<TraiterCommande> getTraiterCommande() {
		return traiterCommande;
	}



	public void setTraiterCommande(Set<TraiterCommande> traiterCommande) {
		this.traiterCommande = traiterCommande;
	}



	public Employe getEmploye() {
		return employe;
	}



	public void setEmploye(Employe employe) {
		this.employe = employe;
	}



	public Panier getPanier() {
		return panier;
	}



	public void setPanier(Panier panier) {
		this.panier = panier;
	}



	@Override
	public String toString() {
		return "Commande [idcommande=" + idcommande + ", datecommande=" + datecommande + ", adressecommande="
				+ adressecommande + ", horaire=" + horaire + ", idclient=" + idclient.getNomclient() + ", traiterCommande="
				+ traiterCommande + ", employe=" + employe + ", panier=" + panier + "]";
	}
	
	
	
	

	
	
}
