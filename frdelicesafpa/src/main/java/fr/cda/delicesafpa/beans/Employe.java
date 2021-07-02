package fr.cda.delicesafpa.beans;

import java.sql.Date;

import javax.imageio.ImageIO;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
	
	@Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] photoemploye;
	
	@Column(name = "passwordemploye")
	private String passwordemploye;
	
	@Column(name = "statusemploye")
	private Boolean statusemploye;
	
	public Employe() {
		// TODO Auto-generated constructor stub
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

	public byte[] getPhotoemploye() {
		return photoemploye;
	}

	public void setPhotoemploye(byte[] photoemploye) {
		this.photoemploye = photoemploye;
	}

	public String getPasswordemploye() {
		return passwordemploye;
	}

	public void setPasswordemploye(String passwordemploye) {
		this.passwordemploye = passwordemploye;
	}

	public Boolean getStatusemploye() {
		return statusemploye;
	}

	public void setStatusemploye(Boolean statusemploye) {
		this.statusemploye = statusemploye;
	}

	
}
