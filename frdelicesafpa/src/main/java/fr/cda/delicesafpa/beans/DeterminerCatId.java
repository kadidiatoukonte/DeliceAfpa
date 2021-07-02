package fr.cda.delicesafpa.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;

@Embeddable
public class DeterminerCatId implements Serializable{

	@ManyToMany
	@Column(name = "idcategorie")
	private Article idcategorie;
	
	@ManyToMany
	@Column(name = "idemploye")
	private Employe idemploye;
	
	private Date date;

	public Article getIdcategorie() {
		return idcategorie;
	}

	public void setIdcategorie(Article idcategorie) {
		this.idcategorie = idcategorie;
	}

	public Employe getIdemploye() {
		return idemploye;
	}

	public void setIdemploye(Employe idemploye) {
		this.idemploye = idemploye;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public DeterminerCatId(Article idcategorie, Employe idemploye, Date date) {
		super();
		this.idcategorie = idcategorie;
		this.idemploye = idemploye;
		this.date = date;
	}

	public DeterminerCatId() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((idcategorie == null) ? 0 : idcategorie.hashCode());
		result = prime * result + ((idemploye == null) ? 0 : idemploye.hashCode());
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
		DeterminerCatId other = (DeterminerCatId) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idcategorie == null) {
			if (other.idcategorie != null)
				return false;
		} else if (!idcategorie.equals(other.idcategorie))
			return false;
		if (idemploye == null) {
			if (other.idemploye != null)
				return false;
		} else if (!idemploye.equals(other.idemploye))
			return false;
		return true;
	}
	
	
	
	
}
