package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.stu;
import com.student.service.stuservice;

@RestController
public class stucontroller {
	
	@Autowired 
	private stuservice Stuservice;
	
	@PostMapping("/stu")
	public ResponseEntity<stu> createStudent(@RequestBody stu Stu)
	{
		stu S= Stuservice.saveStu(Stu);
		return ResponseEntity.status(HttpStatus.CREATED).body(S);
	}
	
	
	@GetMapping("/stu")
	public ResponseEntity<List<stu>> getalluser()
	{
		List<stu> allstu= Stuservice.getAllStudents();
		return ResponseEntity.ok(allstu);
	}
	
	@GetMapping("/stu/{stuId}")
	public ResponseEntity<stu> getById(@PathVariable String stuId)
	{
		stu s1=Stuservice.getStuByStuId(stuId);
		return ResponseEntity.ok(s1);
	}

}
