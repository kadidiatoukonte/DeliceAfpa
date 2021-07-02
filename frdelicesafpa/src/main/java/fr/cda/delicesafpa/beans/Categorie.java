package fr.cda.delicesafpa.beans;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
	
	@Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] photocategorie;

	public Categorie(int idcategorie, String nomcategorie, String descriptioncategorie, Boolean visibilitecategorie,
			byte[] photocategorie) {
		super();
		this.idcategorie = idcategorie;
		this.nomcategorie = nomcategorie;
		this.descriptioncategorie = descriptioncategorie;
		this.visibilitecategorie = visibilitecategorie;
		this.photocategorie = photocategorie;
	}
	
	public Categorie() {
		
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

	public byte[] getPhotocategorie() {
		return photocategorie;
	}

	public void setPhotocategorie(byte[] photocategorie) {
		this.photocategorie = photocategorie;
	}
	
	
	
	
}
