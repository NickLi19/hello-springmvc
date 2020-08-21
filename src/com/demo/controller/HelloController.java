package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("sayhello")
	public ModelAndView sendGoodMorning() {
		String message = "Welcome to Spring MVC 5 & Concepts!";
		
		return new ModelAndView("hello", "data", message);
	}
}
