package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Commande;

public interface CommandeServiceI {

	public	void save(Commande commande);
	public List<Commande> getAll();
	public Commande getById(int id);
}
