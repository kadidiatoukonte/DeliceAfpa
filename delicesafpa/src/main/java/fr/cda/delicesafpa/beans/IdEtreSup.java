package fr.cda.delicesafpa.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

//@Embeddable
public class IdEtreSup implements Serializable {
	/*
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "article",
            joinColumns = {@JoinColumn(name = "idarticle")},
            inverseJoinColumns = {@JoinColumn(name = "idarticle_etreSup")}
    )
    private Set<Article> article = new HashSet<Article>();
	
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "article",
            joinColumns = {@JoinColumn(name = "idarticle_etreSup")},
            inverseJoinColumns = {@JoinColumn(name = "idarticle")}
    )
    private Set<Article> idarticle_etreSup = new HashSet<Article>();


	public IdEtreSup(Set<Article> article, Set<Article> idarticle_etreSup) {
		super();
		this.article = article;
		this.idarticle_etreSup = idarticle_etreSup;
	}


	public Set<Article> getArticle() {
		return article;
	}


	public void setArticle(Set<Article> article) {
		this.article = article;
	}


	public Set<Article> getIdarticle_etreSup() {
		return idarticle_etreSup;
	}


	public void setIdarticle_etreSup(Set<Article> idarticle_etreSup) {
		this.idarticle_etreSup = idarticle_etreSup;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((article == null) ? 0 : article.hashCode());
		result = prime * result + ((idarticle_etreSup == null) ? 0 : idarticle_etreSup.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdEtreSup other = (IdEtreSup) obj;
		if (article == null) {
			if (other.article != null)
				return false;
		} else if (!article.equals(other.article))
			return false;
		if (idarticle_etreSup == null) {
			if (other.idarticle_etreSup != null)
				return false;
		} else if (!idarticle_etreSup.equals(other.idarticle_etreSup))
			return false;
		return true;
	}
	
*/

}
