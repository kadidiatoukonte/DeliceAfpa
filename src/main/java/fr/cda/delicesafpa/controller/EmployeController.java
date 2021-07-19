package fr.cda.delicesafpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.dao.EmployeRepository;
import fr.cda.delicesafpa.dto.EmployeDTO;
import fr.cda.delicesafpa.interfaceServ.EmployeServiceI;


@RestController
public class EmployeController {

	@Autowired
	EmployeServiceI employeService;
	
	@PostMapping("/addEmploye")
	public EmployeDTO addEmploye(@RequestBody EmployeDTO employeDTO) {
		System.out.println(employeDTO);
		return employeService.save(employeDTO);
	}

	@GetMapping("/employe/{idemploye}")
	public EmployeDTO getEmploye(@PathVariable("idemploye") int idemploye) {
		return employeService.getById(idemploye);
	}
	
	@GetMapping(value="/allEmploye")
	public List<EmployeDTO> getAllEmploye() {
		List<EmployeDTO> list =employeService.getAll();
		System.out.println(list);
		return list;
	}
	
	
	@PutMapping("/updateEmploye/")
	public Object updateEmploye(@RequestBody EmployeDTO employeDTO )
	{
		System.out.println(employeDTO);
	return employeService.save(employeDTO);
	}
}
