package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.delicesafpa.beans.EtreSup;

import fr.cda.delicesafpa.dao.EtreSupRepository;

import fr.cda.delicesafpa.dto.EtreSupDTO;

import fr.cda.delicesafpa.interfaceServ.EtreSupServiceI;

import fr.cda.delicesafpa.util.EtreSupConverter;


@Service
public class EtreSupService implements  EtreSupServiceI {
	@Autowired
	private  EtreSupRepository  etreSupRepository;
	
	
	public EtreSupDTO save(EtreSupDTO etreSupDTO) {
		try {

			EtreSup r = EtreSupConverter.convertToEntity(etreSupDTO);
			etreSupRepository.save(r);
		} catch (Exception e) {

		}
		return etreSupDTO;
	}

	public List<EtreSupDTO> getAll() {
		try {
			List<EtreSupDTO> listDto = new ArrayList<EtreSupDTO>();
			List<EtreSup> listDao = etreSupRepository.findAll();
			for (EtreSup t : listDao) {
				listDto.add(EtreSupConverter.convertToDto(t));
			}

			return listDto;

		} catch (Exception e) {
			return null;
		}

	}


	
}
