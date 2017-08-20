package blogProject.portal.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	RestApiServerInfo serverInfo;

	@RequestMapping("/toUserCenterPage")
	public String toUserCenterPage(
			@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
			@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
			@RequestParam(value = "userId") Integer userId,
			HttpSession session, Model model) {

		List<TArticle> userArticle = null;

		String url = serverInfo.getRestApiURL() + "/userCenter/getUserbyId";

		String url_article = serverInfo.getRestApiURL()
				+ "/userCenter/getUserArticle";

		Map<String, Object> map = new HashMap<>();

		map.put("userId", userId);

		TUser user = null;

		try {
			String response = HttpClientUtil.httpPostRequest(url, map);

			String response_article = HttpClientUtil.httpPostRequest(
					url_article, map);

			user = new ObjectMapper().readValue(response.getBytes(),
					new TypeReference<TUser>() {
					});
			userArticle = new ObjectMapper().readValue(
					response_article.getBytes(),
					new TypeReference<List<TArticle>>() {
					});

		} catch (IOException e) {
			e.printStackTrace();
		}
		String pageUrl = "/userCenter/toUserCenterPage?";
		if (userArticle.size() > 0) {
			Page<TArticle> page = pagination.paging(userArticle, pageSize,
					pageNo, userId, pageUrl);
			model.addAttribute("page", page);
		}
		session.setAttribute("user", user);

		return "userCenter/userCenterPage";
	}

	// 去往我的文章页面
	@RequestMapping("/toArticlePage")
	public String tomyArticlePage(
			@RequestParam(value = "mypage", required = false) Integer mypage,
			@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
			@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
			@RequestParam(value = "userId") Integer userId, Model model) {

		List<TArticle> userArticle = null;

		String url = serverInfo.getRestApiURL() + "/userCenter/getUserArticle";
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
		String pageUrl = "/userCenter/toArticlePage?mypage=" + mypage + "&";
		if (userArticle.size() > 0) {
			Page<TArticle> page = pagination.paging(userArticle, pageSize,
					pageNo, userId, pageUrl);
			model.addAttribute("page", page);
		}
		if (mypage == 1) {
			return "userCenter/myArticle";
		}
		if (mypage == 0) {
			return "userCenter/hisPage";
		} else
			return "userCenter/userCenterPage";
	}

	// 去往他人的主页
	@RequestMapping("/toHisPage")
	public String tohisPage(
			@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
			@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
			@RequestParam(value = "userId") Integer userId, Model model,
			HttpSession session) {
		// 获取他人的TUser对象与文章列表
		List<TArticle> userArticle = null;
		TUser user = null;

		String url_article = serverInfo.getRestApiURL()
				+ "/userCenter/getUserArticle";

		String url_user = serverInfo.getRestApiURL()
				+ "/userCenter/getUserbyId";

		Map<String, Object> map = new HashMap<>();
		try {
			map.put("userId", userId);
			String response_article = HttpClientUtil.httpPostRequest(
					url_article, map);

			String response_user = HttpClientUtil
					.httpPostRequest(url_user, map);

			userArticle = new ArrayList<>();

			userArticle = new ObjectMapper().readValue(
					response_article.getBytes(),
					new TypeReference<List<TArticle>>() {
					});

			user = new ObjectMapper().readValue(response_user.getBytes(),
					new TypeReference<TUser>() {
					});

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (userArticle.size() > 0) {
			String pageUrl = "/userCenter/toHisPage?";
			Page<TArticle> page = pagination.paging(userArticle, pageSize,
					pageNo, userId, pageUrl);
			model.addAttribute("page", page);
		}

		session.setAttribute("hisuser", user);

		return "userCenter/hisPage";
	}

	// 去往关注页面
	@RequestMapping("/toFollowPage")
	public String tomyFollowPage(
			@RequestParam(value = "mypage", required = false) Integer mypage,
			@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
			@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
			@RequestParam(value = "userId") Integer userId, Model model) {

		List<TUser> followUser = null;

		String url = serverInfo.getRestApiURL() + "/userCenter/getUserFollow";

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

		String pageUrl = "/userCenter/toFollowPage?mypage=" + mypage + "&";

		if (followUser.size() > 0) {
			Page<TUser> page = pagination.paging(followUser, pageSize, pageNo,
					userId, pageUrl);

			model.addAttribute("page", page);

		}

		if (mypage == 1) {
			return "userCenter/myFollow";
		}
		if (mypage == 0) {
			return "userCenter/hisFollow";
		} else
			return "userCenter/userCenterPage";
	}

	// 去往粉丝页面
	@RequestMapping("/toFansPage")
	public String tomyFansPage(
			@RequestParam(value = "mypage", required = false) Integer mypage,
			@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
			@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
			@RequestParam(value = "userId") Integer userId, Model model) {

		List<TUser> fansUser = null;
		String url = serverInfo.getRestApiURL() + "/userCenter/getUserFans";

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
		String pageUrl = "/userCenter/toFansPage?mypage=" + mypage + "&";
		if (fansUser.size() > 0) {
			Page<TUser> page = pagination.paging(fansUser, pageSize, pageNo,
					userId, pageUrl);

			model.addAttribute("page", page);
		}
		if (mypage == 1) {
			return "userCenter/myFans";
		}
		if (mypage == 0) {
			return "userCenter/hisFans";
		} else
			return "userCenter/userCenterPage";
	}

	// 添加关注
	@ResponseBody
	@RequestMapping("/addFollow")
	public void addFollow(@RequestParam(value = "userId") Integer userId,
			@RequestParam(value = "fanId") Integer fanId, HttpSession session) {
		String url = serverInfo.getRestApiURL() + "/userCenter/addFollow";
		String url1 = serverInfo.getRestApiURL() + "/userCenter/getUserbyId";

		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("fanId", fanId);
		TUser user = null;
		try {
			// 将添加关注的请求发送到restapi
			HttpClientUtil.httpPostRequest(url, map);
			// 将获取用户请求发送到restapi
			String response = HttpClientUtil.httpPostRequest(url1, map);
			// 获取新的user
			user = new ObjectMapper().readValue(response.getBytes(),
					new TypeReference<TUser>() {
					});
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 将user更新到session中
		session.setAttribute("user", user);

	}

	// 取消用户关注
	@ResponseBody
	@RequestMapping("/deleteFollow")
	public void deleteFollow(@RequestParam(value = "userId") Integer userId,
			@RequestParam(value = "fanId") Integer fanId, HttpSession session) {

		String url = serverInfo.getRestApiURL() + "/userCenter/deleteFollow";
		String url1 = serverInfo.getRestApiURL() + "/userCenter/getUserbyId";

		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("fanId", fanId);

		TUser user = null;
		try {
			// 将添加关注的请求发送到restapi
			HttpClientUtil.httpPostRequest(url, map);
			// 将获取用户请求发送到restapi
			String response = HttpClientUtil.httpPostRequest(url1, map);
			// 获取新的user
			user = new ObjectMapper().readValue(response.getBytes(),
					new TypeReference<TUser>() {
					});
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 将user更新到session中
		session.setAttribute("user", user);

	}

	// 判断该是否关注了该用户
	@ResponseBody
	@RequestMapping("/isFollowed")
	public boolean isFollowed(@RequestParam(value = "userId") Integer userId,
			@RequestParam(value = "fanId") Integer fanId) {

		String url = serverInfo.getRestApiURL() + "/userCenter/isFollowed";

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

		String url = serverInfo.getRestApiURL() + "/userCenter/saveIntro";

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
	@RequestMapping(value = "/getIntro", produces = "text/html;charset=UTF-8")
	public String getIntro(@RequestParam(value = "userId") Integer userId)
			throws Exception {

		String url = serverInfo.getRestApiURL() + "/userCenter/getIntro";

		Map<String, Object> map = new HashMap<>();

		map.put("userId", userId);

		String intro = HttpClientUtil.httpPostRequest(url, map);

		System.out.println(intro + "--------------");

		return intro;
	}
}
