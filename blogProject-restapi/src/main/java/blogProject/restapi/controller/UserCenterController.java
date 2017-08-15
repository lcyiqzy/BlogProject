package blogProject.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import blogProject.manager.bean.TUser;
import blogProject.restapi.service.UserCenterService;

@RestController
@RequestMapping("/userCenter")
public class UserCenterController {

	@Autowired
	UserCenterService centerService;

	@RequestMapping("/getUserFollow")
	public List<TUser> getUserFollow(Integer userId) {
		System.out.println("aaaa");
		System.out.println(userId);
		return null;

	}

	@RequestMapping("/getUserFans")
	public void getUserFans() {

	}

}
