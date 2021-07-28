package fr.cda.delicesafpa.util;



import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.steadystate.css.parser.ParseException;

import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterCommandeId;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.beans.TraiterReservationId;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterReservationDTO;

@Component
public class StatusCommandeConverter {
	
	
	public static StatusCommandeDTO convertToDto(StatusCommande statusCommande) {
		ModelMapper mapper = new ModelMapper();
		StatusCommandeDTO map = mapper.map(statusCommande, StatusCommandeDTO.class);

		return map;
	}


	public static StatusCommande convertToEntity(StatusCommandeDTO statusCommandeDto) throws ParseException {
		ModelMapper modelMapper = new ModelMapper();

		StatusCommande statusCommande = modelMapper.map(statusCommandeDto, StatusCommande.class);
		
	 
	    return statusCommande;
	}

	
}
