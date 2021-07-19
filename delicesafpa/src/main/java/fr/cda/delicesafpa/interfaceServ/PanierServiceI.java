package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dto.PanierDTO;

public interface PanierServiceI {

	
	public	void save(PanierDTO panier);
	public	List<PanierDTO> getAll();
	public PanierDTO getById(int id) ;

}
