package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.AssignerRole;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.ConcernerPanArt;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.ConcernerPanArtRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dto.AddProduitToPanierDTO;
import fr.cda.delicesafpa.dto.AssignerRoleDTO;
import fr.cda.delicesafpa.dto.ConcernerPanArtDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.ClientServiceI;
import fr.cda.delicesafpa.interfaceServ.ConcernerPanArtServiceI;
import fr.cda.delicesafpa.util.ArticleConverter;
import fr.cda.delicesafpa.util.ConcernerPanArtConverter;
import fr.cda.delicesafpa.util.PanierConverter;

@Service
public class ConcernerPanArtService implements ConcernerPanArtServiceI {

	@Autowired
	private ConcernerPanArtRepository concernerPanArtRepository;
	@Autowired
	private ConcernerPanArtConverter concernerPanArtConverter;
	@Autowired
	private PanierRepository panierRepository;
	@Autowired
	private ArticleRepository articleRepository;
	

	public ConcernerPanArtDTO save(AddProduitToPanierDTO addPro) {
		 ConcernerPanArtDTO newConcern = new ConcernerPanArtDTO();
		try {
			
		    String Idpanier = addPro.getIdpanier();     
		    Idpanier= Idpanier.replaceAll("\\p{Punct}", "");
		    int id= Integer.valueOf(Idpanier);
			 System.out.println("ciao panier  "+id);

		    String Idarticle = addPro.getIdarticle();        
		    Idarticle= Idarticle.replaceAll("\\p{Punct}", "");
		    int idart= Integer.valueOf(Idarticle);
			 System.out.println("ciao article   "+idart);

		    String qua = addPro.getQuantite();  
		    System.out.println(qua);
		    qua= qua.replaceAll("\\p{Punct}", "");
		    int intqua= Integer.valueOf(qua);
	

	 newConcern.setIdpanier(panierRepository.findById(id).get()	);
	System.out.println(  "trova panier");
	 newConcern.setIdarticle(articleRepository.findById(idart).get());
		System.out.println(  "trova article");

	 newConcern.setQuantitearticle(intqua);
			ConcernerPanArt concernerPanArt = concernerPanArtConverter.convertToEntity(newConcern);
			concernerPanArtRepository.save(concernerPanArt);

		} catch (Exception e) {
System.out.println("errore");
		}
		return newConcern;
	}

	public List<ConcernerPanArtDTO> getAll() {
		try {
			List<ConcernerPanArt> ass = concernerPanArtRepository.findAll();
			List<ConcernerPanArtDTO> assDTO = new ArrayList<ConcernerPanArtDTO>();
			for (ConcernerPanArt a : ass) {
				assDTO.add(ConcernerPanArtConverter.convertToDto(a));
			}

			return assDTO;
		} catch (Exception e) {
			return null;
		}

	}
}
