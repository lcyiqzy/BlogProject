package blogProject.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TArticle;
import blogProject.manager.dao.TArticleMapper;
import blogProject.portal.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
    
    @Autowired
    TArticleMapper articleMapper;
    
    /**
     * 保存文章
     */
   /* @Override
    public boolean saveArticle(TArticle article) {
        int i = articleMapper.insertSelective(article);
        if (i == 1) {
            return true;
        }
        return false;
    }*/
    
    /**
     * 获取所有文章
     */
  /*  @Override
    public List<TArticle> getAllArticles() {
        return articleMapper.selectByExample(null);
    }*/
    
    /**
     * 删除文章
     */
//    @Override
    /*public boolean delArticle(Integer did) {
        int i = articleMapper.deleteByPrimaryKey(did);
        if (i == 1) {
            return true;
        }
        return false;
    }*/
    

}
