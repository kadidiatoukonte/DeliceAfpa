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
import fr.cda.delicesafpa.dto.AssignerRoleDTO;
import fr.cda.delicesafpa.dto.EmployeDTO;
import fr.cda.delicesafpa.dto.RoleEmployeDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.interfaceServ.AssignerRoleServiceI;
import fr.cda.delicesafpa.interfaceServ.RoleEmployeServiceI;
import fr.cda.delicesafpa.util.AssignerRoleConverter;
import fr.cda.delicesafpa.util.EmployeConverter;
import fr.cda.delicesafpa.util.RoleEmployeConverter;




@Service
public class AssignerRoleService implements AssignerRoleServiceI {
	@Autowired
	private AssignerRoleRepository assignerRoleRepository;
	@Autowired
	private	RoleEmployeServiceI roleEmployeService;
	@Autowired
	private	AssignerRoleConverter assignerRoleConverter;
	@Autowired
	private	EmployeConverter employeConverter;
	@Autowired
	private	RoleEmployeConverter roleEmployeConverter;
	
	public AssignerRoleDTO save(AssignerRoleDTO assignerRoleDTO) {
		try {
			AssignerRole assignerRole = assignerRoleConverter.convertToEntity(assignerRoleDTO);
			assignerRoleRepository.save(assignerRole);
		} catch (Exception e) {
			
		}
		return assignerRoleDTO;
	}
	
	
	public List<AssignerRoleDTO> getAll() {
		try {
			List<AssignerRole> ass =assignerRoleRepository.findAll();
			List<AssignerRoleDTO> assDTO= new ArrayList<AssignerRoleDTO>();
			for(AssignerRole a : ass) {
				assDTO.add(assignerRoleConverter.explicitModelMappingDemoDaotoDto(a));
			}
			
			return assDTO;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
	public AssignerRoleDTO findAssRoleActuel(EmployeDTO employeDTO) {
		try {
			Employe ee = employeConverter.dTOToEntity(employeDTO);
			AssignerRole a= assignerRoleRepository.findAssRoleActuel(ee);
			AssignerRoleDTO ass = assignerRoleConverter.explicitModelMappingDemoDaotoDto(a);
			return ass;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
	public RoleEmployeDTO findRoleActuel(EmployeDTO employe) {
		try {
			Employe ee = employeConverter.dTOToEntity(employe);
			RoleEmploye re =assignerRoleRepository.findAssRoleActuel(ee).getIdstatus();
			RoleEmployeDTO reDTO= roleEmployeConverter.EntityToDTO(re);
			return reDTO;
					
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
	public List<AssignerRoleDTO> findListRole(RoleEmployeDTO role) {
		try {
			RoleEmploye r = roleEmployeConverter.dTOToEntity(role);
			List<AssignerRole> la =assignerRoleRepository. findListRole(r);
			List<AssignerRoleDTO> assDTO= new ArrayList<AssignerRoleDTO>();
			for(AssignerRole a : la) {
				assDTO.add(assignerRoleConverter.explicitModelMappingDemoDaotoDto(a));
			}
			
			return assDTO;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public List<EmployeDTO> findListLivreurSOnline() {
		List<Employe>livreursOnline  = new ArrayList<Employe>();
		List<EmployeDTO>l  = new ArrayList<EmployeDTO>();
		try {
			
			RoleEmployeDTO role  = roleEmployeService.getById(3);
		
			List<AssignerRole> list = assignerRoleRepository. findListRole(	RoleEmployeConverter.dTOToEntity(role));
			
			
			for(AssignerRole a: list) {
			if(a.getIdemploye().getStatusemploye()==true) {
				livreursOnline.add(a.getIdemploye());
				
			}
			
			}
			
			for (Employe e :livreursOnline) {
				l.add(employeConverter.EntityToDTO(e));
			}
			
			
			
		} catch (Exception e) {
			
		}
		return l;
		
	}
	
	
	
	
	
	
	
	
}
