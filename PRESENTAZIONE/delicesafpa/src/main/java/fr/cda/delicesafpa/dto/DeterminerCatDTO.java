package fr.cda.delicesafpa.dto;



import java.time.LocalDateTime;



import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Employe;

public class DeterminerCatDTO {


	    Categorie idcategorie;

	    Employe idemploye;

		private LocalDateTime date;
	    
		public DeterminerCatDTO() {
			super();
		}

		public DeterminerCatDTO(Categorie idcategorie, Employe idemploye, LocalDateTime date) {
			super();
			this.idcategorie = idcategorie;
			this.idemploye = idemploye;
			this.date = date;
		}

		public Categorie getIdcategorie() {
			return idcategorie;
		}

		public void setIdcategorie(Categorie idcategorie) {
			this.idcategorie = idcategorie;
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

		@Override
		public String toString() {
			return "DeterminerCatDTO [idcategorie=" + idcategorie + ", idemploye=" + idemploye + ", date=" + date + "]";
		}


	






}