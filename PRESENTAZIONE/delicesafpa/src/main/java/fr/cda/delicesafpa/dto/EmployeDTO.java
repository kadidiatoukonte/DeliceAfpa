package fr.cda.delicesafpa.dto;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import fr.cda.delicesafpa.beans.AssignerRole;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.DeterminerArt;
import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterReservation;

public class EmployeDTO {
	private int idemploye;
	private String nomemploye;
	private String prenomemploye;
	private String telemploye;
	private String mailemploye;
	private String passwordemploye;
	private Boolean statusemploye;

	
	
	public EmployeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeDTO(String nomemploye, String prenomemploye, String telemploye, String mailemploye,
			String passwordemploye, Boolean statusemploye) {
		super();
		this.nomemploye = nomemploye;
		this.prenomemploye = prenomemploye;
		this.telemploye = telemploye;
		this.mailemploye = mailemploye;
		this.passwordemploye = passwordemploye;
		this.statusemploye = statusemploye;
	}

	public int getIdemploye() {
		return idemploye;
	}

	public void setIdemploye(int idemploye) {
		this.idemploye = idemploye;
	}

	public String getNomemploye() {
		return nomemploye;
	}

	public void setNomemploye(String nomemploye) {
		this.nomemploye = nomemploye;
	}

	public String getPrenomemploye() {
		return prenomemploye;
	}

	public void setPrenomemploye(String prenomemploye) {
		this.prenomemploye = prenomemploye;
	}

	public String getTelemploye() {
		return telemploye;
	}

	public void setTelemploye(String telemploye) {
		this.telemploye = telemploye;
	}

	public String getMailemploye() {
		return mailemploye;
	}

	public void setMailemploye(String mailemploye) {
		this.mailemploye = mailemploye;
	}

	public String getPasswordemploye() {
		return passwordemploye;
	}

	public void setPasswordemploye(String passwordemploye) {
		this.passwordemploye = passwordemploye;
	}

	public Boolean getStatusemploye() {
		return statusemploye;
	}

	public void setStatusemploye(Boolean statusemploye) {
		this.statusemploye = statusemploye;
	}

	@Override
	public String toString() {
		return "EmployeDTO [idemploye=" + idemploye + ", nomemploye=" + nomemploye + ", prenomemploye=" + prenomemploye
				+ ", telemploye=" + telemploye + ", mailemploye=" + mailemploye + ", passwordemploye=" + passwordemploye
				+ ", statusemploye=" + statusemploye + "]";
	}


	
	
	
}
