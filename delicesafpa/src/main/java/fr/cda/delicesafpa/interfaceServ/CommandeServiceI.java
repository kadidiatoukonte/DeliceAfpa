package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.dto.AddCommandeDTO;
import fr.cda.delicesafpa.dto.CommandeDTO;

public interface CommandeServiceI {

	public	CommandeDTO  save(CommandeDTO commandeDTO);
	public List<CommandeDTO > getAll();
	public CommandeDTO  getById(int id);
	public CommandeDTO  saveAddCommande(AddCommandeDTO  ADDcommandeDTO) ;

}
