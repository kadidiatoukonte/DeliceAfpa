package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.AssignerRole;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dto.AssignerRoleDTO;
import fr.cda.delicesafpa.dto.EmployeDTO;
import fr.cda.delicesafpa.dto.RoleEmployeDTO;

public interface AssignerRoleServiceI {

	public	AssignerRoleDTO save(AssignerRoleDTO assignerRole);
	public List<AssignerRoleDTO> getAll();
	public AssignerRoleDTO findAssRoleActuel(EmployeDTO employe);
	public RoleEmployeDTO findRoleActuel(EmployeDTO employe);
	public List<AssignerRoleDTO> findListRole(RoleEmployeDTO role);
	public List<EmployeDTO> findListLivreurSOnline();
}
