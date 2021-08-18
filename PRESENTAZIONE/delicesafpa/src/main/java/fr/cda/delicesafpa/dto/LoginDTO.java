package fr.cda.delicesafpa.dto;
import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;

import fr.cda.delicesafpa.beans.Reservation;
import lombok.Data;

@Data
public class LoginDTO {
	
	
	private String mailclient;
	private String passwordclient;
	
	
	
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public LoginDTO(String mailclient, String passwordclient) {
		super();
		this.mailclient = mailclient;
		this.passwordclient = passwordclient;
	}



	public String getMailclient() {
		return mailclient;
	}



	public void setMailclient(String mailclient) {
		this.mailclient = mailclient;
	}



	public String getPasswordclient() {
		return passwordclient;
	}



	public void setPasswordclient(String passwordclient) {
		this.passwordclient = passwordclient;
	}



	@Override
	public String toString() {
		return "ClientLogin [mailclient=" + mailclient + ", passwordclient=" + passwordclient + "]";
	}
	
	
}
