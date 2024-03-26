package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.model.User;
import com.mvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	public UserService service;
	
	 
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header", "Register Here!");
	}

	@RequestMapping("/contact")
	public String showForm() {

		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		int created = this.service.createUser(user);
		model.addAttribute("name",user.getUsername());
		model.addAttribute("email", user.getEmail());
		model.addAttribute("password", user.getPassword());
		model.addAttribute("msg","user created with id "+created);
		return "done";
	}
}
