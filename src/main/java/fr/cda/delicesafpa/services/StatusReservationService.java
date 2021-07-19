package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.dao.StatusReservationRepository;
import fr.cda.delicesafpa.dto.StatusReservationDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.StatusReservationServiceI;
import fr.cda.delicesafpa.util.StatusReservationConverter;
import fr.cda.delicesafpa.util.TraiterCommandeConverter;

@Service
public class StatusReservationService implements StatusReservationServiceI {
	@Autowired
	private StatusReservationRepository statusReservationRepository;
	
	
	public void save(StatusReservationDTO StReservationDTO) {
		try {
			
			StatusReservation s = StatusReservationConverter.convertToEntity(StReservationDTO);
			
			statusReservationRepository.save(s);
		} catch (Exception e) {
			
		}
	}
	

	public List<StatusReservationDTO> getAll() {
		try {
			List<StatusReservationDTO> listDto = new ArrayList<StatusReservationDTO>();
			List<StatusReservation> listDao = statusReservationRepository.findAll();
			for (StatusReservation t : listDao) {
				listDto.add(StatusReservationConverter.convertToDto(t));
			}

			return listDto;
			
			
		} catch (Exception e) {
			return null;
		}

	}
	
	public StatusReservationDTO getById(int id) {
		try {
			
		return StatusReservationConverter.convertToDto(statusReservationRepository.findById(id).get());
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}

	
	
	
	
	
	
}
