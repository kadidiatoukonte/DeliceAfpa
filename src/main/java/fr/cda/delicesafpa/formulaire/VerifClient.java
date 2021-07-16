
package fr.cda.delicesafpa.formulaire;

import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.dto.ClientDTO;

public class VerifClient {

	public static boolean verifClient( String nomclient, String prenomclient, String datebirclient,
			String paysclient, String adresseclient, String complementadrclient, String cpclient, String villeclient,
			String telclient, String mailclient, String passwordclient) {

		if (nomclient.isEmpty() || prenomclient.isEmpty() || paysclient.isEmpty() || adresseclient.isEmpty()
				|| cpclient.isEmpty() || villeclient.isEmpty() || telclient.isEmpty() || mailclient.isEmpty()
				|| passwordclient.isEmpty())
			return false;

		try {
			String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
			boolean verifpassword = passwordclient.matches(pattern);

			String patternCpclient = "^(([0-8][0-9])|(9[0-5])|(2[ab]))[0-9]{3}$";
			boolean verifCpclient = cpclient.matches(patternCpclient);

			String regex = "^(?:(?:\\+|00)33|0)\\s*[1-9](?:[\\s.-]*\\d{2}){4}$";
			Pattern patternTelclient = Pattern.compile(regex);
			Matcher matcher = patternTelclient.matcher(telclient);
			boolean verifTelclient = matcher.matches();

			Pattern patternMailclient = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
			Matcher m = patternMailclient.matcher(mailclient);
			boolean verifMailclient = m.matches();

			Date.valueOf(datebirclient);

			

		} catch (Exception e) {
			return false;
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
