package blogProject.manager.dao;

import blogProject.manager.bean.TUserArticleCommit;
import blogProject.manager.example.TUserArticleCommitExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserArticleCommitMapper {
    long countByExample(TUserArticleCommitExample example);

    int deleteByExample(TUserArticleCommitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserArticleCommit record);

    int insertSelective(TUserArticleCommit record);

    List<TUserArticleCommit> selectByExample(TUserArticleCommitExample example);

    TUserArticleCommit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserArticleCommit record, @Param("example") TUserArticleCommitExample example);

    int updateByExample(@Param("record") TUserArticleCommit record, @Param("example") TUserArticleCommitExample example);

    int updateByPrimaryKeySelective(TUserArticleCommit record);

    int updateByPrimaryKey(TUserArticleCommit record);
}