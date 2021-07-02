package fr.cda.delicesafpa.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statusreservation")
public class StatusReservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idstatus;

	private String description;

	
	
	
	public StatusReservation(String description) {
	
		this.description = description;
	}
	

	public StatusReservation() {
		
	}

	public int getIdstatus() {
		return idstatus;
	}

	public void setIdstatus(int idstatus) {
		this.idstatus = idstatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
