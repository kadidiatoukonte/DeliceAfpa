package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.dto.ReservationDTO;

public interface ReservationServiceI {
	/**/public ReservationDTO save(ReservationDTO reservation);
	/**/public List<ReservationDTO> getAll();
	/**/public ReservationDTO getById(int id) ;
}
