package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class loginCon {

	@GetMapping("/log")
	public ModelAndView log() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login.html");
		return mv;
	}
}
