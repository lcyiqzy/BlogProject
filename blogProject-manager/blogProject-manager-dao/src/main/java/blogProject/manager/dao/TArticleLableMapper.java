package blogProject.manager.dao;

import blogProject.manager.bean.TArticleLable;
import blogProject.manager.example.TArticleLableExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TArticleLableMapper {
    long countByExample(TArticleLableExample example);

    int deleteByExample(TArticleLableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TArticleLable record);

    int insertSelective(TArticleLable record);

    List<TArticleLable> selectByExample(TArticleLableExample example);

    TArticleLable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TArticleLable record, @Param("example") TArticleLableExample example);

    int updateByExample(@Param("record") TArticleLable record, @Param("example") TArticleLableExample example);

    int updateByPrimaryKeySelective(TArticleLable record);

    int updateByPrimaryKey(TArticleLable record);
}