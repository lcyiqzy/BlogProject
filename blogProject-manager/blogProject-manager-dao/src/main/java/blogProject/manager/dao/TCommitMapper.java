package blogProject.manager.dao;

import blogProject.manager.bean.TCommit;
import blogProject.manager.example.TCommitExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCommitMapper {
    long countByExample(TCommitExample example);

    int deleteByExample(TCommitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCommit record);

    int insertSelective(TCommit record);

    List<TCommit> selectByExample(TCommitExample example);

    TCommit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCommit record, @Param("example") TCommitExample example);

    int updateByExample(@Param("record") TCommit record, @Param("example") TCommitExample example);

    int updateByPrimaryKeySelective(TCommit record);

    int updateByPrimaryKey(TCommit record);
}