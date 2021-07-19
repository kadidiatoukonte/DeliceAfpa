package fr.cda.delicesafpa.util;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.steadystate.css.parser.ParseException;

import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterCommandeId;

import fr.cda.delicesafpa.dto.TraiterCommandeDTO;

@Component
public class TraiterCommandeConverter {
	
	
	public static TraiterCommandeDTO convertToDto(TraiterCommande traiterCommande) {
		ModelMapper mapper = new ModelMapper();
		TraiterCommandeDTO map = mapper.map(traiterCommande, TraiterCommandeDTO.class);
		map.setDate(traiterCommande.getId().getDate());
		return map;
	}


	public static TraiterCommande convertToEntity(TraiterCommandeDTO traiterCommandeDto) throws ParseException {
		ModelMapper modelMapper = new ModelMapper();

		TraiterCommande traiterCommande = modelMapper.map(traiterCommandeDto, TraiterCommande.class);
		traiterCommande.setId((new TraiterCommandeId(traiterCommandeDto.getIdcommande().getIdcommande(),
				traiterCommandeDto.getIdemploye().getIdemploye(),traiterCommandeDto.getIdstatus().getIdstatus(),
				traiterCommandeDto.getDate())
	      ));
	 
	    return traiterCommande;
	}

	
}
