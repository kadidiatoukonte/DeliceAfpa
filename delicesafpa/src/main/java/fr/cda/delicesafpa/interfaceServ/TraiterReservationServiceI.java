package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.StatusCommande;
import fr.cda.delicesafpa.beans.StatusReservation;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterReservation;

public interface TraiterReservationServiceI {
	
	public void save(TraiterReservation traiterReservation);
	
	public List<TraiterReservation> getAll();
	
	public TraiterReservation findTraitResActuel(Reservation res);
	
	public StatusReservation findStatusActuel(Reservation res) ;

}
