package blogProject.manager.dao;

import blogProject.manager.bean.tTest;
import blogProject.manager.bean.tTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tTestMapper {
    long countByExample(tTestExample example);

    int deleteByExample(tTestExample example);

    int insert(tTest record);

    int insertSelective(tTest record);

    List<tTest> selectByExample(tTestExample example);

    int updateByExampleSelective(@Param("record") tTest record, @Param("example") tTestExample example);

    int updateByExample(@Param("record") tTest record, @Param("example") tTestExample example);
}