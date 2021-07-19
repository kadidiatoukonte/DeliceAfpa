package fr.cda.delicesafpa.dto;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.TraiterCommande;
import lombok.Data;

@Data
public class ConcernerPanArtDTO {
	
	
    Panier idpanier;

    Article idarticle;
    
	private int quantitearticle;

	public ConcernerPanArtDTO() {
		super();
	}

	public ConcernerPanArtDTO(Article idarticle, int quantitearticle) {
		super();
		this.idarticle = idarticle;
		this.quantitearticle = quantitearticle;
	}

	public Panier getIdpanier() {
		return idpanier;
	}

	public void setIdpanier(Panier idpanier) {
		this.idpanier = idpanier;
	}

	public Article getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(Article idarticle) {
		this.idarticle = idarticle;
	}

	public int getQuantitearticle() {
		return quantitearticle;
	}

	public void setQuantitearticle(int quantitearticle) {
		this.quantitearticle = quantitearticle;
	}

	@Override
	public String toString() {
		return "ConcernerPanArtDTO [idpanier=" + idpanier + ", idarticle=" + idarticle + ", quantitearticle="
				+ quantitearticle + "]";
	}
	
	
	
	
	
}
