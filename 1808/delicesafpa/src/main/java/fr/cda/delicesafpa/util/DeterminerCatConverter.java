package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.steadystate.css.parser.ParseException;


import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.beans.DeterminerCatId;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.DeterminerArtDTO;
import fr.cda.delicesafpa.dto.DeterminerCatDTO;



@Component
public class DeterminerCatConverter {
	
	public static DeterminerCatDTO convertToDto(DeterminerCat determinerCat) {
		ModelMapper modelMapper = new ModelMapper();
	    DeterminerCatDTO postDto = modelMapper.map(determinerCat, DeterminerCatDTO.class);
	    postDto.setDate(determinerCat.getId().getDate());
	    postDto.setIdcategorie(determinerCat.getCategorie());
	    postDto.setIdemploye(determinerCat.getEmploye());
	    
	    return postDto;
	}

	/*ModelMapper modelMapper = new ModelMapper();

		DeterminerArtDTO postDto = modelMapper.map(determinerArt, DeterminerArtDTO.class);
	    postDto.setDate(determinerArt.getId().getDate());
	    return postDto;*/
	
	
	

	public static DeterminerCat convertToEntity(DeterminerCatDTO postDto) throws ParseException {
		ModelMapper modelMapper = new ModelMapper();

		DeterminerCat post = modelMapper.map(postDto, DeterminerCat.class);
	 
	            post.setId((new DeterminerCatId(postDto.getIdcategorie().getIdcategorie(),
	            		postDto.getIdemploye().getIdemploye(),postDto.getDate())));
	        		
	               post.setCategorie(postDto.getIdcategorie());
	             	post.setEmploye(postDto.getIdemploye());
	        		
	        		
	    return post;
	}


}
