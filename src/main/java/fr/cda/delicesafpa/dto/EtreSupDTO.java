package fr.cda.delicesafpa.dto;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.EtresupId;


	import lombok.Data;
	
	@Data
	public class EtreSupDTO {
	
	 private EtresupId id;
	 
	 
	 private ArticleDTO idarticle;
	 private ArticleDTO idarticle_etreSup;
	
	public EtreSupDTO(EtresupId id, ArticleDTO idarticle, ArticleDTO idarticle_etreSup) {
		super();
		this.id = id;
		this.idarticle = idarticle;
		this.idarticle_etreSup = idarticle_etreSup;
	}
	
	public EtreSupDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EtresupId getId() {
		return id;
	}

	public void setId(EtresupId id) {
		this.id = id;
	}

	public ArticleDTO getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(ArticleDTO idarticle) {
		this.idarticle = idarticle;
	}

	public ArticleDTO getIdarticle_etreSup() {
		return idarticle_etreSup;
	}

	public void setIdarticle_etreSup(ArticleDTO idarticle_etreSup) {
		this.idarticle_etreSup = idarticle_etreSup;
	}

	@Override
	public String toString() {
		return "EtreSupDTO [id=" + id + ", idarticle=" + idarticle + ", idarticle_etreSup=" + idarticle_etreSup + "]";
	}
	
	///je l'ai fais
	
	
}
