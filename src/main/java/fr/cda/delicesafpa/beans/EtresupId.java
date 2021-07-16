package fr.cda.delicesafpa.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class EtresupId implements Serializable {
	
	
	@Column(name = "idarticle")
	private int idarticle;
	
	@Column(name = "idarticle_etreSup")
	private int idarticle_etreSup;

	public EtresupId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EtresupId(int idarticle, int idarticle_etreSup) {
		super();
		this.idarticle = idarticle;
		this.idarticle_etreSup = idarticle_etreSup;
	}

	public int getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(int idarticle) {
		this.idarticle = idarticle;
	}

	public int getIdarticle_etreSup() {
		return idarticle_etreSup;
	}

	public void setIdarticle_etreSup(int idarticle_etreSup) {
		this.idarticle_etreSup = idarticle_etreSup;
	}

	@Override
	public String toString() {
		return "EtresupId [idarticle=" + idarticle + ", idarticle_etreSup=" + idarticle_etreSup + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idarticle;
		result = prime * result + idarticle_etreSup;
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
		EtresupId other = (EtresupId) obj;
		if (idarticle != other.idarticle)
			return false;
		if (idarticle_etreSup != other.idarticle_etreSup)
			return false;
		return true;
	}

}
