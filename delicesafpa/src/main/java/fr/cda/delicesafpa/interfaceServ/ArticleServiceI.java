package fr.cda.delicesafpa.interfaceServ;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.CategorieDTO;

public interface ArticleServiceI {

	public	ArticleDTO save(ArticleDTO articleDTO);
	public List<ArticleDTO> getAll();
	public ArticleDTO getById(int id) ;
	public void updateDescription(String description, int idarticle);
	public void updateNomArticle(String description, int idarticle);
	public void updatePrixArticle(float prix, int idarticle);
	public void updateVisibiliteArticle(boolean vis, int idarticle);
	public void updateOffreSpecialeArticle(boolean sp, int idarticle);
	public void updateDescriptionOffresp(String dsp, int idarticle);
	public void updateCategorieArt(Categorie cat, int idarticle);
	public Set<ArticleDTO> findOffrespeciale();
	public Set<Article> findArticleWithCategorie(CategorieDTO categorieDTO);
}
