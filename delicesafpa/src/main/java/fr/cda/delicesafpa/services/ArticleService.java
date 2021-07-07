package fr.cda.delicesafpa.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
import fr.cda.delicesafpa.beans.Client;
import fr.cda.delicesafpa.dao.ArticleRepository;
import fr.cda.delicesafpa.interfaceServ.ArticleServiceI;




@Service
public class ArticleService implements ArticleServiceI {
	@Autowired
	private ArticleRepository articleRepository;
	
	
	public void save(Article article) {
		try {
			articleRepository.save(article);
		} catch (Exception e) {
			
		}
	}
	
	public List<Article> getAll() {
		try {
			return articleRepository.findAll();
		} catch (Exception e) {
			return null;
		}
		
	}
	

	public Article getById(int id) {
		try {
		return articleRepository.findById(id).get();
		} catch (Exception NoSuchElementException) {
			return null;
		}
	}
	
	
	public void testFind()
	{
		try {			System.out.println("try1");

			System.out.println(articleRepository.findArticleWithDescriptionArticle().size());
			System.out.println("try2");
			System.out.println("try2"+articleRepository.findArticleWithDescriptionArticle().size());

		} catch (Exception e) {
			System.out.println("catch");
		}
		
	}
	
	public void updateDescription(String description, int idarticle)
	{
		try {			System.out.println("try1");

		articleRepository.updateDescription(description,idarticle);
			System.out.println("try2");
			System.out.println("try2"+articleRepository.findById(idarticle));

		} catch (Exception e) {
			System.out.println("catch");
		}
		
	}
	public Set<Article> findOffrespeciale()
	{Set<Article> a = null;
		

	try {			System.out.println("try1");

	 a = articleRepository.findOffrespeciale();
		System.out.println("try2");
		System.out.println("try2"+ a);

	} catch (Exception e) {
		System.out.println("catch");
	}
	
	
	
	return a;}
}
