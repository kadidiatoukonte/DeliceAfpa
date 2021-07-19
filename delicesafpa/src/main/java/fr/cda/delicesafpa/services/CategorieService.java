package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.dao.CategorieRepository;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.ReservationRepository;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.CategorieDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.CategorieServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.util.CategorieConverter;

@Service
public class CategorieService implements CategorieServiceI {
	@Autowired
	private CategorieRepository categorieRepository;
	@Autowired
	private CategorieConverter categorieConverter;
	
	
	public CategorieDTO save(CategorieDTO categorieDTO) {
		try {
			Categorie categorie = categorieConverter.dTOToEntity(categorieDTO);
			categorieRepository.save(categorie);
		} catch (Exception e) {
			
		}
		return categorieDTO;
	}
	
	public List<CategorieDTO> getAll() {
		try {
			List<Categorie> categorie = categorieRepository.findAll();
			List<CategorieDTO> categorieDTO = categorieConverter.EntityToDTO(categorie);
			return categorieDTO;
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public CategorieDTO getById(int id) {
		try {
		Categorie c =categorieRepository.findById(id).get();
		CategorieDTO cDTO = categorieConverter.EntityToDTO(c);
		return cDTO;
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}
	
	
	public void updateNomCategorie(String nom, int idcategorie) {
		try {

			categorieRepository.updateNomCategorie(nom, idcategorie);
			

		} catch (Exception e) {
			System.out.println("catch");
		}

	}
	
	public void updateDescriptionCategorie(String d, int idcategorie) {
		try {

			categorieRepository.updateDescriptionCategorie(d, idcategorie);
			

		} catch (Exception e) {
			System.out.println("catch");
		}

	}
	
	
	public void updateVisibiliteCategorie(boolean v, int idcategorie) {
		try {

			categorieRepository.updateVisibiliteCategorie(v, idcategorie);
			

		} catch (Exception e) {
			System.out.println("catch");
		}

	}
	
	
	
}
