package fr.cda.delicesafpa.beans;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
/*CREATE TABLE delicesafpa.concerner(
	idpanier          INT  NOT NULL ,
	idarticle         INT  NOT NULL ,
	quantitearticle   INT  NOT NULL  ,
	PRIMARY KEY (idpanier,idarticle)
);
ALTER TABLE delicesafpa.concerner
    OWNER to gestionnairefr;*/


@Entity @Table( name="concerner" )
public class ConcernerPanArt {

	
	@EmbeddedId
	private ConcernerId id;
	
    @ManyToOne
    @MapsId("idpanier")
    @JoinColumn(name = "idpanier")
    Panier idpanier;

    @ManyToOne
    @MapsId("idarticle")
    @JoinColumn(name = "idarticle")
    Article idarticle;
    
	@Column(name = "quantitearticle")
	private int quantitearticle;


	public ConcernerPanArt() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ConcernerPanArt(ConcernerId id, Panier idpanier, Article idarticle, int quantitearticle) {
		super();
		this.id = id;
		this.idpanier = idpanier;
		this.idarticle = idarticle;
		this.quantitearticle = quantitearticle;
	}


	public ConcernerId getId() {
		return id;
	}


	public void setId(ConcernerId id) {
		this.id = id;
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
		return "ConcernerPanArt [id=" + id + ", idpanier=" + idpanier + ", idarticle=" + idarticle
				+ ", quantitearticle=" + quantitearticle + "]";
	}


	
	
}
