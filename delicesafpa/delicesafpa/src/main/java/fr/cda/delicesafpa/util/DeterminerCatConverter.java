package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.DeterminerCatDTO;



@Component
public class DeterminerCatConverter {
	
	
	public DeterminerCatDTO EntityToDTO(DeterminerCat determinerCat) {
		ModelMapper mapper = new ModelMapper();
		DeterminerCatDTO map = mapper.map(determinerCat, DeterminerCatDTO.class);
		return map;
	}

	
	
	public List<DeterminerCatDTO> EntityToDTO(List<DeterminerCat> determinerCats) {

		return determinerCats.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}
	
	
	
	

	public DeterminerCat dTOToEntity(DeterminerCatDTO determinerCat) {
		ModelMapper mapper = new ModelMapper();
		DeterminerCat map = mapper.map(determinerCat, DeterminerCat.class);
		return map;
	}

	public List<DeterminerCat> dTOToEntity(List<DeterminerCatDTO> determinerCat) {

		return determinerCat.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}


}
