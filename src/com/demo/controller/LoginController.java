package com.demo.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.LoginForm;

@Controller("login")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String showLoginForm(Map model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		
		return "loginform";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processLogin(Map model, @Valid LoginForm loginForm, BindingResult result) {
		String userName = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		System.out.println(userName + ", " + password);
		
		if (result.hasErrors()) {
			return "loginform";
		}
		
		if (userName.equals("Admin") && password.equals("admin123")) {
			model.put("success", "Welcome " + userName + " to the App!");
			return "welcome";
		}
		
		model.put("errorMessage", "Invalid Credentials!");
		return "error";
	}

}
