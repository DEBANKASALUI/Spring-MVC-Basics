package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	
	@ModelAttribute
	public void commonDataforModel(Model m) {
		m.addAttribute("Header","Learn Spring MVC!");
		m.addAttribute("Desc","Happy Learning!!");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("This is Contact URL from Contact Controller");
		return "contact";
	}

	/*@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam(name="email",required=true) String userEmail, 
							@RequestParam("name") String userName,
							@RequestParam("password") String userPassword, Model model) {

//		Get form details using HttpServletRequest req object
//		public String handleForm(HttpServletRequest req) {
//		String email = req.getParameter("email");
//		String name=req.getParameter("username");
//		String pwd=req.getParameter("password");
//		System.out.println("User Email is: "+email+", Name is: "+name+", Password is: *****");
		
//		using Request Param
//		System.out.println("User Email is: "+userEmail+", Name is: "+userName+", Password is: "+ userPassword);	
		
		User user=new User();
		user.setEmail(userEmail);
		user.setName(userName);
		user.setPassword(userPassword);
		System.out.println(user);
		model.addAttribute("user", user);
		
//		process
//		model.addAttribute("name",userName);
//		model.addAttribute("email",userEmail);
//		model.addAttribute("password",userPassword);
		return "success";
	}*/
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		if(user.getEmail().isBlank() || user.getName().isBlank() || user.getPassword().isBlank()) {
			return "redirect:/contact";
		}
		
		int userid = this.userService.createUser(user);
		model.addAttribute("msg","User added successfully in Database! with Id: "+userid);
		return "success";
	}
	
	
	
}
