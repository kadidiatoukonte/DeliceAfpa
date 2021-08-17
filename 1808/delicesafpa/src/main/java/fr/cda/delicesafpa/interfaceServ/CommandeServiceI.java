package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.dto.AddCommandeDTO;
import fr.cda.delicesafpa.dto.AssignerLivreurDTO;
import fr.cda.delicesafpa.dto.CommandeDTO;
import fr.cda.delicesafpa.dto.CommandeTableDetailDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeTableDTO;

public interface CommandeServiceI {

	public	CommandeDTO  save(CommandeDTO commandeDTO);
	public List<CommandeDTO > getAll();
	public CommandeDTO  getById(int id);
	public CommandeDTO  saveAddCommande(AddCommandeDTO  ADDcommandeDTO) ;
	public List<TraiterCommandeTableDTO> findCommandeOnCourse() ;
	public 	CommandeTableDetailDTO getByIdTableDetail(int id) ;
	public AssignerLivreurDTO updateCommandeLivreur(AssignerLivreurDTO  a );
	public List<TraiterCommandeTableDTO> findCommandeOnCourseLivreur(int id) ;

}
