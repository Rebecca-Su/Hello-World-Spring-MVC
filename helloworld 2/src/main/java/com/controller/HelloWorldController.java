package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController{
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public ModelAndView getDetail(@PathVariable(value = "name") String name){
		ModelAndView m = new ModelAndView();
		m.addObject("name", name);
		m.setViewName("hello-name");
		return m;
	}
	
	
}
