package fr.cda.delicesafpa.dao;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import fr.cda.delicesafpa.beans.*;


public interface ConcernerPanArtRepository extends JpaRepository<ConcernerPanArt,ConcernerId>{
	
	@Query("select c from ConcernerPanArt c where c.id.idpanier = ?1")
public	Set<ConcernerPanArt> findConcernerPanArt( int idpanier);
}
