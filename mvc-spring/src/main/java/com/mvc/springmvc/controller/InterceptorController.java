package com.mvc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

	@RequestMapping("/interceptor")
	public String showMainPage() {
		return "interceptor";
	}
	
	@RequestMapping("/welcome")
	public String showWelcomePage(@RequestParam("user") String name, Model model) {
		System.out.println(name);
		model.addAttribute("name", name);
		return "welcome";
	}
}
