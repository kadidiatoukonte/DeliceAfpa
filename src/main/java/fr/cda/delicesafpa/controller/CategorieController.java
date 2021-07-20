package fr.cda.delicesafpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.dto.CategorieDTO;
import fr.cda.delicesafpa.interfaceServ.CategorieServiceI;
import fr.cda.delicesafpa.interfaceServ.DeterminerCatServiceI;


@RestController
public class CategorieController {

	@Autowired
	CategorieServiceI categorieService;

	@Autowired
	DeterminerCatServiceI determinerCatService; 
	
	//partie pour catégorie
	
	@PostMapping("/addCategorie")
	public CategorieDTO addCategorie(@RequestBody CategorieDTO categorieDTO) {
		System.out.println(categorieDTO);
		return categorieService.save(categorieDTO);
	}

	@GetMapping("/categorie/{idcategorie}")
	public CategorieDTO getCategorie(@PathVariable("idcategorie") int idcategorie) {
		return categorieService.getById(idcategorie);// .orElse(null);
	}
	

	@PutMapping("/updateCategorie/")
	public CategorieDTO updateCategorie(@RequestBody CategorieDTO categorieDTO)
	{
		System.out.println(categorieDTO );
		return categorieService.save(categorieDTO);
	}
	
	@GetMapping(value = "/allCategorie")
	public	List<CategorieDTO> getAllCategorie(){
			List<CategorieDTO> listCategorieDTO =categorieService.getAll();
			System.out.println(listCategorieDTO);
			return listCategorieDTO;
}
	/*
	//partie pour determiner catégorie
	
	 @GetMapping(value = "/allDeterminerCat")
	public list<DeterminerCatServiceI> getAllDeterminerCatDTO(){
		
		List<DeterminerCatDTO> listDeterminerCatDTO =determinerCatService.getAll();
		
	}
	*/
}
