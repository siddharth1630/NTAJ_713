package com.nt.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.LocaleAppService;

@Controller("/controller")
public class LocaleController {
	@Autowired
	private LocaleAppService service;
	
	@RequestMapping("/welcome")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/countries")
	public ModelAndView countries() {		// 1st way
		TreeSet<String> list=null;
		list=service.getAllCountries();
		int count=list.size();
		// creating mav object
		ModelAndView mav=new ModelAndView();
		// adding object in mav
		mav.addObject("listInfo",list);
		mav.addObject("count",count);
		mav.addObject("operation", "countries");
		// adding lvn
		mav.setViewName("result");
		return mav;
	}
	
	@RequestMapping("/lang")
	public String language(Map<String,Object> map) {	// 2nd way
		TreeSet<String> list=null;
		list=service.getAllLanguage();
		int count=list.size();
	
		// adding object in map
		map.put("listInfo",list);
		map.put("count",count);
		map.put("operation", "language");
		System.out.println(map.getClass());
		System.out.println("LocaleController.language()");
		return "result";
	}
	
	/*@RequestMapping("/lang")
	public String language(ModelMap map) {	// 3rd way
		TreeSet<String> list=null;
		list=service.getAllLanguage();
		int count=list.size();
		// adding object in mav
		map.put("listInfo",list);
		map.put("count",count);
		map.put("operation", "language");
	
		return "result";
	}*/
	
	/*@RequestMapping("/lang")
	public String language(Model model) {	// 4th  way and best way
		TreeSet<String> list=null;
		list=service.getAllLanguage();
		int count=list.size();
		// adding object in mav
		model.addAttribute("listInfo",list);
		model.addAttribute("count",count);
		model.addAttribute("operation", "language");
		System.out.println(model.getClass());
	
		return "result";
	}*/
	
	/*@RequestMapping("/lang")
	public void language(Model model) {	// 5th way we can also take void then uri is its lvn
		TreeSet<String> list=null;
		list=service.getAllLanguage();
		int count=list.size();
		// adding object in mav
		model.addAttribute("listInfo",list);
		model.addAttribute("count",count);
		model.addAttribute("operation", "language");
	}*/
	
	/*@RequestMapping("/lang")	// here it goes to uri name page 
	public Map<String,Object> language() {	// 6th way
		TreeSet<String> list=null;
		list=service.getAllLanguage();
		Map<String, Object> map=new HashMap<String, Object>();	// in this approch we have to create
													// a map object this is not a good practice
		int count=list.size();
		// adding object in mav
		map.put("listInfo",list);
		map.put("count",count);
		map.put("operation", "language");
		return map;
	}*/
	
	/*@RequestMapping("/lang")
	public Model language() {		// 7th way
		TreeSet<String> list=null;
		list=service.getAllLanguage();
		int count=list.size();
		Model model=new ExtendedModelMap();	// we have to create a object
		// adding object in mav
		model.addAttribute("listInfo",list);
		model.addAttribute("count",count);
		model.addAttribute("operation", "language");
	
		return model;	// there is no control on lvn
	}*/
}
