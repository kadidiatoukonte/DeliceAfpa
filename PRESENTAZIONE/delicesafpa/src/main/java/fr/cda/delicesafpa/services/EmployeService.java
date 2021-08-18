package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import fr.cda.delicesafpa.beans.Employe;

import fr.cda.delicesafpa.dao.EmployeRepository;

import fr.cda.delicesafpa.dto.EmployeDTO;

import fr.cda.delicesafpa.interfaceServ.EmployeServiceI;

import fr.cda.delicesafpa.util.EmployeConverter;


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
			List<Employe> listDao =employeRepository.findAll(Sort.by(Sort.Direction.ASC, "idemploye"));
			for (Employe t : listDao) {
				listDto.add(EmployeConverter.EntityToDTO(t));
			}
			System.out.println("ciao");
System.out.println(listDto.size());
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

	
	public boolean findemployeMailemploye(String email, String password) {
		try {
			
			
			System.out.println(email);
			System.out.println("00");

			System.out.println(employeRepository.findemployeMailEmploye(email));
			System.out.println("01");

			int result = employeRepository.findemployeMailEmploye(email).getPasswordemploye().compareTo(password);
			System.out.println("aaa");
			if (result == 0) {
				
				return true;
			} else {	System.out.println(email);
			System.out.println("ciao  non uguale??");
			System.out.println(	employeRepository.findemployeMailEmploye(email).getPasswordemploye());
			System.out.println(password);

				return false;
			}

		} catch (Exception NoSuchElementException) {
			System.out.println("ciao2");

			return false;
		}
	}
	
	public EmployeDTO getemployeMailemploye(String email, String password) {
		try {
			
			System.out.println(password);
			
			Employe result = employeRepository.findemployeMailEmploye(email);
			System.out.println("aaa");
			if (result!=null) {
				System.out.println(password);
				return EmployeConverter.EntityToDTO(result);	} else {	System.out.println(email);
				System.out.println(password);


				return null;
			}

		} catch (Exception NoSuchElementException) {
			
			return null;
		}
	}
	
}