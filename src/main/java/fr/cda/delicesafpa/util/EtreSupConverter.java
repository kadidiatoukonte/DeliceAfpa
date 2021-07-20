package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.steadystate.css.parser.ParseException;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.AssignerRoleId;
import fr.cda.delicesafpa.beans.DeterminerArt;
import fr.cda.delicesafpa.beans.DeterminerArtId;
import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.beans.EtreSup;
import fr.cda.delicesafpa.beans.EtresupId;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.DeterminerArtDTO;
import fr.cda.delicesafpa.dto.DeterminerCatDTO;
import fr.cda.delicesafpa.dto.EtreSupDTO;



@Component
public class EtreSupConverter {
	
	public static EtreSupDTO convertToDto(EtreSup etreSup) {
		ModelMapper modelMapper = new ModelMapper();

		EtreSupDTO etreSupDTO = modelMapper.map(etreSup, EtreSupDTO.class);
	    return etreSupDTO;
	}


	public static EtreSup convertToEntity(EtreSupDTO etreSupDto) throws ParseException {
		ModelMapper modelMapper = new ModelMapper();

		EtreSup etreSup = modelMapper.map(etreSupDto, EtreSup.class);
		etreSup.setId((new EtresupId(etreSupDto.getIdarticle().getIdarticle(),
				etreSupDto.getIdarticle_etreSup().getIdarticle())
	      ));
	 
	    return etreSup;
	}


}
