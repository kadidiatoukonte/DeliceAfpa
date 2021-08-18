package fr.cda.delicesafpa.dto;

import lombok.Data;

@Data
public class AddProduitToPanierDTO {
	String idpanier;
	String idarticle;
	String quantite;
	
	
	
	public AddProduitToPanierDTO(String idpanier, String idarticle, String quantite) {
		super();
		this.idpanier = idpanier;
		this.idarticle = idarticle;
		this.quantite = quantite;
	}
	
	@Override
	public String toString() {
		return "AddProduitToPanierDTO [idpanier=" + idpanier + ", idarticle=" + idarticle + ", quantite=" + quantite
				+ "]";
	}

	public AddProduitToPanierDTO() {}

	public String getIdpanier() {
		return idpanier;
	}

	public void setIdpanier(String idpanier) {
		this.idpanier = idpanier;
	}

	public String getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(String idarticle) {
		this.idarticle = idarticle;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	};
	
	
	
	
	
	

	
	
	
	
	
	
	

}
