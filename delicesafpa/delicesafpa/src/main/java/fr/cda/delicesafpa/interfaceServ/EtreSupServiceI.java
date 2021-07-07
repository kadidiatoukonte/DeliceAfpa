package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.EtreSup;
import fr.cda.delicesafpa.beans.Reservation;

public interface EtreSupServiceI {
	public void save(EtreSup etreSup);
	public List<EtreSup> getAll();
}
