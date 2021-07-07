package fr.cda.delicesafpa.controller;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
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
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.StatusReservation;
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
import fr.cda.delicesafpa.interfaceServ.AssignerRoleServiceI;
import fr.cda.delicesafpa.interfaceServ.CategorieServiceI;
import fr.cda.delicesafpa.interfaceServ.ClientServiceI;
import fr.cda.delicesafpa.interfaceServ.CommandeServiceI;
import fr.cda.delicesafpa.interfaceServ.ConcernerPanArtServiceI;
import fr.cda.delicesafpa.interfaceServ.DeterminerArtServiceI;
import fr.cda.delicesafpa.interfaceServ.DeterminerCatServiceI;
import fr.cda.delicesafpa.interfaceServ.EmployeServiceI;
import fr.cda.delicesafpa.interfaceServ.EtreSupServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.RoleEmployeServiceI;
import fr.cda.delicesafpa.interfaceServ.StatusCommandeServiceI;
import fr.cda.delicesafpa.interfaceServ.StatusReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.TraiterCommandeServiceI;
import fr.cda.delicesafpa.interfaceServ.TraiterReservationServiceI;
import fr.cda.delicesafpa.services.ArticleService;
import fr.cda.delicesafpa.services.AssignerRoleService;
import fr.cda.delicesafpa.services.ClientService;
import fr.cda.delicesafpa.services.DetCategorieService;
import fr.cda.delicesafpa.services.EmployeService;
import fr.cda.delicesafpa.services.PanierService;
import fr.cda.delicesafpa.services.ReservationService;
import fr.cda.delicesafpa.services.RoleEmployeService;
import fr.cda.delicesafpa.services.StatusCommandeService;
import fr.cda.delicesafpa.services.TraiterCommandeService;
import fr.cda.delicesafpa.services.TraiterReservationService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class Test {

	@Autowired
	ClientServiceI clientService;

	@Autowired
	ReservationServiceI reservationService;
	
	@Autowired
	EmployeServiceI employeService;
	
	@Autowired
	PanierServiceI panierService;
	@Autowired
	RoleEmployeServiceI roleEmployeService;
	
	@Autowired
	CategorieServiceI categorieService;

	@Autowired
	ArticleServiceI articleService;
	
	@Autowired
	DeterminerCatServiceI detCategorieService;
	
	
	@Autowired
	DeterminerArtServiceI detArticleService;
	
	@Autowired
	StatusReservationServiceI statusReservationService;
	
	@Autowired
	TraiterReservationServiceI traiterReservationService;
	
	@Autowired
	TraiterReservationRepository traiterReservationRepository;
	
	
	@Autowired
	CommandeServiceI commandeService;
	
	@Autowired
	StatusCommandeServiceI statusCommandeService;
	
	@Autowired
	TraiterCommandeRepository traiterCommandeRepository;
	@Autowired
	TraiterCommandeServiceI traiterCommandeService;

	@Autowired
	AssignerRoleServiceI assignerRoleService;
	
	
	@Autowired
	ConcernerPanArtServiceI concernerPanArtService;
	
	@Autowired
	EtreSupServiceI etreSupServiceI;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	

		/* %%%%%%%%%%%%%%%%%%% */// CLIENT
		
	Client c = new Client("nomclient","prenomclient",getDate("2010-10-10"),"paysclient","adresseclient",
				"complementadrclient","cpclient","villeclient","telclient","mailclient",
				"passwordclient");
		
	clientService.save(c);/**/
	List<Client>  listClient = clientService.getAll();/**/
	System.out.println(listClient.toString());
	Client cId =  clientService.getById(1);/**/
	System.out.println(cId);
	
		
		
		/* %%%%%%%%%%%%%%%%%%% */// RESERVATION
		LocalTime time = LocalTime.of(20, 30);

		Reservation newreservation = new Reservation(getDate("2010-10-10"), time, 5, cId);
		reservationService.save(newreservation);/**/
		int i = reservationService.getAll().size();/**/
		Reservation reservation = reservationService.getById(i);/**/
		System.out.println(reservation);

		/* %%%%%%%%%%%%%%%%%%% */// EMPLOYE
		Employe employe = employeService.getById(1);
		Employe newEmp = new Employe("nomemploye", "prenomemploye", "telemploye", "String mailemploye",
				"String passwordemploye", false);
		employeService.save(newEmp);
		System.out.println(employeService.getAll().size());
		System.out.println(employe.getTraiterReservation().size());
		Employe employeLast = employeService.getById(employeService.getAll().size());
		System.out.println(employeLast);
		
		
		
		
		
		int iCat = categorieService.getAll().size();/**/
		Categorie categorie = categorieService.getById(iCat);/**/

		
		/* %%%%%%%%%%%%%%%%%%% */// DETARTICLE
		Article newArt = new Article("offsp", (float) 10.50,"descriptionarticle",
				true, true,"descriptionoffresp",categorie);
		articleService.save(newArt);
		System.out.println(articleService.getAll().size());
		Article newArtById = articleService.getById(articleService.getAll().size());
		System.out.println(newArtById);
		
		/* %%%%%%%%%%%%%%%%%%% */// PANIER
		Panier newPanier = new Panier();
		panierService.save(newPanier);/**/
		System.out.println(panierService.getAll().size());/***/
		System.out.println(panierService.getById(panierService.getAll().size()));

		/* %%%%%%%%%%%%%%%%%%% */// ROLEEMPLOYE
		RoleEmploye newRoleEmploye = new RoleEmploye("Sospeso");
		roleEmployeService.save(newRoleEmploye);/**/
		System.out.println(roleEmployeService.getAll().size());/***/
		System.out.println(roleEmployeService.getById(roleEmployeService.getAll().size()));
		
		
		/* %%%%%%%%%%%%%%%%%%% */// DETCATEGORIE
	Categorie newCat = new Categorie("nomcategorie", "descriptioncategorie", true);
		
	     categorieService.save(newCat);/**/

		
		System.out.println(categorie+"?????");
		
		LocalDateTime nowC = LocalDateTime.now();
		DeterminerCatId nowDetCatId = new DeterminerCatId(categorie.getIdcategorie(),1,nowC);
	    
		DeterminerCat nowDetCat = new DeterminerCat(nowDetCatId,categorie,employeService.getById(1));
		detCategorieService.save(nowDetCat);
        System.out.println(detCategorieService.getAll().size());
		System.out.println(nowDetCat);
		
		
		/*List<Dept> listdept = deptService.getAll();
			List<DeptDTO> listdeptDTO = deptConverter.EntityToDTO(listdept);
			model.addAttribute("listdept", listdeptDTO)/inviarealla jsp*/


		LocalDateTime nowCA = LocalDateTime.now();
		int iA = articleService.getAll().size();
		Article art = articleService.getById(iA);
		DeterminerArtId nowDetArtId = new DeterminerArtId(art.getIdarticle(),1,nowCA);

		
		
		DeterminerArt nowDetArt = new DeterminerArt(nowDetArtId,art,employeService.getById(1));
		detArticleService.save(nowDetArt);
		System.out.println(nowDetArt);
	
		 System.out.println(detArticleService.getAll().size());
			System.out.println(nowDetCat);
		
		
		
		
		
		
		
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER RESERVATION
	 LocalDateTime now = LocalDateTime.now();
	 
		TraiterReservationId idtres = new TraiterReservationId(1, 1, 1, now);
		TraiterReservation newTR = new TraiterReservation(idtres, reservation, employe,
				statusReservationService.getById(1));/**/
		statusReservationService.getAll();/**/
		StatusReservation st = new	StatusReservation("description");
		statusReservationService.save(st);/**/
		System.out.println(statusReservationService.getAll().size());/**/

		
		System.out.println(st);
		

		traiterReservationService.save(newTR);/**/
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER RESERVATION

		System.out.println(newTR);
		System.out.println(employe.getTraiterReservation());/**/

		System.out.println(time);

		/* %%%%%%%%%%%%%%%%%%% */// COMMANDE
		LocalTime timec = LocalTime.of(20, 30);
		Panier newPanier2 = new Panier();
		panierService.save(newPanier2);
	/**/	Commande newcommande = new Commande(getDate("2010-10-10"), "adressecommande", timec, c, null, newPanier);
		commandeService.save(newcommande);
	/**/	int iC = commandeService.getAll().size();
		/**/Commande commande = commandeService.getById(iC);
		System.out.println(commande);

		/* %%%%%%%%%%%%%%%%%%% */// TRAITER COMMANDE
		LocalDateTime nowCC = LocalDateTime.now();
		TraiterCommandeId idtcom = new TraiterCommandeId(1, 1, 1, nowCC);
		TraiterCommande newTRC = new TraiterCommande(idtcom, commande, employe,
				statusCommandeService.getById(1));/**/
		traiterCommandeService.save(newTRC);/**/
		/*TraiterCommande ctct = traiterCommandeRepository.findById(newTRC.getId()).get();*/
      //  System.out.println(ctct);
		
		
		System.out.println(newTRC);
		
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER COMMANDE

		System.out.println(newTRC);
		System.out.println(employe.getTraiterCommande());
		System.out.println(commande);
		Commande commandePrint = commandeService.getById(iC);
		System.out.println(commandePrint);
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER COMMANDE

		System.out.println(newPanier);
		/* %%%%%%%%%%%%%%%%%%% */// ASSIGNEROLE
	
	Employe newEmpA = new Employe("nomemploye", "prenomemploye", "telemploye", "String mailemploye",
				"String passwordemploye", false);

		employeService.save(newEmpA);
		LocalDateTime nowCR = LocalDateTime.now();
		AssignerRoleId newAsRol = new AssignerRoleId(1, 2, 1, nowCR);

		Employe employeT = employeService.getById(1);
		Employe employeR = employeService.getById(2);
		RoleEmploye status = roleEmployeService.getById(1);

		AssignerRole newRole = new AssignerRole(newAsRol, employeT, employeR, status);
		assignerRoleService.save(newRole);
		Employe employeRPrint = employeService.getById(2);
		System.out.println(employeRPrint);
		System.out.println( employeService.getById(1).getIdemploye_assigner_role());

		/* %%%%%%%%%%%%%%%%%%% */// panier-article
		
	ConcernerId conId = new ConcernerId(newPanier.getIdpanier(),art.getIdarticle());
		ConcernerPanArt newConPanArt = new ConcernerPanArt(conId,newPanier,art,20 );		
		concernerPanArtService.save(newConPanArt);
		System.out.println(newConPanArt);
/* %%%%%%%%%%%%%%%%%%% */// etresup
   Article aaa= articleService.getById(1);
		EtresupId etruSupId = new EtresupId(aaa.getIdarticle(),art.getIdarticle());
		EtreSup etres = new EtreSup(etruSupId,aaa,art);
		etreSupServiceI.save(etres);
System.out.println(etres);
System.out.println(articleService.getById(1));
System.out.println(articleService.getById(art.getIdarticle()));	

/*%%%%%%%%%%%%%%%%%%%%%%%varie*/
System.out.println(articleService.findOffrespeciale());
		

Article aaaaaa = new Article("offspaaaaa", (float) 10.50,"descriptionaaaaa",
		true, true,"descriptionoffresp",categorie);

articleService.save(aaaaaa);
System.out.println(aaaaaa.getDescriptionarticle());

System.out.println(articleService.getById(articleService.getAll().size()));
/*updateNomArticle
updatePrixArticle
updateVisibiliteArticle
updateOffreSpecialeArticle
updateDescriptionOffresp*/

articleService.updateDescription("updescri",articleService.getAll().size());
articleService.updateNomArticle("upnom",articleService.getAll().size());
articleService.updatePrixArticle(999,articleService.getAll().size());
articleService.updateVisibiliteArticle(false,articleService.getAll().size());
articleService.updateOffreSpecialeArticle(false,articleService.getAll().size());
articleService.updateDescriptionOffresp("1updescrioffrespecial",articleService.getAll().size());
System.out.println(articleService.getById(articleService.getAll().size()));
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


categorieService.updateDescriptionCategorie("updescricat", 10);
categorieService.updateNomCategorie("upnom", 10);
categorieService.updateVisibiliteCategorie(false, 10);
Categorie cat = categorieService.getById(10);
System.out.println(cat);
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
int aSp = articleService.findOffrespeciale().size();
int aAll = articleService.getAll().size();
System.out.println("sp" +aSp +"all"+  aAll  );
/*
 public Employe getById(int id) ;
	public void updateNomEmploye(String nom, int idemploye);
	public void updatePrenomEmploye(String prenom, int idemploye);
	public void updateTelEmploye(String tel, int idemploye);
	public void updateEmailEmploye(String mail, int idemploye);
	public void updatePassEmploye(String pass, int idemploye);
	public void updateOnlineEmploye(boolean online, int idemploye);*/

/* %%%%%%%%%%%%%%%%%%% *///
employeService.updateNomEmploye("upnomemploye", 10);
employeService.updatePrenomEmploye("upprenomemploye", 10);
employeService.updateEmailEmploye("nuovamail", 10);
employeService.updateTelEmploye("0123456", 10);
employeService.updatePassEmploye("nuovapass", 10);
employeService.updateOnlineEmploye(true,10);
Employe emp10 = employeService.getById(10);
System.out.println(emp10);


/*articleService.updateCategorieArt(cat, 1);*/
Article upcatArt = articleService.getById(1);
System.out.println(articleService.getById(1));
upcatArt.setCategorie(categorieService.getById(33));
articleService.save(upcatArt);
System.out.println(articleService.getById(1));
/**/


/**/

System.out.println(traiterReservationRepository.findTraitResByDate(now).size());
System.out.println(traiterReservationRepository.findTraitResActuel(newreservation));

TraiterReservation t = traiterReservationService.findTraitResActuel(newreservation);
StatusReservation s = traiterReservationService.findStatusActuel(newreservation) ;
System.out.println( "s + t"+t+s);
System.out.println(s);



TraiterCommande tC = traiterCommandeService.findTraitComActuel(commande);
StatusCommande sC = traiterCommandeService.findStatusActuel(commande) ;
System.out.println( "t + s"+tC+sC);
System.out.println(sC);

ConcernerId CIP = new ConcernerId(1, 1);
ConcernerPanArt cpa = new ConcernerPanArt(CIP, panierService.getById(1), articleService.getById(1), 5);
concernerPanArtService.save(cpa);

for(int j=2; j<10;j++) {
	
	
ConcernerId CIP2 = new ConcernerId(2, 1);
ConcernerPanArt cpa2 = new ConcernerPanArt(CIP2, panierService.getById(2), articleService.getById(j), 3);
concernerPanArtService.save(cpa2);

panierService.getById(2).getConcernerPanArt().size();



}
System.out.println(panierService.getById(2).getConcernerPanArt());
System.out.println(articleService.getById(3).getConcernerPanArt());
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