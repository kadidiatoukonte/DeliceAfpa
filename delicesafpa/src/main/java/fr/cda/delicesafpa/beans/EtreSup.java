package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
/*CREATE TABLE delicesafpa.etresup(
	idarticle           INT  NOT NULL ,
	idarticle_etreSup   INT  NOT NULL  ,
	PRIMARY KEY (idarticle,idarticle_etresup)
);
*/
@Entity @Table( name="etresup")
public class EtreSup {

	
	@EmbeddedId
	private EtresupId id;

	
    @ManyToOne
    @MapsId("idarticle")
    @JoinColumn(name = "idarticle")
    Article idarticle;

    @ManyToOne
    @MapsId("idarticle_etreSup")
    @JoinColumn(name = "idarticle_etreSup")
    Article idarticle_etreSup;
	
	public EtreSup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EtreSup(EtresupId id, Article idarticle, Article idarticle_etreSup) {
		super();
		this.id = id;
		this.idarticle = idarticle;
		this.idarticle_etreSup = idarticle_etreSup;
	}

	public EtresupId getId() {
		return id;
	}

	public void setId(EtresupId id) {
		this.id = id;
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
		return "EtreSup [id=" + id + ", idarticle=" + idarticle + ", idarticle_etreSup=" + idarticle_etreSup + "]";
	}

	
	
}
