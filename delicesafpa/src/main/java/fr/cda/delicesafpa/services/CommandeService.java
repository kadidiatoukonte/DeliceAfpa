package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.CommandeRepository;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.CommandeDTO;
import fr.cda.delicesafpa.dto.RoleEmployeDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.CommandeServiceI;
import fr.cda.delicesafpa.util.CommandeConverter;
import fr.cda.delicesafpa.util.RoleEmployeConverter;




@Service
public class CommandeService implements CommandeServiceI {
	@Autowired
	private CommandeRepository commandeRepository;
	@Autowired
	private CommandeConverter commandeConverter;
	
	public CommandeDTO  save(CommandeDTO  commandeDTO) {
		try {
			Commande commande = commandeConverter.convertToEntity(commandeDTO);
					commandeRepository.save(commande);
		} catch (Exception e) {
			
		}
		
		return commandeDTO;
	}
	
	public List<CommandeDTO> getAll() {
		try {
			List<CommandeDTO> listDto = new ArrayList<CommandeDTO>();
			List<Commande> listDao = commandeRepository.findAll();
			for (Commande t : listDao) {
				listDto.add(CommandeConverter.EntityToDTO(t));
			}

			return listDto;

		} catch (Exception e) {
			return null;
		}
		
	}
	public CommandeDTO getById(int id) {
		try {
			Commande a = commandeRepository.findById(id).get();
			CommandeDTO aDTO = commandeConverter.EntityToDTO(a);
			return aDTO;
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}
	
	
}
