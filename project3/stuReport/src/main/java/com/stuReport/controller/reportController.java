package com.stuReport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stuReport.entity.stureport;
import com.stuReport.service.stureportservice;

@RestController
public class reportController {
	
	@Autowired
	private stureportservice Stuservice;
	
	@PostMapping("/report")
	public ResponseEntity<stureport> addreport(@RequestBody stureport Stureport)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(Stuservice.create(Stureport));
	}
	
	@GetMapping("/report")
	public ResponseEntity<List<stureport>> getAll()
	{
		return ResponseEntity.ok(Stuservice.getreportdata());
	}
	
	@GetMapping("/report/stu/{stuId}")
	public ResponseEntity<List<stureport>> getalldata(@PathVariable String stuId)
	{
		return ResponseEntity.ok(Stuservice.getReportdataByStuId(stuId));
	}

}
