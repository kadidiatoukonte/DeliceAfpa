package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;

public interface StatusCommandeServiceI {
	
	public void save(StatusCommandeDTO statusCommande);
	public List<StatusCommandeDTO> getAll();
	public StatusCommandeDTO getById(int id) ;

}
