package com.code.webapp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String home() {
		System.out.println("Home!");
		return "home.jsp";
	}
	
	@RequestMapping("user")
	public ModelAndView user(String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("home.jsp");
		return mv;
	}
}
