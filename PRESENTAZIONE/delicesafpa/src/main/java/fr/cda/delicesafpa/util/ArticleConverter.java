package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.dto.ArticleDTO;



@Component
public class ArticleConverter {
	
	
	public ArticleDTO EntityToDTO(Article article) {
		ModelMapper mapper = new ModelMapper();
		ArticleDTO map = mapper.map(article, ArticleDTO.class);
		return map;
	}

	public List<ArticleDTO> EntityToDTO(List<Article> article) {

		return article.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}

	public static Article dTOToEntity(ArticleDTO article) {
		ModelMapper mapper = new ModelMapper();
		Article map = mapper.map(article, Article.class);
		return map;
	}

	public List<Article> dTOToEntity(List<ArticleDTO> article) {

		return article.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}


}
