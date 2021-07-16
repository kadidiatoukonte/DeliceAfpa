package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Reservation;

public interface ReservationServiceI {
	public void save(Reservation reservation);
	public List<Reservation> getAll();
}
