package fr.cda.delicesafpa.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class RoleId implements Serializable {
	
	//
	private Employe idemploye;
	
	//
	private Employe idemploye_assigner_role;

	//
	private RoleEmploye idstatus;
	
	
	private Date date;
	
	
	

	public RoleId(Employe idemploye, Employe idemploye_assigner_role, RoleEmploye idstatus, Date date) {
		super();
		this.idemploye = idemploye;
		this.idemploye_assigner_role = idemploye_assigner_role;
		this.idstatus = idstatus;
		this.date = date;
	}



	public RoleId() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employe getIdemploye() {
		return idemploye;
	}



	public void setIdemploye(Employe idemploye) {
		this.idemploye = idemploye;
	}



	public Employe getIdemploye_assigner_role() {
		return idemploye_assigner_role;
	}



	public void setIdemploye_assigner_role(Employe idemploye_assigner_role) {
		this.idemploye_assigner_role = idemploye_assigner_role;
	}



	public RoleEmploye getIdstatus() {
		return idstatus;
	}



	public void setIdstatus(RoleEmploye idstatus) {
		this.idstatus = idstatus;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((idemploye == null) ? 0 : idemploye.hashCode());
		result = prime * result + ((idemploye_assigner_role == null) ? 0 : idemploye_assigner_role.hashCode());
		result = prime * result + ((idstatus == null) ? 0 : idstatus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleId other = (RoleId) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idemploye == null) {
			if (other.idemploye != null)
				return false;
		} else if (!idemploye.equals(other.idemploye))
			return false;
		if (idemploye_assigner_role == null) {
			if (other.idemploye_assigner_role != null)
				return false;
		} else if (!idemploye_assigner_role.equals(other.idemploye_assigner_role))
			return false;
		if (idstatus == null) {
			if (other.idstatus != null)
				return false;
		} else if (!idstatus.equals(other.idstatus))
			return false;
		return true;
	}

}
