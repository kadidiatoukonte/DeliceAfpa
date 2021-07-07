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
	
	
	@Query("select a from Article a where a.descriptionarticle like '%noce'")
	Set<Article> findArticleWithDescriptionArticle();
	
	
	@Transactional
    @Modifying
	@Query("update Article a SET a.descriptionarticle = ?1 where a.idarticle = ?2")
	public void updateDescription(@Param("description") String description, @Param("id") int id);
	
	@Transactional
	@Modifying
	@Query("update Article s SET s.descriptionarticle = :description WHERE s.id = :id")
	public void updateArticleDesUsingQueryAnnotation(@Param("description") String description, @Param("id") int id);

	@Transactional
	@Modifying
	@Query("select s from Article s where s.offrespecialearticle = true ")
	public Set<Article> findOffrespeciale();


}

