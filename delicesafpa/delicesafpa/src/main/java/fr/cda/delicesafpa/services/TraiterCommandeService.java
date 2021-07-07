package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.dao.RoleEmployeRepository;
import fr.cda.delicesafpa.dao.StatusCommandeRepository;
import fr.cda.delicesafpa.dao.TraiterCommandeRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.RoleEmployeServiceI;
import fr.cda.delicesafpa.interfaceServ.StatusCommandeServiceI;
import fr.cda.delicesafpa.interfaceServ.TraiterCommandeServiceI;

@Service
public class TraiterCommandeService implements TraiterCommandeServiceI {
	@Autowired
	private TraiterCommandeRepository traiterCommandeRepository;
	
	
	public void save(TraiterCommande traiterCommande) {
		try {
			traiterCommandeRepository.save(traiterCommande);
		} catch (Exception e) {
			
		}
	}
	
	public List<TraiterCommande> getAll() {
		try {
			return traiterCommandeRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}
}
