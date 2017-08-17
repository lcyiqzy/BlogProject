package blogProject.restapi.service;

import java.util.List;

import blogProject.manager.bean.TUser;

public interface UserCenterService {
	
	
	public List<TUser> getFollowByUserId(Integer userId);
	
	public List<TUser> getFansByUserId(Integer userId);

	public TUser getUserbyId(Integer userId);

	public void addFollow(Integer userId, Integer fanId);

	public void deleteFollow(Integer userId, Integer fanId);

}
