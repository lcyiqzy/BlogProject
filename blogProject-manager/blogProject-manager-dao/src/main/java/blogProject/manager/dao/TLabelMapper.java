package blogProject.manager.dao;

import blogProject.manager.bean.TLabel;
import blogProject.manager.example.TLabelExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLabelMapper {
    long countByExample(TLabelExample example);

    int deleteByExample(TLabelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLabel record);

    int insertSelective(TLabel record);

    List<TLabel> selectByExample(TLabelExample example);

    TLabel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLabel record, @Param("example") TLabelExample example);

    int updateByExample(@Param("record") TLabel record, @Param("example") TLabelExample example);

    int updateByPrimaryKeySelective(TLabel record);

    int updateByPrimaryKey(TLabel record);
}