package com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is our home url");
		model.addAttribute("key", "hi my name is sushant");
		model.addAttribute("id", 10);
		List<String> list = new ArrayList<>();
		list.add("durgesh");
		list.add("sushant");
		list.add("sahil");
		list.add("ashraf");
		list.add("shabbir");
		model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/about")
	public ModelAndView about(ModelAndView view) {
		view.addObject("name","sushant");
		System.out.println("this is our about url");
		List<String>list=new ArrayList<>();
		list.add("ubaid");
		list.add("shakeel");
		list.add("akhil");
		list.add("fakeer");
		list.add("sulemaan");
		view.addObject("friends", list);
		view.setViewName("about");
		return view;
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("key", "nadeem");
		modelandview.addObject("key2", 102);
		modelandview.setViewName("help");
		return modelandview;
	}

}
