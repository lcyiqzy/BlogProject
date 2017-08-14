package blogProject.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TArticle;
import blogProject.manager.dao.TArticleMapper;
import blogProject.manager.service.TArticleService;

@Service
public class TArticleServiceImpl implements TArticleService {
    
    @Autowired
    TArticleMapper articleMapper;
    
    /**
     * 保存文章
     */
    @Override
    public boolean saveArticle(TArticle article) {
        int i = articleMapper.insertSelective(article);
        if (i == 1) {
            return true;
        }
        return false;
    }
    
    /**
     * 获取所有文章
     */
    @Override
    public List<TArticle> getAllArticles() {
        return articleMapper.selectByExample(null);
    }
    

}
