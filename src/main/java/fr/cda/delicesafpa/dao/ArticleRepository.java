package fr.cda.delicesafpa.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.delicesafpa.beans.*;


public interface ArticleRepository extends JpaRepository<Article,Integer>{
	

}
