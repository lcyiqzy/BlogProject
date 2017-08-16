package blogProject.portal.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import blogProject.commons.utils.HttpClientUtil;
import blogProject.manager.bean.TUser;
import blogProject.portal.bean.Page;
import blogProject.portal.bean.Pagination;

@Controller
@RequestMapping("/userCenter")
public class UserCenterController {

	/*
	 * @Value("${restapi.server.ip}") // 此注解为将数据从配置文件中取出 private String
	 * restapiServer;
	 * 
	 * @Value("${restapi.server.port}") private String restapiPort;
	 * 
	 * @Value("${restapi.server.apppath}") private String restapiPath;
	 * 
	 * private String getRestApiURL() {
	 * 
	 * return "http://" + restapiServer + ":" + restapiPort + "/" + restapiPath;
	 * }
	 */
	Pagination pagination = new Pagination();

	@RequestMapping("/toUserCenterPage")
	public String toUserCenterPage(
			@RequestParam(value = "userId") Integer userId, HttpSession session) {

		String url = "http://127.0.0.1:8082/blogProject-restapi"
				+ "/userCenter/getUserbyId";

		Map<String, Object> map = new HashMap<>();

		map.put("userId", userId);

		TUser user = null;

		try {
			String response = HttpClientUtil.httpPostRequest(url, map);

			user = new ObjectMapper().readValue(response.getBytes(),
					new TypeReference<TUser>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
		}

		session.setAttribute("user", user);

		return "userCenter/userCenterPage";
	}

	@RequestMapping("/tomyFollowPage")
	public String tomyFollowPage(
			@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
			@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
			@RequestParam(value = "userId") Integer userId, Model model) {

		List<TUser> followUser = null;

		String url = "http://127.0.0.1:8082/blogProject-restapi"
				+ "/userCenter/getUserFollow";

		Map<String, Object> map = new HashMap<>();

		try {
			map.put("userId", userId);
			String response = HttpClientUtil.httpPostRequest(url, map);

			followUser = new ArrayList<>();

			followUser = new ObjectMapper().readValue(response.getBytes(),
					new TypeReference<List<TUser>>() {
					});

		} catch (Exception e) {
			e.printStackTrace();
		}

		String pageUrl = "/userCenter/tomyFollowPage";
		Page<TUser> page = pagination.paging(followUser, pageSize, pageNo,
				userId, pageUrl);

		model.addAttribute("page", page);
		return "userCenter/myFollow";
	}

	@RequestMapping("/tomyFansPage")
	public String tomyFansPage(
			@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
			@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
			@RequestParam(value = "userId") Integer userId, Model model) {

		List<TUser> fansUser = null;
		String url = "http://127.0.0.1:8082/blogProject-restapi"
				+ "/userCenter/getUserFans";

		Map<String, Object> map = new HashMap<>();

		try {
			map.put("userId", userId);
			String response = HttpClientUtil.httpPostRequest(url, map);

			fansUser = new ObjectMapper().readValue(response.getBytes(),
					new TypeReference<List<TUser>>() {
					});

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String pageUrl = "/userCenter/tomyFansPage";

		Page<TUser> page = pagination.paging(fansUser, pageSize, pageNo,
				userId, pageUrl);

		model.addAttribute("page", page);

		return "userCenter/myFans";
	}

	@ResponseBody
	@RequestMapping("/addFollow")
	public void addFollow(@RequestParam(value = "userId") Integer userId,
			@RequestParam(value = "fanId") Integer fanId) {
		String url = "http://127.0.0.1:8082/blogProject-restapi"
				+ "/userCenter/addFollow";

		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("fanId", fanId);

		try {
			HttpClientUtil.httpPostRequest(url, map);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@ResponseBody
	@RequestMapping("/deleteFollow")
	public void deleteFollow(@RequestParam(value = "userId") Integer userId,
			@RequestParam(value = "fanId") Integer fanId) {

		String url = "http://127.0.0.1:8082/blogProject-restapi"
				+ "/userCenter/deleteFollow";

		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("fanId", fanId);

		try {
			HttpClientUtil.httpPostRequest(url, map);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@ResponseBody
	@RequestMapping("/isFollowed")
	public boolean isFollowed(@RequestParam(value = "userId") Integer userId,
			@RequestParam(value = "fanId") Integer fanId) {

		String url = "http://127.0.0.1:8082/blogProject-restapi"
				+ "/userCenter/isFollowed";

		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("fanId", fanId);

		Integer i = null;
		try {
			String response = HttpClientUtil.httpPostRequest(url, map);
			i = new ObjectMapper().readValue(response.getBytes(),
					new TypeReference<Integer>() {
					});
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (i == 1) {

			return true;
		} else

			return false;

	}
}
