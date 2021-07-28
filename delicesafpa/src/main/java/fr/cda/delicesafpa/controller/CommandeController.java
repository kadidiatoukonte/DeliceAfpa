package fr.cda.delicesafpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ResponseBody;

import fr.cda.delicesafpa.dto.CommandeDTO;
import fr.cda.delicesafpa.dto.ConcernerPanArtDTO;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeDTO;

import fr.cda.delicesafpa.interfaceServ.CommandeServiceI;
import fr.cda.delicesafpa.interfaceServ.ConcernerPanArtServiceI;

import fr.cda.delicesafpa.interfaceServ.PanierServiceI;

import fr.cda.delicesafpa.interfaceServ.StatusCommandeServiceI;

import fr.cda.delicesafpa.interfaceServ.TraiterCommandeServiceI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public PanierDTO addPanier(@RequestBody PanierDTO panier) {

		return panierService.save(panier);

	}

	@GetMapping("/paniergetall") /**/
	public List<PanierDTO> PanierGetAll() {

		return panierService.getAll();

	}

	@GetMapping("/panier/{id}") /**/
	public PanierDTO getPanier(@PathVariable("id") int id) {
		return panierService.getById(id);
	}

	@PostMapping("/addconcernerpanart") /**/
	public ConcernerPanArtDTO addConPanArt(@RequestBody ConcernerPanArtDTO cap) {

		return concernerPanArtService.save(cap);

	}

	@GetMapping("/concernerpanartgetall") /**/
	public List<ConcernerPanArtDTO> ConcernerPanArtGetAll() {

		return concernerPanArtService.getAll();

	}

}
