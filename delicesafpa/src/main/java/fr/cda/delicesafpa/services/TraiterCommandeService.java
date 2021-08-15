package fr.cda.delicesafpa.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.CommandeRepository;
import fr.cda.delicesafpa.dao.EmployeRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dao.StatusCommandeRepository;
import fr.cda.delicesafpa.dao.TraiterCommandeRepository;
import fr.cda.delicesafpa.dto.AddTraiterCommandeDTO;
import fr.cda.delicesafpa.dto.CommandeDTO;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;
import fr.cda.delicesafpa.dto.StatusReservationDTO;
import fr.cda.delicesafpa.dto.TraiterCommandeDTO;
import fr.cda.delicesafpa.dto.TraiterReservationDTO;
import fr.cda.delicesafpa.interfaceServ.TraiterCommandeServiceI;
import fr.cda.delicesafpa.util.CommandeConverter;
import fr.cda.delicesafpa.util.ReservationConverter;
import fr.cda.delicesafpa.util.StatusCommandeConverter;
import fr.cda.delicesafpa.util.StatusReservationConverter;
import fr.cda.delicesafpa.util.TraiterCommandeConverter;
import fr.cda.delicesafpa.util.TraiterReservationConverter;

@Service
public class TraiterCommandeService implements TraiterCommandeServiceI {
	@Autowired
	private TraiterCommandeRepository traiterCommandeRepository;

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
	private StatusCommandeRepository statusCommandeRepository;
	
	
	public TraiterCommandeDTO save(TraiterCommandeDTO traiterCommandeDTO) {
			
		
		try {
			TraiterCommande tc =	TraiterCommandeConverter.convertToEntity(traiterCommandeDTO);
			traiterCommandeRepository.save(tc);
		return traiterCommandeDTO;///
		} catch (Exception e) {
          return null;
		}
	}

	
	
	
	public TraiterCommandeDTO saveAdd(AddTraiterCommandeDTO addTraiterCommandeDTO) {
			
		TraiterCommandeDTO  tcDto  = new TraiterCommandeDTO();	
		LocalDateTime nowC = LocalDateTime.now();
int idC =Integer.valueOf(addTraiterCommandeDTO.getIdcommande());
int ide=Integer.valueOf(addTraiterCommandeDTO.getIdemploye());
int idstatus=Integer.valueOf(addTraiterCommandeDTO.getIdstatus());
		tcDto.setDate(nowC);

		tcDto.setIdcommande(		commandeRepository.findById(idC).get());
		
		tcDto.setIdemploye(employeRepository.findById(ide).get());

		tcDto.setIdstatus(		statusCommandeRepository.findById(idstatus).get());
		
		
		
		try {
			TraiterCommande tc =	TraiterCommandeConverter.convertToEntity(tcDto);
			traiterCommandeRepository.save(tc);
		return tcDto;///
		} catch (Exception e) {
          return null;
		}
	}

	
	
	
	public List<TraiterCommandeDTO> getAll() {
		try {
		//	return traiterCommandeRepository.findAll();
			List<TraiterCommandeDTO> listDto = new ArrayList<TraiterCommandeDTO>();
			List<TraiterCommande> listDao = traiterCommandeRepository.findAll();
			for (TraiterCommande t : listDao) {
				listDto.add(TraiterCommandeConverter.convertToDto(t));
			}

			return listDto;
		} catch (Exception e) {
			return null;
		}

	}

	public TraiterCommandeDTO findTraitComActuel(CommandeDTO comDto) {
		try {
			//return traiterCommandeRepository.findTraitComActuel(com);
			Commande c = CommandeConverter.convertToEntity(comDto);
			
			TraiterCommande ta = traiterCommandeRepository.findTraitComActuel(c);
			TraiterCommandeDTO t = TraiterCommandeConverter.convertToDto(ta);
			return t;
		
		
		
		} catch (Exception e) {
			return null;
		}

	}
/**//**/
	public List<TraiterCommande> findTraitComByIdCommande(Commande com) {
		try {
			return traiterCommandeRepository.findTraitComByIdCommande(com);
		} catch (Exception e) {
			return null;
		}

	}
/**//**/
	public StatusCommandeDTO findStatusActuel(CommandeDTO comDto) {

		try {
			Commande c = CommandeConverter.convertToEntity(comDto);

			TraiterCommande t = traiterCommandeRepository.findTraitComActuel(c);
			StatusCommande st = t.getIdstatus();
			StatusCommandeDTO stDto = StatusCommandeConverter.convertToDto(st);
			return stDto;

		} catch (Exception e) {
			return null;
		}

	}

}
