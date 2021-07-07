package fr.cda.delicesafpa.interfaceServ;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.query.Param;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Categorie;

public interface ArticleServiceI {

	public	void save(Article article);
	public List<Article> getAll();
	public Article getById(int id) ;
	public void testFind();
	public void updateDescription(String description, int idarticle);
	public Set<Article> findOffrespeciale();
}
