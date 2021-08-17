package fr.cda.delicesafpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import fr.cda.delicesafpa.dto.AssignerRoleDTO;
import fr.cda.delicesafpa.dto.LoginDTO;
import fr.cda.delicesafpa.dto.EmployeDTO;
import fr.cda.delicesafpa.dto.RoleEmployeDTO;
import fr.cda.delicesafpa.interfaceServ.AssignerRoleServiceI;
import fr.cda.delicesafpa.interfaceServ.EmployeServiceI;
import fr.cda.delicesafpa.interfaceServ.RoleEmployeServiceI;

@RestController
public class EmployeController {

	@Autowired
	EmployeServiceI employeService;

	@Autowired
	RoleEmployeServiceI roleEmployeService;

	@Autowired
	AssignerRoleServiceI assignerRoleService;

	@PostMapping("/addEmploye")
	public EmployeDTO addEmploye(@RequestBody EmployeDTO employeDTO) {
		System.out.println(employeDTO);
		return employeService.save(employeDTO);
	}

	@GetMapping("/employe/{idemploye}")
	public EmployeDTO getEmploye(@PathVariable("idemploye") int idemploye) {
		return employeService.getById(idemploye);
	}

	@GetMapping(value = "/allEmploye")
	public List<EmployeDTO> getAllEmploye() {
		List<EmployeDTO> list = employeService.getAll();
		System.out.println(list);
		return list;
	}

	@PutMapping("/updateEmploye")
	public Object updateEmploye(@RequestBody EmployeDTO employeDTO) {
		System.out.println(employeDTO);
		return employeService.save(employeDTO);
	}

	// RoleEmploye

	@PostMapping("/addRoleEmploye")
	public RoleEmployeDTO addRoleEmploye(@RequestBody RoleEmployeDTO roleEmployeDTO) {
		System.out.println(roleEmployeDTO);
		return roleEmployeService.save(roleEmployeDTO);
	}

	@GetMapping(value = "/allRoleEmploye")
	public List<RoleEmployeDTO> getAllRoleEmploye() {
		List<RoleEmployeDTO> listRoleEmploye = roleEmployeService.getAll();
		System.out.println(listRoleEmploye);
		return listRoleEmploye;
	}

	@GetMapping("/roleEmploye/{id}")
	public RoleEmployeDTO getRoleEmployeId(@PathVariable("id") String idemp) {
		System.out.println(idemp);
		int id= Integer.valueOf(idemp);
		System.out.println( roleEmployeService.getById(id).getDescription());
		return roleEmployeService.getById(id);
	}

	// AssignerRole

	@PostMapping("/addAssignerRole")
	public AssignerRoleDTO addAssignerRole(@RequestBody AssignerRoleDTO assignerRoleDTO) {
		// System.out.println(assignerRoleDTO);
		return assignerRoleService.save(assignerRoleDTO);
	}

	@GetMapping(value = "/allAssignerRole")
	public List<AssignerRoleDTO> getAllAssignerRole() {
		List<AssignerRoleDTO> listAssignerRole = assignerRoleService.getAll();
		System.out.println(listAssignerRole);
		return listAssignerRole;
	}

	@PostMapping(value = "/findemployeMailemploye")
	public boolean findemployeMailemploye(@RequestBody LoginDTO loginDTO) {
		String email = loginDTO.getMailclient();
		String pass = loginDTO.getPasswordclient();

		boolean verif = employeService.findemployeMailemploye(email, pass);

		return verif;

	}

	@PostMapping(value = "/getemployeMailemploye")
	public EmployeDTO getemployeMailemploye(@RequestBody LoginDTO loginDTO) {
		String email = loginDTO.getMailclient();
		String pass = loginDTO.getPasswordclient();
		
		
		System.out.println(pass);

		EmployeDTO emp = employeService.getemployeMailemploye(email, pass);
System.out.println(emp);
System.out.println(pass);
System.out.println(emp.getIdemploye());
		return emp;

	}
	
	@GetMapping(value = "/findRoleActuel/{id}")
	public RoleEmployeDTO findRoleActuel(@PathVariable("id") String idemp) {
		idemp=idemp.replaceAll("\\p{Punct}", "");

		int id= Integer.valueOf(idemp);
	
		return assignerRoleService.findRoleActuel(employeService.getById(id));
		 
		
	}
	
	@GetMapping(value = "/findListLivreurSOnline")
	public List<EmployeDTO> findListLivreurSOnline() {
		
		
		
		return assignerRoleService.findListLivreurSOnline();
		
	}
	
	
	
	
}