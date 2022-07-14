package com.boottest.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("=================ok=================");
		return "home.html";
	}
	
	@GetMapping("/")
	public String index() {
		System.out.println("=================start=================");
		return "index";
	}
}
