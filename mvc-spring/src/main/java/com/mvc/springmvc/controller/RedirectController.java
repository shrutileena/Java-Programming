package com.mvc.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("This is handler one");
//		return "redirect:/two";
//	}
//	
//	@RequestMapping("/two")
//	public String two() {
//		System.out.println("This is handler two");
//		return "contact";
//	}
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is handler one");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
//		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is handler two");
		return "contact";
	}
	
//	@RequestMapping("/one")
//	public String one(HttpServletResponse response) throws IOException {
//		System.out.println("This is handler one");
//		response.sendRedirect("/two");
//		return "";
//	}
//	
//	@RequestMapping("/two")
//	public String two() {
//		System.out.println("This is handler two");
//		return "contact";
//	}
	
}
