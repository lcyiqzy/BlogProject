package blogProject.manager.dao;

import blogProject.manager.bean.TTypePermission;
import blogProject.manager.example.TTypePermissionExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTypePermissionMapper {
    long countByExample(TTypePermissionExample example);

    int deleteByExample(TTypePermissionExample example);

    int deleteByPrimaryKey(Integer type);

    int insert(TTypePermission record);

    int insertSelective(TTypePermission record);

    List<TTypePermission> selectByExample(TTypePermissionExample example);

    TTypePermission selectByPrimaryKey(Integer type);

    int updateByExampleSelective(@Param("record") TTypePermission record, @Param("example") TTypePermissionExample example);

    int updateByExample(@Param("record") TTypePermission record, @Param("example") TTypePermissionExample example);

    int updateByPrimaryKeySelective(TTypePermission record);

    int updateByPrimaryKey(TTypePermission record);
}