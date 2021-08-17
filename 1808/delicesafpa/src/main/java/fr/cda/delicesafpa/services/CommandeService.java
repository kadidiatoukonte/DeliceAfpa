package fr.cda.delicesafpa.services;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.CommandeRepository;
import fr.cda.delicesafpa.dao.EmployeRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.TraiterCommandeRepository;
import fr.cda.delicesafpa.dto.AddCommandeDTO;
import fr.cda.delicesafpa.dto.AddTraiterCommandeDTO;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.AssignerLivreurDTO;
import fr.cda.delicesafpa.dto.CommandeDTO;
import fr.cda.delicesafpa.dto.CommandeTableDetailDTO;
import fr.cda.delicesafpa.dto.RoleEmployeDTO;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeTableDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.CommandeServiceI;
import fr.cda.delicesafpa.interfaceServ.TraiterCommandeServiceI;
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

	@Autowired
	private EmployeRepository employeRepository;

	@Autowired
	private TraiterCommandeRepository traiterCommandeRepository;

	@Autowired
	TraiterCommandeServiceI traiterCommandeService;

	public CommandeDTO saveAddCommande(AddCommandeDTO ADDcommandeDTO) {
		CommandeDTO c = new CommandeDTO();

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
			Idpanier = Idpanier.replaceAll("\\p{Punct}", "");
			int id = Integer.valueOf(Idpanier);

			System.out.println(panierRepository.findById(id).get());
			c.setPanier(panierRepository.findById(id).get());
			int time = ADDcommandeDTO.getHoraire();
			int p1 = time % 60;
			int p2 = time / 60;
			int p3 = p2 % 60;
			p2 = p2 / 60;
			System.out.print(p2 + ":" + p3 + ":" + p1);
			LocalTime timeLocal = LocalTime.of(p2, p3);
			System.out.print(p2 + ":" + p3 + ":" + p1);
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

	public CommandeDTO save(CommandeDTO commandeDTO) {
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

	public List<TraiterCommandeTableDTO> findCommandeOnCourse() {
		List<TraiterCommandeTableDTO> listCommandeOnCourseDto = new ArrayList<TraiterCommandeTableDTO>();
		System.out.println("1");
		List<CommandeDTO> listDto = getAll();
		System.out.println("2");

		for (CommandeDTO t : listDto) {
			System.out.println(t);

			System.out.println("3");
			System.out.println(t);
			if (traiterCommandeService.findStatusActuel(t) == null) {
				System.out.println("ops ops");
			} else {
				int st = traiterCommandeService.findStatusActuel(t).getIdstatus();
				System.out.println("4");

				if (st != 3 && st != 5) {
					System.out.println("5");

					int idcommande = t.getIdcommande();

					String adresse = t.getAdressecommande();

					LocalTime time = t.getHoraire();
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm");

					String timeString = time.format(formatter);

					TraiterCommandeTableDTO tOnC = new TraiterCommandeTableDTO(idcommande, st, timeString, adresse);
					listCommandeOnCourseDto.add(tOnC);

				}

			}

		}

		return listCommandeOnCourseDto;

	}

	public List<TraiterCommandeTableDTO> findCommandeOnCourseLivreur(int id) {
		List<TraiterCommandeTableDTO> list = findCommandeOnCourse();
		List<TraiterCommandeTableDTO> listLivreur = new ArrayList<TraiterCommandeTableDTO>();
		System.out.println("1");

		for (TraiterCommandeTableDTO t : list) {
			System.out.println("2");
			int i = t.getIdcommande();
			System.out.println("3" + i);
			Commande c = commandeRepository.findById(i).get();
			
			System.out.println(c);
if(c.getEmploye()==null) 
{if ((t.getIdstatus() == 2 && t.getAdresse().contains("emporter") == false )) {    
	


	listLivreur.add(t);

}

}
else  if(t.getIdstatus() == 4 && id == c.getEmploye().getIdemploye()){
	
	
	   System.out.println("5");

		listLivreur.add(t);
	
	
}		
		System.out.println("4");
			System.out.println("3" + id);
			
			System.out.println("6");
			System.out.println(c);
		}
	
		return listLivreur;
	}

	public CommandeTableDetailDTO getByIdTableDetail(int id) {
		try {
			Commande a = commandeRepository.findById(id).get();
			/*
			 * (String adressecommande, String horaire, String nomclient, String telephone)
			 */
			CommandeTableDetailDTO aDTO = new CommandeTableDetailDTO();
			TraiterCommande t = traiterCommandeRepository.findTraitComActuel(a);

			LocalTime time = a.getHoraire();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm");

			String timeString = time.format(formatter);

			aDTO.setAdressecommande(a.getAdressecommande());

			aDTO.setHoraire(timeString);

			aDTO.setTelephone(a.getIdclient().getTelclient());
			aDTO.setNomclient(a.getIdclient().getNomclient() + "    " + a.getIdclient().getPrenomclient());
			aDTO.setStatus(t.getIdstatus().getIdstatus());
			return aDTO;
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}

	public AssignerLivreurDTO updateCommandeLivreur(AssignerLivreurDTO a)

	{
		System.out.println("1");
		Commande c = commandeRepository.findById(a.getIdcommande()).get();
		System.out.println("2");

		c.setEmploye(employeRepository.findById(a.getIdlivreur()).get());
		System.out.println("3");

		commandeRepository.save(c);
		System.out.println("4");

		return a;

	}

}
