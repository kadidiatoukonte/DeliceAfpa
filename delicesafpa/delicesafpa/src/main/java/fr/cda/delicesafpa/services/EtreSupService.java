package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.EtreSup;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.EmployeRepository;
import fr.cda.delicesafpa.dao.EtreSupRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.EmployeServiceI;
import fr.cda.delicesafpa.interfaceServ.EtreSupServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;

@Service
public class EtreSupService implements  EtreSupServiceI {
	@Autowired
	private  EtreSupRepository  etreSupRepository;
	
	
	public void save( EtreSup  etreSup) {
		try {
			etreSupRepository.save(etreSup);
		} catch (Exception e) {
			
		}
	}
	
	public List< EtreSup> getAll() {
		try {
			return etreSupRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}
}
