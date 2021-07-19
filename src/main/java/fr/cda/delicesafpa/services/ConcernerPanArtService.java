package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.AssignerRole;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.ConcernerPanArt;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.ConcernerPanArtRepository;
import fr.cda.delicesafpa.dto.AssignerRoleDTO;
import fr.cda.delicesafpa.dto.ConcernerPanArtDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.ClientServiceI;
import fr.cda.delicesafpa.interfaceServ.ConcernerPanArtServiceI;
import fr.cda.delicesafpa.util.ConcernerPanArtConverter;

@Service
public class ConcernerPanArtService implements ConcernerPanArtServiceI {

	@Autowired
	private ConcernerPanArtRepository concernerPanArtRepository;
	@Autowired
	private ConcernerPanArtConverter concernerPanArtConverter;

	public ConcernerPanArtDTO save(ConcernerPanArtDTO concernerPanArtDTO) {
		try {
			ConcernerPanArt concernerPanArt = concernerPanArtConverter.convertToEntity(concernerPanArtDTO);
			concernerPanArtRepository.save(concernerPanArt);
		} catch (Exception e) {

		}
		return concernerPanArtDTO;
	}

	public List<ConcernerPanArtDTO> getAll() {
		try {
			List<ConcernerPanArt> ass = concernerPanArtRepository.findAll();
			List<ConcernerPanArtDTO> assDTO = new ArrayList<ConcernerPanArtDTO>();
			for (ConcernerPanArt a : ass) {
				assDTO.add(ConcernerPanArtConverter.convertToDto(a));
			}

			return assDTO;
		} catch (Exception e) {
			return null;
		}

	}
}
