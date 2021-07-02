package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "traitercommande")
public class TraiterCommande {
	@EmbeddedId
	private TraiterCommandeId id;

	public TraiterCommande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TraiterCommande(TraiterCommandeId id) {
		super();
		this.id = id;
	}

	public TraiterCommandeId getId() {
		return id;
	}

	public void setId(TraiterCommandeId id) {
		this.id = id;
	}
	
	
	
	
	
}
