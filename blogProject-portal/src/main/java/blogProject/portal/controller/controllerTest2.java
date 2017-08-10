package blogProject.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllerTest2 {
	
	@RequestMapping("/hello")
	public String test1(){
		
		
		return "success";
	}
	

}
