package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.dto.ClientDTO;
import fr.cda.delicesafpa.dto.PanierDTO;

@Component
public class PanierConverter {

	public static PanierDTO EntityToDTO(Panier panier) {
		ModelMapper mapper = new ModelMapper();
		PanierDTO map = mapper.map(panier, PanierDTO.class);
		return map;
	}

	public List<PanierDTO> EntityToDTO(List<Panier> panier) {

		return panier.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}

	public static Panier dTOToEntity(PanierDTO panier) {
		ModelMapper mapper = new ModelMapper();
		Panier map = mapper.map(panier, Panier.class);
		return map;
	}

	public List<Panier> dTOToEntity(List<PanierDTO> panier) {

		return panier.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}
}
