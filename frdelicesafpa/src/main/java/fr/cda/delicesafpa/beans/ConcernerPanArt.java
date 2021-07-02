package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity @Table( name="concerner" )
public class ConcernerPanArt {

	
	@EmbeddedId
	private ConcernerId id;
	
	
	private int quantitearticle;


	public ConcernerPanArt() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ConcernerPanArt(ConcernerId id, int quantitearticle) {
		super();
		this.id = id;
		this.quantitearticle = quantitearticle;
	}


	public ConcernerId getId() {
		return id;
	}


	public void setId(ConcernerId id) {
		this.id = id;
	}


	public int getQuantitearticle() {
		return quantitearticle;
	}


	public void setQuantitearticle(int quantitearticle) {
		this.quantitearticle = quantitearticle;
	}
	
	
	
}
