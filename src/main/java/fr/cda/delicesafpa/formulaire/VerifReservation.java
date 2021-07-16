package fr.cda.delicesafpa.formulaire;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Reservation;
import fr.cda.delicesafpa.beans.TraiterReservation;
import fr.cda.delicesafpa.dto.ClientDTO;
import fr.cda.delicesafpa.dto.ReservationDTO;

public class VerifReservation {

	public static boolean verifReservation(String datereservation, String horaireh, String horairemn,
			String nbreplacereservation, String idclient) {
		
		Map<String, String> listVide = new HashMap<>();
		
		if (datereservation.isEmpty()) {
			listVide.put("datereservation", "Veuillez renseigner le champs date de réservation");
			System.out.println("Veuillez renseigner le champs date de réservation");// à retirer
			return false;
		} else {
			java.util.Date utilDate;
			try {
				utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(datereservation);
			} catch (ParseException e) {
				listVide.put(" datereservation", "Veuillez renseigner le champs date de réservation valid");
				System.out.println("Veuillez renseigner le champs date de réservation valid");// à retirer
				return false;
			}
		}
		
		try {
			LocalTime time = LocalTime.of(Integer.parseInt(horaireh), Integer.parseInt(horairemn));
		} catch (Exception e) {
			listVide.put(" datereservation", "Veuillez renseigner le champs heure de réservation valid");
			System.out.println("Veuillez renseigner le champs heure de réservation valid");// à retirer
			return false;
		}
		
		try {
		Integer.parseInt(nbreplacereservation);
		} catch (NumberFormatException e) {
			listVide.put("nbreplacereservation", "veuillez renseinger nombre de places réservation ,veuillez saisir un chiffre");
			System.out.println("veuillez renseinger nombre de places réservation ,veuillez saisir un chiffre");// à retirer
			return false;
		}
		
		try {
		Integer.parseInt(idclient);
		} catch (NumberFormatException e) {
			listVide.put("idclient", "veuillez renseinger id client ,veuillez saisir un chiffre");
			System.out.println("veuillez renseinger id client réservation ,veuillez saisir un chiffre");// à retirer
			return false;
		}
		return true;
		}

	public static boolean verifReservation(ReservationDTO reservationDTO) {
		if (reservationDTO.equals(null))
			return false;
		return true;
	}

	public static boolean verifReservation(Reservation reservation) {
		if (reservation.equals(null))
			return false;
		return true;
	}

}
