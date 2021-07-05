package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "traitercommande")
public class TraiterCommande {
	
	
	@EmbeddedId
	private TraiterCommandeId id;

    @ManyToOne
    @MapsId("idcommande")
    @JoinColumn(name = "idcommande")
	private Commande idcommande;

    @ManyToOne
    @MapsId("idemploye")
    @JoinColumn(name = "idemploye")
	private Employe idemploye;	
    
    


	@ManyToOne
    @MapsId("idstatus")
    @JoinColumn(name = "idstatus")
    private StatusCommande idstatus;


	public TraiterCommande() {}

	public TraiterCommande(TraiterCommandeId id, Commande idcommande, Employe idemploye, StatusCommande idstatus) {
		super();
		this.id = id;
		this.idcommande = idcommande;
		this.idemploye = idemploye;
		this.idstatus = idstatus;
	}




	public TraiterCommandeId getId() {
		return id;
	}




	public void setId(TraiterCommandeId id) {
		this.id = id;
	}




	public Commande getIdcommande() {
		return idcommande;
	}




	public void setIdcommande(Commande idcommande) {
		this.idcommande = idcommande;
	}




	public Employe getIdemploye() {
		return idemploye;
	}




	public void setIdemploye(Employe idemploye) {
		this.idemploye = idemploye;
	}




	public StatusCommande getIdstatus() {
		return idstatus;
	}




	public void setIdstatus(StatusCommande idstatus) {
		this.idstatus = idstatus;
	}




	@Override
	public String toString() {
		return "TraiterCommande [id=" + id.getIdcommande() + ", idcommande=" + idcommande.getDatecommande() + ", idemploye=" + idemploye.getIdemploye() + ", idstatus="
				+ idstatus.getDescription() + "]";
	}
	
	
	
}
