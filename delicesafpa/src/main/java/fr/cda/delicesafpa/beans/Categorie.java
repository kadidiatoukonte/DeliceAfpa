package fr.cda.delicesafpa.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "categorie")
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcategorie;
	
	@Column(name = "nomcategorie")
	private String nomcategorie;
	
	@Column(name = "descriptioncategorie")
	private String descriptioncategorie;
	
	@Column(name = "visibilitecategorie")
	private Boolean visibilitecategorie;

	@OneToMany(mappedBy = "idcategorie",fetch = FetchType.EAGER)
	Set<DeterminerCat> determinerCat;
	
	@OneToMany( mappedBy="categorie", fetch = FetchType.EAGER  )
    private Set<Article> article ;
	
	
	
	public Categorie() {
		super();
	}

	public Categorie( String nomcategorie, String descriptioncategorie, Boolean visibilitecategorie) {
		super();
		this.nomcategorie = nomcategorie;
		this.descriptioncategorie = descriptioncategorie;
		this.visibilitecategorie = visibilitecategorie;
	}

	public int getIdcategorie() {
		return idcategorie;
	}

	public void setIdcategorie(int idcategorie) {
		this.idcategorie = idcategorie;
	}

	public String getNomcategorie() {
		return nomcategorie;
	}

	public void setNomcategorie(String nomcategorie) {
		this.nomcategorie = nomcategorie;
	}

	public String getDescriptioncategorie() {
		return descriptioncategorie;
	}

	public void setDescriptioncategorie(String descriptioncategorie) {
		this.descriptioncategorie = descriptioncategorie;
	}

	public Boolean getVisibilitecategorie() {
		return visibilitecategorie;
	}

	public void setVisibilitecategorie(Boolean visibilitecategorie) {
		this.visibilitecategorie = visibilitecategorie;
	}

	public Set<DeterminerCat> getDeterminerCat() {
		return determinerCat;
	}

	public void setDeterminerCat(Set<DeterminerCat> determinerCat) {
		this.determinerCat = determinerCat;
	}

	@Override
	public String toString() {
		return "Categorie [idcategorie=" + idcategorie + ", nomcategorie=" + nomcategorie + ", descriptioncategorie="
				+ descriptioncategorie + ", visibilitecategorie=" + visibilitecategorie + ", determinerCat="
				+ determinerCat.size() + "]";
	}
	


	
	
	
	
}