package fr.cda.delicesafpa.interfaceServ;


import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.ConcernerPanArt;

public interface ConcernerPanArtServiceI {

	public	void save(ConcernerPanArt concernerPanArt);
	public	List<ConcernerPanArt> getAll();
}
