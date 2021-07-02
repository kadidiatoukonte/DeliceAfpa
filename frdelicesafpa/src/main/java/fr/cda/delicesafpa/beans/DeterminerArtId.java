package fr.cda.delicesafpa.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;

@Embeddable
public class DeterminerArtId implements Serializable {

	@ManyToMany
	@Column(name = "idarticle")
	private Article idarticle;
	
	@ManyToMany
	@Column(name = "idemploye")
	private Employe idemploye;
	
	private Date date;

	public DeterminerArtId() {
		// TODO Auto-generated constructor stub
	}
	
	public DeterminerArtId(Article idarticle, Employe idemploye, Date date) {
		super();
		this.idarticle = idarticle;
		this.idemploye = idemploye;
		this.date = date;
	}

	public Article getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(Article idarticle) {
		this.idarticle = idarticle;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((idarticle == null) ? 0 : idarticle.hashCode());
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
		DeterminerArtId other = (DeterminerArtId) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idarticle == null) {
			if (other.idarticle != null)
				return false;
		} else if (!idarticle.equals(other.idarticle))
			return false;
		if (idemploye == null) {
			if (other.idemploye != null)
				return false;
		} else if (!idemploye.equals(other.idemploye))
			return false;
		return true;
	}
	
	
	
}
