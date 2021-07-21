package fr.cda.delicesafpa.beans;

import java.awt.Image;
import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "reservation")

public class Reservation implements Serializable {/*
							 * /*CREATE TABLE delicesafpa.reservation( idreservation SERIAL NOT NULL ,
							 * datereservation DATE NOT NULL , nbreplacereservation INT NOT NULL , idclient
							 * INT NOT NULL , PRIMARY KEY (idreservation) );
							 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idreservation;

	@Column(name = "datereservation")
	private Date datereservation;

	@Column(name = "horaire")
	private LocalTime horaire;
	
		
	@Column(name = "nbreplacereservation")
	private int nbreplacereservation;

	@ManyToOne
	@JoinColumn(name = "idclient", nullable = false)
	private Client idclient;

	
    @JsonIgnore
	@OneToMany(mappedBy = "idreservation",fetch = FetchType.EAGER)
	Set<TraiterReservation> traiterReservation;

	public Reservation() {

	}



	public Reservation(Date datereservation, LocalTime horaire, int nbreplacereservation,
			Client idclient) {
		super();
		this.datereservation = datereservation;
		this.horaire = horaire;
		this.nbreplacereservation = nbreplacereservation;
		this.idclient = idclient;
	}



	public LocalTime getHoraire() {
		return horaire;
	}



	public void setHoraire(LocalTime horaire) {
		this.horaire = horaire;
	}


	@JsonIgnore
	public Set<TraiterReservation> getTraiterReservation() {
		return traiterReservation;
	}



	public void setTraiterReservation(Set<TraiterReservation> traiterReservation) {
		this.traiterReservation = traiterReservation;
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

	@Override
	public String toString() {
		return "Reservation [idreservation=" + idreservation + ", datereservation=" + datereservation
				+ ", nbreplacereservation=" + nbreplacereservation + ", idclient=" + idclient.getNomclient() + "]";
	}

}
