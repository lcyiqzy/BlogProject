package blogProject.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

	@RequestMapping("/hello")
	public String test1(){
		
		System.out.println("进入方法");
		return "test";
	}
}
