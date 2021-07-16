package fr.cda.delicesafpa.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.delicesafpa.beans.Article;
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
}
