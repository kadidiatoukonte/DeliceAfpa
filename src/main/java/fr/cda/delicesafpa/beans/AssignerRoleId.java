package fr.cda.delicesafpa.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Embeddable
public class AssignerRoleId implements Serializable {
	@Column(name = "idemploye_assigner_role")
	private int idemploye_assigner_role;
   
    @Column(name = "idemploye")
	private int idemploye;
	
    @Column(name = "idstatus")
	private int idstatus;
 
	private LocalDateTime date;

	public AssignerRoleId() {
		super();
	}

	public AssignerRoleId(int idemploye_assigner_role, int idemploye, int idstatus, LocalDateTime date) {
		super();
		this.idemploye_assigner_role = idemploye_assigner_role;
		this.idemploye = idemploye;
		this.idstatus = idstatus;
		this.date = date;
	}

	public int getIdemploye_assigner_role() {
		return idemploye_assigner_role;
	}

	public void setIdemploye_assigner_role(int idemploye_assigner_role) {
		this.idemploye_assigner_role = idemploye_assigner_role;
	}

	public int getIdemploye() {
		return idemploye;
	}

	public void setIdemploye(int idemploye) {
		this.idemploye = idemploye;
	}

	public int getIdstatus() {
		return idstatus;
	}

	public void setIdstatus(int idstatus) {
		this.idstatus = idstatus;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + idemploye;
		result = prime * result + idemploye_assigner_role;
		result = prime * result + idstatus;
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
		AssignerRoleId other = (AssignerRoleId) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idemploye != other.idemploye)
			return false;
		if (idemploye_assigner_role != other.idemploye_assigner_role)
			return false;
		if (idstatus != other.idstatus)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AssignerRoleId [idemploye_assigner_role=" + idemploye_assigner_role + ", idemploye=" + idemploye
				+ ", idstatus=" + idstatus + ", date=" + date + "]";
	}


	
}
