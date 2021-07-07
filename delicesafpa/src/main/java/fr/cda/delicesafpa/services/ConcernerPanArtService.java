package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.ConcernerPanArt;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.ConcernerPanArtRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.ClientServiceI;
import fr.cda.delicesafpa.interfaceServ.ConcernerPanArtServiceI;

@Service
public class ConcernerPanArtService implements ConcernerPanArtServiceI {

	@Autowired
	private ConcernerPanArtRepository concernerPanArtRepository;

	public void save(ConcernerPanArt concernerPanArt) {
		try {
			concernerPanArtRepository.save(concernerPanArt);
		} catch (Exception e) {

		}
	}

	public List<ConcernerPanArt> getAll() {
		try {
			return concernerPanArtRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}
}
