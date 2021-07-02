package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "traiterreservation")
public class TraiterReservation {
	@EmbeddedId
	private TraiterReservationId id;

	public TraiterReservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TraiterReservation(TraiterReservationId id) {
		super();
		this.id = id;
	}

	public TraiterReservationId getId() {
		return id;
	}

	public void setId(TraiterReservationId id) {
		this.id = id;
	}

	
	
	

}
