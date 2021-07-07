package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.AssignerRole;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.RoleEmploye;

public interface AssignerRoleServiceI {

	public	void save(AssignerRole assignerRole);
	public List<AssignerRole> getAll();
	public AssignerRole findAssRoleActuel(Employe employe);
	public RoleEmploye findRoleActuel(Employe employe);
	public List<AssignerRole> findListRole(RoleEmploye role);
	public List<Employe> findListLivreurSOnline();
}
