package fr.cda.delicesafpa.formulaire;

import java.util.HashMap;
import java.util.Map;
import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.dto.ArticleDTO;

public class VerifArticle {

	public static boolean verifArticle(String nomarticle, String prixarticle, String descriptionarticle,
			String visibilitearticle, String offrespecialearticle, String categorie) {
		
		Map<String, String> listVide = new HashMap<>();
		
		if (nomarticle.isEmpty()){
			listVide.put("nomarticle", "Veuillez renseigner le champs nom");
			System.out.println("Veuillez renseigner le champs nom");//à retirer
			return false;
		} else
			listVide.put("nomarticle", "");
		
		if (descriptionarticle.isEmpty()){
			listVide.put("descriptionarticle", "Veuillez renseigner le champs description");
			System.out.println("Veuillez renseigner le champs description");//à retirer
			return false;
		} else
			listVide.put("descriptionarticle", "");
		
		if (categorie.isEmpty()){
			listVide.put("categorie", "Veuillez renseigner le champs catégorie");
			System.out.println("Veuillez renseigner le champs catégorie");//à retirer
			return false;
		} else
			try {
			int ncategorie= Integer.parseInt(categorie);
			listVide.put("categorie", "");
			} catch (NumberFormatException e) {
				listVide.put("categorie", " veuillez saisir un chiffre");
				System.out.println("veuillez saisir un chiffre");//à retirer
				return false;
			}
		
		if (visibilitearticle.isEmpty()){
			listVide.put("visibilitearticle", "Veuillez renseigner le champs visibilé article");
			System.out.println("Veuillez renseigner le champs visibilé article");//à retirer
			return false;
		
		} else {
		if (visibilitearticle !="true" && visibilitearticle != "false") {
			listVide.put("visibilitearticle", "Veuillez renseigner le champs visibilité article valid(true/false)");
			System.out.println("Veuillez renseigner le champs visibilité article valid(true/false)");//à retirer
				return false;
		}
	}
			
		
		if (offrespecialearticle.isEmpty()){
			listVide.put("visibilitearticle", "Veuillez renseigner le champs offre spécial article");
			System.out.println("Veuillez renseigner le champs  offre spécial article");//à retirer
			return false;
		} else {
			if (offrespecialearticle !="true" && offrespecialearticle != "false") {
				listVide.put("offrespecialearticle", "Veuillez renseigner le champs  offre spécial article valid (true/false)");
				System.out.println("Veuillez renseigner le champs  offre spécial article valid (true/false)");//à retirer
					return false;
			}
		}
		
		if (prixarticle.isEmpty()) {
			listVide.put("prixarticle", "Veuillez saisir un prix pour l'article");
			System.out.println("Veuillez saisir un prix pour l'article");//à retirer
			return false;
		} else {
			try {
				int num = Integer.parseInt(prixarticle);
			} catch (NumberFormatException e) {
				listVide.put("prixarticle", " veuillez saisir un chiffre");
				System.out.println("veuillez saisir un chiffre");//à retirer
				return false;
			}
		}
		
		return true;

	}

	public static boolean verifArticle(ArticleDTO articleDTO) {
		if (articleDTO.equals(null))
			return false;
		return true;

	}

	public static boolean verifArticle(Article article) {
		if (article.equals(null))
			return false;
		return true;
	}

}
