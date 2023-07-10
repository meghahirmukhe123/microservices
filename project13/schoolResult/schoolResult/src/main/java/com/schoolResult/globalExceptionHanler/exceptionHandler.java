package com.schoolResult.globalExceptionHanler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.schoolResult.repo.resultrepo;

@RestControllerAdvice
public class exceptionHandler {
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handlingexception(IllegalArgumentException x)
	
	{
		String s = x.getMessage();
		
		if(s.equals("wrong school result id") )
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("this student result id is not available");
		}
		else if(s.equals("wrong school id"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("wrong school id");
		}
		else if(s.equals("wrong teachergrp id"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("wrong teacher grp id");
		}
		else if(s.equals("wrong student id" ))
			
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("wrong student id");
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("internal server error");
		}
	}

}
