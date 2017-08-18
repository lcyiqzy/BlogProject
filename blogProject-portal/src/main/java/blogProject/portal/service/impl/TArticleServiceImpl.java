package blogProject.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TArticle;
import blogProject.manager.dao.TArticleMapper;
import blogProject.manager.example.TArticleExample;
import blogProject.portal.service.TArticleService;


@Service
public class TArticleServiceImpl implements TArticleService{
	
	@Autowired
	TArticleMapper tArticleMapper;

	@Override
	public TArticle getArticle(Integer id) {
		// TODO Auto-generated method stub
		return tArticleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TArticle> getAll(TArticleExample example) {
		// TODO Auto-generated method stub
		return tArticleMapper.selectByExample(null);
	}


}
