package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "determinerart")
public class DeterminerArt {

	@EmbeddedId
	private DeterminerArtId id;

	public DeterminerArt(DeterminerArtId id) {
		super();
		this.id = id;
	}
	
	public DeterminerArt() {
		// TODO Auto-generated constructor stub
	}

	public DeterminerArtId getId() {
		return id;
	}

	public void setId(DeterminerArtId id) {
		this.id = id;
	}
	
	
}

