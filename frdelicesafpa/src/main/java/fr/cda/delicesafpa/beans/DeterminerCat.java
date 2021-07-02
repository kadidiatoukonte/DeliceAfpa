package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "determinercat")
public class DeterminerCat {

	@EmbeddedId
	private DeterminerCatId id;

	public DeterminerCatId getId() {
		return id;
	}

	public void setId(DeterminerCatId id) {
		this.id = id;
	}

	public DeterminerCat(DeterminerCatId id) {
		super();
		this.id = id;
	}
	
	public DeterminerCat() {
		
	}
	
}
