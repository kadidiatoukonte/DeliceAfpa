package fr.cda.delicesafpa.interfaceServ;

import java.util.List;

import fr.cda.delicesafpa.beans.Article;

public interface ArticleServiceI {

	public	void save(Article article);
	public List<Article> getAll();
}
