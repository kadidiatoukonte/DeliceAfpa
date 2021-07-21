package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.dao.RoleEmployeRepository;
import fr.cda.delicesafpa.dto.RoleEmployeDTO;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.RoleEmployeServiceI;
import fr.cda.delicesafpa.util.RoleEmployeConverter;
import fr.cda.delicesafpa.util.StatusCommandeConverter;

@Service
public class RoleEmployeService implements RoleEmployeServiceI {
	@Autowired
	private RoleEmployeRepository roleEmployeRepository;
	
	public RoleEmployeDTO save(RoleEmployeDTO roleEmployeDTO) {
		try {

			RoleEmploye r = RoleEmployeConverter.dTOToEntity(roleEmployeDTO);
			roleEmployeRepository.save(r);
		} catch (Exception e) {

		}
		return roleEmployeDTO;
	}

	public List<RoleEmployeDTO> getAll() {
		try {
			List<RoleEmployeDTO> listDto = new ArrayList<RoleEmployeDTO>();
			List<RoleEmploye> listDao = roleEmployeRepository.findAll();
			for (RoleEmploye t : listDao) {
				listDto.add(RoleEmployeConverter.EntityToDTO(t));
			}

			return listDto;

		} catch (Exception e) {
			return null;
		}

	}

	public RoleEmployeDTO getById(int id) {
		try {

			return RoleEmployeConverter.EntityToDTO(roleEmployeRepository.findById(id).get());
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}


	
	
	
}
