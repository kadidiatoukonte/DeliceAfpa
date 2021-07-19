package fr.cda.delicesafpa.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.cda.delicesafpa.beans.*;


public interface AssignerRoleRepository extends JpaRepository<AssignerRole,AssignerRoleId>{
	
	
	
	@Query("select c from AssignerRole c where  c.idemploye =?1 and c.id.date="
			+ "(select max(c2.id.date) from AssignerRole c2 "
			+ "where c2.idemploye = c.idemploye )")
	AssignerRole findAssRoleActuel(Employe employe);
	
	
	
	@Query("select c from AssignerRole c where c.id.date="
			+ "(select max(c2.id.date) from AssignerRole c2 "
			+ "where c2.idemploye = c.idemploye and  c.idstatus =?1 )")
	List<AssignerRole> findListRole(RoleEmploye role);

	

}
