package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.delicesafpa.beans.Reservation;

import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.beans.TraiterReservation;

import fr.cda.delicesafpa.dao.TraiterReservationRepository;
import fr.cda.delicesafpa.dto.ReservationDTO;
import fr.cda.delicesafpa.dto.StatusReservationDTO;
import fr.cda.delicesafpa.dto.TraiterReservationDTO;

import fr.cda.delicesafpa.interfaceServ.TraiterReservationServiceI;
import fr.cda.delicesafpa.util.TraiterReservationConverter;
import fr.cda.delicesafpa.util.*;

@Service
public class TraiterReservationService implements TraiterReservationServiceI {
	@Autowired
	private TraiterReservationRepository traiterReservationRepository;

	public void save(TraiterReservationDTO traiterReservationDTO) {
		try {

			TraiterReservation traiterReservation = TraiterReservationConverter.convertToEntity(traiterReservationDTO);

			traiterReservationRepository.save(traiterReservation);
		} catch (Exception e) {

		}
	}

	public List<TraiterReservationDTO> getAll() {
		try {
			List<TraiterReservationDTO> listDto = new ArrayList<TraiterReservationDTO>();
			List<TraiterReservation> listDao = traiterReservationRepository.findAll();
			for (TraiterReservation t : listDao) {
				listDto.add(TraiterReservationConverter.convertToDto(t));
			}

			return listDto;
		} catch (Exception e) {
			return null;
		}
	}

	/* findTraitResActuel(Reservation res) */
	public TraiterReservationDTO findTraitResActuel(ReservationDTO resDto) {
		try {
			Reservation r = ReservationConverter.dTOToEntity(resDto);
			TraiterReservation ta = traiterReservationRepository.findTraitResActuel(r);
			TraiterReservationDTO t = TraiterReservationConverter.convertToDto(ta);
			return t;
		} catch (Exception e) {
			return null;
		}

	}

	public StatusReservationDTO findStatusActuel(ReservationDTO resDto) {

		try {
			Reservation r = ReservationConverter.dTOToEntity(resDto);

			TraiterReservation t = traiterReservationRepository.findTraitResActuel(r);
			StatusReservation st = t.getIdstatus();
			StatusReservationDTO stDto = StatusReservationConverter.convertToDto(st);
			return stDto;

		} catch (Exception e) {
			return null;
		}

	}

}
