package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity @Table( name="assignerrole" )
public class AssignerRole {


	@EmbeddedId
	private RoleId id;

	public AssignerRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssignerRole(RoleId id) {
		super();
		this.id = id;
	}

	public RoleId getId() {
		return id;
	}

	public void setId(RoleId id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	
	


}
