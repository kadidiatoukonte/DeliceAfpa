package fr.cda.delicesafpa.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;

@Embeddable
public class DeterminerArtId implements Serializable {

	
	@Column(name = "idarticle")
	private int idarticle;
	
	
	@Column(name = "idemploye")
	private int idemploye;
	
	private LocalDateTime date;

	public DeterminerArtId() {
		super();
	}

	public DeterminerArtId(int idarticle, int idemploye, LocalDateTime date) {
		super();
		this.idarticle = idarticle;
		this.idemploye = idemploye;
		this.date = date;
	}

	public int getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(int idarticle) {
		this.idarticle = idarticle;
	}

	public int getIdemploye() {
		return idemploye;
	}

	public void setIdemploye(int idemploye) {
		this.idemploye = idemploye;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "DeterminerArtId [idarticle=" + idarticle + ", idemploye=" + idemploye + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + idarticle;
		result = prime * result + idemploye;
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
		if (idarticle != other.idarticle)
			return false;
		if (idemploye != other.idemploye)
			return false;
		return true;
	}
	
	
}
