package fr.cda.delicesafpa.formulaire;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.dto.CommandeDTO;

public class VerifCommande {

	public static boolean verifcommande(String idcommande, String idclient, String adressecommande,
			String datecommande) { // ,String horaire
		Map<String, String> listVide = new HashMap<>();

		if (adressecommande.isEmpty()) {
			listVide.put("adressecommande", "Veuillez renseigner le champs adresse de la commande");
			System.out.println("Veuillez renseigner le champs adresse de la commande");// à retirer
			return false;
		} else
			listVide.put("adressecommande", "");

		if (datecommande.isEmpty()) {
			listVide.put("datecommande", "Veuillez renseigner le champs date de la commande");
			System.out.println("Veuillez renseigner le champs date de la commande");// à retirer
			return false;
		} else {
			java.util.Date utilDate;
			try {
				utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(datecommande);
			} catch (ParseException e) {
				listVide.put(" datecommande", "Veuillez renseigner le champs date de commande valid");
				System.out.println("Veuillez renseigner le champs date de commande valid");// à retirer
				return false;
			}
		}

		try {
			Integer.parseInt(idcommande);
		} catch (NumberFormatException e) {
			listVide.put("idcommande", "veuillez renseinger id commande ,veuillez saisir un chiffre");
			System.out.println("veuillez renseinger id commande ,veuillez saisir un chiffre");// à retirer
			return false;
		}

		try {
			int numclient = Integer.parseInt(idclient);
		} catch (NumberFormatException e) {
			listVide.put("idclient", " veuillez renseinger id client,veuillez saisir un chiffre");
			System.out.println("veuillez renseinger id client,veuillez saisir un chiffre");// à retirer
			return false;
		}
		return true;
	}

	public static boolean verifcommande(CommandeDTO commandeDTO) {
		if (commandeDTO.equals(null))
			return false;
		return true;

	}

	public static boolean verifcommande(Commande commande) {
		if (commande.equals(null))
			return false;
		return true;

	}

}
