package fr.cda.delicesafpa.dao;

import java.awt.print.Pageable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.beans.TraiterReservationId;

public interface TraiterReservationRepository extends JpaRepository<TraiterReservation,TraiterReservationId>{

	@Query("select c from TraiterReservation c where c.idreservation= ?1")
	List<TraiterReservation> findTraitResByIdReservation(Reservation res);
	
	@Query("select c from TraiterReservation c where c.id.date= ?1")
	List<TraiterReservation> findTraitResByDate(LocalDateTime date);
	
	@Query("select c from TraiterReservation c where  c.idreservation =?1 and c.id.date="
			+ "(select max(c2.id.date) from TraiterReservation c2 "
			+ "where c2.idreservation = c.idreservation )")
   TraiterReservation findTraitResActuel(Reservation res);





}
