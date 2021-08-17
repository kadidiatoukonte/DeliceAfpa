package fr.cda.delicesafpa.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class ArticleDTO {
	private int idarticle;
	private String nomarticle;
	private float prixarticle;
	private String descriptionarticle;
	private boolean visibilitearticle;
	private boolean offrespecialearticle;
	private String descriptionoffresp;
	private List<DeterminerArtDTO> determinerart = new ArrayList<>();
	private CategorieDTO categorie;
	private Set<EtreSupDTO> idarticle_etreSup;
	private Set<EtreSupDTO> idarticleS;
	private List<ArticleDTO> listeArticle;
	
	public ArticleDTO(String nomarticle, float prixarticle, String descriptionarticle, boolean visibilitearticle,
			boolean offrespecialearticle, String descriptionoffresp, CategorieDTO categorie) {
		super();
		this.nomarticle = nomarticle;
		this.prixarticle = prixarticle;
		this.descriptionarticle = descriptionarticle;
		this.visibilitearticle = visibilitearticle;
		this.offrespecialearticle = offrespecialearticle;
		this.descriptionoffresp = descriptionoffresp;
		this.categorie = categorie;
	}

	public ArticleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(int idarticle) {
		this.idarticle = idarticle;
	}

	public String getNomarticle() {
		return nomarticle;
	}

	public void setNomarticle(String nomarticle) {
		this.nomarticle = nomarticle;
	}

	public float getPrixarticle() {
		return prixarticle;
	}

	public void setPrixarticle(float prixarticle) {
		this.prixarticle = prixarticle;
	}

	public String getDescriptionarticle() {
		return descriptionarticle;
	}

	public void setDescriptionarticle(String descriptionarticle) {
		this.descriptionarticle = descriptionarticle;
	}

	public boolean isVisibilitearticle() {
		return visibilitearticle;
	}

	public void setVisibilitearticle(boolean visibilitearticle) {
		this.visibilitearticle = visibilitearticle;
	}

	public boolean isOffrespecialearticle() {
		return offrespecialearticle;
	}

	public void setOffrespecialearticle(boolean offrespecialearticle) {
		this.offrespecialearticle = offrespecialearticle;
	}

	public String getDescriptionoffresp() {
		return descriptionoffresp;
	}

	public void setDescriptionoffresp(String descriptionoffresp) {
		this.descriptionoffresp = descriptionoffresp;
	}

	public List<DeterminerArtDTO> getDeterminerart() {
		return determinerart;
	}

	public void setDeterminerart(List<DeterminerArtDTO> determinerart) {
		this.determinerart = determinerart;
	}

	public CategorieDTO getCategorie() {
		return categorie;
	}

	public void setCategorie(CategorieDTO categorie) {
		this.categorie = categorie;
	}

	public Set<EtreSupDTO> getIdarticle_etreSup() {
		return idarticle_etreSup;
	}

	public void setIdarticle_etreSup(Set<EtreSupDTO> idarticle_etreSup) {
		this.idarticle_etreSup = idarticle_etreSup;
	}

	public Set<EtreSupDTO> getIdarticleS() {
		return idarticleS;
	}

	public void setIdarticleS(Set<EtreSupDTO> idarticleS) {
		this.idarticleS = idarticleS;
	}

	public List<ArticleDTO> getListeArticle() {
		return listeArticle;
	}

	public void setListeArticle(List<ArticleDTO> listeArticle) {
		this.listeArticle = listeArticle;
	}

	@Override
	public String toString() {
		return "ArticleDTO [idarticle=" + idarticle + ", nomarticle=" + nomarticle + ", prixarticle=" + prixarticle
				+ ", descriptionarticle=" + descriptionarticle + ", visibilitearticle=" + visibilitearticle
				+ ", offrespecialearticle=" + offrespecialearticle + ", descriptionoffresp=" + descriptionoffresp
				+ ", determinerart=" + determinerart + ", categorie=" + categorie + ", idarticle_etreSup="
				+ idarticle_etreSup + ", idarticleS=" + idarticleS + "]";
	}

	
	
}
