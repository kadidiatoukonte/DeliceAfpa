package fr.cda.delicesafpa.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.delicesafpa.beans.*;


public interface ReservationRepository extends JpaRepository<Reservation,Integer>{
	

}
