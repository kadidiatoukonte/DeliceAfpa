package fr.cda.delicesafpa.util;



import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.steadystate.css.parser.ParseException;

import fr.cda.delicesafpa.beans.ConcernerId;
import fr.cda.delicesafpa.beans.ConcernerPanArt;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterCommandeId;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.beans.TraiterReservationId;
import fr.cda.delicesafpa.dto.ConcernerPanArtDTO;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterReservationDTO;

@Component
public class ConcernerPanArtConverter {
	
	
	public static ConcernerPanArtDTO convertToDto(ConcernerPanArt concernerPanArt) {
		ModelMapper mapper = new ModelMapper();
		ConcernerPanArtDTO map = mapper.map(concernerPanArt, ConcernerPanArtDTO.class);

		return map;
	}


	public static ConcernerPanArt convertToEntity(ConcernerPanArtDTO concernerPanArtDto) throws ParseException {
		ModelMapper modelMapper = new ModelMapper();

		ConcernerPanArt concernerPanArt = modelMapper.map(concernerPanArtDto, ConcernerPanArt.class);
		concernerPanArt.setId(new ConcernerId (concernerPanArtDto.getIdpanier().getIdpanier(),concernerPanArtDto.getIdarticle().getIdarticle()));
	 
	    return concernerPanArt;
	}

	
}
