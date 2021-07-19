package fr.cda.delicesafpa.dto;


import java.time.LocalDateTime;


import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Employe;


public class DeterminerArtDTO {



    Article idarticle;

    Employe idemploye;

	private LocalDateTime date;

    
    
	public DeterminerArtDTO(Article idarticle, Employe idemploye, LocalDateTime date) {
		super();
		this.idarticle = idarticle;
		this.idemploye = idemploye;
		this.date = date;
	}



	@Override
	public String toString() {
		return "DeterminerArtDTO [idarticle=" + idarticle + ", idemploye=" + idemploye + ", date=" + date + "]";
	}



	public DeterminerArtDTO() {
		super();
	}



	public Article getIdarticle() {
		return idarticle;
	}



	public void setIdarticle(Article idarticle) {
		this.idarticle = idarticle;
	}



	public Employe getIdemploye() {
		return idemploye;
	}



	public void setIdemploye(Employe idemploye) {
		this.idemploye = idemploye;
	}



	public LocalDateTime getDate() {
		return date;
	}



	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	







}