package fr.cda.delicesafpa.controller;

import java.text.DateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.dao.ClientRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
    ClientRepository clientRepository;
	/**
	 * Simply selects the home view to render by returning its name.
	 * @return 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public  String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//Client client = clientRepository.findById(0).get();
		//String url = "data:image/jpeg;base64," + Base64.getEncoder().encodeToString(client.getPhotoclient());
		//model.addAttribute("url", url);
		return "home";
	}
	
}
