package blogProject.manager.dao;

import blogProject.manager.bean.TUserUser;
import blogProject.manager.example.TUserUserExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserUserMapper {
	long countByExample(TUserUserExample example);

	int deleteByExample(TUserUserExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(TUserUser record);

	int insertSelective(TUserUser record);

	List<TUserUser> selectByExample(TUserUserExample example);

	TUserUser selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") TUserUser record,
			@Param("example") TUserUserExample example);

	int updateByExample(@Param("record") TUserUser record,
			@Param("example") TUserUserExample example);

	int updateByPrimaryKeySelective(TUserUser record);

	int updateByPrimaryKey(TUserUser record);

	List<Integer> getFansId(@Param("userId") Integer userId);
}