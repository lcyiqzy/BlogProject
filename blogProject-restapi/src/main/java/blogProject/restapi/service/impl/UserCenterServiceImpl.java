package blogProject.restapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TArticle;
import blogProject.manager.bean.TUser;
import blogProject.manager.bean.TUserUser;
import blogProject.manager.dao.TArticleMapper;
import blogProject.manager.dao.TUserMapper;
import blogProject.manager.dao.TUserUserMapper;
import blogProject.manager.example.TArticleExample;
import blogProject.manager.example.TUserUserExample;
import blogProject.manager.example.TUserUserExample.Criteria;
import blogProject.restapi.service.UserCenterService;

@Service
public class UserCenterServiceImpl implements UserCenterService {

	@Autowired
	TUserUserMapper userUserMapper;

	@Autowired
	TUserMapper userMapper;

	@Autowired
	TArticleMapper articleMapper;

	@Override
	public List<TUser> getFollowByUserId(Integer userId) {
		List<TUser> list = new ArrayList<>();

		List<TUserUser> tUserUser = userUserMapper.getFollowId(userId);
		if (tUserUser != null) {
			for (TUserUser t : tUserUser) {

				if (t.getUserFollowedId() != 0) {
					TUser follow = userMapper.selectByPrimaryKey(t
							.getUserFollowedId());
					list.add(follow);
				}
			}
			return list;
		}
		return null;
	}

	@Override
	public List<TUser> getFansByUserId(Integer userId) {

		List<TUser> list = new ArrayList<>();

		List<TUserUser> tUserUser = userUserMapper.getFansId(userId);

		for (TUserUser t : tUserUser) {
			if (t.getUserFanId() != 0) {
				TUser fans = userMapper.selectByPrimaryKey(t.getUserFanId());
				list.add(fans);
			}
		}

		return list;
	}

	@Override
	public TUser getUserbyId(Integer userId) {

		return userMapper.selectByPrimaryKey(userId);

	}

	@Override
	public void addFollow(Integer userId, Integer fanId) {
		System.out.println(userId);
		System.out.println(fanId);
		TUserUser userUser = new TUserUser();

		userUser.setUserId(userId);

		userUser.setUserFollowedId(fanId);

		TUserUser userUser2 = new TUserUser();

		userUser2.setUserFanId(userId);

		userUser2.setUserId(fanId);

		// 将用户取出，并把他的关注数+1
		TUser user1 = userMapper.selectByPrimaryKey(userId);

		user1.setFollowNum(user1.getFollowNum() + 1);

		// 将被关注的用户取出，并把他的粉丝数+1
		TUser user2 = userMapper.selectByPrimaryKey(fanId);

		user2.setFollowedNum(user2.getFollowedNum() + 1);
		userMapper.updateByPrimaryKey(user2);

		userMapper.updateByPrimaryKey(user1);

		userUserMapper.insertSelective(userUser);

		userUserMapper.insertSelective(userUser2);
	}

	@Override
	public void deleteFollow(Integer userId, Integer fanId) {

		TUserUserExample uue = new TUserUserExample();

		Criteria criteria = uue.createCriteria();

		criteria.andUserFollowedIdEqualTo(fanId);

		criteria.andUserIdEqualTo(userId);

		userUserMapper.deleteByExample(uue);

		TUserUserExample uue2 = new TUserUserExample();

		Criteria criteria2 = uue2.createCriteria();

		criteria2.andUserFanIdEqualTo(userId);

		criteria2.andUserIdEqualTo(fanId);

		userUserMapper.deleteByExample(uue2);
		// 将用户取出，并把他的关注数-1
		TUser user1 = userMapper.selectByPrimaryKey(userId);

		user1.setFollowNum(user1.getFollowNum() - 1);

		// 将被关注的用户取出，并把他的粉丝数-1
		TUser user2 = userMapper.selectByPrimaryKey(fanId);

		user2.setFollowedNum(user2.getFollowedNum() - 1);

		userMapper.updateByPrimaryKey(user2);

		userMapper.updateByPrimaryKey(user1);
	}

	@Override
	public void saveIntro(String content, Integer userId) {

		TUser user = userMapper.selectByPrimaryKey(userId);

		user.setUserSelfIntroduction(content);

		userMapper.updateByPrimaryKeySelective(user);

	}

	@Override
	public String getIntro(Integer userId) {

		TUser user = userMapper.selectByPrimaryKey(userId);

		String intro = user.getUserSelfIntroduction();

		return intro;
	}

	@Override
	public List<TArticle> getUserArticleByUserId(Integer userId) {

		TArticleExample example = new TArticleExample();

		blogProject.manager.example.TArticleExample.Criteria criteria = example
				.createCriteria();

		criteria.andAuthorIdEqualTo(userId);

		List<TArticle> list = articleMapper.selectByExample(example);

		return list;
	}

}
