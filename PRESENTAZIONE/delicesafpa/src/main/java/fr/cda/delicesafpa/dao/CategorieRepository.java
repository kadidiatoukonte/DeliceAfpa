package fr.cda.delicesafpa.dao;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cda.delicesafpa.beans.*;


public interface CategorieRepository extends JpaRepository<Categorie,Integer>{
	
	@Transactional
    @Modifying
	@Query("update Categorie c SET c.nomcategorie = ?1 where c.idcategorie = ?2")
	public void updateNomCategorie(@Param("nomcategorie") String nomcategorie, @Param("id") int id);

	@Transactional
    @Modifying
	@Query("update Categorie c SET c.descriptioncategorie = ?1 where c.idcategorie = ?2")
	public void updateDescriptionCategorie(@Param("descriptioncategorie") String descriptioncategorie, @Param("id") int id);

	@Transactional
    @Modifying
	@Query("update Categorie c SET c.visibilitecategorie = ?1 where c.idcategorie = ?2")
	public void updateVisibiliteCategorie(@Param("visibilitecategorie") boolean visibilitecategorie, @Param("id") int id);

	
	
	
	
	
}