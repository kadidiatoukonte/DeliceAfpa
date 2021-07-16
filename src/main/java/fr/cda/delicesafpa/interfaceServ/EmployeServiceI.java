package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.Reservation;

public interface EmployeServiceI {
	public void save(Employe employe);
	public List<Employe> getAll();
}
