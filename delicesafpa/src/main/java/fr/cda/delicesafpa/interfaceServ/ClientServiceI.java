package fr.cda.delicesafpa.interfaceServ;


import java.util.List;

import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.dto.ClientDTO;

public interface ClientServiceI {

	public	ClientDTO save(ClientDTO client);
	public	List<ClientDTO> getAll();
    public ClientDTO getById(int id) ;
    public boolean 	findclientMailclient(String email, String password) ;
}
