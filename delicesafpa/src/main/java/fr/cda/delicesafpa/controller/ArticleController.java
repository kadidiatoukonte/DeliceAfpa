package fr.cda.delicesafpa.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.DeterminerArtDTO;
import fr.cda.delicesafpa.dto.EtreSupDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.DeterminerArtServiceI;
import fr.cda.delicesafpa.interfaceServ.EtreSupServiceI;


@RestController
public class ArticleController {

	@Autowired
	DeterminerArtServiceI determinerArtService;
	
	
	@Autowired
	ArticleServiceI articleService;
	
	@Autowired
	EtreSupServiceI etreSupService;
	

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
		System.out.println(list.size());
		return list;
	}
	
	
	@PutMapping("/updateArticle/")
	public Object updateArticle(@RequestBody ArticleDTO articleDTO )
	{
		System.out.println(articleDTO);
	return articleService.save(articleDTO);
	}


	@PostMapping("/adddeterminerArt")
	public DeterminerArtDTO addDeterminerArt(@RequestBody DeterminerArtDTO determinerArtDTO) {
	
		return determinerArtService.save(determinerArtDTO);
	}
 
	
	@GetMapping(value="/alldetarticle")
	public List<DeterminerArtDTO> getAllDetArticle() {
		List<DeterminerArtDTO> list =determinerArtService.getAll();
		System.out.println(list.size());
		return list;
	}
	
	@PostMapping("/addetresup")
	public EtreSupDTO addEtreSup(@RequestBody EtreSupDTO etreSupDTO) {

		return etreSupService.save(etreSupDTO);
	}
 
	
	@GetMapping(value="/getalletresup")
	public List<EtreSupDTO> getAllEtreSup() {
		List<EtreSupDTO> list =etreSupService.getAll();
		System.out.println(list.size());
		return list;
	}
	
	@GetMapping(value="/findOffrespeciale")
	public Set<ArticleDTO> findOffrespeciale(){
		
		return articleService.findOffrespeciale();
		
	}

	
	
}