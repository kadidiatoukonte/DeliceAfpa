package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "determinerart")
public class DeterminerArt {

	@EmbeddedId
	private DeterminerArtId id;


	
    @ManyToOne
    @MapsId("idarticle")
    @JoinColumn(name = "idarticle")
    Article idarticle;

    @ManyToOne
    @MapsId("idemploye")
    @JoinColumn(name = "idemploye")
    Employe idemploye;

	public DeterminerArt() {
		super();
	}

	public DeterminerArt(DeterminerArtId id, Article idarticle, Employe idemploye) {
		super();
		this.id = id;
		this.idarticle = idarticle;
		this.idemploye = idemploye;
	}

	@Override
	public String toString() {
		return "DeterminerArt [id=" + id + ", idarticle=" + idarticle + ", idemploye=" + idemploye.getIdemploye() + "]";
	}

	
}

