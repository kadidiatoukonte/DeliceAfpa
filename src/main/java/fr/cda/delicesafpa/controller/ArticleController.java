package fr.cda.delicesafpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.EmployeServiceI;


@RestController
public class ArticleController {

	@Autowired
	ArticleServiceI articleService;

	@PostMapping("/addArticle")
	public ArticleDTO addArticle(@RequestBody ArticleDTO articleDTO) {
		System.out.println(articleDTO);
		return articleService.save(articleDTO);
	}

	@GetMapping("/article/{idarticle}")
	public ArticleDTO getArticle(@PathVariable("idarticle") int idarticle) {
		return articleService.getById(idarticle);
	}
	
	@GetMapping(value="/allArticle")
	public List<ArticleDTO> getAllArticle() {
		List<ArticleDTO> list =articleService.getAll();
		System.out.println(list);
		return list;
	}
	
	
	@PutMapping("/updateArticle/")
	public Object updateArticle(@RequestBody ArticleDTO articleDTO )
	{
		System.out.println(articleDTO);
	return articleService.save(articleDTO);
	}
}
