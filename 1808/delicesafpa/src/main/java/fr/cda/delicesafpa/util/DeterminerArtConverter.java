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
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.DeterminerArtDTO;
import fr.cda.delicesafpa.dto.DeterminerCatDTO;



@Component
public class DeterminerArtConverter {
	
	public static DeterminerArtDTO convertToDto(DeterminerArt determinerArt) {
		ModelMapper modelMapper = new ModelMapper();

		DeterminerArtDTO postDto = modelMapper.map(determinerArt, DeterminerArtDTO.class);
	    postDto.setDate(determinerArt.getId().getDate());
	    return postDto;
	}


	public static DeterminerArt convertToEntity(DeterminerArtDTO postDto) throws ParseException {
		ModelMapper modelMapper = new ModelMapper();

		DeterminerArt post = modelMapper.map(postDto, DeterminerArt.class);
	
	 
	        post.setId((new DeterminerArtId(postDto.getIdarticle().getIdarticle(),
	        		postDto.getIdemploye().getIdemploye(),postDto.getDate()))
	      );
	    return post;
	}


}
