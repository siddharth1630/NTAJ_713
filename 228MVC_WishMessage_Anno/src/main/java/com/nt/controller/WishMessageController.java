package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.WishMessageGenerator;

@Controller
public class WishMessageController {
	@Autowired
	private WishMessageGenerator service;
	
	@RequestMapping("/welcome")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/result")
	public ModelAndView result() {
		String msg=service.generator();
		return new ModelAndView("result","wmsg",msg);
	}

}
