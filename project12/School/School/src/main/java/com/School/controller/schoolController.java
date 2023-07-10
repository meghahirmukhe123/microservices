package com.School.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.School.entity.schoolinfo;
import com.School.exceptionHandler.schoolException;
import com.School.service.schoolService;
import com.School.serviceImpl.schoolImpl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class schoolController {
	
	@Autowired
	private schoolService SchoolService;
	
	private org.slf4j.Logger logger= LoggerFactory.getLogger(schoolImpl.class);

	
	@PostMapping("/school")
	public ResponseEntity<schoolinfo> saveInfo(@RequestBody schoolinfo Schoolinfo)
	{
		schoolinfo info = SchoolService.createInfo(Schoolinfo);
		return ResponseEntity.status(HttpStatus.CREATED).body(info);
	}
	
	@GetMapping("/school")
	
	public ResponseEntity<List<schoolinfo>> getAllInfo()
	{
		List<schoolinfo> list= SchoolService.getAllSchoolData();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	
	}
	
	
	@GetMapping("/school/{schoolId}")
	@CircuitBreaker(name = "schoolBreaker",fallbackMethod = "myfallbackmethod")
	public ResponseEntity<schoolinfo> getbyid(@PathVariable String schoolId) throws schoolException
	{
		return ResponseEntity.ok().body(SchoolService.getBySchoolId(schoolId));
	}
	
	public ResponseEntity<schoolinfo> myfallbackmethod(String schoolId,Exception ex)
	{
		
		logger.info("fallback method is excecuted because service is down: ",ex.getMessage() );
		schoolinfo info= schoolinfo.builder()
				.schoolId("1234")
				.schoolName("abcd")
				.teacherGrpId("1111")
				.stuId("000")
				.resultId("0000")
				.build();
		return new ResponseEntity<schoolinfo>(info,HttpStatus.OK);
				
	}

}
