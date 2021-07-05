package fr.cda.delicesafpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.cda.delicesafpa.beans.TraiterCommande;
import fr.cda.delicesafpa.beans.TraiterCommandeId;

public interface TraiterCommandeRepository extends JpaRepository<TraiterCommande ,TraiterCommandeId >{

}
