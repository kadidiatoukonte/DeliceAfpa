package fr.cda.delicesafpa.interfaceServ;

import java.util.List;
import java.util.Set;


import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Categorie;

public interface ArticleServiceI {

	public	void save(Article article);
	public List<Article> getAll();
	public Article getById(int id) ;
	public void testFind();
	public void updateDescription(String description, int idarticle);
	public void updateNomArticle(String description, int idarticle);
	public void updatePrixArticle(float prix, int idarticle);
	public void updateVisibiliteArticle(boolean vis, int idarticle);
	public void updateOffreSpecialeArticle(boolean sp, int idarticle);
	public void updateDescriptionOffresp(String dsp, int idarticle);
	public void updateCategorieArt(Categorie cat, int idarticle);
	
	
	public Set<Article> findOffrespeciale();
}
