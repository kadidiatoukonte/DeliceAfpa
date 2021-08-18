package fr.cda.delicesafpa.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ResponseBody;

import fr.cda.delicesafpa.dto.AddCommandeDTO;
import fr.cda.delicesafpa.dto.AddProduitToPanierDTO;
import fr.cda.delicesafpa.dto.AddTraiterCommandeDTO;
import fr.cda.delicesafpa.dto.AssignerLivreurDTO;
import fr.cda.delicesafpa.dto.CommandeDTO;
import fr.cda.delicesafpa.dto.CommandeTableDetailDTO;
import fr.cda.delicesafpa.dto.ConcernerPanArtDTO;
import fr.cda.delicesafpa.dto.IdConcerPanArtDTO;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeTableDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.CommandeServiceI;
import fr.cda.delicesafpa.interfaceServ.ConcernerPanArtServiceI;

import fr.cda.delicesafpa.interfaceServ.PanierServiceI;

import fr.cda.delicesafpa.interfaceServ.StatusCommandeServiceI;

import fr.cda.delicesafpa.interfaceServ.TraiterCommandeServiceI;
import fr.cda.delicesafpa.util.ArticleConverter;
import fr.cda.delicesafpa.util.PanierConverter;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandeController {

	@Autowired
	PanierServiceI panierService;

	@Autowired
	CommandeServiceI commandeService;

	@Autowired
	StatusCommandeServiceI statusCommandeService;

	@Autowired
	TraiterCommandeServiceI traiterCommandeService;

	@Autowired
	ConcernerPanArtServiceI concernerPanArtService;
	
	@Autowired
	ArticleServiceI articleService;
	

	@PostMapping("/addcommande") /**/
	public CommandeDTO addCommande(@RequestBody CommandeDTO commande) {
		
		
		return commandeService.save(commande);

	}

	@GetMapping("/commandegetall") /**/
	public List<CommandeDTO> getAll() {

		return commandeService.getAll();

	}

	@GetMapping("/commande/{id}") /**/
	public CommandeDTO getCommande(@PathVariable("id") int id) {
		return commandeService.getById(id);
	}

	
	
	
	@ResponseBody
	@PostMapping("/addtraitercommande") /**/
	public TraiterCommandeDTO addTraiterCommande(@RequestBody TraiterCommandeDTO commande) {
		System.out.println("ciao");
		
		
		
		return traiterCommandeService.save(commande);

	}
	
	
	@ResponseBody
	@PostMapping("/addADDtraitercommande") /**/
	public TraiterCommandeDTO addADDTraiterCommande(@RequestBody AddTraiterCommandeDTO commande) {
		System.out.println("ciao");
		
		System.out.println(commande);
		
		return traiterCommandeService.saveAdd(commande);

	}

	
	
	
	
	
	
	
	@GetMapping("/traitercommandegetall") /**/
	public List<TraiterCommandeDTO> AllTraiterCommande() {
		System.out.println(traiterCommandeService.getAll().size());
		return traiterCommandeService.getAll();

	}

	/**/
	@PostMapping("/findtraitcomactuel") /**/

	public TraiterCommandeDTO FindTraitComActuel(@RequestBody CommandeDTO com) {
		System.out.println(traiterCommandeService.findTraitComActuel(com));
		return traiterCommandeService.findTraitComActuel(com);

	}

	@PostMapping("/findstatusactuelcommande") /**/

	public StatusCommandeDTO findStatusActuel(@RequestBody CommandeDTO com) {
		System.out.println(traiterCommandeService.findTraitComActuel(com));
		return traiterCommandeService.findStatusActuel(com);

	}

	@PostMapping("/addpanier") /**/
	public PanierDTO addPanier() {

		return panierService.save();

	}

	@GetMapping("/paniergetall") /**/
	public List<PanierDTO> PanierGetAll() {

		return panierService.getAll();

	}

	@GetMapping("/panier/{id}") /**/
	public PanierDTO getPanier(@PathVariable("id") int id) {
		return panierService.getById(id);
	}
//	AddProduitToPanierDTO(String idpanier, String idarticle, String quantite) 

	
	@PostMapping("/addconcernerpanart") /**/
	public ConcernerPanArtDTO addConPanArt(@RequestBody AddProduitToPanierDTO addPro) {
		
		

		return concernerPanArtService.save(addPro);

	}

	@GetMapping("/concernerpanartgetall") /**/
	public List<ConcernerPanArtDTO> ConcernerPanArtGetAll() {

		return concernerPanArtService.getAll();

	}

	@PostMapping("/findConcernerPanArtPanier")
	public	Set<ConcernerPanArtDTO> findConcernerPanArtPanier(@RequestBody PanierDTO idpanier)
	{Set<ConcernerPanArtDTO> p = panierService.findConcernerPanArtPanier( idpanier);
		System.out.println(idpanier);
		System.out.println(idpanier);
	return	p;
		
		
	}
	
	
	
	@PostMapping("/findConcernerAddOne")
	public	ConcernerPanArtDTO findConcernerAddOne(@RequestBody IdConcerPanArtDTO idConcerPanArtDTO)
	{
		System.out.println(idConcerPanArtDTO);
		ConcernerPanArtDTO c =concernerPanArtService.findConcernerAddOne( idConcerPanArtDTO);
		System.out.println(idConcerPanArtDTO);
		System.out.println(c);
	return	c;
		
		
	}
	
	
	
	@PostMapping("/findConcernerMinusOne")
	public	ConcernerPanArtDTO findConcernerMinusOne(@RequestBody IdConcerPanArtDTO idConcerPanArtDTO)
	{
		System.out.println(idConcerPanArtDTO);
		ConcernerPanArtDTO c =concernerPanArtService.findConcernerMinusOne( idConcerPanArtDTO);
		System.out.println(idConcerPanArtDTO);
		System.out.println(c);
	return	c;
		
		
	}
	
	
	
	
	@PostMapping("/findConcernerDelete")

	public void deleteConcernerPanArt( @RequestBody IdConcerPanArtDTO idConcerPanArtDTO) {
		
		concernerPanArtService.deleteConcernerPanArt(idConcerPanArtDTO);
	
	System.out.println(idConcerPanArtDTO);
	
	}
	
	
	@GetMapping("/testdate")
public void testdate( ) {
		
		int p1 = 77400 % 60;
	    int p2 = 77400 / 60;
	    int p3 = p2 % 60;
	    p2 = p2 / 60;
	    System.out.print( p2 + ":" + p3 + ":" + p1);	
	    LocalTime time = LocalTime.of(p2, p3);
	    System.out.print( p2 + ":" + p3 + ":" + p1);	

	System.out.println(time);
	}

	@PostMapping("/addcommandeclient") /**/
	public /*AddCommandeDTO*//**/CommandeDTO addCommande(@RequestBody AddCommandeDTO commande) {

		int time = commande.getHoraire();
		int p1 = time % 60;
	    int p2 = time / 60;
	    int p3 = p2 % 60;
	    p2 = p2 / 60;
	    System.out.print( p2 + ":" + p3 + ":" + p1);	
	    LocalTime timeLocal = LocalTime.of(p2, p3);
	    System.out.print( p2 + ":" + p3 + ":" + p1);
	    System.out.println(commande);
	    System.out.println(timeLocal);
	    CommandeDTO c =   commandeService.saveAddCommande(commande);
	    System.out.println(c);
		return c;

	}
	
	
	
	@GetMapping("/commOnCourse") /**/

	public List<TraiterCommandeTableDTO> findCommandeOnCourse(){
		
		
	return commandeService.findCommandeOnCourse();	
	
	}
	

	@GetMapping("/commandeOnCourseLivreur/{id}") /**/

	public List<TraiterCommandeTableDTO> findCommandeOnCourseLivreur(@PathVariable("id") int id){
		
		
	return commandeService.findCommandeOnCourseLivreur(id);	
	
	}
	
	
	
	@GetMapping("/commandePanierId/{id}") /**/
	public int commandePanierId(@PathVariable("id") int id) {
		CommandeDTO c = commandeService.getById(id);
        int idP = c.getPanier().getIdpanier();		
		
		return idP;
	}

	
	
	@GetMapping("/getByIdTableDetail/{id}") /**/
	public 	CommandeTableDetailDTO getByIdTableDetail(@PathVariable("id")  int id) {
		
		return 	commandeService.getByIdTableDetail(id);
		
	
	}
	
	@PutMapping("/updateCommandeLivreur")
	public AssignerLivreurDTO updateCommandeLivreur(@RequestBody AssignerLivreurDTO  a )
	{
    commandeService.updateCommandeLivreur(a);
   System.out.println( commandeService.getById(a.getIdcommande()));
	return a;
	}

	
	@GetMapping("/findCommandeOnCourseClient/{idclient}") /**/
	public List<TraiterCommandeTableDTO> findCommandeOnCourseClient(@PathVariable("idclient") String idclient) {
		
		
		
		System.out.println(idclient + "eccolo");
		
		return commandeService.findCommandeOnCourseClient(Integer.valueOf(idclient));
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
