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
import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.dao.RoleEmployeRepository;
import fr.cda.delicesafpa.dao.StatusCommandeRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.RoleEmployeServiceI;
import fr.cda.delicesafpa.interfaceServ.StatusCommandeServiceI;

@Service
public class StatusCommandeService implements StatusCommandeServiceI {
	@Autowired
	private StatusCommandeRepository statusCommandeRepository;
	
	
	public void save(StatusCommande statusCommande) {
		try {
			statusCommandeRepository.save(statusCommande);
		} catch (Exception e) {
			
		}
	}
	
	public List<StatusCommande> getAll() {
		try {
			return statusCommandeRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}
	
	public StatusCommande getById(int id) {
		try {
		return statusCommandeRepository.findById(id).get();
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}

	
	
	
	
	
}