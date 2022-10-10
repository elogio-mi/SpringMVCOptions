package info.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	@GetMapping("/test1")
	public String test1() {
		System.out.println("test1");
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		System.out.println("test2");
		return "test2";
	}
	
	
}

