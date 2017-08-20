package blogProject.portal.service;

import blogProject.manager.bean.TArticle;

public interface TArticleService {

    boolean delArticle(Integer did);

    boolean saveArticle(TArticle article);

	TArticle getArticleById(Integer id);
    
    

}
