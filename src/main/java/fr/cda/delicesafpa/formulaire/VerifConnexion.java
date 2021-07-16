package fr.cda.delicesafpa.formulaire;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.dto.ClientDTO;

public class VerifConnexion {

	public final static Pattern passwordPattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
    public final static Pattern mailPattern = Pattern.compile("\\b[\\w.%+-]+@[a-zA-Z\\d.-]+\\.[A-Za-z]{2,4}\\b");
    public static Map<String, String> listeVide = new HashMap<String,String>();

	public static boolean verifConnexion(String login, String password) {

		if (login.isEmpty()) {
			listeVide.put("login" , "Veuillez saissir votre login");
			return false;
		}
		if (password.isEmpty()) {
			listeVide.put("password", "Veuillez saissir votre password");
			return false;
		}
		if(mailPattern.matcher(login).matches() && passwordPattern.matcher(password).matches() ) {
			return true;
		}
		else {
			return false;
		}
	}
}
