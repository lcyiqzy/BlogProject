package blogProject.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TArticle;
import blogProject.manager.dao.TArticleMapper;
import blogProject.portal.service.TArticleService;

@Service
public class TArticleServiceImpl implements TArticleService {
    
    @Autowired
    TArticleMapper articleMapper;
    
    //删除
    @Override
    public boolean delArticle(Integer did) {
        int i = articleMapper.deleteByPrimaryKey(did);
        if (i == 1) {
            return true;
        }
        return false;
    }
    
    //保存
    @Override
    public boolean saveArticle(TArticle article) {
        int i = articleMapper.insertSelective(article);
        if (i == 1) {
            return true;
        }
        return false;
    }

}
