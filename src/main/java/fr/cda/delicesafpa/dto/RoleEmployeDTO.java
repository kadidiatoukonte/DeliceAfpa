package fr.cda.delicesafpa.dto;

import java.util.Set;


import lombok.Data;

@Data
public class RoleEmployeDTO {
	private int idstatus;

	private String description;
	Set<AssignerRoleDTO> assignerRole;

	public RoleEmployeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleEmployeDTO(String description) {
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

	public Set<AssignerRoleDTO> getAssignerRole() {
		return assignerRole;
	}

	public void setAssignerRole(Set<AssignerRoleDTO> assignerRole) {
		this.assignerRole = assignerRole;
	}

	@Override
	public String toString() {
		return "RoleEmployeDTO [idstatus=" + idstatus + ", description=" + description + ", assignerRole="
				+ assignerRole + "]";
	}

	
}
