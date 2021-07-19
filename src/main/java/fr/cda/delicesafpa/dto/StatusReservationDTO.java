package fr.cda.delicesafpa.dto;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;


import lombok.Data;

@Data
public class StatusReservationDTO {

	private int idstatus;

	private String description;

	public StatusReservationDTO() {
		super();
	}

	public StatusReservationDTO(String description) {
		super();
		this.description = description;
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

	@Override
	public String toString() {
		return "StatusReservationDTO [idstatus=" + idstatus + ", description=" + description + "]";
	}




}
