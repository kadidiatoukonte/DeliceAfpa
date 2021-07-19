package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.ConcernerPanArt;
import fr.cda.delicesafpa.beans.DeterminerArt;
import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.beans.DeterminerCatId;
import fr.cda.delicesafpa.dao.DeterminerArtRepository;
import fr.cda.delicesafpa.dao.DeterminerCatRepository;
import fr.cda.delicesafpa.dto.ConcernerPanArtDTO;
import fr.cda.delicesafpa.dto.DeterminerArtDTO;
import fr.cda.delicesafpa.interfaceServ.DeterminerArtServiceI;
import fr.cda.delicesafpa.interfaceServ.DeterminerCatServiceI;
import fr.cda.delicesafpa.util.ConcernerPanArtConverter;
import fr.cda.delicesafpa.util.DeterminerArtConverter;




@Service
public class DetArticleService implements DeterminerArtServiceI {
	@Autowired
	private DeterminerArtRepository determinerArtRepository;
	@Autowired
	private DeterminerArtConverter determinerArtConverter;
	
	public DeterminerArtDTO save(DeterminerArtDTO  determinerArtDTO ) {
		
	try {
		DeterminerArt determinerArt= determinerArtConverter.convertToEntity(determinerArtDTO);
			determinerArtRepository.save(determinerArt);
		} catch (Exception e) {
			
		}
	return determinerArtDTO;
	}
	
	public List<DeterminerArtDTO > getAll() {
		
		try {
			List<DeterminerArt> ass = determinerArtRepository.findAll();
			List<DeterminerArtDTO> assDTO = new ArrayList<DeterminerArtDTO>();
			for (DeterminerArt a : ass) {
				assDTO.add(determinerArtConverter.convertToDto(a));
			}

			return assDTO;
		} catch (Exception e) {
			return null;
		}
		
	}
	

	



	
	
}
