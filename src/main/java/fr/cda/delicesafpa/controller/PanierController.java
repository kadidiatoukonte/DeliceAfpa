package fr.cda.delicesafpa.controller;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.dao.CommandeRepository;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.CommandeServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;


@RestController
public class PanierController {

	@Autowired
	PanierServiceI panierService;


	@PostMapping("/addPanier")
	public PanierDTO addPanier(@RequestBody PanierDTO panierDTO) {
		System.out.println(panierDTO);
		return panierService.save(panierDTO);
	}

	@GetMapping("/panier/{idpanier}")
	public PanierDTO getPanier(@PathVariable("idpanier") int idpanier) {
		return panierService.getById(idpanier);
	}
	
	@GetMapping(value="/allPanier")
	public List<PanierDTO> getAllPanier() {
		List<PanierDTO> list =panierService.getAll();
		System.out.println(list);
		return list;
	}
	
	@PutMapping("/updatePanier/")
	public Object updatePanier(@RequestBody PanierDTO panierDTO)
	{
		System.out.println(panierDTO);
	return panierService.save(panierDTO);
	}
}
