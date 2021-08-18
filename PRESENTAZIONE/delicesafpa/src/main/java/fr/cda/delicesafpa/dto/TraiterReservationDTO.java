package fr.cda.delicesafpa.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.StatusReservation;
import lombok.Data;

@Data
public class TraiterReservationDTO {

	private Reservation idreservation;
    
	private Employe idemploye;	
    
 
    private StatusReservation idstatus;
    
    
    private LocalDateTime date;


	public TraiterReservationDTO() {
		super();
	}


	public TraiterReservationDTO(Reservation idreservation, Employe idemploye, StatusReservation idstatus,
			LocalDateTime date) {
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


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "TraiterReservationDTO [idreservation=" + idreservation + ", idemploye=" + idemploye + ", idstatus="
				+ idstatus + ", date=" + date + "]";
	}
    
    
    
    
    
    
    
    
    
    
}
