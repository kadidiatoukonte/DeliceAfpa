package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;

public interface CategorieServiceI {
	public	void save(Categorie categorie);
	public	List<Categorie> getAll();
	public Categorie getById(int id) ;
	public void updateNomCategorie(String nom, int idcategorie);
	public void updateDescriptionCategorie(String description, int idcategorie);
	public void updateVisibiliteCategorie(boolean v, int idcategorie);
}
