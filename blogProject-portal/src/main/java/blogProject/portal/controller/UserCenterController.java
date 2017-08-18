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

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import blogProject.commons.utils.HttpClientUtil;
import blogProject.manager.bean.TArticle;
import blogProject.manager.bean.TUser;
import blogProject.portal.bean.Page;
import blogProject.portal.bean.Pagination;

@Controller
@RequestMapping("/userCenter")
public class UserCenterController {
	// 构建分页条
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

	// 去往文章页面
	@RequestMapping("/tomyArticlePage")
	public String tomyArticlePage(
			@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
			@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
			@RequestParam(value = "userId") Integer userId, Model model) {

		List<TArticle> userArticle = null;

		String url = "http://127.0.0.1:8082/blogProject-restapi"
				+ "/userCenter/getUserArticle";
		Map<String, Object> map = new HashMap<>();
		try {
			map.put("userId", userId);
			String response = HttpClientUtil.httpPostRequest(url, map);

			userArticle = new ArrayList<>();

			userArticle = new ObjectMapper().readValue(response.getBytes(),
					new TypeReference<List<TArticle>>() {
					});

		} catch (Exception e) {
			e.printStackTrace();
		}
		String pageUrl = "/userCenter/tomyArticlePage";
		Page<TArticle> page = pagination.paging(userArticle, pageSize, pageNo,
				userId, pageUrl);
		model.addAttribute("page", page);
		return "userCenter/myArticle";
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

	// 判断该是否关注了该用户
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

	// 将自我介绍添加到数据库
	@ResponseBody
	@RequestMapping("/saveIntro")
	public void saveIntro(@RequestParam(value = "userId") Integer userId,
			@RequestParam(value = "content", required = false) String content,
			HttpSession session)

	throws Exception {

		byte[] bytes = content.getBytes("ISO-8859-1");
		// ISO-8859-1-------------------->UTF-8码表
		String content1 = new String(bytes, "UTF-8");

		String url = "http://127.0.0.1:8082/blogProject-restapi"
				+ "/userCenter/saveIntro";

		Map<String, Object> map = new HashMap<>();
		map.put("content", content1);
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

		// 将新的user(更新了个人介绍)放进session中替换之前的user信息
		session.setAttribute("user", user);
	}

	// 将个人介绍从数据库中取出
	@ResponseBody
	@RequestMapping(value="/getIntro", produces="text/html;charset=UTF-8")
	public String getIntro(@RequestParam(value = "userId") Integer userId)
			throws Exception {

		String url = "http://127.0.0.1:8082/blogProject-restapi"
				+ "/userCenter/getIntro";

		Map<String, Object> map = new HashMap<>();

		map.put("userId", userId);

		String intro = HttpClientUtil.httpPostRequest(url, map);

		System.out.println(intro + "--------------");

		return intro;
	}
}
