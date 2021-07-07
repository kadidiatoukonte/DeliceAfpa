package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.StatusCommande;

public interface StatusCommandeServiceI {
	
	public void save(StatusCommande statusCommande);
	public List<StatusCommande> getAll();
	public StatusCommande getById(int id) ;

}
