package com.mvc.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/mvc")
public class HomeController {

//	@RequestMapping(path = {"/home", "/"})
//	public String home() {
//		System.out.println("Hello this is home url");
//		return "index";			// returns view / jsp page name / home page
//	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about url");
		return "about";
	}
	
	@RequestMapping(path = {"/home", "/"})
	public String home(Model model) {
		System.out.println("This is home url");
		
		model.addAttribute("name", "Shruti Agarwal");
		model.addAttribute("id", 1234);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Abhay");
		friends.add("Smit");
		model.addAttribute("friends", friends);
		
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help url");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Shruti");
		modelAndView.setViewName("help");
		modelAndView.addObject("id", 12);
		
		LocalDateTime date = LocalDateTime.now();
		modelAndView.addObject("time", date);
		
		List<Integer> marks = Arrays.asList(12,12,123,54,34);
		modelAndView.addObject("marks", marks);
		
		return modelAndView;
	}
}
