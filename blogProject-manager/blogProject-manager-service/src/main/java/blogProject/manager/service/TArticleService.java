package blogProject.manager.service;

import java.util.List;

import blogProject.manager.bean.TArticle;

public interface TArticleService {

    boolean saveArticle(TArticle article);

    List<TArticle> getAllArticles();

}
