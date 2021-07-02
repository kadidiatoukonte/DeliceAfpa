package fr.cda.delicesafpa.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Embeddable
public class TraiterCommandeId implements Serializable {
	@ManyToMany
	@JoinColumn(name = "idcommande")
	private Commande idcommande;

	@ManyToMany
	@JoinColumn(name = "idemploye")
	private Employe idemploye;
	
	@ManyToMany
	@JoinColumn(name = "idstatus")
	private StatusCommande idstatus;

	private Date date;

	public TraiterCommandeId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TraiterCommandeId(Commande idcommande, Employe idemploye, StatusCommande idstatus, Date date) {
		super();
		this.idcommande = idcommande;
		this.idemploye = idemploye;
		this.idstatus = idstatus;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((idcommande == null) ? 0 : idcommande.hashCode());
		result = prime * result + ((idemploye == null) ? 0 : idemploye.hashCode());
		result = prime * result + ((idstatus == null) ? 0 : idstatus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TraiterCommandeId other = (TraiterCommandeId) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idcommande == null) {
			if (other.idcommande != null)
				return false;
		} else if (!idcommande.equals(other.idcommande))
			return false;
		if (idemploye == null) {
			if (other.idemploye != null)
				return false;
		} else if (!idemploye.equals(other.idemploye))
			return false;
		if (idstatus == null) {
			if (other.idstatus != null)
				return false;
		} else if (!idstatus.equals(other.idstatus))
			return false;
		return true;
	}
	
	
}
