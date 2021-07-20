package fr.cda.delicesafpa.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.steadystate.css.parser.ParseException;

import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterCommandeId;
import fr.cda.delicesafpa.dto.CommandeDTO;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.dto.ReservationDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeDTO;

@Component
public class CommandeConverter {
	
	public static CommandeDTO EntityToDTO(Commande commande) {
		ModelMapper mapper = new ModelMapper();
		CommandeDTO map = mapper.map(commande, CommandeDTO.class);
		return map;
	}

	public static Commande convertToEntity(CommandeDTO commandeDto) throws ParseException {
		ModelMapper modelMapper = new ModelMapper();

		Commande commande = modelMapper.map(commandeDto, Commande.class);
		
	    return commande;
	}

}
