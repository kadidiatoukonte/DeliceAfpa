package fr.cda.delicesafpa.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.dao.StatusCommandeRepository;
import fr.cda.delicesafpa.dto.StatusCommandeDTO;
import fr.cda.delicesafpa.interfaceServ.StatusCommandeServiceI;
import fr.cda.delicesafpa.util.StatusCommandeConverter;

@Service
public class StatusCommandeService implements StatusCommandeServiceI {
	@Autowired
	private StatusCommandeRepository statusCommandeRepository;

	public void save(StatusCommandeDTO StCommandeDTO) {
		try {

			StatusCommande s = StatusCommandeConverter.convertToEntity(StCommandeDTO);

			statusCommandeRepository.save(s);
		} catch (Exception e) {

		}
	}

	public List<StatusCommandeDTO> getAll() {
		try {
			List<StatusCommandeDTO> listDto = new ArrayList<StatusCommandeDTO>();
			List<StatusCommande> listDao = statusCommandeRepository.findAll();
			for (StatusCommande t : listDao) {
				listDto.add(StatusCommandeConverter.convertToDto(t));
			}

			return listDto;

		} catch (Exception e) {
			return null;
		}

	}

	public StatusCommandeDTO getById(int id) {
		try {

			return StatusCommandeConverter.convertToDto(statusCommandeRepository.findById(id).get());
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}

}
