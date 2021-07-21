package fr.cda.delicesafpa.beans;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "traiterreservation")
public class TraiterReservation implements Serializable {
	
	
	
	@EmbeddedId
	private TraiterReservationId id;
	
	
    @ManyToOne
    @MapsId("idreservation")
    @JoinColumn(name = "idreservation")
	private Reservation idreservation;
   
    @ManyToOne
    @MapsId("idemploye")
    @JoinColumn(name = "idemploye")
	private Employe idemploye;	
    
    

	@ManyToOne
    @MapsId("idstatus")
    @JoinColumn(name = "idstatus")
    private StatusReservation idstatus;
	
    public TraiterReservation(TraiterReservationId id, Reservation idreservation, Employe idemploye,
			StatusReservation idstatus) {
		super();
		this.id = id;
		this.idreservation = idreservation;
		this.idemploye = idemploye;
		this.idstatus = idstatus;
	}
	
	
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

	public Reservation getIdreservation() {
		return idreservation;
	}

	public void setIdreservation(Reservation idreservation) {
		this.idreservation = idreservation;
	}

	public Employe getIdemploye() {
		return idemploye;
	}

	public void setIdemploye(Employe idemploye) {
		this.idemploye = idemploye;
	}

	public StatusReservation getIdstatus() {
		return idstatus;
	}

	public void setIdstatus(StatusReservation idstatus) {
		this.idstatus = idstatus;
	}

	@Override
	public String toString() {
		return "TraiterReservation [id=" + id.getDate() + ", idreservation=" + idreservation.getIdreservation() + ", idemploye=" + idemploye.getIdemploye()
				+ ", idstatus=" + idstatus.getDescription() + "]";
	}

	

	

	

}
