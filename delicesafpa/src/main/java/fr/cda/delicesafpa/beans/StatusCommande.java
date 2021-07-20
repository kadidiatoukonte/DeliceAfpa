package fr.cda.delicesafpa.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "statuscommande")
public class StatusCommande  implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idstatus;

	private String description;
	
	@JsonIgnore
	@OneToMany(mappedBy = "idstatus",fetch = FetchType.EAGER)
	Set<TraiterCommande> traiterCommande;
	
	public StatusCommande() {

	}
	@JsonIgnore
	public Set<TraiterCommande> getTraiterCommande() {
		return traiterCommande;
	}

	public void setTraiterCommande(Set<TraiterCommande> traiterCommande) {
		this.traiterCommande = traiterCommande;
	}

	public StatusCommande(String description) {
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

	@Override
	public String toString() {
		return "StatusCommande [idstatus=" + idstatus + ", description=" + description + ", traiterCommande="
				+ traiterCommande + "]";
	}

	
	
}
