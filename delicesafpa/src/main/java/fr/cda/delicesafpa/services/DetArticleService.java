package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.DeterminerArt;
import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.beans.DeterminerCatId;
import fr.cda.delicesafpa.dao.DeterminerArtRepository;
import fr.cda.delicesafpa.dao.DeterminerCatRepository;
import fr.cda.delicesafpa.interfaceServ.DeterminerArtServiceI;
import fr.cda.delicesafpa.interfaceServ.DeterminerCatServiceI;




@Service
public class DetArticleService implements DeterminerArtServiceI {
	@Autowired
	private DeterminerArtRepository determinerArtRepository;
	
	
	public void save(DeterminerArt determinerArt) {
		
		try {
			determinerArtRepository.save(determinerArt);
		} catch (Exception e) {
			
		}
	}
	
	public List<DeterminerArt> getAll() {
		try {
			return determinerArtRepository.findAll();
		} catch (Exception e) {
			return null;
		}
		
	}
	

	



	
	
}
