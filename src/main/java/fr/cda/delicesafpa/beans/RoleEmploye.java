package fr.cda.delicesafpa.beans;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "roleemploye")
public class RoleEmploye {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idstatus;

	private String description;
	
	@OneToMany(mappedBy = "idstatus",fetch = FetchType.EAGER)
	Set<AssignerRole> assignerRole;

	public RoleEmploye() {}
	
	public RoleEmploye(String description) {
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

	public Set<AssignerRole> getAssignerRole() {
		return assignerRole;
	}

	public void setAssignerRole(Set<AssignerRole> assignerRole) {
		this.assignerRole = assignerRole;
	}

	@Override
	public String toString() {
		return "RoleEmploye [idstatus=" + idstatus + ", description=" + description/* + ", assignerRole=" + assignerRole
				*/+ "]";
	}
	

}
