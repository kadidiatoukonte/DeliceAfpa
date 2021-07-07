package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.TraiterCommande;

public interface TraiterCommandeServiceI {
	
	public void save(TraiterCommande traiterCommande);
	
	public List<TraiterCommande> getAll();
	
	public TraiterCommande findTraitComActuel(Commande com);
	
	public List<TraiterCommande> findTraitComByIdCommande(Commande com);
	
	
	public StatusCommande findStatusActuel(Commande com); 

}
