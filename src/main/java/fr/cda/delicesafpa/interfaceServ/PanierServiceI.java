package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Panier;

public interface PanierServiceI {

	
	public	void save(Panier panier);
	public	List<Panier> getAll();

}
