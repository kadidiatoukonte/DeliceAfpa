package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.AssignerRole;

public interface AssignerRoleServiceI {

	public	void save(AssignerRole assignerRole);
	public List<AssignerRole> getAll();
}
