package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController{

	@RequestMapping("/one")
	public RedirectView one(RedirectView view) {
		System.out.println("this is one handler");
		view.setUrl("enjoy");
		// return "redirect:/enjoy";
		return view;
	}

	@RequestMapping("/enjoy")
	public String two()  {
		System.out.println("this is two handler");
		return "contact";
	}

}
