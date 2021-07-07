package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.Reservation;

public interface EmployeServiceI {
	public void save(Employe employe);
	public List<Employe> getAll();
	public Employe getById(int id) ;
	public void updateNomEmploye(String nom, int idemploye);
	public void updatePrenomEmploye(String prenom, int idemploye);
	public void updateTelEmploye(String tel, int idemploye);
	public void updateEmailEmploye(String mail, int idemploye);
	public void updatePassEmploye(String pass, int idemploye);
	public void updateOnlineEmploye(boolean online, int idemploye);
}
