package fr.cda.delicesafpa.interfaceServ;

import java.util.List;
import java.util.Set;

import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.dto.ReservationDTO;
import fr.cda.delicesafpa.dto.StatusReservationDTO;
import fr.cda.delicesafpa.dto.TraiterReservationDTO;

public interface TraiterReservationServiceI {
	
	public TraiterReservationDTO save(TraiterReservationDTO traiterReservationDTO);
	
	public List<TraiterReservationDTO> getAll();
	
	public TraiterReservationDTO findTraitResActuel(ReservationDTO res);
	
	public StatusReservationDTO findStatusActuel(ReservationDTO res) ;

}
