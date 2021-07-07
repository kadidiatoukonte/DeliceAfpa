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
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.CategorieServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;

@Service
public class CategorieService implements CategorieServiceI {
	@Autowired
	private CategorieRepository categorieRepository;
	
	
	public void save(Categorie categorie) {
		try {
			categorieRepository.save(categorie);
		} catch (Exception e) {
			
		}
	}
	
	public List<Categorie> getAll() {
		try {
			return categorieRepository.findAll();
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public Categorie getById(int id) {
		try {
		return categorieRepository.findById(id).get();
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
