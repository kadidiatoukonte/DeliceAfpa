package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.beans.DeterminerCatId;
import fr.cda.delicesafpa.dao.DeterminerCatRepository;
import fr.cda.delicesafpa.interfaceServ.DeterminerCatServiceI;




@Service
public class DetCategorieService implements DeterminerCatServiceI {
	@Autowired
	private DeterminerCatRepository determinerCatRepository;
	
	
	public void save(DeterminerCat determinerCat) {
		
		try {
			determinerCatRepository.save(determinerCat);
		} catch (Exception e) {
			
		}
	}
	
	public List<DeterminerCat> getAll() {
		try {
			return determinerCatRepository.findAll();
		} catch (Exception e) {
			return null;
		}
		
	}
	

	



	
	
}
