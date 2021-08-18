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
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.ClientDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.ClientServiceI;
import fr.cda.delicesafpa.util.ClientConverter;

@Service
public class ClientService implements ClientServiceI {

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ClientConverter clientConverter;

	public ClientDTO save(ClientDTO clientDTO) {
		try {
			
			ClientDTO c = findclientBMail(clientDTO.getMailclient()) ;
		if(c==null) {
			
			Client client = ClientConverter.dTOToEntity(clientDTO);
			clientRepository.save(client);}
		
		else {clientDTO=null;}
		} catch (Exception e) {

		}
		return clientDTO;
	}

	public List<ClientDTO> getAll() {
		try {
			List<Client> client = clientRepository.findAll();
			List<ClientDTO> clientDTO = clientConverter.EntityToDTO(client);
			return clientDTO;

		} catch (Exception e) {
			return null;
		}

	}

	public ClientDTO getById(int id) {
		try {
			Client a = clientRepository.findById(id).get();
			ClientDTO aDTO = clientConverter.EntityToDTO(a);
			return aDTO;
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}

	public boolean findclientMailclient(String email, String password) {
		try {

			System.out.println(password);

			int result = clientRepository.findclientMailclient(email).getPasswordclient().compareTo(password);
			if (result == 0) {

				return true;
			} else {
				System.out.println(password);
				return false;
			}

		} catch (Exception NoSuchElementException) {

			return false;
		}
	}

	public ClientDTO findclientBMail(String email) {
		try {

			Client c = clientRepository.findclientMailclient(email);
			ClientDTO cDTO = clientConverter.EntityToDTO(c);
			return cDTO;

		} catch (Exception NoSuchElementException) {

			return null;
		}
	}

	public int findclientIdByMail(String email) {
		int id = 0;
		try {

			Client c = clientRepository.findclientMailclient(email);
			id = c.getIdclient();
			return id;

		} catch (Exception NoSuchElementException) {

			return id;
		}
	}

}
