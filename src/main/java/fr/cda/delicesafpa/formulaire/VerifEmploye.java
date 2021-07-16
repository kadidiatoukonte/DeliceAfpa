package fr.cda.delicesafpa.formulaire;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class VerifEmploye {

	public final static Pattern passwordPattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
    public final static Pattern mailPattern = Pattern.compile("\\b[\\w.%+-]+@[a-zA-Z\\d.-]+\\.[A-Za-z]{2,4}\\b");
    public final static Pattern telPattern= Pattern.compile("\\b0[1-689]([-. ]?\\d{2}){4}\\b");
    public static Map<String, String> listeVide = new HashMap<String,String>();
	public static boolean verifInscriptionEmploye(String nomemploye, String prenomemploye, String passwordemploye, String telemploye, String mailemploye) {

		if (nomemploye.isEmpty()) {
			listeVide.put("nomemploye" , "Veuillez saissir le nom de l'employer");
			return false;
		}
		if (prenomemploye.isEmpty()) {
			listeVide.put("prenomemploye", "Veuillez saissir le prénom de l'employer");
			return false;
		}
		if (telemploye.isEmpty()) {
			listeVide.put("telemploye", "Veuillez saissir le téléphone de l'employer");
			return false;
		}
		if (mailemploye.isEmpty()) {
			listeVide.put("mailemploye", "Veuillez saissir le mail de l'employer");
			return false;
		}
            if(passwordPattern.matcher(passwordemploye).matches() && mailPattern.matcher(mailemploye).matches()  && 
            		telPattern.matcher(telemploye).matches() &&  nomemploye!=null 
                    && prenomemploye!=null ) {
            	return true;
            }
            else
            	return false;
    }
}
