package fr.cda.delicesafpa.dao;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.TraiterReservation;


public interface ClientRepository extends JpaRepository<Client,Integer>{
	
	
	@Query("select c from Client c where c.mailclient = ?1")
public	Client findclientMailclient( String clientemail);
	

}
