package com.demo.controller;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class UserController {
	
	
	@RequestMapping(value="/hello")
	public String hello(){
		System.out.println("--------");
		return "hello";
	}

}
