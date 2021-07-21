package fr.cda.delicesafpa.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Embeddable
public class TraiterReservationId implements Serializable {
	

	@Column(name = "idreservation")
	private int idreservation;
   
    @Column(name = "idemploye")
	private int idemploye;
	
    @Column(name = "idstatus")
	private int idstatus;
 
	private LocalDateTime date;

	public TraiterReservationId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TraiterReservationId(int idreservation, int idemploye, int idstatus, LocalDateTime date) {
		super();
		this.idreservation = idreservation;
		this.idemploye = idemploye;
		this.idstatus = idstatus;
		this.date = date;
	}

	public int getIdreservation() {
		return idreservation;
	}

	public void setIdreservation(int idreservation) {
		this.idreservation = idreservation;
	}

	public int getIdemploye() {
		return idemploye;
	}

	public void setIdemploye(int idemploye) {
		this.idemploye = idemploye;
	}

	public int getIdstatus() {
		return idstatus;
	}

	public void setIdstatus(int idstatus) {
		this.idstatus = idstatus;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "TraiterReservationId [idreservation=" + idreservation + ", idemploye=" + idemploye + ", idstatus="
				+ idstatus + ", date=" + date + "datattatatata]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + idemploye;
		result = prime * result + idreservation;
		result = prime * result + idstatus;
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
		if (idemploye != other.idemploye)
			return false;
		if (idreservation != other.idreservation)
			return false;
		if (idstatus != other.idstatus)
			return false;
		return true;
	}

	

}
