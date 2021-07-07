package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;

@Service
public class PanierService implements PanierServiceI {
	@Autowired
	private PanierRepository panierRepository;
	
	
	public void save(Panier panier) {
		try {
			panierRepository.save(panier);
		} catch (Exception e) {
			
		}
	}
	
	public List<Panier> getAll() {
		try {
			return panierRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}
	
	public Panier getById(int id) {
		try {
		return panierRepository.findById(id).get();
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}
	
	
	
	
	
}
