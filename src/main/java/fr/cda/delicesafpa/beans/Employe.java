package fr.cda.delicesafpa.beans;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "employe")
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idemploye;
	
	@Column(name = "nomemploye")
	private String nomemploye;

	@Column(name = "prenomemploye")
	private String prenomemploye;
	
	@Column(name = "telemploye")
	private String telemploye;

	@Column(name = "mailemploye")
	private String mailemploye;
	
	/*@Column(name = "photoemploye")
	private ImageIO photoemploye;*/
	
	
	@Column(name = "passwordemploye")
	private String passwordemploye;
	
	@Column(name = "statusemploye")
	private Boolean statusemploye;
	
	
	@OneToMany
	(fetch = FetchType.EAGER , mappedBy = "idemploye")
	private Set<TraiterCommande> traiterCommande;

	@OneToMany
	(fetch = FetchType.EAGER , mappedBy = "idemploye")
	private Set<TraiterReservation> traiterReservation;
	
	@OneToMany( mappedBy="employe", fetch = FetchType.EAGER  )
    private Set<Commande> commandeliv ;

	@OneToMany(mappedBy = "idemploye_assigner_role",fetch = FetchType.EAGER)
	private Set<AssignerRole> idemploye_assigner_role;
	
	@OneToMany(mappedBy = "idemploye",fetch = FetchType.EAGER)
	private Set<AssignerRole> idemployer;
	
	
	@OneToMany( mappedBy="idemploye", fetch = FetchType.EAGER  )
    private Set<DeterminerCat> determinercat ;
	
	@OneToMany( mappedBy="idemploye", fetch = FetchType.EAGER   )
    private Set<DeterminerArt> determinerart ;
	
	public Employe() {
		// TODO Auto-generated constructor stub
	}
	

	
	public Employe( String nomemploye, String prenomemploye, String telemploye, String mailemploye,
		String passwordemploye, Boolean statusemploye) {
	super();
	this.nomemploye = nomemploye;
	this.prenomemploye = prenomemploye;
	this.telemploye = telemploye;
	this.mailemploye = mailemploye;
	this.passwordemploye = passwordemploye;
	this.statusemploye = statusemploye;
}



	public int getIdemploye() {
		return idemploye;
	}

	public void setIdemploye(int idemploye) {
		this.idemploye = idemploye;
	}

	public String getNomemploye() {
		return nomemploye;
	}

	public void setNomemploye(String nomemploye) {
		this.nomemploye = nomemploye;
	}

	public String getPrenomemploye() {
		return prenomemploye;
	}

	public void setPrenomemploye(String prenomemploye) {
		this.prenomemploye = prenomemploye;
	}

	public String getTelemploye() {
		return telemploye;
	}

	public void setTelemploye(String telemploye) {
		this.telemploye = telemploye;
	}

	public String getMailemploye() {
		return mailemploye;
	}

	public void setMailemploye(String mailemploye) {
		this.mailemploye = mailemploye;
	}

	/*public byte[] getPhotoemploye() {
		return photoemploye;
	}

	public void setPhotoemploye(byte[] photoemploye) {
		this.photoemploye = photoemploye;
	}*/

	public String getPasswordemploye() {
		return passwordemploye;
	}

	public Set<TraiterCommande> getTraiterCommande() {
		return traiterCommande;
	}



	public void setTraiterCommande(Set<TraiterCommande> traiterCommande) {
		this.traiterCommande = traiterCommande;
	}



	


	public Set<AssignerRole> getIdemploye_assigner_role() {
		return idemploye_assigner_role;
	}



	public void setIdemploye_assigner_role(Set<AssignerRole> idemploye_assigner_role) {
		this.idemploye_assigner_role = idemploye_assigner_role;
	}



	public Set<AssignerRole> getIdemployer() {
		return idemployer;
	}



	public void setIdemployer(Set<AssignerRole> idemployer) {
		this.idemployer = idemployer;
	}



	public void setPasswordemploye(String passwordemploye) {
		this.passwordemploye = passwordemploye;
	}

	public Boolean getStatusemploye() {
		return statusemploye;	}

	public void setStatusemploye(Boolean statusemploye) {
		this.statusemploye = statusemploye;
	}

/*
	@JsonIgnore
	public Set<TraiterReservation> getTraiterReservation() {
	return traiterReservation;
	}
*/
	public Set<TraiterReservation> getTraiterReservation() {
		return traiterReservation;
	}



	public void setTraiterReservation(Set<TraiterReservation> traiterReservation) {
		this.traiterReservation = traiterReservation;
	}




	public Set<Commande> getCommandeliv() {
		return commandeliv;
	}



	public void setCommandeliv(Set<Commande> commandeliv) {
		this.commandeliv = commandeliv;
	}



	public Set<DeterminerCat> getDeterminercat() {
		return determinercat;
	}



	public void setDeterminercat(Set<DeterminerCat> determinercat) {
		this.determinercat = determinercat;
	}



	public Set<DeterminerArt> getDeterminerart() {
		return determinerart;
	}



	public void setDeterminerart(Set<DeterminerArt> determinerart) {
		this.determinerart = determinerart;
	}



	@Override
	public String toString() {
		return "Employe [idemploye=" + idemploye + ", nomemploye=" + nomemploye + ", prenomemploye=" + prenomemploye
				+ ", telemploye=" + telemploye + ", mailemploye=" + mailemploye + ", passwordemploye=" + passwordemploye
				+ ", statusemploye=" + statusemploye + ", traiterReservation=" + traiterReservation.size()+"determinercat"+determinercat.size() 
				+"determinerart"+determinerart.size()+"]";
	}


}
