package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/hello")
	public String greet() {
		return "welcome";
	}
	
	@GetMapping("/homapage")
	public String greet1() {
		return "home";
	}
}
