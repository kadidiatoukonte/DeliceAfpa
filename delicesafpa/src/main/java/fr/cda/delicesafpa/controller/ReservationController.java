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
import java.util.Set;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

import fr.cda.delicesafpa.dto.ReservationDTO;
import fr.cda.delicesafpa.dto.StatusReservationDTO;
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

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * Handles requests for the application home page.
 */
@RestController
public class ReservationController {

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
	CommandeServiceI commandeService;
	
	@Autowired
	StatusCommandeServiceI statusCommandeService;

	@Autowired
	TraiterCommandeServiceI traiterCommandeService;

	@Autowired
	AssignerRoleServiceI assignerRoleService;
	
	
	@Autowired
	ConcernerPanArtServiceI concernerPanArtService;
	
	@Autowired
	EtreSupServiceI etreSupService;

		
		
			@PostMapping("/addreservation")/**/
			public ReservationDTO addReservation(@RequestBody ReservationDTO reservation) {
				
				return reservationService.save(reservation);
			
			}
			
			

			
			@GetMapping("/reservationgetall")/**/
			public List<ReservationDTO>  getAll() {
				
				return reservationService.getAll();
			
			}
			
			
			@GetMapping("/reservation/{id}")/**/
			public ReservationDTO getProduit(@PathVariable("id") int id) {
				return reservationService.getById(id);
			}

			
			@ResponseBody 
			@PostMapping("/addtraiterteservation")/**/
			public TraiterReservationDTO addTraiterReservation(@RequestBody TraiterReservationDTO reservation) {
				System.out.println("ciao");
			return	traiterReservationService.save(reservation);
			
			}
			

			@GetMapping("/traiterteservationgetall")/**/
		    
		public List<TraiterReservationDTO> AllTraiterReservation() {
				System.out.println(traiterReservationService.getAll().size());
				return traiterReservationService.getAll();
			
			}
			/**/
			@PostMapping("/findtraitresactuel")/**/
			
			public TraiterReservationDTO FindTraitResActuel(@RequestBody ReservationDTO res) {
					System.out.println(traiterReservationService.findTraitResActuel(res));
					return traiterReservationService.findTraitResActuel(res);
				
				}
			
            @PostMapping("/findstatusactuel")/**/
			
			public StatusReservationDTO findStatusActuel(@RequestBody ReservationDTO res) {
					System.out.println(traiterReservationService.findTraitResActuel(res));
					return traiterReservationService.findStatusActuel(res);
				
				}
			
	}

