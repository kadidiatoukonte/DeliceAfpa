package fr.cda.delicesafpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "determinercat")
public class DeterminerCat implements java.io.Serializable{

	@EmbeddedId
	private DeterminerCatId id;

	
	    @ManyToOne
	    @MapsId("idcategorie")
	    @JoinColumn(name = "idcategorie")
	    Categorie idcategorie;
	
	
	    @ManyToOne
	    @MapsId("idemploye")
	    @JoinColumn(name = "idemploye")
	    Employe idemploye;

		public DeterminerCat() {
			super();
		}

		
		
		public DeterminerCat(DeterminerCatId id, Categorie categorie, Employe employe) {
			super();
			this.id = id;
			this.idcategorie = categorie;
			this.idemploye = employe;
		}

		public DeterminerCat(DeterminerCatId id) {
			super();
			this.id = id;
			
		}


		public DeterminerCatId getId() {
			return id;
		}

		public void setId(DeterminerCatId id) {
			this.id = id;
		}

		public Categorie getCategorie() {
			return idcategorie;
		}

		public void setCategorie(Categorie categorie) {
			this.idcategorie = categorie;
		}

		public Employe getEmploye() {
			return idemploye;
		}

		public void setEmploye(Employe employe) {
			this.idemploye = employe;
		}



		@Override
		public String toString() {
			return "DeterminerCat [ "+id.getDate()+", categorie=" + idcategorie + ", employe=" + idemploye.getNomemploye() + "]";
		}
	
	
	


}
