package com.stuBio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stuBio.entity.stuBio;
import com.stuBio.service.bioservice;

@RestController
public class biocontroller {
	
	@Autowired
	private bioservice Bioservice;
	
	@PostMapping("/bio")
	public ResponseEntity<stuBio> create(@RequestBody stuBio Stu)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(Bioservice.create(Stu));
	}

	@GetMapping("/bio")
	public ResponseEntity<List<stuBio>> getbio()
	{
		return ResponseEntity.ok(Bioservice.getStuBio());
	}
	
	
	@GetMapping("/bio/student/{stuId}")
	public ResponseEntity<List<stuBio>> getbioByStuId(@PathVariable String stuId)
	{
		return ResponseEntity.ok(Bioservice.getByStuId(stuId));
	}
	
	@GetMapping("/bio/result/{resultid}")
	public ResponseEntity<List<stuBio>> getbioByresultId(@PathVariable String resultid)
	{
		return ResponseEntity.ok(Bioservice.getByResultId(resultid));
	}
	
	
}
