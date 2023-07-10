package com.user.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.contact;
import com.user.entity.user;
import com.user.service.userService;

@RestController

public class userController {
	
	@Autowired
	private userService Userservice;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@GetMapping("/user/{userId}")
	public user getuser(@PathVariable long userId)
	{
		user User=this.Userservice.getUser(userId);
		List c=this.resttemplate.getForObject("localhost:9007/contact/user/"+User.getUserId(),List.class);
		
		User.setContacts((java.util.List<contact>) c);
		return User;
	}

}
