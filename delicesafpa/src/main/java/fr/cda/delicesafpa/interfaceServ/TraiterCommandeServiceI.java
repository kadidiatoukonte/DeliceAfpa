package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.dto.AddTraiterCommandeDTO;
import fr.cda.delicesafpa.dto.CommandeDTO;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeDTO;

public interface TraiterCommandeServiceI {
	
	public TraiterCommandeDTO save(TraiterCommandeDTO traiterCommande);
	
	public List<TraiterCommandeDTO> getAll();
	
	public TraiterCommandeDTO findTraitComActuel(CommandeDTO com);
	
/**/	public List<TraiterCommande> findTraitComByIdCommande(Commande com);
	
	
	public StatusCommandeDTO findStatusActuel(CommandeDTO com); 
	
	public TraiterCommandeDTO saveAdd(AddTraiterCommandeDTO addTraiterCommandeDTO);

}
