package fr.cda.delicesafpa.dto;

public class IdConcerPanArtDTO {
private String idpanier;
private String idarticle;



public IdConcerPanArtDTO() {
	super();
}



public IdConcerPanArtDTO(String idpanier, String idarticle) {
	super();
	this.idpanier = idpanier;
	this.idarticle = idarticle;
}



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



}
