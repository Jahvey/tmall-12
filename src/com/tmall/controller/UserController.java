package com.tmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tmall.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userServcie;
	public IUserService getUserServcie() {
		return userServcie;
	}

	public void setUserServcie(IUserService userServcie) {
		this.userServcie = userServcie;
	}

	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login() {
		return "loginPage";
	}
	
	@RequestMapping(value = "/foreLogin",method = RequestMethod.POST)
	public String foreLogin(@RequestParam(value = "username")String name,
			@RequestParam(value = "password")String password) {
		if(null == name || null == password){
			System.out.println("用户名或密码不能为空");
			return "error";
		}
		if(userServcie.isExist(name)){
			return "success";
		}
		return "error";
	}
}
