package fr.cda.delicesafpa.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.StatusReservation;
import lombok.Data;

@Data
public class TraiterReservationDTO {
	
	private EmployeDTO idemploye;
	private ReservationDTO idreservation; 
	private LocalDateTime date; 
    private StatusReservationDTO idstatus;
	
    
    public TraiterReservationDTO() {
    	
    }


	public TraiterReservationDTO(EmployeDTO idemploye, ReservationDTO idreservation, LocalDateTime date,
			StatusReservationDTO idstatus) {
		super();
		this.idemploye = idemploye;
		this.idreservation = idreservation;
		this.date = date;
		this.idstatus = idstatus;
	}


	public EmployeDTO getIdemploye() {
		return idemploye;
	}


	public void setIdemploye(EmployeDTO idemploye) {
		this.idemploye = idemploye;
	}


	public ReservationDTO getIdreservation() {
		return idreservation;
	}


	public void setIdreservation(ReservationDTO idreservation) {
		this.idreservation = idreservation;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	public StatusReservationDTO getIdstatus() {
		return idstatus;
	}


	public void setIdstatus(StatusReservationDTO idstatus) {
		this.idstatus = idstatus;
	}


	@Override
	public String toString() {
		return "TraiterReservationDTO [idemploye=" + idemploye + ", idreservation=" + idreservation + ", date=" + date
				+ ", idstatus=" + idstatus + "]";
	}
    
    
}
