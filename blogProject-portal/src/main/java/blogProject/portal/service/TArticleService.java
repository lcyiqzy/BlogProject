package blogProject.portal.service;


import java.util.List;

import blogProject.manager.bean.TArticle;
import blogProject.manager.example.TArticleExample;

public interface TArticleService {
	TArticle getArticle(Integer id);
	List<TArticle> getAll(TArticleExample example);
}
