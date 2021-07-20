package fr.cda.delicesafpa.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "panier")
public class Panier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpanier;

	@OneToMany
	(fetch = FetchType.EAGER , mappedBy = "idpanier")
	private Set<ConcernerPanArt> concernerPanArt;
	
	


	public void setConcernerPanArt(Set<ConcernerPanArt> concernerPanArt) {
		this.concernerPanArt = concernerPanArt;
	}




	public Panier() {}
	



	public int getIdpanier() {
		return idpanier;
	}

	public void setIdpanier(int idpanier) {
		this.idpanier = idpanier;
	}

	public Set<ConcernerPanArt> getConcernerPanArt() {
		return concernerPanArt;
	}





	@Override
	public String toString() {
		return "Panier [idpanier=" + idpanier + "]";
	}

	


}
