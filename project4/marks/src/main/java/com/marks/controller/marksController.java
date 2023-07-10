package com.marks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marks.entity.stumarks;
import com.marks.service.markservice;

@RestController
public class marksController {
	@Autowired
	private markservice Markservice;
	
	@PostMapping("/marks")
	public ResponseEntity<stumarks> createmarks(@RequestBody stumarks Stumarks)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(Markservice.create(Stumarks));
	}
	
	@GetMapping("/marks")
	public ResponseEntity<List<stumarks>> getall()
	{
		return ResponseEntity.ok(Markservice.getAll());
	}
	
	
	@GetMapping("/marks/{resultId}")
	public ResponseEntity<stumarks> getemarks(@PathVariable String resultId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(Markservice.get(resultId));
	}

}
