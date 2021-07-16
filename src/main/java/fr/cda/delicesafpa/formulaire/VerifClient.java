
package fr.cda.delicesafpa.formulaire;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.beans.Commande;
import fr.cda.delicesafpa.dto.ClientDTO;
import fr.cda.delicesafpa.dto.CommandeDTO;

public class VerifClient {

	public final static Pattern passwordPattern = Pattern
			.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
	public final static Pattern mailPattern = Pattern.compile("\\b[\\w.%+-]+@[a-zA-Z\\d.-]+\\.[A-Za-z]{2,4}\\b");
	public final static Pattern codePosPattern = Pattern.compile("^(([0-8][0-9])|(9[0-5])|(2[ab]))[0-9]{3}$");
	public final static Pattern telPattern = Pattern.compile("\\b0[1-689]([-. ]?\\d{2}){4}\\b");

	public static boolean verifClient(String nomclient, String prenomclient, String datebirclient, String paysclient,
			String adresseclient, String cpclient, String villeclient, String telclient, String mailclient,
			String passwordclient) {

		Map<String, String> listVide = new HashMap<>();

		if (nomclient.isEmpty()) {
			listVide.put("nomclient", "Veuillez renseigner le champs nom");
			System.out.println("Veuillez renseigner le champs nom");// à retirer
			return false;
		} else
			listVide.put("nomclient", "");

		if (prenomclient.isEmpty()) {
			listVide.put(" prenomclient", "Veuillez renseigner le champs prénom");
			System.out.println("Veuillez renseigner le champs prénom");// à retirer
			return false;
		} else
			listVide.put("prenomclient", "");

		if (datebirclient.isEmpty()) {
			listVide.put(" datebirclient", "Veuillez renseigner le champs date de naissance");
			System.out.println("Veuillez renseigner le champs date de naissance");// à retirer
			return false;
		} else {
			java.util.Date utilDate;
			try {
				utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(datebirclient);
			} catch (ParseException e) {
				listVide.put(" datebirclient", "Veuillez renseigner le champs date de naissance valid");
				System.out.println("Veuillez renseigner le champs date de naissance valid");// à retirer
				return false;
			}
		}

		if (paysclient.isEmpty()) {
			listVide.put("paysclient", "Veuillez renseigner le champs pays");
			System.out.println("Veuillez renseigner le champs pays");// à retirer
			return false;
		} else
			listVide.put("paysclient", "");

		if (adresseclient.isEmpty()) {
			listVide.put("adresseclient", "Veuillez renseigner le champs adresse");
			System.out.println("Veuillez renseigner le champs adresse");// à retirer
			return false;
		} else
			listVide.put("adresseclient", "");

		if (cpclient.isEmpty()) {
			listVide.put("cpclient", "Veuillez renseigner le champs code postal");
			System.out.println("Veuillez renseigner le champs code postal");// à retirer
			return false;
		} else {
			if (codePosPattern.matcher(cpclient).matches() == false) {
				listVide.put("cpclient", "Veuillez saisir un code postal valid");
				System.out.println("Veuillez saisir un code postal valid");
				return false;
			}
		}

		if (villeclient.isEmpty()) {
			listVide.put("villeclient", "Veuillez renseigner le champs ville pour le client");
			System.out.println("Veuillez renseigner le champs ville pour le client");// à retirer
			return false;
		} else
			listVide.put("villeclient", "");

		if (telclient.isEmpty()) {
			listVide.put("telclient", "Veuillez renseigner le téléphone de client");
			System.out.println("Veuillez renseigner le téléphone de client");// à retirer
			return false;
		} else {
			if (telPattern.matcher(telclient).matches() == false) {
				listVide.put("telclient", "Veuillez saisir un numéro de téléphone valid");
				System.out.println("Veuillez saisir un numéro de téléphone valid");// à retirer
				return false;
			}
		}

		if (mailclient.isEmpty()) {
			listVide.put("mailclient", "Veuillez renseigner la champs mail ");
			System.out.println("Veuillez renseigner le champs mail");// à retirer
			return false;
		} else {
			if (mailPattern.matcher(mailclient).matches() == false) {
				listVide.put("mailclient", "Veuillez saisir un mail valid");
				System.out.println("Veuillez saisir un mail valid");// à retirer
				return false;
			}
		}

		if (passwordclient.isEmpty()) {
			listVide.put("passwordclient", "Veuillez renseigner la champs mot de passe ");
			System.out.println("Veuillez renseigner le champs mot de passe");// à retirer
			return false;
		} else {
			if (passwordPattern.matcher(passwordclient).matches() == false) {
				listVide.put("passwordclient", "Veuillez saisir un mot de passe valid");
				System.out.println("Veuillez saisir un mot de passe valid");// à retirer
				return false;
			}
		}
		return true;
	}

	public static boolean verifClient(ClientDTO clientDTO) {
		if (clientDTO.equals(null))
			return false;
		return true;

	}

	public static boolean verifClient(Client client) {
		if (client.equals(null))
			return false;
		return true;

	}

}
