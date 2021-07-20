package fr.cda.delicesafpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.dao.CategorieRepository;
import fr.cda.delicesafpa.dao.ClientRepository;

@RestController
public class HomeController {
/*
	@Autowired
	ClientRepository clientDao;
	
	@Autowired
	CategorieRepository categorieDao;

	@PostMapping("/addClient")
	public Client addClient(@RequestBody Client client) {
		System.out.println(client);
		return clientDao.save(client);
	}

	@GetMapping("/client/{idclient}")
	public Client getClient(@PathVariable("idclient") int idclient) {
		return clientDao.findById(idclient).orElse(null);
	}
	
	@PostMapping("/addCategorie")
	public Categorie addCategorie(@RequestBody Categorie categorie) {
		System.out.println(categorie);
		return categorieDao.save(categorie);
	}

	@GetMapping("/categorie/{idcategorie}")
	public Categorie getCategorie(@PathVariable("idcategorie") int idcategorie) {
		return categorieDao.findById(idcategorie).orElse(null);
	}
*/
}
