package blogProject.restapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	
	@RequestMapping("/hello")
	public Map<String,Object> testPsge(){
		Map<String,Object> map = new HashMap<>();
		map.put("tom", "29");
		
		return map;
		
	}

}
