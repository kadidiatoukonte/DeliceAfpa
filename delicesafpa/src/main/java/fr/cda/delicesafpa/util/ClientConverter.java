package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.ClientDTO;

@Component
public class ClientConverter {
	
	
	public ClientDTO EntityToDTO(Client client) {
		ModelMapper mapper = new ModelMapper();
		ClientDTO map = mapper.map(client, ClientDTO.class);
		return map;
	}

	public List<ClientDTO> EntityToDTO(List<Client> client) {

		return client.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}

	public Client dTOToEntity(ClientDTO client) {
		ModelMapper mapper = new ModelMapper();
		Client map = mapper.map(client, Client.class);
		return map;
	}

	public List<Client> dTOToEntity(List<ClientDTO> client) {

		return client.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}

}
