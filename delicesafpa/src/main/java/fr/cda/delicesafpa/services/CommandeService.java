package fr.cda.delicesafpa.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.CommandeRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.CommandeServiceI;




@Service
public class CommandeService implements CommandeServiceI {
	@Autowired
	private CommandeRepository commandeRepository;
	
	
	public void save(Commande commande) {
		try {
			commandeRepository.save(commande);
		} catch (Exception e) {
			
		}
	}
	
	public List<Commande> getAll() {
		try {
			return commandeRepository.findAll();
		} catch (Exception e) {
			return null;
		}
		
	}
	public Commande getById(int id) {
		try {
		return commandeRepository.findById(id).get();
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}
	
	
}
