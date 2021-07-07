package fr.cda.delicesafpa.dto;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.DeterminerCat;
import lombok.Data;

@Data
public class CategorieDTO {
	private int idcategorie;
	private String nomcategorie;
	private String descriptioncategorie;
	private Boolean visibilitecategorie;
	private Set<DeterminerCat> determinerCat;
	private Set<Article> article;
	private List<CategorieDTO> listCategorie;
	
	public CategorieDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategorieDTO(String nomcategorie, String descriptioncategorie, Boolean visibilitecategorie) {
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

	public Set<Article> getArticle() {
		return article;
	}

	public void setArticle(Set<Article> article) {
		this.article = article;
	}

	public List<CategorieDTO> getListCategorie() {
		return listCategorie;
	}

	public void setListCategorie(List<CategorieDTO> listCategorie) {
		this.listCategorie = listCategorie;
	}

	@Override
	public String toString() {
		return "CategorieDTO [idcategorie=" + idcategorie + ", nomcategorie=" + nomcategorie + ", descriptioncategorie="
				+ descriptioncategorie + ", visibilitecategorie=" + visibilitecategorie + ", determinerCat="
				+ determinerCat + ", article=" + article + ", listCategorie=" + listCategorie + "]";
	}
	
	
}
