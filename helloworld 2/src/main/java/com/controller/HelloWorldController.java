package com.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.entity.User;
import com.service.UserService;

@Controller
public class HelloWorldController {
	
	@Resource
	private UserService userService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello(Model model) {
		return "welcome";
	}

	@ResponseBody
	@RequestMapping(value = "/getName", method = RequestMethod.GET)
	public User getJsonDetail(String name) {
		 User user = userService.selectByE(name);
		return user;
	}
	
	
}
	
