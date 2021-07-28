package fr.cda.delicesafpa.dto;

import java.time.LocalDateTime;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import fr.cda.delicesafpa.beans.AssignerRoleId;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.RoleEmploye;

public class AssignerRoleDTO {


	private Employe idemploye_assigner_role;
	
	private Employe idemploye;	

    private RoleEmploye idstatus;
    
	private LocalDateTime date;
	
	public AssignerRoleDTO() {};
	
	public AssignerRoleDTO(Employe idemploye_assigner_role, Employe idemploye, RoleEmploye idstatus,
			LocalDateTime date) {
		super();
		this.idemploye_assigner_role = idemploye_assigner_role;
		this.idemploye = idemploye;
		this.idstatus = idstatus;
		this.date = date;
	}

	public Employe getIdemploye_assigner_role() {
		return idemploye_assigner_role;
	}

	public void setIdemploye_assigner_role(Employe idemploye_assigner_role) {
		this.idemploye_assigner_role = idemploye_assigner_role;
	}

	public Employe getIdemploye() {
		return idemploye;
	}

	public void setIdemploye(Employe idemploye) {
		this.idemploye = idemploye;
	}

	public RoleEmploye getIdstatus() {
		return idstatus;
	}

	public void setIdstatus(RoleEmploye idstatus) {
		this.idstatus = idstatus;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "AssignerRoleDTO [idemploye_assigner_role=" + idemploye_assigner_role + ", idemploye=" + idemploye
				+ ", idstatus=" + idstatus + ", date=" + date + "]";
	}
    
    
}
