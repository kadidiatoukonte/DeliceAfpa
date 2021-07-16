//package fr.cda.delicesafpa.formulaire;
//
//import java.sql.Date;
//import java.time.LocalTime;
//import java.util.Set;
//import java.util.regex.Pattern;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import fr.cda.delicesafpa.beans.Client;
//import fr.cda.delicesafpa.beans.TraiterReservation;
//
//public class VerifReservation {
//
//
//	public final static Pattern passwordPattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
//    public final static Pattern mailPattern = Pattern.compile("\\b[\\w.%+-]+@[a-zA-Z\\d.-]+\\.[A-Za-z]{2,4}\\b");
//    public final static Pattern nbPattern= Pattern.compile("\\b0[1-689]([-. ]?\\d{2}){4}\\b");
//
//	 public static boolean verifReservation(String datereservation,String horaire,
//	 String nbreplacereservation,Client idclient){
//	 
//	            if(passwordPattern.matcher(passwordclient).matches() && mailPattern.matcher(mailclient).matches()  &&
//	                    codePosPattern.matcher(cpclient).matches() && telPattern.matcher(telclient).matches() &&  nomclient!=null 
//	                    && prenomclient!=null && paysclient!=null && adresseclient!=null && villeclient!=null && getDate(datebirclient)==true)
//
//	            return true;
//	            else
//	            return false;
//	        }
//	 
//	    
//	    public static boolean getDate(String date) {
//	        java.util.Date utilDate;
//	        java.sql.Date sqlDate = null;
//	        try {
//	            utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
//	            sqlDate = new java.sql.Date(utilDate.getTime());
//
//	        } catch (ParseException e) {
//	            e.printStackTrace();
//	            return false;
//	        }
//	        return true;
//	    }	 
//	}
//
//}
