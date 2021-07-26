package fr.cda.delicesafpa.controller;



import java.security.Timestamp;

import java.text.DateFormat;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.time.LocalDate;

import java.time.LocalDateTime;

import java.time.LocalTime;

import java.util.Date;

import java.util.List;

import java.util.Locale;

import java.util.Optional;

import java.time.LocalDateTime;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;



import fr.cda.delicesafpa.beans.Article;

import fr.cda.delicesafpa.beans.AssignerRole;

import fr.cda.delicesafpa.beans.AssignerRoleId;

import fr.cda.delicesafpa.beans.Categorie;

import fr.cda.delicesafpa.beans.Client;

import fr.cda.delicesafpa.beans.Commande;

import fr.cda.delicesafpa.beans.ConcernerId;

import fr.cda.delicesafpa.beans.ConcernerPanArt;

import fr.cda.delicesafpa.beans.DeterminerArt;

import fr.cda.delicesafpa.beans.DeterminerArtId;

import fr.cda.delicesafpa.beans.DeterminerCat;

import fr.cda.delicesafpa.beans.DeterminerCatId;

import fr.cda.delicesafpa.beans.Employe;

import fr.cda.delicesafpa.beans.EtreSup;

import fr.cda.delicesafpa.beans.EtresupId;

import fr.cda.delicesafpa.beans.Panier;

import fr.cda.delicesafpa.beans.Reservation;

import fr.cda.delicesafpa.beans.RoleEmploye;

import fr.cda.delicesafpa.beans.StatusCommande;

import fr.cda.delicesafpa.beans.StatusReservation;

import fr.cda.delicesafpa.beans.TraiterCommande;

import fr.cda.delicesafpa.beans.TraiterCommandeId;

import fr.cda.delicesafpa.beans.TraiterReservation;

import fr.cda.delicesafpa.beans.TraiterReservationId;

import fr.cda.delicesafpa.dao.ArticleRepository;

import fr.cda.delicesafpa.dao.AssignerRoleRepository;

import fr.cda.delicesafpa.dao.CategorieRepository;

import fr.cda.delicesafpa.dao.ClientRepository;

import fr.cda.delicesafpa.dao.CommandeRepository;

import fr.cda.delicesafpa.dao.ConcernerPanArtRepository;

import fr.cda.delicesafpa.dao.DeterminerArtRepository;

import fr.cda.delicesafpa.dao.DeterminerCatRepository;

import fr.cda.delicesafpa.dao.EmployeRepository;

import fr.cda.delicesafpa.dao.EtreSupRepository;

import fr.cda.delicesafpa.dao.PanierRepository;

import fr.cda.delicesafpa.dao.ReservationRepository;

import fr.cda.delicesafpa.dao.RoleEmployeRepository;

import fr.cda.delicesafpa.dao.StatusCommandeRepository;

import fr.cda.delicesafpa.dao.StatusReservationRepository;

import fr.cda.delicesafpa.dao.TraiterCommandeRepository;

import fr.cda.delicesafpa.dao.TraiterReservationRepository;

import fr.cda.delicesafpa.dto.AssignerRoleDTO;

import fr.cda.delicesafpa.dto.ClientDTO;
import fr.cda.delicesafpa.dto.LoginDTO;
import fr.cda.delicesafpa.dto.DeterminerArtDTO;

import fr.cda.delicesafpa.dto.DeterminerCatDTO;

import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;

import fr.cda.delicesafpa.interfaceServ.AssignerRoleServiceI;

import fr.cda.delicesafpa.interfaceServ.CategorieServiceI;

import fr.cda.delicesafpa.interfaceServ.ClientServiceI;

import fr.cda.delicesafpa.interfaceServ.CommandeServiceI;

import fr.cda.delicesafpa.interfaceServ.ConcernerPanArtServiceI;

import fr.cda.delicesafpa.interfaceServ.DeterminerArtServiceI;

import fr.cda.delicesafpa.interfaceServ.DeterminerCatServiceI;

import fr.cda.delicesafpa.interfaceServ.EmployeServiceI;

import fr.cda.delicesafpa.interfaceServ.EtreSupServiceI;

import fr.cda.delicesafpa.interfaceServ.PanierServiceI;

import fr.cda.delicesafpa.interfaceServ.ReservationServiceI;

import fr.cda.delicesafpa.interfaceServ.RoleEmployeServiceI;

import fr.cda.delicesafpa.interfaceServ.StatusCommandeServiceI;

import fr.cda.delicesafpa.interfaceServ.StatusReservationServiceI;

import fr.cda.delicesafpa.interfaceServ.TraiterCommandeServiceI;

import fr.cda.delicesafpa.interfaceServ.TraiterReservationServiceI;

import fr.cda.delicesafpa.services.ArticleService;

import fr.cda.delicesafpa.services.AssignerRoleService;

import fr.cda.delicesafpa.services.ClientService;

import fr.cda.delicesafpa.services.DetCategorieService;

import fr.cda.delicesafpa.services.EmployeService;

import fr.cda.delicesafpa.services.PanierService;

import fr.cda.delicesafpa.services.ReservationService;

import fr.cda.delicesafpa.services.RoleEmployeService;

import fr.cda.delicesafpa.services.StatusCommandeService;

import fr.cda.delicesafpa.services.TraiterCommandeService;

import fr.cda.delicesafpa.services.TraiterReservationService;

import fr.cda.delicesafpa.util.AssignerRoleConverter;

import fr.cda.delicesafpa.util.DeterminerArtConverter;

import fr.cda.delicesafpa.util.DeterminerCatConverter;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import fr.cda.delicesafpa.beans.Client;

import fr.cda.delicesafpa.interfaceServ.ClientServiceI;



@RestController

public class ClientController {



    @Autowired

    ClientServiceI clientService;



    

    @PostMapping("/addClient")

    public ClientDTO addClient(@RequestBody ClientDTO clientDTO) {



        return clientService.save(clientDTO);

    }



    

    @GetMapping("/client/{idclient}")

    public ClientDTO getClient(@PathVariable("idclient") int idclient) {

        return clientService.getById(idclient);

    }
    @PutMapping("/updateClient/")

    public Object updateClient(@RequestBody ClientDTO clientDTO) {

        return clientService.save(clientDTO);

    }



    

    @GetMapping(value = "/allClient")

    public List<ClientDTO> getAll() {

        List<ClientDTO> listClientDTO = clientService.getAll();

        return listClientDTO;

    }

    @PostMapping(value = "/findclientMailclient")

    public boolean findclientMailclient(@RequestBody LoginDTO clientLoginDTO)  {
    	String clientemail = clientLoginDTO.getMailclient();
      	String pass = clientLoginDTO.getPasswordclient();
    	
    	
    	boolean verif=clientService.findclientMailclient(clientemail,pass ); 
    	
        return verif;

    }
    	

}