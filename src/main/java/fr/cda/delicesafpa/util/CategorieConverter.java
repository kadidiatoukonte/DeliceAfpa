package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.dto.CategorieDTO;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.dto.ReservationDTO;

@Component
public class CategorieConverter {
	
	public CategorieDTO EntityToDTO(Categorie categorie) {
		ModelMapper mapper = new ModelMapper();
		CategorieDTO map = mapper.map(categorie, CategorieDTO.class);
		return map;
	}

	public List<CategorieDTO> EntityToDTO(List<Categorie> categorie) {

		return categorie.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}

	public Categorie dTOToEntity(CategorieDTO categorie) {
		ModelMapper mapper = new ModelMapper();
		Categorie map = mapper.map(categorie, Categorie.class);
		return map;
	}

	public List<Categorie> dTOToEntity(List<CategorieDTO> categorie) {

		return categorie.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}
}
