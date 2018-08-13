package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserMapper;
import com.entity.User;


@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController{
	@Resource
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello(Model model) {
		return "hello"; 
	}
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public ModelAndView getDetail(@PathVariable(value="name")String name) {
		ModelAndView m = new ModelAndView();
        User a = userService.selectByE(name);
		m.addObject("name", a);  
		m.setViewName("hello-name");
		return m;

	}
	@ResponseBody
	@RequestMapping(value = "/json/{name}", method = RequestMethod.GET)
	public User getJsonDetail(@PathVariable(value="name")String name) {
		 User a = userService.selectByE(name);
		return a;
	}
}
