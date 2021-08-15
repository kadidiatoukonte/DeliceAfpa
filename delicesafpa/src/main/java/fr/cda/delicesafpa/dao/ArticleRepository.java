package fr.cda.delicesafpa.dao;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import fr.cda.delicesafpa.beans.*;


public interface ArticleRepository extends JpaRepository<Article,Integer>{
	
	
	@Query("select a from Article a where a.categorie =?1")
	Set<Article> findArticleWithCategorie(@Param("idcat") Categorie cat);
	
	@Transactional
    @Modifying
	@Query("update Article a SET a.descriptionarticle = ?1 where a.idarticle = ?2")
	public void updateDescription(@Param("description") String description, @Param("id") int id);
	
	@Transactional
    @Modifying
	@Query("update Article a SET a.nomarticle = ?1 where a.idarticle = ?2")
	public void updateNomArticle(@Param("nomarticle") String nomarticle, @Param("id") int id);
	
	@Transactional
    @Modifying
	@Query("update Article a SET a.prixarticle = ?1 where a.idarticle = ?2")
	public void updatePrixArticle(@Param("prixarticle") float prixarticle, @Param("id") int id);
	
	@Transactional
    @Modifying
	@Query("update Article a SET a.visibilitearticle = ?1 where a.idarticle = ?2")
	public void updateVisibiliteArticle(@Param("visibilitearticle") boolean visibilitearticle, @Param("id") int id);
	
	@Transactional
    @Modifying
	@Query("update Article a SET a.offrespecialearticle = ?1 where a.idarticle = ?2")
	public void updateOffreSpecialeArticle(@Param("offrespecialearticle") boolean offrespecialearticle, @Param("id") int id);
	
	@Transactional
    @Modifying
	@Query("update Article a SET a.descriptionoffresp = ?1 where a.idarticle = ?2")
	public void updateDescriptionOffresp(@Param("descriptionoffresp") String descriptionoffresp, @Param("id") int id);
	
	
	@Transactional
    @Modifying
    @Query(value = "update Article a SET a.idcategorie = ?1 where a.idarticle = ?2",
            nativeQuery = true)
    void updateCategorieArt(@Param("idcategorie") Categorie idcategorie, @Param("id") int id);

	
	
	/*@Transactional
    @Modifying
	@Query("update Article a SET a.idcategorie = ?1 where a.idarticle = ?2")
	public void updateCategorie(@Param("idcategorie") int idcategorie, @Param("id") int id);
	*/
	
	@Transactional
	@Modifying
	@Query("select s from Article s where s.offrespecialearticle = true  and s.visibilitearticle = true ")
	public Set<Article> findOffrespeciale();


	
	
	
	
}

