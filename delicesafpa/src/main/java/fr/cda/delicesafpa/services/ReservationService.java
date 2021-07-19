package fr.cda.delicesafpa.services;

import java.util.ArrayList;
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
import fr.cda.delicesafpa.dto.ReservationDTO;
import fr.cda.delicesafpa.dto.RoleEmployeDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.util.ReservationConverter;
import fr.cda.delicesafpa.util.RoleEmployeConverter;

@Service
public class ReservationService implements ReservationServiceI {
	@Autowired
	private ReservationRepository reservationRepository;

	
	
	public void save(ReservationDTO reservationDTO) {
		try {

			Reservation r = ReservationConverter.dTOToEntity(reservationDTO);
			reservationRepository.save(r);
		} catch (Exception e) {

		}
	}

	public List<ReservationDTO> getAll() {
		try {
			List<ReservationDTO> listDto = new ArrayList<ReservationDTO>();
			List<Reservation> listDao = reservationRepository.findAll();
			for (Reservation t : listDao) {
				listDto.add(ReservationConverter.EntityToDTO(t));
			}

			return listDto;

		} catch (Exception e) {
			return null;
		}

	}

	public ReservationDTO getById(int id) {
		try {

			return ReservationConverter.EntityToDTO(reservationRepository.findById(id).get());
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}


	
	
	
	
	
	
}
