package fr.cda.delicesafpa.util;



import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.steadystate.css.parser.ParseException;

import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterCommandeId;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.beans.TraiterReservationId;
import fr.cda.delicesafpa.dto.TraiterCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterReservationDTO;

@Component
public class TraiterReservationConverter {
	
	
	public static TraiterReservationDTO convertToDto(TraiterReservation traiterReservation) {
		ModelMapper mapper = new ModelMapper();
		TraiterReservationDTO map = mapper.map(traiterReservation, TraiterReservationDTO.class);
		map.setDate(traiterReservation.getId().getDate());
		return map;
	}


	public static TraiterReservation convertToEntity(TraiterReservationDTO traiterReservationDto) throws ParseException {
		ModelMapper modelMapper = new ModelMapper();

		TraiterReservation traiterReservation = modelMapper.map(traiterReservationDto, TraiterReservation.class);
		traiterReservation.setId(new TraiterReservationId(traiterReservationDto.getIdreservation().getIdreservation(),
				traiterReservationDto.getIdemploye().getIdemploye(),	
				traiterReservationDto.getIdstatus().getIdstatus()	,
				traiterReservationDto.getDate()
				));
	 
	    return traiterReservation;
	}

	
}
