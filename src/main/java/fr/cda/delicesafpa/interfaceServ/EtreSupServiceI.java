package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.EtreSup;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.dto.EtreSupDTO;

public interface EtreSupServiceI {
	public EtreSupDTO save(EtreSupDTO etreSup);
	public List<EtreSupDTO> getAll();
}
