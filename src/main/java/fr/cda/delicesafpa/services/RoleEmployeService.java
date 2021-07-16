package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.dao.RoleEmployeRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.RoleEmployeServiceI;

@Service
public class RoleEmployeService implements RoleEmployeServiceI {
	@Autowired
	private RoleEmployeRepository roleEmployeRepository;
	
	
	public void save(RoleEmploye roleEmploye) {
		try {
			roleEmployeRepository.save(roleEmploye);
		} catch (Exception e) {
			
		}
	}
	
	public List<RoleEmploye> getAll() {
		try {
			return roleEmployeRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}
}
