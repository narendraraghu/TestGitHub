package com.springthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoginController {

	@RequestMapping("/login")
	public String getMovie( Model model) {
		System.out.println("login");
		return "Login";
	}
	
	@RequestMapping("/result")
	public String getMovie1( String firstName,String lastName,Model model) {
		System.out.println("result");
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		return "result";
	}
}
