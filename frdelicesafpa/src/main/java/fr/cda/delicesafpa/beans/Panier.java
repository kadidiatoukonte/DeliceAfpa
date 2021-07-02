package fr.cda.delicesafpa.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity @Table( name="panier" )
public class Panier {

	@Id @GeneratedValue( strategy=GenerationType.IDENTITY )
	private int idpanier;
	
	
	@ManyToOne @JoinColumn(name="idcommande", nullable=false)
    private Commande commande;
	
	public Panier(){
		
	}
	
	public Panier(Commande commande){
		super();
		this.commande=commande;
	}

	public int getIdpanier() {
		return idpanier;
	}

	public void setIdpanier(int idpanier) {
		this.idpanier = idpanier;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
	
}
