package fr.cda.delicesafpa.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Embeddable
public class TraiterReservationId implements Serializable {
	@ManyToMany
	 @JoinColumn(name="idreservation")
	private Reservation idreservation;
	
	@ManyToMany
	 @JoinColumn(name="idemploye")
	private Employe idemploye;
	
	@ManyToMany
	 @JoinColumn(name="idstatus")
	private StatusReservation idstatus;
 
	private Date date;

	public TraiterReservationId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TraiterReservationId(Reservation idreservation, Employe idemploye, StatusReservation idstatus, Date date) {
		super();
		this.idreservation = idreservation;
		this.idemploye = idemploye;
		this.idstatus = idstatus;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((idemploye == null) ? 0 : idemploye.hashCode());
		result = prime * result + ((idreservation == null) ? 0 : idreservation.hashCode());
		result = prime * result + ((idstatus == null) ? 0 : idstatus.hashCode());
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
		TraiterReservationId other = (TraiterReservationId) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idemploye == null) {
			if (other.idemploye != null)
				return false;
		} else if (!idemploye.equals(other.idemploye))
			return false;
		if (idreservation == null) {
			if (other.idreservation != null)
				return false;
		} else if (!idreservation.equals(other.idreservation))
			return false;
		if (idstatus == null) {
			if (other.idstatus != null)
				return false;
		} else if (!idstatus.equals(other.idstatus))
			return false;
		return true;
	}
	
	
}
