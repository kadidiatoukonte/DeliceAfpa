package fr.cda.delicesafpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.beans.TraiterReservationId;

public interface TraiterReservationRepository extends JpaRepository<TraiterReservation,TraiterReservationId>{

}
