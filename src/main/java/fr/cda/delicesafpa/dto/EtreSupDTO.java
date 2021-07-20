package fr.cda.delicesafpa.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import fr.cda.delicesafpa.beans.Article;
import lombok.Data;

@Data
public class EtreSupDTO {


  
    Article idarticle;

    Article idarticle_etreSup;
	
	public EtreSupDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EtreSupDTO(Article idarticle, Article idarticle_etreSup) {
		super();
		this.idarticle = idarticle;
		this.idarticle_etreSup = idarticle_etreSup;
	}

	public Article getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(Article idarticle) {
		this.idarticle = idarticle;
	}

	public Article getIdarticle_etreSup() {
		return idarticle_etreSup;
	}

	public void setIdarticle_etreSup(Article idarticle_etreSup) {
		this.idarticle_etreSup = idarticle_etreSup;
	}

	@Override
	public String toString() {
		return "EtreSupDTO [idarticle=" + idarticle + ", idarticle_etreSup=" + idarticle_etreSup + "]";
	}
	
	
	
}
