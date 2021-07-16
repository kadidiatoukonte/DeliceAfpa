package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.RoleEmploye;

public interface RoleEmployeServiceI {

	public	void save(RoleEmploye roleEmploye);
	public List<RoleEmploye> getAll();
}
