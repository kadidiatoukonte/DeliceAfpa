package fr.cda.delicesafpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.dto.ReservationDTO;
import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.StatusReservationServiceI;
import fr.cda.delicesafpa.interfaceServ.TraiterReservationServiceI;
import fr.cda.delicesafpa.services.TraiterReservationService;

	
@RestController
public class ReservationController {
	
	@Autowired
	ReservationServiceI reservationService;
 
 	@Autowired
 	TraiterReservationServiceI traiterReservationService;
 
 	@Autowired
	StatusReservationServiceI statusReservationService;

 

 	@PostMapping("/addReservation")
		public ReservationDTO addReservation(@RequestBody ReservationDTO reservationDTO) {
			System.out.println(reservationDTO);
			return reservationService.save(reservationDTO);
		
		}
 
 	@GetMapping("/reservation/{idreservation}")
	public ReservationDTO getReservation(@PathVariable("idreservation") int idreservation) {
		return reservationService.getById(idreservation);//   .orElse(null);
	}


 	@PutMapping("/updateReservation/")
	public Object updateReservation(@RequestBody ReservationDTO reservationDTO)
	{
		System.out.println(reservationDTO);
	return reservationService.save(reservationDTO);
	}
	
 	
 	@GetMapping(value="/allReservation")
	public List<ReservationDTO> getAllReservation() {
		List<ReservationDTO> listreservationDTO =reservationService.getAll();
		System.out.println(listreservationDTO);
		return listreservationDTO;
	}
 	
 	
/*
 	//TraiterReservationService
 	@PostMapping("/addTraiterReservation")
		public TraiterReservation addTraiterReservation(@RequestBody TraiterReservation traiterReservation) {
			System.out.println(traiterReservation);
			return traiterReservationService.save(traiterReservation);
		
		}
 	
 	@GetMapping("/reservation/{idreservation}")
	public Reservation getTraiterReservation(@PathVariable("idreservation") int idreservation) {
		return reservationService.getById(idreservation);//   .orElse(null);
	}

 	@GetMapping(value="/allReservation")
	public List<TraiterReservation> getAllTraiterReservation() {
		List<TraiterReservation> listTraiterReservation =TraiterReservationService.getAll();
		System.out.println(listTraiterReservation);
		return listTraiterReservation;
	}

 	
 	// à finir
 	public TraiterReservation findTraitResActuel(Reservation res) {
		return null;
 		
 	}
 	
 	public StatusReservation findStatusActuel(Reservation res) {
		return null;
 		
 	}
 	*/
}
