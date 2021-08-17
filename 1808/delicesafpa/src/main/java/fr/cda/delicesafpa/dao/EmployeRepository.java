package fr.cda.delicesafpa.dao;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cda.delicesafpa.beans.*;


public interface EmployeRepository extends JpaRepository<Employe,Integer>{
	
	
	
	@Query("select e from Employe e where e.mailemploye = ?1")
public	Employe findemployeMailEmploye( String employeEmail);
	
	
	
	
	@Transactional
    @Modifying
	@Query("update Employe e SET e.nomemploye = ?1 where e.idemploye = ?2")
	public void updateNomEmploye(@Param("nomemploye") String nomemploye, @Param("id") int id);

	@Transactional
    @Modifying
	@Query("update Employe e SET e.prenomemploye = ?1 where e.idemploye = ?2")
	public void updatePrenomEmploye(@Param("prenomemploye") String prenomemploye, @Param("id") int id);
	
	@Transactional
    @Modifying
	@Query("update Employe e SET e.telemploye = ?1 where e.idemploye = ?2")
	public void updateTelEmploye(@Param("telemploye") String telemploye, @Param("id") int id);
	
	@Transactional
    @Modifying
	@Query("update Employe e SET e.mailemploye = ?1 where e.idemploye = ?2")
	public void updateEmailEmploye(@Param("mailemploye") String mailemploye, @Param("id") int id);
	
	@Transactional
    @Modifying
	@Query("update Employe e SET e.passwordemploye = ?1 where e.idemploye = ?2")
	public void updatePassEmploye(@Param("passwordemploye") String passwordemploye, @Param("id") int id);
	
	@Transactional
    @Modifying
	@Query("update Employe e SET e.statusemploye = ?1 where e.idemploye = ?2")
	public void updateOnlineEmploye(@Param("online") boolean online, @Param("id") int id);
	
	  






}
