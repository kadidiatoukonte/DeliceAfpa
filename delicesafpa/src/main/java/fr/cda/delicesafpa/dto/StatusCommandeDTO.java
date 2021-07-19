package fr.cda.delicesafpa.dto;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;


import lombok.Data;

@Data
public class StatusCommandeDTO {

	private int idstatus;

	private String description;

	public StatusCommandeDTO() {
		super();
	}

	public StatusCommandeDTO(String description) {
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
		return "StatusCommandeDTO [idstatus=" + idstatus + ", description=" + description + "]";
	}




}
