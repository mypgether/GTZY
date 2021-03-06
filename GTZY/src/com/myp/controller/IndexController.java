package com.myp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myp.model.User;
import com.myp.service.UserService;

@Controller
public class IndexController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "base/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public User login(User user) {
		User iUser = userService.login(user);
		return iUser;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String goIndex() {
		return "base/index";
	}
}
