package blogProject.restapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blogProject.manager.bean.TUser;
import blogProject.restapi.bean.BlogReturn;
import blogProject.restapi.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	/**
	 * 注册邮箱激活
	 */
	@RequestMapping("/activate")
	public BlogReturn activate(String userEmail, String registCode) {
		System.out.println("resapi接到的userEmail:" + userEmail);
		System.out.println("resapi接到的registCode:" + registCode);
		TUser user = userService.find(userEmail);
		System.out.println("拿到要激活的user: " + user);
		// 1.验证邮箱是否存在
		if (user == null) {
			return BlogReturn.fail("该帐号未注册(邮箱地址不存在)！", null, null);
		}
		if (user.getRegistState() == 0) {
			// 帐号没激活
			if (registCode.equals(user.getRegistCode())) {
				// 激活成功 ,同时更新用户的激活状态
				boolean flag = userService.updateStatus(user);
				if (flag) {
					// 更新状态成功后,删除激活注册码
					userService.deleteRegistCode(registCode);
					return BlogReturn.success("点击这里去<a href='http://localhost:8081/blogProject-portal/login.jsp' style=\"color: red;\">登录</a>", null, null);
				}
			} else {
				return BlogReturn.fail("激活码不正确,请重新激活！", null, null);
			}

		} 
		return BlogReturn.fail("该帐号已激活!<a href='http://localhost:8081/blogProject-portal/login.jsp' style=\"color: red;\">登录</a>", null, null);
	}

	@RequestMapping("/regist")
	public BlogReturn regist(TUser user) {
		// 创建一个空的对象
		boolean flag = false;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			// 将在数据库保存的对象返回保存信息
			flag = userService.regist(user);
			System.out.println("数据库中保存的regist:" + flag);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("error", "该帐号已被注册!!!");
		}
		if (flag) {
			return BlogReturn.success("恭喜您注册成功！请到注册的邮箱点击链接激活！", null, null);
		} else {
			// 若为false,说明要么是数据库添加失败或者邮件发送异常
			map.put("error", "注册异常");
			return BlogReturn.fail("注册失败！", null, map);
		}
	}

	@RequestMapping("/login")
	public BlogReturn login(TUser user) {
		try {
			TUser loginUser = userService.login(user);
			System.out.println("数据库查到的loginUser:" + loginUser);
			if (loginUser != null) {
				// 说明用户存在
				if(loginUser.getRegistState() == 1) {
					return BlogReturn.success("登录成功!", loginUser, null);
				}
			} else {
				return BlogReturn.fail("请输入正确的登录帐号!", loginUser, null);
			}
		} catch (Exception e) {
			System.out.println(e);
			return BlogReturn.fail("登录异常", null, null);
		}
		return BlogReturn.fail("登录失败,该帐号未激活!", null, null);
	}
}
