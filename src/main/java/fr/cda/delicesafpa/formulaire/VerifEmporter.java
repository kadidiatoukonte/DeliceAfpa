package fr.cda.delicesafpa.formulaire;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class VerifEmporter {

	
	public static boolean verifEmporter( String idcommande,String datecommande,String horaireh, String horairemn) {
		Map<String, String> listVide = new HashMap<>();
	
		try {
			Integer.parseInt(idcommande);
		} catch (NumberFormatException e) {
			listVide.put("idcommande", "veuillez renseinger id commande ,veuillez saisir un chiffre");
			System.out.println("veuillez renseinger id commande ,veuillez saisir un chiffre");// à retirer
			return false;
		}	
		
		if (datecommande.isEmpty()) {
			listVide.put("datecommande", "Veuillez renseigner le champs date de la commande");
			System.out.println("Veuillez renseigner le champs date de la commande");// à retirer
			return false;
		} else {
			java.util.Date utilDate;
			try {
				utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(datecommande);
			} catch (ParseException e) {
				listVide.put(" datecommande", "Veuillez renseigner le champs date de commande valid,veuillez saisir un chiffre");
				System.out.println("Veuillez renseigner le champs date de commande valid,veuillez saisir un chiffre");// à retirer
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
		
	 return true;
	}
	
}
