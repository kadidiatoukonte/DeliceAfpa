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
	private Set<TraiterCommandeDTO> traiterCommande;
	private Set<TraiterReservationDTO> traiterReservation;
	private Set<CommandeDTO> commandeliv;
	private Set<AssignerRoleDTO> idemploye_assigner_role;
	private Set<AssignerRoleDTO> idemployer;
	private Set<DeterminerCatDTO> determinercat;
	private Set<DeterminerArtDTO> determinerart;
	private List<EmployeDTO> listEmploye;
	
	
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

	public Set<TraiterCommandeDTO> getTraiterCommande() {
		return traiterCommande;
	}

	public void setTraiterCommande(Set<TraiterCommandeDTO> traiterCommande) {
		this.traiterCommande = traiterCommande;
	}

	public Set<TraiterReservationDTO> getTraiterReservation() {
		return traiterReservation;
	}

	public void setTraiterReservation(Set<TraiterReservationDTO> traiterReservation) {
		this.traiterReservation = traiterReservation;
	}

	public Set<CommandeDTO> getCommandeliv() {
		return commandeliv;
	}

	public void setCommandeliv(Set<CommandeDTO> commandeliv) {
		this.commandeliv = commandeliv;
	}

	public Set<AssignerRoleDTO> getIdemploye_assigner_role() {
		return idemploye_assigner_role;
	}

	public void setIdemploye_assigner_role(Set<AssignerRoleDTO> idemploye_assigner_role) {
		this.idemploye_assigner_role = idemploye_assigner_role;
	}

	public Set<AssignerRoleDTO> getIdemployer() {
		return idemployer;
	}

	public void setIdemployer(Set<AssignerRoleDTO> idemployer) {
		this.idemployer = idemployer;
	}

	public Set<DeterminerCatDTO> getDeterminercat() {
		return determinercat;
	}

	public void setDeterminercat(Set<DeterminerCatDTO> determinercat) {
		this.determinercat = determinercat;
	}

	public Set<DeterminerArtDTO> getDeterminerart() {
		return determinerart;
	}

	public void setDeterminerart(Set<DeterminerArtDTO> determinerart) {
		this.determinerart = determinerart;
	}

	public List<EmployeDTO> getListEmploye() {
		return listEmploye;
	}

	public void setListEmploye(List<EmployeDTO> listEmploye) {
		this.listEmploye = listEmploye;
	}

	@Override
	public String toString() {
		return "EmployeDTO [idemploye=" + idemploye + ", nomemploye=" + nomemploye + ", prenomemploye=" + prenomemploye
				+ ", telemploye=" + telemploye + ", mailemploye=" + mailemploye + ", passwordemploye=" + passwordemploye
				+ ", statusemploye=" + statusemploye + ", traiterCommande=" + traiterCommande + ", traiterReservation="
				+ traiterReservation + ", commandeliv=" + commandeliv + ", idemploye_assigner_role="
				+ idemploye_assigner_role + ", idemployer=" + idemployer + ", determinercat=" + determinercat
				+ ", determinerart=" + determinerart + "]";
	}
	
	
	
}
