package fr.cda.delicesafpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.ClientServiceI;

@Service
public class ClientService implements ClientServiceI {

	@Autowired
	private ClientRepository clientRepository;

	public Client save(Client client) {
		try {
			clientRepository.save(client);
		} catch (Exception e) {

		}
		return client;
	}

	public List<Client> getAll() {
		try {
			return clientRepository.findAll();
		} catch (Exception e) {
			return null;
		}

	}


	public Client getById(int id) {
		try {
		return clientRepository.findById(id).get();
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}





}
