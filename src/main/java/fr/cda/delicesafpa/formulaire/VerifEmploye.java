package fr.cda.delicesafpa.formulaire;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import fr.cda.delicesafpa.beans.Employe;
import fr.cda.delicesafpa.dto.EmployeDTO;

public class VerifEmploye {

	public final static Pattern passwordPattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
	public final static Pattern mailPattern = Pattern.compile("\\b[\\w.%+-]+@[a-zA-Z\\d.-]+\\.[A-Za-z]{2,4}\\b");
	public final static Pattern telPattern = Pattern.compile("\\b0[1-689]([-. ]?\\d{2}){4}\\b");

	public static boolean verifEmploye(String nomemploye, String prenomemploye, String passwordemploye,
			String telemploye, String mailemploye) {

		Map<String, String> listVide = new HashMap<>();

		if (nomemploye.isEmpty()) {
			listVide.put("nomemploye", "Veuillez renseigner le champs nom");
			System.out.println("Veuillez renseigner le champs nom");// à retirer
			return false;
		} else
			listVide.put("nomemploye", "");

		if (prenomemploye.isEmpty()) {
			listVide.put("prenomemploye", "Veuillez renseigner le champs prénom");
			System.out.println("Veuillez renseigner le champs prénom");// à retirer
			return false;
		} else
			listVide.put("prenomemploye", "");

		if (mailemploye.isEmpty()) {
			listVide.put("mailemploye", "Veuillez renseigner la champs mail ");
			System.out.println("Veuillez renseigner le champs mail");// à retirer
			return false;
		} else {
			if (mailPattern.matcher(mailemploye).matches() == false) {
				listVide.put("mailemploye", "Veuillez saisir un mail valid");
				System.out.println("Veuillez saisir un mail valid");// à retirer
				return false;
			}
		}

		if (telemploye.isEmpty()) {
			listVide.put("telemploye", "Veuillez renseigner le téléphone de l'employé");
			System.out.println("Veuillez renseigner le téléphone de l'employé");// à retirer
			return false;
		} else {
			if (telPattern.matcher(telemploye).matches() == false) {
				listVide.put("telemploye", "Veuillez saisir un numéro de téléphone valid");
				System.out.println("Veuillez saisir un numéro de téléphone valid");// à retirer
				return false;
			}
		}

		if (passwordemploye.isEmpty()) {
			listVide.put("passwordclient", "Veuillez renseigner la champs mot de passe ");
			System.out.println("Veuillez renseigner le champs mot de passe");// à retirer
			return false;
		} else {
			if (passwordPattern.matcher(passwordemploye).matches() == false) {
				listVide.put("passwordemploye", "Veuillez saisir un mot de passe valid");
				System.out.println("Veuillez saisir un mot de passe valid");// à retirer
				return false;
			}
		}

		return true;
	}

	public static boolean verifEmploye(EmployeDTO employeDTO) {
		if (employeDTO.equals(null))
			return false;
		return true;

	}

	public static boolean verifEmploye(Employe employe) {
		if (employe.equals(null))
			return false;
		return true;

	}

}
