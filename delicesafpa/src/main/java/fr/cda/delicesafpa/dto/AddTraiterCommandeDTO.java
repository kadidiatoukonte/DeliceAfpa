package fr.cda.delicesafpa.dto;
import java.time.LocalDateTime;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.StatusCommande;
import lombok.Data;



@Data
public class AddTraiterCommandeDTO {

	@Override
	public String toString() {
		return "AddTraiterCommandeDTO [idcommande=" + idcommande + ", idemploye=" + idemploye + ", idstatus=" + idstatus
				+ "]";
	}




	private String idcommande;

	private String idemploye;	
    
 
    private String idstatus;

	


	public AddTraiterCommandeDTO() {
		super();
	}




	public AddTraiterCommandeDTO(String idcommande, String idemploye, String idstatus) {
		super();
		this.idcommande = idcommande;
		this.idemploye = idemploye;
		this.idstatus = idstatus;
	}




	public String getIdcommande() {
		return idcommande;
	}




	public void setIdcommande(String idcommande) {
		this.idcommande = idcommande;
	}




	public String getIdemploye() {
		return idemploye;
	}




	public void setIdemploye(String idemploye) {
		this.idemploye = idemploye;
	}




	public String getIdstatus() {
		return idstatus;
	}




	public void setIdstatus(String idstatus) {
		this.idstatus = idstatus;
	}


	
	
	
}
