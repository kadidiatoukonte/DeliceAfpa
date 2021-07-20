package fr.cda.delicesafpa.beans;
import java.awt.Image;
import java.math.BigInteger;
import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "article")
public class Article {
/*CREATE TABLE delicesafpa.article(
	idarticle              SERIAL NOT NULL ,
	nomarticle             VARCHAR (50) NOT NULL ,
	prixarticle            FLOAT  NOT NULL ,
	descriptionarticle     VARCHAR (150) NOT NULL ,
	visibilitearticle      BOOL  NOT NULL ,
	offreSpecialearticle   BOOL  NOT NULL ,
	descriptionoffresp     VARCHAR (150)  ,
	photoarticle           BYTEA  NOT NULL ,
	idcategorie            INT    ,
	PRIMARY KEY (idarticle)
);*/
@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idarticle;
	
	@Column(name = "nomarticle")
	private String nomarticle;

	@Column(name = "prixarticle")
	private float prixarticle;
	
	@Column(name = "descriptionarticle")
	private String descriptionarticle;

	@Column(name = "visibilitearticle")
	private boolean visibilitearticle;

	@Column(name = "offrespecialearticle")
	private boolean offrespecialearticle;
	
	@Column(name = "descriptionoffresp")
	private String descriptionoffresp;
	
	@OneToMany( mappedBy="idarticle", fetch = FetchType.EAGER  )
    private List<DeterminerArt> determinerart = new ArrayList<>();
	
	@ManyToOne @JoinColumn(name="idcategorie", nullable=true)
    private Categorie categorie ;
	
	@OneToMany(mappedBy = "idarticle_etreSup",fetch = FetchType.EAGER)
	Set<EtreSup> idarticle_etreSup;
	
	@OneToMany(mappedBy = "idarticle",fetch = FetchType.EAGER)
	Set<EtreSup> idarticleS;
	
	@OneToMany
	(fetch = FetchType.EAGER , mappedBy = "idarticle")
	private Set<ConcernerPanArt> concernerPanArt;
	
	
	public Article() {};

	public Article(String nomarticle, float prixarticle, String descriptionarticle,
			boolean visibilitearticle, boolean offrespecialearticle, String descriptionoffresp,Categorie categorie) {
		super();
		this.nomarticle = nomarticle;
		this.prixarticle = prixarticle;
		this.descriptionarticle = descriptionarticle;
		this.visibilitearticle = visibilitearticle;
		this.offrespecialearticle = offrespecialearticle;
		this.descriptionoffresp = descriptionoffresp;
	    this.categorie = categorie;
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

	public List<DeterminerArt> getDeterminerart() {
		return determinerart;
	}

	public void setDeterminerart(List<DeterminerArt> determinerart) {
		this.determinerart = determinerart;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Set<EtreSup> getIdarticle_etreSup() {
		return idarticle_etreSup;
	}

	public void setIdarticle_etreSup(Set<EtreSup> idarticle_etreSup) {
		this.idarticle_etreSup = idarticle_etreSup;
	}

	public Set<EtreSup> getIdarticleS() {
		return idarticleS;
	}

	public void setIdarticleS(Set<EtreSup> idarticleS) {
		this.idarticleS = idarticleS;
	}
	
	
	
	
public Set<ConcernerPanArt> getConcernerPanArt() {
		return concernerPanArt;
	}

	public void setConcernerPanArt(Set<ConcernerPanArt> concernerPanArt) {
		this.concernerPanArt = concernerPanArt;
	}

	/*java.lang.StackOverflowError*/
	@Override
	public String toString() {
		return "nomarticle=" + nomarticle + ", prixarticle=" + prixarticle
				+ ", descriptionarticle=" + descriptionarticle + ", visibilitearticle=" + visibilitearticle
				+ ", offrespecialearticle=" + offrespecialearticle + ", descriptionoffresp=" + descriptionoffresp
				+ ", determinerart=" + determinerart.size() + ", categorie=" + categorie + ", idarticle_etreSup="
				+ idarticle_etreSup.size() + ", idarticleS=" + idarticleS.size() + "]";
	}


	
	

	
	
}
