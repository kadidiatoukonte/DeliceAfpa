package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.ConcernerPanArt;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dao.ClientRepository;
import fr.cda.delicesafpa.dao.ConcernerPanArtRepository;
import fr.cda.delicesafpa.dao.PanierRepository;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.ConcernerPanArtDTO;
import fr.cda.delicesafpa.dto.PanierDTO;
import fr.cda.delicesafpa.dto.ReservationDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.PanierServiceI;
import fr.cda.delicesafpa.util.ConcernerPanArtConverter;
import fr.cda.delicesafpa.util.PanierConverter;
import fr.cda.delicesafpa.util.ReservationConverter;

@Service
public class PanierService implements PanierServiceI {
	
	
	@Autowired
	private PanierRepository panierRepository;
	
	
	@Autowired
	private	ConcernerPanArtRepository concernerPanArtRepository;

	
	public PanierDTO save() {
		try {

			Panier r = new Panier();
			panierRepository.save(r);
		int n =	panierRepository.findAll().size();
		PanierDTO panierDTO =new PanierDTO(); 
	 panierDTO =	PanierConverter.EntityToDTO(panierRepository.findById(n).get());
			return panierDTO;
		} catch (Exception e) {
return null;
		}
	}

	public List<PanierDTO> getAll() {
		try {
			List<PanierDTO> listDto = new ArrayList<PanierDTO>();
			List<Panier> listDao = panierRepository.findAll();
			for (Panier t : listDao) {
				listDto.add(PanierConverter.EntityToDTO(t));
			}

			return listDto;

		} catch (Exception e) {
			return null;
		}

	}

	public PanierDTO getById(int id) {
		try {

			return PanierConverter.EntityToDTO(panierRepository.findById(id).get());
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}

	public	Set<ConcernerPanArtDTO> findConcernerPanArtPanier( PanierDTO idpanier )

	{			Set<ConcernerPanArtDTO> concDTO = new HashSet<ConcernerPanArtDTO>();

	 System.out.println("ciao panier 1 ");

		try {
			
		    String Idpanier = idpanier.getIdpanier();     
		    Idpanier= Idpanier.replaceAll("\\p{Punct}", "");
		    int id= Integer.valueOf(Idpanier);
			 System.out.println("ciao panier 2 ");

		    System.out.println("ciao panier  "+id);

			 System.out.println("ciao panier 3 ");

				Set<ConcernerPanArt> concList =	concernerPanArtRepository.findConcernerPanArt(id);
			 System.out.println("ciao panier a 4 "+concList.size() );
for(ConcernerPanArt conc :concList )
{ concDTO.add( ConcernerPanArtConverter.convertToDto(conc))   ; 
}

System.out.println(concDTO.size());
//§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
			return concDTO;
		} catch (Exception NoSuchElementException) {
			
			 System.out.println("error " );

			return null;
		}
	}
	
	
	
}
