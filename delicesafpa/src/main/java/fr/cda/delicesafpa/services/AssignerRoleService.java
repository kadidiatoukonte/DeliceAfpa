package fr.cda.delicesafpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.AssignerRole;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.AssignerRoleRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.AssignerRoleServiceI;
import fr.cda.delicesafpa.interfaceServ.RoleEmployeServiceI;




@Service
public class AssignerRoleService implements AssignerRoleServiceI {
	@Autowired
	private AssignerRoleRepository assignerRoleRepository;
	
	@Autowired
	private	RoleEmployeServiceI roleEmployeService;
	
	public void save(AssignerRole assignerRole) {
		try {
			assignerRoleRepository.save(assignerRole);
		} catch (Exception e) {
			
		}
	}
	
	public List<AssignerRole> getAll() {
		try {
			return assignerRoleRepository.findAll();
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
	public AssignerRole findAssRoleActuel(Employe employe) {
		try {
			return assignerRoleRepository. findAssRoleActuel(employe);
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
	public RoleEmploye findRoleActuel(Employe employe) {
		try {
			return assignerRoleRepository. findAssRoleActuel(employe).getIdstatus();
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public List<AssignerRole> findListRole(RoleEmploye role) {
		try {
			return assignerRoleRepository. findListRole(role);
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public List<Employe> findListLivreurSOnline() {
		List<Employe>livreursOnline  = new ArrayList<Employe>();
		try {
			
			RoleEmploye role  = roleEmployeService.getById(3);
			List<AssignerRole> list = assignerRoleRepository. findListRole(role);
			
			
			for(AssignerRole a: list) {
			if(a.getIdemploye().getStatusemploye()==true) {
				livreursOnline.add(a.getIdemploye());
				
			}
			
			}
			
			
		} catch (Exception e) {
			
		}
		return livreursOnline;
		
	}
	
	
	
	
	
	
	
	
}
