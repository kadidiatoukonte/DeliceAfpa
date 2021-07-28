package fr.cda.delicesafpa.util;



import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.steadystate.css.parser.ParseException;

import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.dto.StatusReservationDTO;



@Component
public class StatusReservationConverter {
	
	
	public static StatusReservationDTO convertToDto(StatusReservation statusReservation) {
		ModelMapper mapper = new ModelMapper();
		StatusReservationDTO map = mapper.map(statusReservation, StatusReservationDTO.class);

		return map;
	}


	public static StatusReservation convertToEntity(StatusReservationDTO statusReservationDto) throws ParseException {
		ModelMapper modelMapper = new ModelMapper();

		StatusReservation statusReservation = modelMapper.map(statusReservationDto, StatusReservation.class);
		
	 
	    return statusReservation;
	}

	
}
