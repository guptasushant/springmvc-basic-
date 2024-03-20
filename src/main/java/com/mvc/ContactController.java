package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() 
	{
		return "contact";
	}
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String useremail,
			@RequestParam("username") String username,
			@RequestParam("password") String password, Model model) 
	{
//		System.out.println(useremail);
//		System.out.println(username);
//		System.out.println(password);
//		model.addAttribute("email",useremail);
//		model.addAttribute("name",username);
//		model.addAttribute("password",password);

		User user=new User();
		user.setEmail(useremail);
		user.setUsername(username);
		user.setPassword(password);
		System.out.println(user);
		model.addAttribute(user);
		return "done";
	}
}
