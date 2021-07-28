package fr.cda.delicesafpa.dto;
import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;

import fr.cda.delicesafpa.beans.Reservation;
import lombok.Data;

@Data
public class ClientDTO {
	
	private int idclient;
	private String nomclient;
	private String prenomclient;
	private Date datebirclient;
	private String paysclient;
	private String adresseclient;
	private String complementadrclient;
	private String cpclient;
	private String villeclient;
	private String telclient;
	private String mailclient;
	private String passwordclient;
	private Set<CommandeDTO> commandes;
	private Set<ReservationDTO> reservations;
	private List<ClientDTO> listClient;
	
	
	
	
	
	public ClientDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ClientDTO(String nomclient, String prenomclient, Date datebirclient, String paysclient, String adresseclient,
			String complementadrclient, String cpclient, String villeclient, String telclient, String mailclient,
			String passwordclient) {
		super();
		this.nomclient = nomclient;
		this.prenomclient = prenomclient;
		this.datebirclient = datebirclient;
		this.paysclient = paysclient;
		this.adresseclient = adresseclient;
		this.complementadrclient = complementadrclient;
		this.cpclient = cpclient;
		this.villeclient = villeclient;
		this.telclient = telclient;
		this.mailclient = mailclient;
		this.passwordclient = passwordclient;
	}
	
	public int getIdclient() {
		return idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}
	public String getNomclient() {
		return nomclient;
	}
	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}
	public String getPrenomclient() {
		return prenomclient;
	}
	public void setPrenomclient(String prenomclient) {
		this.prenomclient = prenomclient;
	}
	public Date getDatebirclient() {
		return datebirclient;
	}
	public void setDatebirclient(Date datebirclient) {
		this.datebirclient = datebirclient;
	}
	public String getPaysclient() {
		return paysclient;
	}
	public void setPaysclient(String paysclient) {
		this.paysclient = paysclient;
	}
	public String getAdresseclient() {
		return adresseclient;
	}
	public void setAdresseclient(String adresseclient) {
		this.adresseclient = adresseclient;
	}
	public String getComplementadrclient() {
		return complementadrclient;
	}
	public void setComplementadrclient(String complementadrclient) {
		this.complementadrclient = complementadrclient;
	}
	public String getCpclient() {
		return cpclient;
	}
	public void setCpclient(String cpclient) {
		this.cpclient = cpclient;
	}
	public String getVilleclient() {
		return villeclient;
	}
	public void setVilleclient(String villeclient) {
		this.villeclient = villeclient;
	}
	public String getTelclient() {
		return telclient;
	}
	public void setTelclient(String telclient) {
		this.telclient = telclient;
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
	public Set<CommandeDTO> getCommandes() {
		return commandes;
	}
	public void setCommandes(Set<CommandeDTO> commandes) {
		this.commandes = commandes;
	}
	public Set<ReservationDTO> getReservations() {
		return reservations;
	}
	public void setReservations(Set<ReservationDTO> reservations) {
		this.reservations = reservations;
	}
	public List<ClientDTO> getListClient() {
		return listClient;
	}
	public void setListClient(List<ClientDTO> listClient) {
		this.listClient = listClient;
	}
	
	@Override
	public String toString() {
		return "ClientDTO [idclient=" + idclient + ", nomclient=" + nomclient + ", prenomclient=" + prenomclient
				+ ", datebirclient=" + datebirclient + ", paysclient=" + paysclient + ", adresseclient=" + adresseclient
				+ ", complementadrclient=" + complementadrclient + ", cpclient=" + cpclient + ", villeclient="
				+ villeclient + ", telclient=" + telclient + ", mailclient=" + mailclient + ", passwordclient="
				+ passwordclient + ", commandes=" + commandes + ", reservations=" + reservations + ", listClient="
				+ listClient + "]";
	}
	
	
}
