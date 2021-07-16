package fr.cda.delicesafpa.formulaire;

import java.util.HashMap;
import java.util.Map;

import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.dto.CategorieDTO;
public class VerifCategorie {
	

	public static boolean verifCategorie(String nomcategorie,String descriptioncategorie,String visibilitecategorie){
	
	Map<String, String> listVide = new HashMap<>();
	
	if (nomcategorie.isEmpty()){
			listVide.put("nomcategorie", "Veuillez renseigner le champs nom catégorie");
			System.out.println("Veuillez renseigner le champs nom catégorie");//à retirer
			return false;
		} else
			listVide.put("nomcategorie", "");
	
	if (descriptioncategorie.isEmpty()){
			listVide.put("descriptioncategorie", "Veuillez remplir le champs description catégorie");
			System.out.println("Veuillez remplir le champs description catégorie");//à retirer
			return false;
		} else
			listVide.put("descriptioncategorie", "");
	
		if (visibilitecategorie.isEmpty()) {
			listVide.put("visibilitecategorie", "Veuillez indiquer une visibilité catégorie ");
		    System.out.println("Veuillez indiquer une visibilité catégorie ");
		} else {  
			if( visibilitecategorie !="true" && visibilitecategorie != "false"){
			listVide.put("visibilitecategorie", "Veuillez indiquer une visibilité catégorie valide (true/false)");
			System.out.println("Veuillez indiquer une visibilité catégorie valide (true/false)");//à retirer
			return false;
		}
		}
		return true;
	}
	
	
	public static boolean verifCategorie(CategorieDTO categorieDTO) {
		if (categorieDTO.equals(null))
			return false;
		return true;

	}

	public static boolean verifCategorie(Categorie categorie) {
		if (categorie.equals(null))
			return false;
		return true;
	}

}
