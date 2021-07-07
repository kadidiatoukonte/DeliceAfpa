package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.EmployeRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.EmployeServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;

@Service
public class EmployeService implements EmployeServiceI {
	@Autowired
	private EmployeRepository employeRepository;
	
	
	public void save(Employe employe) {
		try {
			employeRepository.save(employe);
		} catch (Exception e) {
			
		}
	}
	
	public List<Employe> getAll() {
		try {
			return employeRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}
	
	public Employe getById(int id) {
		try {
		return employeRepository.findById(id).get();
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}

	
	public void updateNomEmploye(String nom, int idemploye) {
		try {

			employeRepository.updateNomEmploye(nom, idemploye);
			

		} catch (Exception e) {
			System.out.println("catch");
		}

	}
	
	public void updatePrenomEmploye(String pnom, int idemploye) {
		try {

			employeRepository.updatePrenomEmploye(pnom, idemploye);
			

		} catch (Exception e) {
			System.out.println("catch");
		}

	}
	public void updateTelEmploye(String tel, int idemploye) {
		try {

			employeRepository.updateTelEmploye(tel, idemploye);
			

		} catch (Exception e) {
			System.out.println("catch");
		}

	}
	public void updateEmailEmploye(String mail, int idemploye) {
		try {

			employeRepository.updateEmailEmploye(mail, idemploye);
			

		} catch (Exception e) {
			System.out.println("catch");
		}

	}
	public void updatePassEmploye(String pass, int idemploye) {
		try {

			employeRepository.updatePassEmploye(pass, idemploye);
			

		} catch (Exception e) {
			System.out.println("catch");
		}

	}
	public void updateOnlineEmploye(boolean o, int idemploye) {
		try {

			employeRepository.updateOnlineEmploye(o, idemploye);
			

		} catch (Exception e) {
			System.out.println("catch");
		}

	}
	
	
	
}
