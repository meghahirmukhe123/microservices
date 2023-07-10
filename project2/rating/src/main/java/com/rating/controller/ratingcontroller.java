package com.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rating.entity.Rating;
import com.rating.service.ratingservice;

@RestController
public class ratingcontroller {
	
	@Autowired
	private ratingservice Ratingservice;
	
	
	//add data in database
	@PostMapping("/rating")
	public ResponseEntity<Rating> addratings(@RequestBody Rating ratings)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(Ratingservice.create(ratings));
	}

	//get all user data from database
	
	@GetMapping("/rating")
	public ResponseEntity<List<Rating>> getallratings()
	{
		return ResponseEntity.ok(Ratingservice.getRatings());
	}
	
	//get data of particular user id
	@GetMapping("/rating/user/{userId}")
	public ResponseEntity<List<Rating>> getallratingsByuserid(@PathVariable String userId)
	{
		return ResponseEntity.ok(Ratingservice.getRatingsByUserid(userId));
	}
	
	
	
}
