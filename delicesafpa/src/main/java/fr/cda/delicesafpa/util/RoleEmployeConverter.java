package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.dto.ReservationDTO;
import fr.cda.delicesafpa.dto.RoleEmployeDTO;

@Component
public class RoleEmployeConverter {
	public RoleEmployeDTO EntityToDTO(RoleEmploye roleEmploye) {
		ModelMapper mapper = new ModelMapper();
		RoleEmployeDTO map = mapper.map(roleEmploye, RoleEmployeDTO.class);
		return map;
	}

	public List<RoleEmployeDTO> EntityToDTO(List<RoleEmploye> roleEmploye) {

		return roleEmploye.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}

	public RoleEmploye dTOToEntity(RoleEmployeDTO roleEmploye) {
		ModelMapper mapper = new ModelMapper();
		RoleEmploye map = mapper.map(roleEmploye, RoleEmploye.class);
		return map;
	}

	public List<RoleEmploye> dTOToEntity(List<RoleEmployeDTO> roleEmploye) {

		return roleEmploye.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}
}
