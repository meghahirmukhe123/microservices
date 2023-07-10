package com.schoolResult.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolResult.entity.schoolResult;
import com.schoolResult.service.resultService;


@RestController
public class schoolResultController {
	
	@Autowired 
	private resultService ResultService;
	
	@PostMapping("/schoolResult")
	public ResponseEntity<schoolResult> savedata(@RequestBody schoolResult Schoolresult)

	{
		return ResponseEntity.status(HttpStatus.CREATED).body(ResultService.createSchoolResult(Schoolresult));
	}
	
	@GetMapping("/schoolResult")
	public ResponseEntity<List<schoolResult>> getall()
	{
		return ResponseEntity.status(HttpStatus.OK).body(ResultService.getAllResult());
	}
	
	@GetMapping("/schoolResult/resultId/{resultId}")
	public ResponseEntity<Optional<schoolResult>> getallbyresultId(@PathVariable String resultId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(ResultService.getByResultId(resultId));
	}
	

	@GetMapping("/schoolResult/stuId/{stuId}")
	public ResponseEntity<List<schoolResult>> getallbystuId(@PathVariable String stuId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(ResultService.getbystuId(stuId));
	}
	
	@GetMapping("/schoolResult/teacherId/{teacherId}")
	public ResponseEntity<List<schoolResult>> getallbyteacherId(@PathVariable String teacherId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(ResultService.getByteacherId(teacherId));
	}
	
	@GetMapping("/schoolResult/schoolId/{schoolId}")
	public ResponseEntity<List<schoolResult>> getallbyschoolId(@PathVariable String schoolId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(ResultService.getByschoolId(schoolId));
	}
}
