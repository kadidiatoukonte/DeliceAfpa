package fr.cda.delicesafpa.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.delicesafpa.beans.Client;


public interface ClientRepository extends JpaRepository<Client,Integer>{
	

}
