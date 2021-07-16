package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity @Table( name="assignerrole" )
public class AssignerRole {

	@EmbeddedId
	private AssignerRoleId id;

    @ManyToOne
    @MapsId("idemploye_assigner_role")
    @JoinColumn(name = "idemploye_assigner_role")
	private Employe idemploye_assigner_role;

    @ManyToOne
    @MapsId("idemploye")
    @JoinColumn(name = "idemploye")
	private Employe idemploye;	

    
    @ManyToOne
    @MapsId("idstatus")
    @JoinColumn(name = "idstatus")
    private RoleEmploye idstatus;

    public AssignerRole() {};
    
	public AssignerRole(AssignerRoleId id, Employe idemploye_assigner_role, Employe idemploye, RoleEmploye idstatus) {
		super();
		this.id = id;
		this.idemploye_assigner_role = idemploye_assigner_role;
		this.idemploye = idemploye;
		this.idstatus = idstatus;
	}


	public AssignerRoleId getId() {
		return id;
	}


	public void setId(AssignerRoleId id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "AssignerRole [id=" + id + ", idemploye_assigner_role=" + idemploye_assigner_role + ", idemploye="
				+ idemploye + ", idstatus=" + idstatus + "]";
	}

    
    
    
}
