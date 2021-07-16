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
import fr.cda.delicesafpa.formulaire.VerifArticle;
import fr.cda.delicesafpa.formulaire.VerifCategorie;
import fr.cda.delicesafpa.formulaire.VerifClient;
import fr.cda.delicesafpa.formulaire.VerifCommande;
import fr.cda.delicesafpa.formulaire.VerifEmploye;
import fr.cda.delicesafpa.formulaire.VerifEmporter;
import fr.cda.delicesafpa.formulaire.VerifReservation;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.services.ArticleService;

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
	 * @throws ParseException 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {//throws ParseException {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		
		/* %%%%%%%%%%%%%%%%%%%%%% VerifCommande %%%%%%%%%%%%%%%%%%%%%%%%% */
		/*
		 //tout les champs bien remplis avec les bons types 
		System.out.println("1er test VerifCommande il doit être true");//ici la vérification marche
		System.out.println(VerifCommande.verifcommande( "1","1" ,"48 rue d'alger 59100 roubaix","2021-07-07"));
		*/
		
		/*
		//ici idcommande est vide
		System.out.println("2eme test VerifCommande il doit être false");//ici la vérification marche
		System.out.println(VerifCommande.verifcommande( "","1", "48 rue d'alger 59100 roubaix","2021-07-07"));
		*/
		
		/*
		//ici idcommande de type caractère
		System.out.println("3eme test VerifCommande il doit être false");//ici la vérification marche
		System.out.println(VerifCommande.verifcommande( "dr","1", "48 rue d'alger 59100 roubaix","2021-07-07"));
		*/
		
		/*
		//ici idclient est vide
		System.out.println("3eme test VerifCommande il doit être false");//ici la vérification marche
		System.out.println(VerifCommande.verifcommande( "1","", "48 rue d'alger 59100 roubaix","2021-07-07"));
		*/
		
		/*
		//ici idcommande est vide
		System.out.println("4eme test VerifCommande il doit être false");//ici la vérification marche
		System.out.println(VerifCommande.verifcommande( "1","rt", "48 rue d'alger 59100 roubaix","2021-07-07"));
		*/
		
		/*
		//ici adresse est vide
		System.out.println("3eme test VerifCommande il doit être false");//ici la vérification marche
		System.out.println(VerifCommande.verifcommande( "1","1", "","2021-07-07"));
		*/
		
		/*
		//ici date de la commande est vide
		System.out.println("3eme test VerifCommande il doit être false");//ici la vérification marche
		System.out.println(VerifCommande.verifcommande( "","1", "48 rue d'alger 59100 roubaix",""));
		*/
		
		/* %%%%%%%%%%%%%%%%%%%%%%%%  verifarticle  %%%%%%%%%%%%%%%%%%%%%%% */
		/*
		 //tout les champs bien remplis avec les bons types 
		System.out.println("1er test vérifarticle il doit être true");
		System.out.println(VerifArticle.verifArticle( "azerty", "12","azssdgdfg","true","true","1"));//ici la vérification marche
		*/
		
		/*
		 // le champs prix est vide
		System.out.println("2eme test vérifarticle il doit être false");
		System.out.println(VerifArticle.verifArticle( "azerty", "","azssdgdfg","true","true","1"));//ici la vérification marche
		*/
		
		/*
		//le champs prix ne corresponds pas au type numéric
		System.out.println("3eme test vérifarticle il doit être false");
		System.out.println(VerifArticle.verifArticle( "azerty", "ert","azssdgdfg","true","true","1"));//ici la vérification marche
		*/
		
		/*
		//le chmaps description est vide
		System.out.println("4eme test vérifarticle il doit être false");
		System.out.println(VerifArticle.verifArticle( "azerty", "12","","true","true","1"));//ici la vérification marche
		*/
				
		/*
		//le champs visibilité article est vide
		System.out.println("5eme test vérifarticle il doit être false");
		System.out.println(VerifArticle.verifArticle( "azerty", "12","azssdgdfg","","true","1"));//ici la vérification marche
		*/
		
		/*
		//le champs visibilité article n'est pas un boolean
		System.out.println("6eme test vérifarticle il doit être false");//ici la vérification marche
		System.out.println(VerifArticle.verifArticle( "azerty", "12","azssdgdfg","123","true","1"));//ici la vérification ne marche pas peut être mal parser ou bien c'est le catch
		*/
		
		/*
		//le champs offre spécial article est vide
		System.out.println("7eme test vérifarticle il doit être false");
		System.out.println(VerifArticle.verifArticle( "azerty", "12","azssdgdfg","true","","1"));//ici la vérification marche
		*/
		
		/*
		//le champs offre spécial article n'est pas un boolean
		System.out.println("8eme test vérifarticle il doit être false");//ici la vérification marche
		System.out.println(VerifArticle.verifArticle( "azerty", "12","azssdgdfg","true","cvfde","1"));//ici la vérification ne marche pas peut être mal parser ou bien c'est le catch
		*/
		
		/*
		//le champs catégorie article est vide
		System.out.println("8eme test vérifarticle il doit être false");
		System.out.println(VerifArticle.verifArticle( "azerty", "12","azssdgdfg","true","false",""));//ici la vérification marche
		*/
		
		/*
		//le champs catégorie article n'est pas un chiffre
		System.out.println("8eme test vérifarticle il doit être false");
		System.out.println(VerifArticle.verifArticle( "azerty", "12","azssdgdfg","true","false","toto"));
		*/		
		
		/* %%%%%%%%%%%%%%%%%%%%%%%%  VerifClient  %%%%%%%%%%%%%%%%%%%%%%% */
		/*
		//tout les champs remplis avec de bons types
		System.out.println("0eme test verifClient il doit être true"); //ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
				"2021-07-07","france","1 rue de la gare ","59100" ,"paris","06-06-06-06-06","azerty@yahoo.fr","12azertY#"));
		*/
		
		/*
		//champs mot de passe vide
		System.out.println("1er test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
				"2021-07-07","france","1 rue de la gare ","59100" ,"paris","06-06-06-06-06","azerty@yahoo.fr",""));
		*/
		
		/*
		//mot de passe qui ne respècte pas minimum 8 caractères mélangés entre maj ,min ,chiffres ,caractère spéciales
		System.out.println("2er test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
				"2021-07-07","france","1 rue de la gare ","59100" ,"paris","06-06-06-06-06","azerty@yahoo.fr","azeTY12"));
		*/
		
		/*
		//champs mail est vide
		System.out.println("3er test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
				"2021-07-07","france","1 rue de la gare ","59100" ,"paris","06-06-06-06-06","","azeTY12+"));
		*/
		
		/*
		//champs mail ne respecte pas le format
		System.out.println("4er test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
				"2021-07-07","france","1 rue de la gare ","59100" ,"paris","06-06-06-06-06","azertyyahoofr","azeTY12+"));
		*/
		
		/*
		//champs numéro tél est vide
		System.out.println("5er test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
				"2021-07-07","france","1 rue de la gare ","59100" ,"paris","","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs numéro tél ne respécte pas le format et type
		System.out.println("6er test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
		"2021-07-07","france","1 rue de la gare ","59100" ,"paris","aerty","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs ville client est vide
		System.out.println("7er test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
		"2021-07-07","france","1 rue de la gare ","59100" ,"","06-06-06-06-06","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs code postal client est vide
		System.out.println("8eme test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
		"2021-07-07","france","1 rue de la gare ","" ,"paris","06-06-06-06-06","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs code postal ne respécte pas le format
		System.out.println("9eme test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
		"2021-07-07","france","1 rue de la gare ","12457823" ,"paris","06-06-06-06-06","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs code postal ne respécte pas le format j'ai mis des lettres
		System.out.println("10eme test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
		"2021-07-07","france","1 rue de la gare ","ardjou" ,"paris","06-06-06-06-06","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs adresse vide
		System.out.println("11eme test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
		"2021-07-07","france","","59170" ,"paris","06-06-06-06-06","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs pays vide
		System.out.println("12eme test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
		"2021-07-07","","1 rue de la gare","59170" ,"paris","06-06-06-06-06","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs date de naissance vide
		System.out.println("13eme test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
		"","france","1 rue de la gare","59170" ,"paris","06-06-06-06-06","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs date de naissance n'est pas de type date
		System.out.println("13eme test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "djouher",
		"azerty","france","1 rue de la gare","59170" ,"paris","06-06-06-06-06","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs prénom est vide
		System.out.println("14eme test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("boub", "",
		"2021-07-07","france","1 rue de la gare","59170" ,"paris","06-06-06-06-06","azerty@yahoo.fr","azeTY12+"));
		*/
		
		/*
		//champs nom est vide
		System.out.println("15eme test verifClient il doit être false");//ici la vérification marche
		System.out.println(VerifClient.verifClient("", "djouher",
		"2021-07-07","france","1 rue de la gare","59170" ,"paris","06-06-06-06-06","azerty@yahoo.fr","azeTY12+"));
		*/		
		
		
		/* %%%%%%%%%%%%%%%%%%%%%% VerifCategorie %%%%%%%%%%%%%%%%%%%%%%%%% */
		
		/*
		//ici tout les champs sont rempli avec les bons types
		System.out.println("1er test VerifCategorie il doit être true");//ici la vérification marche
		System.out.println(VerifCategorie.verifCategorie( "plat", "frite et salade avec tomate et concombre mais olives betraves fait maison ","true"));//la vérification catégorie marche
		*/
		
		/*
		// champs nom catégorie est vide
		System.out.println("2eme test VerifCategorie il doit être false");//ici la vérification marche
		System.out.println(VerifCategorie.verifCategorie( "", "frite et salade avec tomate et concombre mais olives betraves fait maison","true"));
		*/
		
		/*
		// champs description catégorie est vide
		System.out.println("3eme test VerifCategorie il doit être false");//ici la vérification marche
		System.out.println(VerifCategorie.verifCategorie( "plat", "","true"));
		*/
		
		/*
		// champs visibilité catégorie est vide
		System.out.println("4eme test VerifCategorie il doit être false");//ici la vérification marche
		System.out.println(VerifCategorie.verifCategorie( "plat", "frite et salade avec tomate et concombre mais olives betraves fait maison ",""));
		*/
		
		/*
		// champs visibilité catégorie n'est pas boolean
		System.out.println("4eme test VerifCategorie il doit être false");//ici la vérification marche
		System.out.println(VerifCategorie.verifCategorie( "plat", "frite et salade avec tomate et concombre mais olives betraves fait maison ","a14"));
		*/
		/* %%%%%%%%%%%%%%%%%%%%%% VerifReservation  tout les cas %%%%%%%%%%%%%%%%%%%%%%%%% */
		
		/*
		////ici tout les champs sont rempli avec les bons types
		System.out.println("1er test VerifReservation il doit être true");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "2021-07-07", "17","12","10","1"));
		*/
		
		/*
		//date reservation vide
		System.out.println("2eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "", "17","12","10","1"));
		*/
		
		/*
		//date de réservation different de type date
		System.out.println("3eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "azerty7", "17","12","10","1"));
		*/
		
		/*
		//heure reservation vide
		System.out.println("4eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "2021-07-07", "","12","10","1"));
		*/
		
		/*
		//heure reservation n'est pas un chiffre
		System.out.println("5eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "2021-07-07", "ret","12","10","1"));
		*/
		
		/*
		//heure reservation vide
		System.out.println("5eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "2021-07-07", "17","","10","1"));
		*/
		
		/*
		//heure reservation n'est pas un chiffre
		System.out.println("6eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "2021-07-07", "17","tre","10","1"));
		*/		
		
		/*
		//nombre de places reservation vide
		System.out.println("5eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "2021-07-07", "17","12","","1"));
		*/
		
		/*
		//nombre de places reservation n'est pas un chiffre
		System.out.println("6eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "2021-07-07", "17","12","tre",""));
		*/
		
		/*
		//le champs id client vide
		System.out.println("7eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "fhgfb", "17","12","10",""));
		*/
		
		/*
		//le champs id client n'est pas un chiffre
		System.out.println("8eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifReservation.verifReservation( "2021-07-07", "fghf","12","10","tre"));
		 */
	/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%vérif emporter %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%   */
	
		/*
		//tout les champs sont bien renseignés
		System.out.println("0eme test VerifReservation il doit être true");//ici la vérification marche
		System.out.println(VerifEmporter.verifEmporter( "1","2021-07-07","12","10"));
		
		//le champs idcommande est vide
		System.out.println("1er test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifEmporter.verifEmporter( "","2021-07-07","12","10"));
		
		//le champs idcommande n'est pas un chiffre
		System.out.println("2eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifEmporter.verifEmporter( "tre","2021-07-07","12","10"));
		
		//le champs date commande est vide
		System.out.println("3eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifEmporter.verifEmporter( "1","","12","10"));
		
		//le champs date commande n'est pas de type date
		System.out.println("4eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifEmporter.verifEmporter( "1","tre","12","10"));
		
		//le champs heure commande est vide
		System.out.println("5eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifEmporter.verifEmporter( "1","2021-07-07","","10"));
		
		//le champs heure commande n'est pas de type heure
		System.out.println("6eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifEmporter.verifEmporter( "1","2021-07-07","tre","10"));
				
		//le champs minutes commande est vide
		System.out.println("7eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifEmporter.verifEmporter( "1","2021-07-07","10",""));
						
		//le champs minutes commande n'est pas de type heure
		System.out.println("8eme test VerifReservation il doit être false");//ici la vérification marche
		System.out.println(VerifEmporter.verifEmporter( "1","2021-07-07","10","tre"));
		*/
		
		/*%%%%%%%%%%%%%%%%%%%%%%%%% vérif employe  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
		
		/*
		//tout les champs remplis avec de bons types
		System.out.println("0eme testVerifEmploye il doit être true"); //ici la vérification marche
		System.out.println(VerifEmploye.verifEmploye("boub", "djouher","12azertY#","06-06-06-06-06","azerty@yahoo.fr"));
				
		
		//champs nom vide
		System.out.println("1er testVerifEmploye il doit être false"); //ici la vérification marche
		System.out.println(VerifEmploye.verifEmploye("", "djouher","12azertY#","06-06-06-06-06","azerty@yahoo.fr"));
	
		
		
		//champs prénom vide
		System.out.println("1er testVerifEmploye il doit être false"); //ici la vérification marche
		System.out.println(VerifEmploye.verifEmploye("boubeker", "","12azertY#","06-06-06-06-06","azerty@yahoo.fr"));
		
		
		
		//champs mot de passe vide
		System.out.println("2eme testVerifEmploye il doit être false"); //ici la vérification marche
		System.out.println(VerifEmploye.verifEmploye("boubeker", "djouher","","06-06-06-06-06","azerty@yahoo.fr"));
		
		
		
		//champs mot de passe ne respecte pas le type minimum 8 caractères avec un mélange miniscul,majuscul,chiffre,caractère spécial
		System.out.println("3eme testVerifEmploye il doit être false"); //ici la vérification marche
		System.out.println(VerifEmploye.verifEmploye("boubeker", "djouher","azert12y","06-06-06-06-06","azerty@yahoo.fr"));
		
		
		//champs téléphone vide
		System.out.println("4eme testVerifEmploye il doit être false"); //ici la vérification marche
		System.out.println(VerifEmploye.verifEmploye("boubeker", "djouher","12azertY#","","azerty@yahoo.fr"));
	
		
		
		//champs téléphone ne respécte pas le format et le type
		System.out.println("5eme testVerifEmploye il doit être false"); //ici la vérification marche
		System.out.println(VerifEmploye.verifEmploye("boubeker", "djouher","12azertY#","12-tre","azerty@yahoo.fr"));
	
		
		
		//champs mail vide
		System.out.println("6eme testVerifEmploye il doit être false"); //ici la vérification marche
		System.out.println(VerifEmploye.verifEmploye("boubeker", "djouher","12azertY#","06-06-06-06-06",""));
	
	
		//champs mail ne respécte pas le type et le format
		System.out.println("7eme testVerifEmploye il doit être false"); //ici la vérification marche
		System.out.println(VerifEmploye.verifEmploye("boubeker", "djouher","12azertY#","06-06-06-06-06","azertyyahoo.fr"));
		
		*/
		
		/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
	return "home";
	}

}
