package fr.cda.delicesafpa.interfaceServ;

import java.util.List;
import java.util.Set;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dto.ConcernerPanArtDTO;
import fr.cda.delicesafpa.dto.PanierDTO;

public interface PanierServiceI {

	
	public	PanierDTO save();
	public	List<PanierDTO> getAll();
	public PanierDTO getById(int id) ;
	public	Set<ConcernerPanArtDTO> findConcernerPanArtPanier( PanierDTO panierDTO );

}
