package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Panier;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.dto.StatusReservationDTO;

public interface StatusReservationServiceI {

	
	public	void save(StatusReservationDTO statusReservation);
	public	List<StatusReservationDTO> getAll();
	public StatusReservationDTO getById(int id) ;
}
