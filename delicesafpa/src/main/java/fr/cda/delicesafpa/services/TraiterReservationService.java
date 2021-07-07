package fr.cda.delicesafpa.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.beans.TraiterReservationId;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.dao.RoleEmployeRepository;
import fr.cda.delicesafpa.dao.StatusCommandeRepository;
import fr.cda.delicesafpa.dao.TraiterCommandeRepository;
import fr.cda.delicesafpa.dao.TraiterReservationRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.RoleEmployeServiceI;

import fr.cda.delicesafpa.interfaceServ.TraiterReservationServiceI;

@Service
public class TraiterReservationService implements TraiterReservationServiceI {
	@Autowired
	private TraiterReservationRepository traiterReservationRepository;

	public void save(TraiterReservation traiterReservation) {
		try {
			traiterReservationRepository.save(traiterReservation);
		} catch (Exception e) {

		}
	}

	public List<TraiterReservation> getAll() {
		try {
			return traiterReservationRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}

	/* findTraitResActuel(Reservation res) */
	public TraiterReservation findTraitResActuel(Reservation res) {
		try {
			return traiterReservationRepository.findTraitResActuel(res);
		} catch (Exception e) {
			return null;
		}

	}
	
	public StatusReservation findStatusActuel(Reservation res) {
		
		try {
			TraiterReservation t = traiterReservationRepository.findTraitResActuel(res);
		return t.getIdstatus();
		
		} catch (Exception e) {
			return null;
		}

	}
	
	
	

}