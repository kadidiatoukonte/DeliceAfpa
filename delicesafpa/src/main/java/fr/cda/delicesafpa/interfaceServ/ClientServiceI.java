package fr.cda.delicesafpa.interfaceServ;


import java.util.List;

import fr.cda.delicesafpa.beans.Client;

public interface ClientServiceI {

	public	Client save(Client client);
	public	List<Client> getAll();
    public Client getById(int id) ;
}
