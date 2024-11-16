package com.spring.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is Home URL");
//		setting the data to be sent from controller to view
		model.addAttribute("name", "MVC");
		model.addAttribute("id", 1001);

		List<String> friends = new ArrayList<String>();
		friends.add("Harry Potter");
		friends.add("James Potter");
		friends.add("Lily Potter");
		model.addAttribute("friend", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is About URL");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is Help URL");
//		creating ModelAndView object
		ModelAndView mav = new ModelAndView("help");

//		setting the data to be sent from controller to view
		mav.addObject("name", "Harry Potter");
		mav.addObject("id", 1001);
//		setting the viewname to be resolved by View Resolver
//		mav.setViewName("help");
		LocalDateTime now = LocalDateTime.now();
		mav.addObject("time", now);
		return mav;
	}
	
	@RequestMapping("/service")
	public ModelAndView service() {
		System.out.println("This is Service URL");
//		creating ModelAndView object
		ModelAndView mav = new ModelAndView("service");

//		setting the data to be sent from controller to view
		mav.addObject("name", "Harry Potter");
		mav.addObject("id", 1001);
//		setting the viewname to be resolved by View Resolver
//		mav.setViewName("service");
		LocalDateTime now = LocalDateTime.now();
		mav.addObject("time", now);
		List<String> friends = new ArrayList<String>();
		friends.add("Harry Potter");
		friends.add("James Potter");
		friends.add("Lily Potter");
		
		mav.addObject("friendList", friends);
		return mav;
	}

}
