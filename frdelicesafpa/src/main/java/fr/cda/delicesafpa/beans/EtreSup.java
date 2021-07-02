package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity @Table( name="etresup")
public class EtreSup {

	
	@EmbeddedId
	private EtresupId id;

	public EtreSup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EtreSup(EtresupId id) {
		super();
		this.id = id;
	}

	public EtresupId getId() {
		return id;
	}

	public void setId(EtresupId id) {
		this.id = id;
	} 
	
	
	
	
	
}
