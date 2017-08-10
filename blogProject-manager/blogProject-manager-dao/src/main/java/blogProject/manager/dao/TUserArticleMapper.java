package blogProject.manager.dao;

import blogProject.manager.bean.TUserArticle;
import blogProject.manager.example.TUserArticleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserArticleMapper {
    long countByExample(TUserArticleExample example);

    int deleteByExample(TUserArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserArticle record);

    int insertSelective(TUserArticle record);

    List<TUserArticle> selectByExample(TUserArticleExample example);

    TUserArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserArticle record, @Param("example") TUserArticleExample example);

    int updateByExample(@Param("record") TUserArticle record, @Param("example") TUserArticleExample example);

    int updateByPrimaryKeySelective(TUserArticle record);

    int updateByPrimaryKey(TUserArticle record);
}