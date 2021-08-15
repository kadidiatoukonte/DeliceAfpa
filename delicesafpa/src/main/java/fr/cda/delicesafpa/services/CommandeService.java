package fr.cda.delicesafpa.services;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.CommandeRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dto.AddCommandeDTO;
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
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private PanierRepository panierRepository;
	
	
	
	public CommandeDTO  saveAddCommande(AddCommandeDTO  ADDcommandeDTO) {
		CommandeDTO c = new CommandeDTO	();	
		

		try {
			c.setAdressecommande(ADDcommandeDTO.getAdressecommande());
			System.out.println(ADDcommandeDTO.getAdressecommande());
			Date today = new Date();
             System.out.println(today);
             java.sql.Date sqlDate = new java.sql.Date(today.getTime());
			
			System.out.println(sqlDate);
			c.setDatecommande(sqlDate);
			
			c.setIdclient(clientRepository.findById(ADDcommandeDTO.getIdclient()).get());
			c.setTotcommande(ADDcommandeDTO.getTotcommande());
			   String Idpanier = ADDcommandeDTO.getIdpanier();     
			    Idpanier= Idpanier.replaceAll("\\p{Punct}", "");
			    int id= Integer.valueOf(Idpanier);
			
			
		System.out.println(panierRepository.findById(id).get());
			c.setPanier(panierRepository.findById(id).get());
			int time = ADDcommandeDTO.getHoraire();
			int p1 = time % 60;
		    int p2 = time / 60;
		    int p3 = p2 % 60;
		    p2 = p2 / 60;
		    System.out.print( p2 + ":" + p3 + ":" + p1);	
		    LocalTime timeLocal = LocalTime.of(p2, p3);
		    System.out.print( p2 + ":" + p3 + ":" + p1);
		    c.setHoraire(timeLocal);
			
			
			
			Commande commande = commandeConverter.convertToEntity(c);
					commandeRepository.save(commande);
					int idCD = commandeRepository.findAll().size();
					c.setIdcommande(idCD);
		} catch (Exception e) {
			System.out.println("errore");
		}
		
		return c;
	}
	
	
	public CommandeDTO  save(CommandeDTO  commandeDTO) {
		try {
			Commande commande = commandeConverter.convertToEntity(commandeDTO);
					commandeRepository.save(commande);
					int id = commandeRepository.findAll().size();
					commandeDTO.setIdcommande(id);
		} catch (Exception e) {
			
		}
		
		System.out.println(commandeDTO);
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
