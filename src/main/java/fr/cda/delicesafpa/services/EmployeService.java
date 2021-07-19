package fr.cda.delicesafpa.services;

import java.util.ArrayList;
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
import fr.cda.delicesafpa.dto.EmployeDTO;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.EmployeServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.util.EmployeConverter;
import fr.cda.delicesafpa.util.PanierConverter;

@Service
public class EmployeService implements EmployeServiceI {
	@Autowired
	private EmployeRepository employeRepository;
	

	public EmployeDTO save(EmployeDTO employeDTO) {
		try {

			Employe r = EmployeConverter.dTOToEntity(employeDTO);
			employeRepository.save(r);
		} catch (Exception e) {

		}
		return employeDTO;
	}

	public List<EmployeDTO> getAll() {
		try {
			List<EmployeDTO> listDto = new ArrayList<EmployeDTO>();
			List<Employe> listDao =employeRepository.findAll();
			for (Employe t : listDao) {
				listDto.add(EmployeConverter.EntityToDTO(t));
			}

			return listDto;

		} catch (Exception e) {
			return null;
		}

	}

	public EmployeDTO getById(int id) {
		try {

			return EmployeConverter.EntityToDTO(employeRepository.findById(id).get());
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
