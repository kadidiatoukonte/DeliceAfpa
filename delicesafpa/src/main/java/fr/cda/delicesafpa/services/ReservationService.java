package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;

@Service
public class ReservationService implements ReservationServiceI {
	@Autowired
	private ReservationRepository reservationRepository;
	
	
	public void save(Reservation reservation) {
		try {
			reservationRepository.save(reservation);
		} catch (Exception e) {
			
		}
	}
	

	public List<Reservation> getAll() {
		try {
			return reservationRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}
	
	public Reservation getById(int id) {
		try {
		return reservationRepository.findById(id).get();
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}

	
	
	
	
	
}
