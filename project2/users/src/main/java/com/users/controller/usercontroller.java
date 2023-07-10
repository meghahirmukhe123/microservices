package com.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.users.entity.myuser;
import com.users.service.myuserservice;

@RestController
public class usercontroller {
	
	
	@Autowired
	private myuserservice Myuserservice;
	
	
	//to add data
	@PostMapping("/user")
	public ResponseEntity<myuser> createuser(@RequestBody myuser Myuser)
	{
		myuser Myuser1=Myuserservice.saveusers(Myuser);
		return ResponseEntity.status(HttpStatus.CREATED).body(Myuser1);
	}
	
	
	//to get data of all user
	@GetMapping("/user")
	public ResponseEntity<List<myuser>> getallmyusers()
	{
		List<myuser> myallusers=Myuserservice.getallusers();
		return ResponseEntity.ok(myallusers);
		
	}
	
	//to get data by user id
	@GetMapping("/user/{userId}")
	public ResponseEntity<myuser> getusersbitsid(@PathVariable String userId)
	{
		myuser Myuser= Myuserservice.getuserbyid(userId);
		return ResponseEntity.ok(Myuser);
	}
}
