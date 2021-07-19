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
import fr.cda.delicesafpa.dao.CommandeRepository;
import fr.cda.delicesafpa.dto.CommandeDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.CommandeServiceI;


@RestController
public class CommandeController {

	@Autowired
	CommandeServiceI commandeService;


	@PostMapping("/addCommande")
	public CommandeDTO addCommande(@RequestBody CommandeDTO commandeDTO) {
		System.out.println(commandeDTO);
		return commandeService.save(commandeDTO);
	}

	@GetMapping("/commande/{idcommande}")
	public CommandeDTO getCommande(@PathVariable("idcommande") int idcommande) {
		return commandeService.getById(idcommande);
	}
	
	@GetMapping(value="/allCommande")
	public List<CommandeDTO> getAllCommande() {
		List<CommandeDTO> list =commandeService.getAll();
		System.out.println(list);
		return list;
	}
	
	
	@PutMapping("/updateCommande/")
	public Object updateCommande(@RequestBody CommandeDTO commandeDTO)
	{
		System.out.println(commandeDTO);
	return commandeService.save(commandeDTO);
	}
}
