package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.DeterminerArt;
import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.DeterminerArtDTO;
import fr.cda.delicesafpa.dto.DeterminerCatDTO;



@Component
public class DeterminerArtConverter {
	
	
	public DeterminerArtDTO EntityToDTO(DeterminerArt determinerArt) {
		ModelMapper mapper = new ModelMapper();
		DeterminerArtDTO map = mapper.map(determinerArt, DeterminerArtDTO.class);
		return map;
	}

	
	
	public List<DeterminerArtDTO> EntityToDTO(List<DeterminerArt> determinerArts) {

		return determinerArts.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}
	
	
	
	

	public DeterminerArt dTOToEntity(DeterminerArtDTO determinerArt) {
		ModelMapper mapper = new ModelMapper();
		DeterminerArt map = mapper.map(determinerArt, DeterminerArt.class);
		return map;
	}

	public List<DeterminerArt> dTOToEntity(List<DeterminerArtDTO> determinerArt) {

		return determinerArt.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}


}
