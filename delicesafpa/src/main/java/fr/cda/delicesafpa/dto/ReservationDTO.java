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
	private ClientDTO idclient;
	private Set<TraiterReservationDTO> traiterReservation;
	private List<ReservationDTO> listReservation;
	
	public ReservationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReservationDTO(Date datereservation, LocalTime horaire, int nbreplacereservation, ClientDTO idclient) {
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

	public ClientDTO getIdclient() {
		return idclient;
	}

	public void setIdclient(ClientDTO idclient) {
		this.idclient = idclient;
	}

	public Set<TraiterReservationDTO> getTraiterReservation() {
		return traiterReservation;
	}

	public void setTraiterReservation(Set<TraiterReservationDTO> traiterReservation) {
		this.traiterReservation = traiterReservation;
	}

	public List<ReservationDTO> getListReservation() {
		return listReservation;
	}

	public void setListReservation(List<ReservationDTO> listReservation) {
		this.listReservation = listReservation;
	}

	@Override
	public String toString() {
		return "ReservationDTO [idreservation=" + idreservation + ", datereservation=" + datereservation + ", horaire="
				+ horaire + ", nbreplacereservation=" + nbreplacereservation + ", idclient=" + idclient
				+ ", traiterReservation=" + traiterReservation + ", listReservation=" + listReservation + "]";
	}
	
	
}
