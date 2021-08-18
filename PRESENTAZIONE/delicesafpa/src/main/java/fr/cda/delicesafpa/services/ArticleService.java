package fr.cda.delicesafpa.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Categorie;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.dto.ArticleDTO;
import fr.cda.delicesafpa.dto.CategorieDTO;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;
import fr.cda.delicesafpa.util.ArticleConverter;
import fr.cda.delicesafpa.util.CategorieConverter;

@Service
public class ArticleService implements ArticleServiceI {
	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private ArticleConverter articleconverter;

	public ArticleDTO save(ArticleDTO articleDTO) {
		try {
			Article article = ArticleConverter.dTOToEntity(articleDTO);
			articleRepository.save(article);
			
		} catch (Exception e) {

		}
		return articleDTO;
	}

	public List<ArticleDTO> getAll() {
		try {
			List<Article> articles = articleRepository.findAll();
			List<ArticleDTO> articlesDTO = articleconverter.EntityToDTO(articles);
			return articlesDTO;
		} catch (Exception e) {
			return null;
		}

	}

	public ArticleDTO getById(int id) {
		try {
			Article a = articleRepository.findById(id).get();
			ArticleDTO aDTO = articleconverter.EntityToDTO(a);
			return aDTO;
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}

	public void updateDescription(String description, int idarticle) {
		try {

			articleRepository.updateDescription(description, idarticle);

		} catch (Exception e) {
			System.out.println("catch");
		}

	}

	public void updateNomArticle(String nom, int idarticle) {
		try {

			articleRepository.updateNomArticle(nom, idarticle);

		} catch (Exception e) {
			System.out.println("catch");
		}

	}

	public void updatePrixArticle(float prix, int idarticle) {
		try {

			articleRepository.updatePrixArticle(prix, idarticle);

		} catch (Exception e) {
			System.out.println("catch");
		}

	}

	public void updateVisibiliteArticle(boolean vis, int idarticle) {
		try {

			articleRepository.updateVisibiliteArticle(vis, idarticle);

		} catch (Exception e) {
			System.out.println("catch");
		}

	}

	public void updateOffreSpecialeArticle(boolean sp, int idarticle) {
		try {

			articleRepository.updateOffreSpecialeArticle(sp, idarticle);

		} catch (Exception e) {
			System.out.println("catch");
		}

	}

	public void updateDescriptionOffresp(String dsp, int idarticle) {
		try {

			articleRepository.updateDescriptionOffresp(dsp, idarticle);

		} catch (Exception e) {
			System.out.println("catch");
		}

	}

	public void updateCategorieArt(Categorie cat, int idarticle) {
		try {

			articleRepository.updateCategorieArt(cat, idarticle);

		} catch (Exception e) {
			System.out.println("catch");
		}

	}

	public Set<ArticleDTO> findOffrespeciale() {
		Set<ArticleDTO>aDTO= new HashSet<ArticleDTO>();
		Set<Article> a= new HashSet<Article>();
		try {
			System.out.println("catch1");
	
 a = articleRepository.findOffrespeciale();
	System.out.println("catch2");

			for (Article ar : a) {
				System.out.println("catch3");
System.out.println(ar);
				aDTO.add(articleconverter.EntityToDTO(ar));
				System.out.println("catch4");

			}


		} catch (Exception e) {
			System.out.println("catch5");
			System.out.println(aDTO.size());
			System.out.println(a.size());
			System.out.println("catch6");

		}
		System.out.println("catch7");

		return aDTO;
	}
	
	
	
	public Set<Article> findArticleWithCategorie(CategorieDTO categorieDTO){
		try {
			
			
			
	Categorie c = CategorieConverter.dTOToEntity(categorieDTO);
			
		
System.out.println(articleRepository.findArticleWithCategorie(c));

		return	articleRepository.findArticleWithCategorie(c);

		} catch (Exception e) {
			System.out.println("catch");
	
			return null;
		}

	}
	
}