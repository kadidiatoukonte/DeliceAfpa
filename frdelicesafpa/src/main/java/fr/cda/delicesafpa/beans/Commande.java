package fr.cda.delicesafpa.beans;

import java.awt.Image;
import java.math.BigInteger;
import java.math.BigInteger;
import java.sql.Date;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
public class Commande {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcommande;	
	
	@Column(name = "datecommande")
	private Date datecommande;

	@Column(name = "adressecommande")
	private String adressecommande;


	
	@ManyToOne
	@JoinColumn(name = "idclient", nullable = false)
	//@Column(name = "idclient")/*liv*/
	private Client idclient;
	
	
	
	@ManyToMany
	@JoinTable(
	  name = "idemploye", 
	  joinColumns = @JoinColumn(name = "idcommande"), 
	  inverseJoinColumns = @JoinColumn(name = "idemploye"))
	//@Column(name = "idemploye")/*traiter*/
	private Employe idemploye;

	
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpanier", referencedColumnName = "idcommande")
	private Panier idpanier;

	
	
	
	
	
	
	
	
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

	public Client getIdclient() {
		return idclient;
	}

	public void setIdclient(Client idclient) {
		this.idclient = idclient;
	}

	public Employe getIdemploye() {
		return idemploye;
	}

	public void setIdemploye(Employe idemploye) {
		this.idemploye = idemploye;
	}

	public Panier getIdpanier() {
		return idpanier;
	}

	public void setIdpanier(Panier idpanier) {
		this.idpanier = idpanier;
	}

	public Commande(int idcommande, Date datecommande, String adressecommande, Client idclient, Employe idemploye,
			Panier idpanier) {
		super();
		this.idcommande = idcommande;
		this.datecommande = datecommande;
		this.adressecommande = adressecommande;
		this.idclient = idclient;
		this.idemploye = idemploye;
		this.idpanier = idpanier;
	}


	
	
	
}
