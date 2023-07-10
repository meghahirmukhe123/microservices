package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.studentClass;
import com.student.service.stuservice;

@RestController
public class stucontroller {
	
	@Autowired
	private stuservice Stuservice;
	
	@PostMapping("/stu")
	public studentClass savedata(@RequestBody studentClass Studebtclass)
	{
		return Stuservice.savestudent(Studebtclass);
	}
	
	@GetMapping("/stu")
	public List<studentClass> getallstudents()
	{
		return Stuservice.getallstudents();
	}
	
	@GetMapping("/stu/{stuId}")
	public studentClass getstubyid(@PathVariable String stuId)
	{
		return Stuservice.getStudentByStuId(stuId);
	}

}
