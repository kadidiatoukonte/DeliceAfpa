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
public class AddReservationDTO {

	private String datereservation;
	private int horaire;
	private int nbreplacereservation;
	private String idclient;
	
	
	public AddReservationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AddReservationDTO(String datereservation, int horaire, int nbreplacereservation, String idclient) {
		super();
		this.datereservation = datereservation;
		this.horaire = horaire;
		this.nbreplacereservation = nbreplacereservation;
		this.idclient = idclient;
	}


	public String getDatereservation() {
		return datereservation;
	}


	public void setDatereservation(String datereservation) {
		this.datereservation = datereservation;
	}


	public int getHoraire() {
		return horaire;
	}


	public void setHoraire(int horaire) {
		this.horaire = horaire;
	}


	public int getNbreplacereservation() {
		return nbreplacereservation;
	}


	public void setNbreplacereservation(int nbreplacereservation) {
		this.nbreplacereservation = nbreplacereservation;
	}


	public String getIdclient() {
		return idclient;
	}


	public void setIdclient(String idclient) {
		this.idclient = idclient;
	}




	
	
}
