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
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.dto.ReservationDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.util.PanierConverter;
import fr.cda.delicesafpa.util.ReservationConverter;

@Service
public class PanierService implements PanierServiceI {
	@Autowired
	private PanierRepository panierRepository;
	

	
	public PanierDTO save(PanierDTO panierDTO) {
		try {

			Panier r = PanierConverter.dTOToEntity(panierDTO);
			panierRepository.save(r);
			
			return panierDTO;
		} catch (Exception e) {
return null;
		}
	}

	public List<PanierDTO> getAll() {
		try {
			List<PanierDTO> listDto = new ArrayList<PanierDTO>();
			List<Panier> listDao = panierRepository.findAll();
			for (Panier t : listDao) {
				listDto.add(PanierConverter.EntityToDTO(t));
			}

			return listDto;

		} catch (Exception e) {
			return null;
		}

	}

	public PanierDTO getById(int id) {
		try {

			return PanierConverter.EntityToDTO(panierRepository.findById(id).get());
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}


	
	
	
	
}
