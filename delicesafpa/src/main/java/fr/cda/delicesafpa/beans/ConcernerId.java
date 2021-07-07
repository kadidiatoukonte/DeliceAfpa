package fr.cda.delicesafpa.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable 
public class ConcernerId implements Serializable {
	
	@Column(name = "idpanier")
	private int idpanier;
	
	@Column(name = "idarticle")
	private int idarticle;
	



	public ConcernerId(int idpanier, int idarticle) {
		super();
		this.idpanier = idpanier;
		this.idarticle = idarticle;
	}




	public ConcernerId() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getIdpanier() {
		return idpanier;
	}




	public void setIdpanier(int idpanier) {
		this.idpanier = idpanier;
	}




	public int getIdarticle() {
		return idarticle;
	}




	public void setIdarticle(int idarticle) {
		this.idarticle = idarticle;
	}




	@Override
	public String toString() {
		return "ConcernerId [idpanier=" + idpanier + ", idarticle=" + idarticle + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idarticle;
		result = prime * result + idpanier;
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
		ConcernerId other = (ConcernerId) obj;
		if (idarticle != other.idarticle)
			return false;
		if (idpanier != other.idpanier)
			return false;
		return true;
	}



}
