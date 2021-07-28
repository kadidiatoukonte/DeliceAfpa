package fr.cda.delicesafpa.interfaceServ;


import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.ConcernerPanArt;
import fr.cda.delicesafpa.dto.ConcernerPanArtDTO;

public interface ConcernerPanArtServiceI {

	public	ConcernerPanArtDTO  save(ConcernerPanArtDTO concernerPanArtDTO);
	public	List<ConcernerPanArtDTO> getAll();
}
