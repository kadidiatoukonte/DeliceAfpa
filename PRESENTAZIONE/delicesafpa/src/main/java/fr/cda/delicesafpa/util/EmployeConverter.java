package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.dto.EmployeDTO;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.dto.ReservationDTO;

@Component
public class EmployeConverter {
	
	public static EmployeDTO EntityToDTO(Employe employe) {
		ModelMapper mapper = new ModelMapper();
		EmployeDTO map = mapper.map(employe, EmployeDTO.class);
		return map;
	}

	public List<EmployeDTO> EntityToDTO(List<Employe> employe) {

		return employe.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}

	public static Employe dTOToEntity(EmployeDTO employe) {
		ModelMapper mapper = new ModelMapper();
		Employe map = mapper.map(employe, Employe.class);
		return map;
	}

	public List<Employe> dTOToEntity(List<EmployeDTO> employe) {

		return employe.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}
}
