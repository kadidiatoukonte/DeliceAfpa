package fr.cda.delicesafpa.controller;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.AssignerRole;
import fr.cda.delicesafpa.beans.AssignerRoleId;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.ConcernerId;
import fr.cda.delicesafpa.beans.ConcernerPanArt;
import fr.cda.delicesafpa.beans.DeterminerArt;
import fr.cda.delicesafpa.beans.DeterminerArtId;
import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.beans.DeterminerCatId;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.EtreSup;
import fr.cda.delicesafpa.beans.EtresupId;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterCommandeId;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.beans.TraiterReservationId;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.AssignerRoleRepository;
import fr.cda.delicesafpa.dao.CategorieRepository;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.CommandeRepository;
import fr.cda.delicesafpa.dao.ConcernerPanArtRepository;
import fr.cda.delicesafpa.dao.DeterminerArtRepository;
import fr.cda.delicesafpa.dao.DeterminerCatRepository;
import fr.cda.delicesafpa.dao.EmployeRepository;
import fr.cda.delicesafpa.dao.EtreSupRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.dao.RoleEmployeRepository;
import fr.cda.delicesafpa.dao.StatusCommandeRepository;
import fr.cda.delicesafpa.dao.StatusReservationRepository;
import fr.cda.delicesafpa.dao.TraiterCommandeRepository;
import fr.cda.delicesafpa.dao.TraiterReservationRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.services.ArticleService;
import fr.cda.delicesafpa.util.AssignerRoleConverter;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	CommandeRepository commandeRepository;
	@Autowired
	ReservationRepository reservationRepository;
	@Autowired
	EmployeRepository employeRepository;
	@Autowired
	TraiterReservationRepository traiterReservationRepository;
	@Autowired
	StatusReservationRepository statusReservationRepository;
	@Autowired
	StatusCommandeRepository statusCommandeRepository;
	@Autowired
	TraiterCommandeRepository traiterCommandeRepository;
	@Autowired
	PanierRepository panierRepository;
	@Autowired
	RoleEmployeRepository roleEmployeRepository;
	@Autowired
	AssignerRoleRepository assignerRoleRepository;
	@Autowired
	DeterminerArtRepository determinerArtRepository;
	@Autowired
	DeterminerCatRepository determinerCatRepository;
	@Autowired
	CategorieRepository categorieRepository;
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	ArticleServiceI articleService;
	@Autowired
	ConcernerPanArtRepository concernerPanArtRepository;
	@Autowired
	EtreSupRepository etreSupRepository;
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/ciao", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	/*	logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);

		/* %%%%%%%%%%%%%%%%%%% */// CLIENT
	/*	Client client = clientRepository.findById(1).get();
		System.out.println(client);
		/*
		 * public Reservation(Date datereservation, int nbreplacereservation, Client
		 * idclient) {
		 */
		/* %%%%%%%%%%%%%%%%%%% */// RESERVATION
	//	LocalTime time = LocalTime.of(20, 30);
		/*
		 * n(int idreservation, Date datereservation, LocalTime horaire, int
		 * nbreplacereservation, Client idclient)
		 */
	/*Reservation newreservation = new Reservation(getDate("2010-10-10"), time, 5, client);
		reservationRepository.save(newreservation);
		int i = reservationRepository.findAll().size();
		Reservation reservation = reservationRepository.findById(i).get();
		System.out.println(reservation);

		/* %%%%%%%%%%%%%%%%%%% */// EMPLOYE
/*		Employe employe = employeRepository.findById(1).get();
		System.out.println(employe.getTraiterReservation().size());
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER RESERVATION
	/*	LocalDateTime now = LocalDateTime.now();
		TraiterReservationId idtres = new TraiterReservationId(1, 1, 1, now);
		TraiterReservation newTR = new TraiterReservation(idtres, reservation, employe,
				statusReservationRepository.findById(1).get());

		traiterReservationRepository.save(newTR);
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER RESERVATION

	/*	System.out.println(newTR);
		System.out.println(employe.getTraiterReservation());

		System.out.println(time);

		/* %%%%%%%%%%%%%%%%%%% */// COMMANDE
	/*	LocalTime timec = LocalTime.of(20, 30);
		Panier newPanier = new Panier();
		panierRepository.save(newPanier);
		Commande newcommande = new Commande(getDate("2010-10-10"), "adressecommande", timec, client, null, newPanier);
		commandeRepository.save(newcommande);
		int iC = commandeRepository.findAll().size();
		Commande commande = commandeRepository.findById(iC).get();
		System.out.println(commande);

		/* %%%%%%%%%%%%%%%%%%% */// TRAITER COMMANDE
		/*LocalDateTime nowC = LocalDateTime.now();
		TraiterCommandeId idtcom = new TraiterCommandeId(1, 1, 1, nowC);
		TraiterCommande newTRC = new TraiterCommande(idtcom, commande, employe,
				statusCommandeRepository.findById(1).get());

		traiterCommandeRepository.save(newTRC);
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER COMMANDE

	/*	System.out.println(newTRC);
		System.out.println(employe.getTraiterCommande());
		System.out.println(commande);
		Commande commandePrint = commandeRepository.findById(iC).get();
		System.out.println(commandePrint);
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER COMMANDE

	/*	Commande commandePrint2 = commandeRepository.findById(iC).get();
		System.out.println(newPanier);
		System.out.println(commandePrint2);
		/* %%%%%%%%%%%%%%%%%%% */// ASSIGNEROLE
		/*
		 * Employe( String nomemploye, String prenomemploye, String telemploye, String
		 * mailemploye, String passwordemploye, Boolean statusemploye)
		 */

	/*	Employe newEmp = new Employe("nomemploye", "prenomemploye", "telemploye", "String mailemploye",
				"String passwordemploye", false);

		employeRepository.save(newEmp);
		LocalDateTime nowCR = LocalDateTime.now();
		AssignerRoleId newAsRol = new AssignerRoleId(1, 2, 1, nowCR);

		Employe employeT = employeRepository.findById(1).get();
		Employe employeR = employeRepository.findById(2).get();
		RoleEmploye status = roleEmployeRepository.findById(1).get();

		AssignerRole newRole = new AssignerRole(newAsRol, employeT, employeR, status);
		assignerRoleRepository.save(newRole);
		Employe employeRPrint = employeRepository.findById(2).get();
		System.out.println(employeRPrint);
		System.out.println(employeRepository.findById(1).get().getIdemploye_assigner_role());

		/* %%%%%%%%%%%%%%%%%%% */// DETCATEGORIE
	/*	Categorie newCat = new Categorie("nomcategorie", "descriptioncategorie", true);
		categorieRepository.save(newCat);

		/* DeterminerCatId(int idcategorie, int idemploye, LocalDateTime date) */
		/*LocalDateTime nowCat = LocalDateTime.now();
		int iCat = categorieRepository.findAll().size();
		Categorie categorie = categorieRepository.findById(iCat).get();
		
		DeterminerCatId nowDetCatId = new DeterminerCatId(categorie.getIdcategorie(),1,nowCat);
		/*		public DeterminerCat(DeterminerCatId id, 
		 * Categorie categorie, 
		 * Employe employe) {
*/
		
/*		int cat =categorie.getIdcategorie(); 
		DeterminerCat nowDetCat = new DeterminerCat(nowDetCatId,categorie,employeRepository.findById(1).get());
		determinerCatRepository.save(nowDetCat);
		System.out.println(nowDetCat);
		System.out.println(categorieRepository.findById(cat).get());
		
		System.out.println(employeRepository.findById(1).get());
		
		/* %%%%%%%%%%%%%%%%%%% */// DETARTICLE
		/*Article(String nomarticle, float prixarticle, String descriptionarticle,
			boolean visibilitearticle, boolean offrespecialearticle, String descriptionoffresp)*/
	//	Article newArt = new Article("TESTTTT", (float) 10.50,"descriptionarticle",
	//			true, false,"descriptionoffresp",categorie);
		//articleRepository.save(newArt);
	/*	articleService.save(newArt);

		/* DeterminerCatId(int idcategorie, int idemploye, LocalDateTime date) */
		/*LocalDateTime nowCA = LocalDateTime.now();
		int iA = articleRepository.findAll().size();
		Article art = articleRepository.findById(iA).get();
		DeterminerArtId nowDetArtId = new DeterminerArtId(art.getIdarticle(),1,nowCA);

		
		int aid =art.getIdarticle(); 
		DeterminerArt nowDetArt = new DeterminerArt(nowDetArtId,art,employeRepository.findById(1).get());
		determinerArtRepository.save(nowDetArt);
		System.out.println(nowDetArt);
		System.out.println(articleRepository.findById(aid).get());
		
		System.out.println(employeRepository.findById(1).get());	
		/* %%%%%%%%%%%%%%%%%%% */// panier-article
		
	/*	ConcernerId conId = new ConcernerId(newPanier.getIdpanier(),art.getIdarticle());
		ConcernerPanArt newConPanArt = new ConcernerPanArt(conId,newPanier,art,20 );		
		concernerPanArtRepository.save(newConPanArt);
		System.out.println(newConPanArt);
/* %%%%%%%%%%%%%%%%%%% */// etresup
     /*   Article aaa= articleRepository.findById(1).get();
		EtresupId etruSupId = new EtresupId(aaa.getIdarticle(),art.getIdarticle());
		EtreSup etres = new EtreSup(etruSupId,aaa,art);
		etreSupRepository.save(etres);
System.out.println(etres);
System.out.println(articleRepository.findById(1).get());
System.out.println(articleRepository.findById(art.getIdarticle()).get());		
		
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
		

		/* %%%%%%%%%%%%%%%%%%% *///
		return "home";
	}

	/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% */
	public static java.sql.Date getDate(String date) {
		java.util.Date utilDate;
		java.sql.Date sqlDate = null;
		try {
			utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			sqlDate = new java.sql.Date(utilDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();

		}

		return sqlDate;

	}

}
