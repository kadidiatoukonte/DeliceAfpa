package fr.cda.delicesafpa.dto;
import java.time.LocalDateTime;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.StatusCommande;
import lombok.Data;



@Data
public class TraiterCommandeDTO {

	private Commande idcommande;

	private Employe idemploye;	
    
 
    private StatusCommande idstatus;

	
	private LocalDateTime date;


	public TraiterCommandeDTO() {
		super();
	}


	public TraiterCommandeDTO(Commande idcommande, Employe idemploye, StatusCommande idstatus, LocalDateTime date) {
		super();
		this.idcommande = idcommande;
		this.idemploye = idemploye;
		this.idstatus = idstatus;
		this.date = date;
	}


	public Commande getIdcommande() {
		return idcommande;
	}


	public void setIdcommande(Commande idcommande) {
		this.idcommande = idcommande;
	}


	public Employe getIdemploye() {
		return idemploye;
	}


	public void setIdemploye(Employe idemploye) {
		this.idemploye = idemploye;
	}


	public StatusCommande getIdstatus() {
		return idstatus;
	}


	public void setIdstatus(StatusCommande idstatus) {
		this.idstatus = idstatus;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "TraiterCommandeDTO [idcommande=" + idcommande + ", idemploye=" + idemploye + ", idstatus=" + idstatus
				+ ", date=" + date + "]";
	}
	
	

	
	
	
}
