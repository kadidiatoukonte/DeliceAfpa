package fr.cda.delicesafpa.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.AssignerRole;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dao.AssignerRoleRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.AssignerRoleServiceI;




@Service
public class AssignerRoleService implements AssignerRoleServiceI {
	@Autowired
	private AssignerRoleRepository assignerRoleRepository;
	
	
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
	
	
	
	
}
