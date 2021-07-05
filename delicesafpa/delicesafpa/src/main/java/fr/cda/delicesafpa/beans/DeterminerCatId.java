package fr.cda.delicesafpa.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;

@Embeddable
public class DeterminerCatId implements Serializable{


	@Column(name = "idcategorie")
	private int idcategorie;
	
	@Column(name = "idemploye")
	private int idemploye;
	
 
	private LocalDateTime date;


	public DeterminerCatId() {
		super();
	}


	public DeterminerCatId(int idcategorie, int idemploye, LocalDateTime date) {
		super();
		this.idcategorie = idcategorie;
		this.idemploye = idemploye;
		this.date = date;
	}


	public int getIdcategorie() {
		return idcategorie;
	}


	public void setIdcategorie(int idcategorie) {
		this.idcategorie = idcategorie;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + idcategorie;
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
		DeterminerCatId other = (DeterminerCatId) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idcategorie != other.idcategorie)
			return false;
		if (idemploye != other.idemploye)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "DeterminerCatId [idcategorie=" + idcategorie + ", idemploye=" + idemploye + ", date=" + date + "]";
	}



	
}
