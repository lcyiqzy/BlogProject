package blogProject.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import blogProject.manager.bean.TArticle;
import blogProject.manager.bean.TUser;
import blogProject.restapi.service.UserCenterService;

@RestController
@RequestMapping("/userCenter")
public class UserCenterController {

	@Autowired
	UserCenterService centerService;

	@RequestMapping("/getUserbyId")
	public TUser getUserbyId(Integer userId) {

		TUser user = centerService.getUserbyId(userId);

		return user;
	}

	@RequestMapping("/getUserFollow")
	public List<TUser> getUserFollow(Integer userId) {
		List<TUser> follow = centerService.getFollowByUserId(userId);

		return follow;

	}

	@RequestMapping("/getUserFans")
	public List<TUser> getUserFans(Integer userId) {

		List<TUser> fans = centerService.getFansByUserId(userId);

		return fans;

	}

	@RequestMapping("/addFollow")
	public void addFollow(@RequestParam(value = "userId") Integer userId,
			@RequestParam(value = "fanId") Integer fanId) {

		centerService.addFollow(userId, fanId);

	}

	@RequestMapping("/deleteFollow")
	public void deleteFollow(@RequestParam(value = "userId") Integer userId,
			@RequestParam(value = "fanId") Integer fanId) {

		centerService.deleteFollow(userId, fanId);

	}

	@RequestMapping("/isFollowed")
	public Integer isFollowed(Integer userId, Integer fanId) {

		List<TUser> follow = centerService.getFollowByUserId(userId);
		if (follow != null) {
			List<Integer> followedId = new ArrayList<>();
			for (TUser tUser : follow) {

				followedId.add(tUser.getId());

			}
			if (followedId.contains(fanId)) {
				return 1;
			}
			return 0;
		}
		return 0;
	}

	@RequestMapping("/saveIntro")
	public TUser saveIntro(String content, Integer userId) {

		centerService.saveIntro(content, userId);

		TUser user = centerService.getUserbyId(userId);

		return user;
	}

	@RequestMapping(value="/getIntro", produces="text/html;charset=UTF-8")
	public String getIntro(Integer userId) throws Exception {
		String intro = centerService.getIntro(userId);
		return intro;
	}
	
	@RequestMapping("/getUserArticle")
	public List<TArticle> getUserArticle(Integer userId){
		
		List<TArticle> list =centerService.getUserArticleByUserId(userId);
		
		
		return list;
	}
	

}
