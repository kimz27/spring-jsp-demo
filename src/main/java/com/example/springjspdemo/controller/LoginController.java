package com.example.springjspdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.*;


@Controller 
public class LoginController {
	
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String WelcomePage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
		
		if(userId.equals("202004831") && password.equals("root")) {
			
			return "dashboard";
		
		}
		if(userId.equals("202003363") && password.equals("root")) {
			
			return "dashboard";
		
		}
		
	 
			model.put("errorMsg", "please provide the correct user id and password");
		
		return "login";
			
	}


}
