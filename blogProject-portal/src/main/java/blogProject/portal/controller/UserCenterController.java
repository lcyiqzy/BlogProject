package blogProject.portal.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blogProject.commons.utils.HttpClientUtil;


@Controller
@RequestMapping("/userCenter")
public class UserCenterController {
	
/*	@Value("${restapi.server.ip}")
	// 此注解为将数据从配置文件中取出
	private String restapiServer;

	@Value("${restapi.server.port}")
	private String restapiPort;

	@Value("${restapi.server.apppath}")
	private String restapiPath;

	private String getRestApiURL() {

		return "http://" + restapiServer + ":" + restapiPort + "/"
				+ restapiPath;
	}
*/
	@RequestMapping("/toUserCenterPage")
	public String toUserCenterPage(){
		
		return "userCenter/userCenterPage";
	}
	
	@RequestMapping("/tomyFollowPage")
	public String tomyFollowPage(@RequestParam(value = "userId") Integer userId){
		
		String url ="http://127.0.0.1:8082/blogProject-restapi"+ "/userCenter/getUserFollow";
		
		Map<String,Object> map = new HashMap<>();
		
		try {
			map.put("userId", userId);
			String response = HttpClientUtil.httpPostRequest(url, map);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return"userCenter/myFollow";
	}
	
	@RequestMapping("/tomyFansPage")
	public String tomyFansPage(){
		
		return "userCenter/myFans";
	}
}
