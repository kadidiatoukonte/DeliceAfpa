package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.RoleEmploye;
import fr.cda.delicesafpa.dto.RoleEmployeDTO;

public interface RoleEmployeServiceI {

	public	RoleEmployeDTO save(RoleEmployeDTO roleEmploye);
	public List<RoleEmployeDTO> getAll();
	public RoleEmployeDTO getById(int id) ;


}
