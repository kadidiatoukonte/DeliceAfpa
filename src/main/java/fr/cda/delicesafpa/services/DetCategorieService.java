package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.DeterminerArt;
import fr.cda.delicesafpa.beans.DeterminerCat;
import fr.cda.delicesafpa.beans.DeterminerCatId;
import fr.cda.delicesafpa.dao.DeterminerCatRepository;
import fr.cda.delicesafpa.dto.DeterminerArtDTO;
import fr.cda.delicesafpa.dto.DeterminerCatDTO;
import fr.cda.delicesafpa.interfaceServ.DeterminerCatServiceI;
import fr.cda.delicesafpa.util.DeterminerCatConverter;




@Service
public class DetCategorieService implements DeterminerCatServiceI {
	@Autowired
	private DeterminerCatRepository determinerCatRepository;
	@Autowired
	private DeterminerCatConverter determinerCatConverter;
	
	
	public DeterminerCatDTO save(DeterminerCatDTO determinerCatDTO) {
		
		try {
			DeterminerCat determinerCat = determinerCatConverter.convertToEntity(determinerCatDTO);
			
			determinerCatRepository.save(determinerCat);
		} catch (Exception e) {
			
		}
		return determinerCatDTO;
	}
	
	public List<DeterminerCatDTO> getAll() {
		try {
			List<DeterminerCat> ass = determinerCatRepository.findAll();
			List<DeterminerCatDTO> assDTO = new ArrayList<DeterminerCatDTO>();
			for (DeterminerCat a : ass) {
				assDTO.add(determinerCatConverter.convertToDto(a));
			}

			return assDTO;
		} catch (Exception e) {
			return null;
		}
		
	}
	

	



	
	
}
