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

import fr.cda.delicesafpa.beans.ConcernerPanArt;
import fr.cda.delicesafpa.beans.EtreSup;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.dao.TraiterCommandeRepository;
import fr.cda.delicesafpa.dao.TraiterReservationRepository;
import fr.cda.delicesafpa.dto.ConcernerPanArtDTO;
import fr.cda.delicesafpa.dto.EtreSupDTO;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;
import fr.cda.delicesafpa.dto.StatusReservationDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterReservationDTO;
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
import fr.cda.delicesafpa.util.ConcernerPanArtConverter;
import fr.cda.delicesafpa.util.EtreSupConverter;
import fr.cda.delicesafpa.util.StatusCommandeConverter;
import fr.cda.delicesafpa.util.StatusReservationConverter;
import fr.cda.delicesafpa.util.TraiterCommandeConverter;
import fr.cda.delicesafpa.util.TraiterReservationConverter;

import org.springframework.web.bind.annotation.RestController;
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
	EtreSupServiceI etreSupService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		System.out.println(	StatusCommandeConverter.convertToDto(statusCommandeService.getAll().get(1)) );
		StatusCommandeDTO	statusCommandeDto=StatusCommandeConverter.convertToDto(statusCommandeService.getAll().get(1)) ;
		try {
			StatusCommande	statusCommande =	StatusCommandeConverter.convertToEntity(statusCommandeDto);
			System.out.println(statusCommande);
			System.out.println(statusCommandeDto);
		} catch (com.steadystate.css.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("errore");
		}
		
		
		
		
		System.out.println(	StatusReservationConverter.convertToDto(statusReservationService.getAll().get(1)) );
		StatusReservationDTO	statusReservationDto=StatusReservationConverter.convertToDto(statusReservationService.getAll().get(1)) ;
		try {
			StatusReservation	statusReservation =	StatusReservationConverter.convertToEntity(statusReservationDto);
			System.out.println(statusReservation);
			System.out.println(statusReservationDto);
		} catch (com.steadystate.css.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("errore");
		}
		
		
		
		System.out.println(	ConcernerPanArtConverter.convertToDto(concernerPanArtService.getAll().get(1)) );
		ConcernerPanArtDTO	concernerPanArtDto=ConcernerPanArtConverter.convertToDto(concernerPanArtService.getAll().get(1)) ;
		try {
			ConcernerPanArt	concernerPanArt =	ConcernerPanArtConverter.convertToEntity(concernerPanArtDto);
			System.out.println(concernerPanArtDto);
			System.out.println(concernerPanArt);
		
		} catch (com.steadystate.css.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("errore");
		}
		
		
		
		/*

		System.out.println(	TraiterReservationConverter.convertToDto(traiterReservationService.getAll().get(1)) );
		TraiterReservationDTO	traiterReservationDto=TraiterReservationConverter.convertToDto(traiterReservationService.getAll().get(1)) ;
		try {
			TraiterReservation	traiterReservation =	TraiterReservationConverter.convertToEntity(traiterReservationDto);
			System.out.println(traiterReservation);
			System.out.println(traiterReservationDto);
		} catch (com.steadystate.css.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("errore");
		}
		
/*
		System.out.println(	TraiterCommandeConverter.convertToDto(traiterCommandeService.getAll().get(1)) );
		TraiterCommandeDTO	traiterCommandeDto=TraiterCommandeConverter.convertToDto(traiterCommandeService.getAll().get(1)) ;
		try {
			TraiterCommande	traiterCommande =	TraiterCommandeConverter.convertToEntity(traiterCommandeDto);
			System.out.println(traiterCommande);
			System.out.println(traiterCommandeDto);
		} catch (com.steadystate.css.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("errore");
		}
		
		
		
		
	/*
		
		System.out.println(	EtreSupConverter.convertToDto(etreSupService.getAll().get(1)) );
		EtreSupDTO	etreSupDto=EtreSupConverter.convertToDto(etreSupService.getAll().get(1)) ;
		try {
			EtreSup	etreSup =	EtreSupConverter.convertToEntity(etreSupDto);
			System.out.println(etreSup);
		} catch (com.steadystate.css.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("errore");
		}
		
		
		
		
	
		/*detCategorie*/
		/*
		DeterminerCat det = detCategorieService.getAll().get(1);
		System.out.println(det);
		DeterminerCatDTO detDTO = DeterminerCatConverter.convertToDto(det);
		   System.out.println(detDTO);
		   DeterminerCat detNew = new DeterminerCat();
			try {
				detNew= DeterminerCatConverter.convertToEntity (detDTO);
			} catch (com.steadystate.css.parser.ParseException e) {
				e.printStackTrace();
				System.out.println("ciaocuaoihkqsgdqsuh");
			}
		
			System.out.println("conv+"+detDTO);
			System.out.println("convA+"+detNew);		
		
		/*detArticle*//*
DeterminerArt det = detArticleService.getAll().get(1);
		DeterminerArtDTO detDTO = DeterminerArtConverter.convertToDto (det);
		   System.out.println(detDTO);
			DeterminerArt detNew = new DeterminerArt();
			try {
				detNew= DeterminerArtConverter.convertToEntity (detDTO);
			} catch (com.steadystate.css.parser.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ciaocuaoihkqsgdqsuh");
			}
		
			System.out.println("conv+"+detDTO);
			System.out.println("convA+"+detNew);		
			
			
		/*assignerRole*/
	/*	AssignerRole assignerRole = assignerRoleService.getAll().get(1);	
		AssignerRoleDTO aDto =  AssignerRoleConverter.explicitModelMappingDemoDaotoDto(assignerRole);
	    System.out.println(aDto);
		AssignerRole assignerRoleNew  = new AssignerRole();
		try {
			assignerRoleNew =	AssignerRoleConverter.convertToEntity(aDto);
			System.out.println(assignerRoleNew);
		} catch (com.steadystate.css.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ciaociao");
		}
				
		System.out.println("conv+"+aDto);
		System.out.println("convA+"+assignerRoleNew);
//System.out.println(assignerRoleUPDAO);
/**/
	return "home";}
	
		/*cat*/
	/*	
		for(int a=0;a<11;a++) {
		Categorie newCat = new Categorie("nomcategorie"+a, "descriptioncategorie"+a, true);
		
	     categorieService.save(newCat);/**/
		
	//}
	     /* %%%%%%%%%%%%%%%%%%% */// CLIENT
	/*	
	Client c = new Client("nomclient","prenomclient",getDate("2010-10-10"),"paysclient","adresseclient",
				"complementadrclient","cpclient","villeclient","telclient","mailclient",
				"passwordclient");
		
	clientService.save(c);/**/
	/*List<Client>  listClient = clientService.getAll();/**/
/*	System.out.println(listClient.toString());
	Client cId =  clientService.getById(1);/**/
	/*System.out.println(cId);
	
		
		
		/* %%%%%%%%%%%%%%%%%%% */// RESERVATION
	/*	LocalTime time = LocalTime.of(20, 30);

		Reservation newreservation = new Reservation(getDate("2010-10-10"), time, 5, cId);
		reservationService.save(newreservation);/**/
/*		int i = reservationService.getAll().size();/**/
/*		Reservation reservation = reservationService.getById(i);/**/
	/*	System.out.println(reservation);

		/* %%%%%%%%%%%%%%%%%%% */// EMPLOYE
	/*	Employe employe = employeService.getById(1);
		Employe newEmp = new Employe("nomemploye", "prenomemploye", "telemploye", "String mailemploye",
				"String passwordemploye", false);
		employeService.save(newEmp);
		System.out.println(employeService.getAll().size());
		System.out.println(employe.getTraiterReservation().size());
		Employe employeLast = employeService.getById(employeService.getAll().size());
		System.out.println(employeLast);
		
		
		
		
		
		int iCat = categorieService.getAll().size();/**/
	//	Categorie categorie = categorieService.getById(iCat);/**/

		
		/* %%%%%%%%%%%%%%%%%%% */// DETARTICLE
		
		
		
	/*	for (int ik = 1 ; ik<11;ik++) {
		Article newArt = new Article("offsp"+ik, (float) 10.50+ik,"descriptionarticle"+ik,
				true, true,"descriptionoffresp"+ik,categorie);
		articleService.save(newArt);
		
		};
		
		
		
		
		System.out.println(articleService.getAll().size());
		Article newArtById = articleService.getById(articleService.getAll().size());
		System.out.println(newArtById);
		
		/* %%%%%%%%%%%%%%%%%%% */// PANIER
	/*	Panier newPanier = new Panier();
		panierService.save(newPanier);/**/
	/*	System.out.println(panierService.getAll().size());/***/
	//	System.out.println(panierService.getById(panierService.getAll().size()));

		/* %%%%%%%%%%%%%%%%%%% */// ROLEEMPLOYE
	/*	RoleEmploye newRoleEmploye = new RoleEmploye("Sospeso");
		roleEmployeService.save(newRoleEmploye);/**/
	/*	System.out.println(roleEmployeService.getAll().size());/***/
		/*System.out.println(roleEmployeService.getById(roleEmployeService.getAll().size()));
		
		
		/* %%%%%%%%%%%%%%%%%%% */// DETCATEGORIE
	/*Categorie newCat = new Categorie("nomcategorie", "descriptioncategorie", true);
		
	     categorieService.save(newCat);/**/

	/*	
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

/*
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
	/* LocalDateTime now = LocalDateTime.now();
	 
		TraiterReservationId idtres = new TraiterReservationId(1, 1, 1, now);
		TraiterReservation newTR = new TraiterReservation(idtres, reservation, employe,
				statusReservationService.getById(1));/**/
	/*	statusReservationService.getAll();/**/
	/*	StatusReservation st = new	StatusReservation("description");
		statusReservationService.save(st);/**/
	/*	System.out.println(statusReservationService.getAll().size());/**/
/*
		
		System.out.println(st);
		

		traiterReservationService.save(newTR);/**/
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER RESERVATION
/*
		System.out.println(newTR);
		System.out.println(employe.getTraiterReservation());/**/

/*	System.out.println(time);

		/* %%%%%%%%%%%%%%%%%%% */// COMMANDE
	/*	LocalTime timec = LocalTime.of(20, 30);
		Panier newPanier2 = new Panier();
		panierService.save(newPanier2);
	/**///	Commande newcommande = new Commande(getDate("2010-10-10"), "adressecommande", timec, c, null, newPanier);
		//commandeService.save(newcommande);
	/**/	//int iC = commandeService.getAll().size();
		/**///Commande commande = commandeService.getById(iC);
		//System.out.println(commande);

		/* %%%%%%%%%%%%%%%%%%% */// TRAITER COMMANDE
	/*	LocalDateTime nowCC = LocalDateTime.now();
		TraiterCommandeId idtcom = new TraiterCommandeId(1, 1, 1, nowCC);
		TraiterCommande newTRC = new TraiterCommande(idtcom, commande, employe,
				statusCommandeService.getById(1));/**/
	//	traiterCommandeService.save(newTRC);/**/
		/*TraiterCommande ctct = traiterCommandeRepository.findById(newTRC.getId()).get();*/
      //  System.out.println(ctct);
		
		
	//	System.out.println(newTRC);
		
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER COMMANDE
/*
		System.out.println(newTRC);
		System.out.println(employe.getTraiterCommande());
		System.out.println(commande);
		Commande commandePrint = commandeService.getById(iC);
		System.out.println(commandePrint);
		/* %%%%%%%%%%%%%%%%%%% */// TRAITER COMMANDE

	//	System.out.println(newPanier);
		/* %%%%%%%%%%%%%%%%%%% */// ASSIGNEROLE
	/*
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
		

		/* %%%%%%%%%%%%%%%%%%% */// panier-article
	/*	
	ConcernerId conId = new ConcernerId(newPanier.getIdpanier(),art.getIdarticle());
		ConcernerPanArt newConPanArt = new ConcernerPanArt(conId,newPanier,art,20 );		
		concernerPanArtService.save(newConPanArt);
		System.out.println(newConPanArt);
/* %%%%%%%%%%%%%%%%%%% */// etresup
  /* Article aaa= articleService.getById(1);
		EtresupId etruSupId = new EtresupId(aaa.getIdarticle(),art.getIdarticle());
		EtreSup etres = new EtreSup(etruSupId,aaa,art);
		etreSupServiceI.save(etres);
System.out.println(etres);
System.out.println(articleService.getById(1));
System.out.println(articleService.getById(art.getIdarticle()));	

/*%%%%%%%%%%%%%%%%%%%%%%%varie*/
/*System.out.println(articleService.findOffrespeciale());
		

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
/*
articleService.updateDescription("updescri",articleService.getAll().size());
articleService.updateNomArticle("upnom",articleService.getAll().size());
articleService.updatePrixArticle(999,articleService.getAll().size());
articleService.updateVisibiliteArticle(false,articleService.getAll().size());
articleService.updateOffreSpecialeArticle(false,articleService.getAll().size());
articleService.updateDescriptionOffresp("1updescrioffrespecial",articleService.getAll().size());
System.out.println(articleService.getById(articleService.getAll().size()));
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*

categorieService.updateDescriptionCategorie("updescricat", 10);
categorieService.updateNomCategorie("upnom", 10);
categorieService.updateVisibiliteCategorie(false, 10);
Categorie cat = categorieService.getById(10);
System.out.println(cat);
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
	/*
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
	/*
employeService.updateNomEmploye("upnomemploye", 10);
employeService.updatePrenomEmploye("upprenomemploye", 10);
employeService.updateEmailEmploye("nuovamail", 10);
employeService.updateTelEmploye("0123456", 10);
employeService.updatePassEmploye("nuovapass", 10);
employeService.updateOnlineEmploye(true,10);
Employe emp10 = employeService.getById(10);
System.out.println(emp10);


/*articleService.updateCategorieArt(cat, 1);*/
	/*
Article upcatArt = articleService.getById(1);
System.out.println(articleService.getById(1));
upcatArt.setCategorie(categorieService.getById(33));
articleService.save(upcatArt);
System.out.println(articleService.getById(1));
/**/


/**/
/*
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
	
LocalDateTime nowCRbis = LocalDateTime.now();
AssignerRoleId newAsRolbis = new AssignerRoleId(1, 2, 3, nowCRbis);

Employe employeTb = employeService.getById(1);
Employe employeRb = employeService.getById(2);
RoleEmploye statusb = roleEmployeService.getById(3);

AssignerRole newRoleb = new AssignerRole(newAsRolbis, employeTb, employeRb, statusb);
assignerRoleService.save(newRoleb);


System.out.println(assignerRoleService.findAssRoleActuel(employeService.getById(2)).getIdstatus());

assignerRoleService.findRoleActuel(employeService.getById(2));

LocalDateTime nowCRbis3 = LocalDateTime.now();
AssignerRoleId newAsRolbis3 = new AssignerRoleId(1, 3, 3, nowCRbis3);

Employe employeTb3 = employeService.getById(1);
Employe employeRb3 = employeService.getById(3);
RoleEmploye statusb3 = roleEmployeService.getById(3);

AssignerRole newRoleb3 = new AssignerRole(newAsRolbis3, employeTb3, employeRb3, statusb3);
assignerRoleService.save(newRoleb3);


System.out.println(assignerRoleService.findAssRoleActuel(employeService.getById(2)).getIdstatus());

assignerRoleService.findRoleActuel(employeService.getById(2));


System.out.println(assignerRoleService.findRoleActuel(employeService.getById(2)));
System.out.println(assignerRoleService.findListRole(roleEmployeService.getById(3)).size());

employeService.updateOnlineEmploye(true, 2);
employeService.updateOnlineEmploye(true, 3);
System.out.println(assignerRoleService.findListLivreurSOnline());
*/


	
	
	
	
	
	
	
	
	
	
	
	
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
