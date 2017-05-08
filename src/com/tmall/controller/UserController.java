package com.tmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tmall.dao.UserDao;
import com.tmall.entity.User;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("foreLogin")
	public void login() {
		
	}
}
