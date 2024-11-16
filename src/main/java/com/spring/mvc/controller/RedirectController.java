package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/first")
//	for RedirectView
	public RedirectView FirstHandler()
	
//	for Redirect prefix
//	public String FirstHandler()
	{
		System.out.println("Welcome to Handler 1");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("second");
//		redirectView.setUrl("https://www.google.com");
		return redirectView;
		
//		for Redirect prefix
//		return "redirect:/second";
	}

	@RequestMapping("/second")
	public String SecondHandler() {
		System.out.println("Welcome to Handler 2");
		return "contact";
	}

}
