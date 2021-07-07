package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.dao.StatusReservationRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.StatusReservationServiceI;

@Service
public class StatusReservationService implements StatusReservationServiceI {
	@Autowired
	private StatusReservationRepository statusReservationRepository;
	
	
	public void save(StatusReservation reservation) {
		try {
			statusReservationRepository.save(reservation);
		} catch (Exception e) {
			
		}
	}
	

	public List<StatusReservation> getAll() {
		try {
			return statusReservationRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}
	
	public StatusReservation getById(int id) {
		try {
		return statusReservationRepository.findById(id).get();
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}

	
	
	
	
	
	
}
