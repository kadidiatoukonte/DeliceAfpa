package fr.cda.delicesafpa.beans;
import java.awt.Image;
import java.math.BigInteger;
import java.math.BigInteger;
import java.sql.Date;
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
@Table(name = "client")
public class Client  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idclient;
	
	@Column(name = "nomclient")
	private String nomclient;

	@Column(name = "prenomclient")
	private String prenomclient;
	
	@Column(name = "datebirclient")
	private Date datebirclient;

	@Column(name = "paysclient")
	private String paysclient;
	
	@Column(name = "adresseclient")
	private String adresseclient;

	@Column(name = "complementadrclient")
	private String complementadrclient;
	
	@Column(name = "cpclient")
	private String cpclient;

	@Column(name = "villeclient")
	private String villeclient;
	
	@Column(name = "telclient")
	private Date telclient;

	@Column(name = "mailclient")
	private String mailclient;
	
	@Column(name = "passwordclient")
	private String passwordclient;
   
	
    @OneToMany(fetch = FetchType.EAGER) @JoinColumn(name="idclient")
    private Set<Commande> commandes ;
   
    @OneToMany(fetch = FetchType.EAGER) @JoinColumn(name="idclient")
    private Set<Reservation> reservations ;
	
	/*
	@Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] photoclient;
	
	/*   @Lob
    @Column(name="PROFILE_PIC")
    private byte[] profilePic;*/
	
	
	
	
	
	
	
	
	public int getIdclient() {
		return idclient;
	}
	
	
	
	public Client(
			int idclient, String nomclient, String prenomclient,
			Date datebirclient, String paysclient,
			String adresseclient, String complementadrclient, 
			String cpclient, String villeclient, Date telclient,
			String mailclient, String passwordclient) {
		super();
		this.idclient = idclient;
		this.nomclient = nomclient;
		this.prenomclient = prenomclient;
		this.datebirclient = datebirclient;
		this.paysclient = paysclient;
		this.adresseclient = adresseclient;
		this.complementadrclient = complementadrclient;
		this.cpclient = cpclient;
		this.villeclient = villeclient;
		this.telclient = telclient;
		this.mailclient = mailclient;
		this.passwordclient = passwordclient;
	}
	
	
	
	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}
	public String getNomclient() {
		return nomclient;
	}
	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}
	public String getPrenomclient() {
		return prenomclient;
	}
	public void setPrenomclient(String prenomclient) {
		this.prenomclient = prenomclient;
	}
	public Date getDatebirclient() {
		return datebirclient;
	}
	public void setDatebirclient(Date datebirclient) {
		this.datebirclient = datebirclient;
	}
	public String getPaysclient() {
		return paysclient;
	}
	public void setPaysclient(String paysclient) {
		this.paysclient = paysclient;
	}
	public String getAdresseclient() {
		return adresseclient;
	}
	public void setAdresseclient(String adresseclient) {
		this.adresseclient = adresseclient;
	}
	public String getComplementadrclient() {
		return complementadrclient;
	}
	public void setComplementadrclient(String complementadrclient) {
		this.complementadrclient = complementadrclient;
	}
	public String getCpclient() {
		return cpclient;
	}
	public void setCpclient(String cpclient) {
		this.cpclient = cpclient;
	}
	public String getVilleclient() {
		return villeclient;
	}
	public void setVilleclient(String villeclient) {
		this.villeclient = villeclient;
	}
	public Date getTelclient() {
		return telclient;
	}
	public void setTelclient(Date telclient) {
		this.telclient = telclient;
	}
	public String getMailclient() {
		return mailclient;
	}
	public void setMailclient(String mailclient) {
		this.mailclient = mailclient;
	}
	public String getPasswordclient() {
		return passwordclient;
	}
	public void setPasswordclient(String passwordclient) {
		this.passwordclient = passwordclient;
	}
/*	public byte[] getPhotoclient() {
		return photoclient;
	}
	public void setPhotoclient(byte[] photoclient) {
		this.photoclient = photoclient;
	}*/
	
	
}
