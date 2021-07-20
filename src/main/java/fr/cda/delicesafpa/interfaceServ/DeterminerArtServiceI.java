package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.DeterminerArt;
import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.beans.DeterminerCatId;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.dto.DeterminerArtDTO;

public interface DeterminerArtServiceI {

	public	DeterminerArtDTO  save(DeterminerArtDTO determinerArtDTO);
	public List<DeterminerArtDTO > getAll();

}
