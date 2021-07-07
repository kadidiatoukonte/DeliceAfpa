package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.dto.ReservationDTO;

@Component
public class ReservationConverter {
	public ReservationDTO EntityToDTO(Reservation reservation) {
		ModelMapper mapper = new ModelMapper();
		ReservationDTO map = mapper.map(reservation, ReservationDTO.class);
		return map;
	}

	public List<ReservationDTO> EntityToDTO(List<Reservation> reservation) {

		return reservation.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}

	public Reservation dTOToEntity(ReservationDTO reservation) {
		ModelMapper mapper = new ModelMapper();
		Reservation map = mapper.map(reservation, Reservation.class);
		return map;
	}

	public List<Reservation> dTOToEntity(List<ReservationDTO> reservation) {

		return reservation.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}
}
