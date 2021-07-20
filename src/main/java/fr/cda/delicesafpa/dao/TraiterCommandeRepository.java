package fr.cda.delicesafpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterCommandeId;
import fr.cda.delicesafpa.beans.TraiterReservation;

public interface TraiterCommandeRepository extends JpaRepository<TraiterCommande ,TraiterCommandeId >{

	@Query("select c from TraiterCommande c where c.idcommande= ?1")
	List<TraiterCommande> findTraitComByIdCommande(Commande com);
	
	@Query("select c from TraiterCommande c where  c.idcommande =?1 and c.id.date=(select max(c2.id.date) from TraiterCommande c2 where c2.idcommande = c.idcommande )")
	TraiterCommande findTraitComActuel(Commande com);
	
}
