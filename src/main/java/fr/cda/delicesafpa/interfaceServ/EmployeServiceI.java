package fr.cda.delicesafpa.interfaceServ;

import java.util.List;


import fr.cda.delicesafpa.dto.EmployeDTO;

public interface EmployeServiceI {
	public EmployeDTO save(EmployeDTO employe);
	public List<EmployeDTO> getAll();
	public EmployeDTO getById(int id) ;
	public void updateNomEmploye(String nom, int idemploye);
	public void updatePrenomEmploye(String prenom, int idemploye);
	public void updateTelEmploye(String tel, int idemploye);
	public void updateEmailEmploye(String mail, int idemploye);
	public void updatePassEmploye(String pass, int idemploye);
	public void updateOnlineEmploye(boolean online, int idemploye);
}
