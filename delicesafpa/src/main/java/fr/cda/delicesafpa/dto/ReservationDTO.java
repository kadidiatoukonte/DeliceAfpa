package fr.cda.delicesafpa.dto;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.TraiterReservation;
import lombok.Data;

@Data
public class ReservationDTO {
	
	private int idreservation;	
	private Date datereservation;
	private LocalTime horaire;
	private int nbreplacereservation;
	private Client idclient;
	
	
	public ReservationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ReservationDTO(Date datereservation, LocalTime horaire, int nbreplacereservation, Client idclient) {
		super();
		this.datereservation = datereservation;
		this.horaire = horaire;
		this.nbreplacereservation = nbreplacereservation;
		this.idclient = idclient;
	}


	public int getIdreservation() {
		return idreservation;
	}


	public void setIdreservation(int idreservation) {
		this.idreservation = idreservation;
	}


	public Date getDatereservation() {
		return datereservation;
	}


	public void setDatereservation(Date datereservation) {
		this.datereservation = datereservation;
	}


	public LocalTime getHoraire() {
		return horaire;
	}


	public void setHoraire(LocalTime horaire) {
		this.horaire = horaire;
	}


	public int getNbreplacereservation() {
		return nbreplacereservation;
	}


	public void setNbreplacereservation(int nbreplacereservation) {
		this.nbreplacereservation = nbreplacereservation;
	}


	public Client getIdclient() {
		return idclient;
	}


	public void setIdclient(Client idclient) {
		this.idclient = idclient;
	}


	public ReservationDTO(int idreservation, Date datereservation, LocalTime horaire, int nbreplacereservation,
			Client idclient) {
		super();
		this.idreservation = idreservation;
		this.datereservation = datereservation;
		this.horaire = horaire;
		this.nbreplacereservation = nbreplacereservation;
		this.idclient = idclient;
	}

	
}
