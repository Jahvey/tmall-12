package com.tmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomeController {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
