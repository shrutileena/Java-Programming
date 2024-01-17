package springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {

	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "Hello!");
		model.addAttribute("desc", "Home for programmer");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model model) {
//		model.addAttribute("Header", "Hello!");
//		model.addAttribute("desc", "Home for programmer");
		return "contact";
	}

	// moving data from view to controller using HttpServletRequest

//	  @RequestMapping(path = "/processform", method = RequestMethod.POST) public
//	  String handleForm(HttpServletRequest request, HttpServletResponse response) {
//	  String email = request.getParameter("email"); System.out.println(email);
//	  return null; }

	// moving data from view to controller using @RequestParam

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam(name = "email", required = true) String email,
//			@RequestParam(name = "username", required = true) String username,
//			@RequestParam(name = "password", required = true) String password, Model model) { 
//		// System.out.println(email+"
//		// "+username+"
//		// "+password);
//		model.addAttribute("email", email);
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		return "success";
//	}

	// moving data from view to controller using a class inside model attribute
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam(name = "email", required = true) String email,
//			@RequestParam(name = "username", required = true) String username,
//			@RequestParam(name = "password", required = true) String password, Model model) {
//
//		User user = new User();
//		user.setEmail(email);
//		user.setUsername(username);
//		user.setPassword(password);
//		
//		model.addAttribute("user", user);
//		
//		return "success";
//	}

	// moving data from view to controller using @ModelAttribute
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
//		model.addAttribute("Header", "Hello!");
//		model.addAttribute("desc", "Home for programmer");
		return "success";
	}
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@ModelAttribute("user") User user, Model model) {
//		return "success";
//	}
}
